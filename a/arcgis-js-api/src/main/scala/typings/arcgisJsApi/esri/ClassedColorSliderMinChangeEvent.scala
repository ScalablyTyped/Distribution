package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`min-change`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassedColorSliderMinChangeEvent extends StObject {
  
  var oldValue: Double = js.native
  
  var `type`: `min-change` = js.native
  
  var value: Double = js.native
}
object ClassedColorSliderMinChangeEvent {
  
  @scala.inline
  def apply(oldValue: Double, `type`: `min-change`, value: Double): ClassedColorSliderMinChangeEvent = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassedColorSliderMinChangeEvent]
  }
  
  @scala.inline
  implicit class ClassedColorSliderMinChangeEventMutableBuilder[Self <: ClassedColorSliderMinChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOldValue(value: Double): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `min-change`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
