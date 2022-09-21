package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The event type used for onVolatileReload.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVVolatileReloadEvent extends StObject {
  
  /**
    * Cancel the reload. Otherwise a blank screen with be displayed until the page is loaded.
    */
  def cancel(): Unit
}
object ATVVolatileReloadEvent {
  
  inline def apply(cancel: () => Unit): ATVVolatileReloadEvent = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
    __obj.asInstanceOf[ATVVolatileReloadEvent]
  }
  
  extension [Self <: ATVVolatileReloadEvent](x: Self) {
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
  }
}
