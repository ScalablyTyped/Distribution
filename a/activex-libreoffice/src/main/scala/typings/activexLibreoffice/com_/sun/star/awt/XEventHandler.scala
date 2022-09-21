package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface can be implemented by clients that need access to the toolkits window message loop. */
trait XEventHandler
  extends StObject
     with XInterface {
  
  /**
    * requests the implementor of this interface to handle a platform dependent event.
    * @param event the platform dependent event.
    * @returns `TRUE` if the event was handled properly and no further handling should take place, `FALSE` otherwise.
    */
  def handleEvent(event: Any): Boolean
}
object XEventHandler {
  
  inline def apply(
    acquire: () => Unit,
    handleEvent: Any => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XEventHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), handleEvent = js.Any.fromFunction1(handleEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XEventHandler]
  }
  
  extension [Self <: XEventHandler](x: Self) {
    
    inline def setHandleEvent(value: Any => Boolean): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
  }
}
