package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`max-change`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorSizeSliderMaxChangeEvent extends StObject {
  
  var oldValue: Double
  
  var `type`: `max-change`
  
  var value: Double
}
object ColorSizeSliderMaxChangeEvent {
  
  @scala.inline
  def apply(oldValue: Double, value: Double): ColorSizeSliderMaxChangeEvent = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("max-change")
    __obj.asInstanceOf[ColorSizeSliderMaxChangeEvent]
  }
  
  @scala.inline
  implicit class ColorSizeSliderMaxChangeEventMutableBuilder[Self <: ColorSizeSliderMaxChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOldValue(value: Double): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `max-change`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
