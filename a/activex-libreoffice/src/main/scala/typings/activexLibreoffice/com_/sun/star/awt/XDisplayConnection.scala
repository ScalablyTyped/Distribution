package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface should be implemented by toolkits that want to give access to their internal message handling loop. */
trait XDisplayConnection
  extends StObject
     with XInterface {
  
  /**
    * returns a identifier.
    * @returns a unique platform dependent identifier for a display connection.
    */
  val Identifier: Any
  
  /**
    * register an error handler for toolkit specific errors.
    * @param errorHandler the handler to register.
    */
  def addErrorHandler(errorHandler: XEventHandler): Unit
  
  /**
    * registers an event handler.
    * @param window the platform specific window id. If empty, the handler should be registered for all windows.
    * @param eventHandler the handler to register.
    * @param eventMask the event mask specifies the events the handler is interested in.
    */
  def addEventHandler(window: Any, eventHandler: XEventHandler, eventMask: Double): Unit
  
  /**
    * returns a identifier.
    * @returns a unique platform dependent identifier for a display connection.
    */
  def getIdentifier(): Any
  
  /**
    * remover an error handler from the handler list.
    * @param errorHandler the handler to remove.
    */
  def removeErrorHandler(errorHandler: XEventHandler): Unit
  
  /**
    * removes a eventHandler from the handler list.
    * @param window the platform specific window id the handler should be unregistered for. If empty, the handler should be unregistered completely.
    * @param eventHandler the handler to remove.
    */
  def removeEventHandler(window: Any, eventHandler: XEventHandler): Unit
}
object XDisplayConnection {
  
  inline def apply(
    Identifier: Any,
    acquire: () => Unit,
    addErrorHandler: XEventHandler => Unit,
    addEventHandler: (Any, XEventHandler, Double) => Unit,
    getIdentifier: () => Any,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeErrorHandler: XEventHandler => Unit,
    removeEventHandler: (Any, XEventHandler) => Unit
  ): XDisplayConnection = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addErrorHandler = js.Any.fromFunction1(addErrorHandler), addEventHandler = js.Any.fromFunction3(addEventHandler), getIdentifier = js.Any.fromFunction0(getIdentifier), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeErrorHandler = js.Any.fromFunction1(removeErrorHandler), removeEventHandler = js.Any.fromFunction2(removeEventHandler))
    __obj.asInstanceOf[XDisplayConnection]
  }
  
  extension [Self <: XDisplayConnection](x: Self) {
    
    inline def setAddErrorHandler(value: XEventHandler => Unit): Self = StObject.set(x, "addErrorHandler", js.Any.fromFunction1(value))
    
    inline def setAddEventHandler(value: (Any, XEventHandler, Double) => Unit): Self = StObject.set(x, "addEventHandler", js.Any.fromFunction3(value))
    
    inline def setGetIdentifier(value: () => Any): Self = StObject.set(x, "getIdentifier", js.Any.fromFunction0(value))
    
    inline def setIdentifier(value: Any): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setRemoveErrorHandler(value: XEventHandler => Unit): Self = StObject.set(x, "removeErrorHandler", js.Any.fromFunction1(value))
    
    inline def setRemoveEventHandler(value: (Any, XEventHandler) => Unit): Self = StObject.set(x, "removeEventHandler", js.Any.fromFunction2(value))
  }
}
