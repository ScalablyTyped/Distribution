package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureFormViewModelValueChangeEvent extends StObject {
  
  var feature: Graphic = js.native
  
  var fieldName: String = js.native
  
  var layer: FeatureLayer = js.native
  
  var valid: Boolean = js.native
  
  var value: Double | String | js.Any = js.native
}
object FeatureFormViewModelValueChangeEvent {
  
  @scala.inline
  def apply(
    feature: Graphic,
    fieldName: String,
    layer: FeatureLayer,
    valid: Boolean,
    value: Double | String | js.Any
  ): FeatureFormViewModelValueChangeEvent = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureFormViewModelValueChangeEvent]
  }
  
  @scala.inline
  implicit class FeatureFormViewModelValueChangeEventMutableBuilder[Self <: FeatureFormViewModelValueChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeature(value: Graphic): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayer(value: FeatureLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double | String | js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
