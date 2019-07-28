package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface should be implemented by toolkits that want to give access to their internal message handling loop. */
trait XDisplayConnection extends XInterface {
  /**
    * returns a identifier.
    * @returns a unique platform dependent identifier for a display connection.
    */
  val Identifier: js.Any
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
  def addEventHandler(window: js.Any, eventHandler: XEventHandler, eventMask: Double): Unit
  /**
    * returns a identifier.
    * @returns a unique platform dependent identifier for a display connection.
    */
  def getIdentifier(): js.Any
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
  def removeEventHandler(window: js.Any, eventHandler: XEventHandler): Unit
}

object XDisplayConnection {
  @scala.inline
  def apply(
    Identifier: js.Any,
    acquire: () => Unit,
    addErrorHandler: XEventHandler => Unit,
    addEventHandler: (js.Any, XEventHandler, Double) => Unit,
    getIdentifier: () => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeErrorHandler: XEventHandler => Unit,
    removeEventHandler: (js.Any, XEventHandler) => Unit
  ): XDisplayConnection = {
    val __obj = js.Dynamic.literal(Identifier = Identifier, acquire = js.Any.fromFunction0(acquire), addErrorHandler = js.Any.fromFunction1(addErrorHandler), addEventHandler = js.Any.fromFunction3(addEventHandler), getIdentifier = js.Any.fromFunction0(getIdentifier), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeErrorHandler = js.Any.fromFunction1(removeErrorHandler), removeEventHandler = js.Any.fromFunction2(removeEventHandler))
  
    __obj.asInstanceOf[XDisplayConnection]
  }
}

