package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeaturesTriggerActionEvent extends StObject {
  
  var action: ActionButton
}
object FeaturesTriggerActionEvent {
  
  inline def apply(action: ActionButton): FeaturesTriggerActionEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeaturesTriggerActionEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeaturesTriggerActionEvent] (val x: Self) extends AnyVal {
    
    inline def setAction(value: ActionButton): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
