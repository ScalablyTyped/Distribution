package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is fired when a change becomes effective on the source of the event
  * @see XBackendChangesNotifier
  */
trait ComponentChangeEvent
  extends StObject
     with EventObject {
  
  /** The name of the Component that changed */
  var Component: String
}
object ComponentChangeEvent {
  
  inline def apply(Component: String, Source: XInterface): ComponentChangeEvent = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentChangeEvent]
  }
  
  extension [Self <: ComponentChangeEvent](x: Self) {
    
    inline def setComponent(value: String): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
  }
}
