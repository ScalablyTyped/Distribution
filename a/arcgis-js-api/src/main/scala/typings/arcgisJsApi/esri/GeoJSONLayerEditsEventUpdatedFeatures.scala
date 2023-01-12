package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoJSONLayerEditsEventUpdatedFeatures extends StObject {
  
  var objectId: Double
}
object GeoJSONLayerEditsEventUpdatedFeatures {
  
  inline def apply(objectId: Double): GeoJSONLayerEditsEventUpdatedFeatures = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSONLayerEditsEventUpdatedFeatures]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeoJSONLayerEditsEventUpdatedFeatures] (val x: Self) extends AnyVal {
    
    inline def setObjectId(value: Double): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
  }
}
