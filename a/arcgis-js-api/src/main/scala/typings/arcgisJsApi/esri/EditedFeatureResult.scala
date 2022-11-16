package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditedFeatureResult extends StObject {
  
  /**
    * Object containing all edited features belonging to the specified layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditedFeatureResult)
    */
  var editedFeatures: EditedFeatureResultEditedFeatures
  
  /**
    * The layerId of the feature layer where features were edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditedFeatureResult)
    */
  var layerId: Double
}
object EditedFeatureResult {
  
  inline def apply(editedFeatures: EditedFeatureResultEditedFeatures, layerId: Double): EditedFeatureResult = {
    val __obj = js.Dynamic.literal(editedFeatures = editedFeatures.asInstanceOf[js.Any], layerId = layerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditedFeatureResult]
  }
  
  extension [Self <: EditedFeatureResult](x: Self) {
    
    inline def setEditedFeatures(value: EditedFeatureResultEditedFeatures): Self = StObject.set(x, "editedFeatures", value.asInstanceOf[js.Any])
    
    inline def setLayerId(value: Double): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
  }
}
