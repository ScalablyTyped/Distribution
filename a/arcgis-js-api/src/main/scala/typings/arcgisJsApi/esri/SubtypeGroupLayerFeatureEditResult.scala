package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtypeGroupLayerFeatureEditResult extends StObject {
  
  /**
    * If the edit failed, the edit result includes an error.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#FeatureEditResult)
    */
  var error: SubtypeGroupLayerFeatureEditResultError
  
  /**
    * The globalId of the feature or the attachment that was edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#FeatureEditResult)
    */
  var globalId: String
  
  /**
    * The objectId of the feature or the attachmentId of the attachment that was edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#FeatureEditResult)
    */
  var objectId: Double
}
object SubtypeGroupLayerFeatureEditResult {
  
  inline def apply(error: SubtypeGroupLayerFeatureEditResultError, globalId: String, objectId: Double): SubtypeGroupLayerFeatureEditResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], globalId = globalId.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubtypeGroupLayerFeatureEditResult]
  }
  
  extension [Self <: SubtypeGroupLayerFeatureEditResult](x: Self) {
    
    inline def setError(value: SubtypeGroupLayerFeatureEditResultError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setGlobalId(value: String): Self = StObject.set(x, "globalId", value.asInstanceOf[js.Any])
    
    inline def setObjectId(value: Double): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
  }
}
