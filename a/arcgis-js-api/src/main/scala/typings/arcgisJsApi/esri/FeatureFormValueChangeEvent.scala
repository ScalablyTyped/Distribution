package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureFormValueChangeEvent extends StObject {
  
  var feature: Graphic
  
  var fieldName: String
  
  var layer: FeatureLayer
  
  var valid: Boolean
  
  var value: Double | String | js.Any
}
object FeatureFormValueChangeEvent {
  
  @scala.inline
  def apply(
    feature: Graphic,
    fieldName: String,
    layer: FeatureLayer,
    valid: Boolean,
    value: Double | String | js.Any
  ): FeatureFormValueChangeEvent = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureFormValueChangeEvent]
  }
  
  @scala.inline
  implicit class FeatureFormValueChangeEventMutableBuilder[Self <: FeatureFormValueChangeEvent] (val x: Self) extends AnyVal {
    
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
