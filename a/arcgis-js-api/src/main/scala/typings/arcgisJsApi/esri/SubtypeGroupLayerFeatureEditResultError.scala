package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtypeGroupLayerFeatureEditResultError extends StObject {
  
  /**
    * Message describing the error.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#FeatureEditResult)
    */
  var message: String
  
  /**
    * Error name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#FeatureEditResult)
    */
  var name: String
}
object SubtypeGroupLayerFeatureEditResultError {
  
  inline def apply(message: String, name: String): SubtypeGroupLayerFeatureEditResultError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubtypeGroupLayerFeatureEditResultError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubtypeGroupLayerFeatureEditResultError] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
