package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureFormViewModelValueChangeEvent extends StObject {
  
  var feature: Graphic
  
  var fieldName: String
  
  var layer: FeatureLayer
  
  var valid: Boolean
  
  var value: Double | String | Any
}
object FeatureFormViewModelValueChangeEvent {
  
  inline def apply(
    feature: Graphic,
    fieldName: String,
    layer: FeatureLayer,
    valid: Boolean,
    value: Double | String | Any
  ): FeatureFormViewModelValueChangeEvent = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureFormViewModelValueChangeEvent]
  }
  
  extension [Self <: FeatureFormViewModelValueChangeEvent](x: Self) {
    
    inline def setFeature(value: Graphic): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setLayer(value: FeatureLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double | String | Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
