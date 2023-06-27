package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureEditResult extends StObject {
  
  /**
  		 * If the edit failed, the edit result includes an error.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#FeatureEditResult)
  		 */
  var error: FeatureEditResultError
  
  /**
  		 * The globalId of the feature or the attachment that was edited.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#FeatureEditResult)
  		 */
  var globalId: String
  
  /**
  		 * The objectId of the feature or the attachmentId of the attachment that was edited.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#FeatureEditResult)
  		 */
  var objectId: Double
}
object FeatureEditResult {
  
  inline def apply(error: FeatureEditResultError, globalId: String, objectId: Double): FeatureEditResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], globalId = globalId.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureEditResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureEditResult] (val x: Self) extends AnyVal {
    
    inline def setError(value: FeatureEditResultError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setGlobalId(value: String): Self = StObject.set(x, "globalId", value.asInstanceOf[js.Any])
    
    inline def setObjectId(value: Double): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
  }
}
