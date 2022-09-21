package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditedFeatureResult
  extends StObject
     with Object {
  
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
  
  inline def apply(
    constructor: js.Function,
    editedFeatures: EditedFeatureResultEditedFeatures,
    hasOwnProperty: PropertyKey => Boolean,
    layerId: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): EditedFeatureResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], editedFeatures = editedFeatures.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layerId = layerId.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[EditedFeatureResult]
  }
  
  extension [Self <: EditedFeatureResult](x: Self) {
    
    inline def setEditedFeatures(value: EditedFeatureResultEditedFeatures): Self = StObject.set(x, "editedFeatures", value.asInstanceOf[js.Any])
    
    inline def setLayerId(value: Double): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
  }
}
