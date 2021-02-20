package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`thumb-change`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartMappingSliderBaseThumbChangeEvent extends StObject {
  
  var index: Double = js.native
  
  var oldValue: Double = js.native
  
  var `type`: `thumb-change` = js.native
  
  var value: Double = js.native
}
object SmartMappingSliderBaseThumbChangeEvent {
  
  @scala.inline
  def apply(index: Double, oldValue: Double, `type`: `thumb-change`, value: Double): SmartMappingSliderBaseThumbChangeEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartMappingSliderBaseThumbChangeEvent]
  }
  
  @scala.inline
  implicit class SmartMappingSliderBaseThumbChangeEventMutableBuilder[Self <: SmartMappingSliderBaseThumbChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValue(value: Double): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `thumb-change`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
