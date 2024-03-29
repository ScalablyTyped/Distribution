package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoJSONLayerEditsEventDeletedFeatures extends StObject {
  
  var objectId: Double
}
object GeoJSONLayerEditsEventDeletedFeatures {
  
  inline def apply(objectId: Double): GeoJSONLayerEditsEventDeletedFeatures = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSONLayerEditsEventDeletedFeatures]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeoJSONLayerEditsEventDeletedFeatures] (val x: Self) extends AnyVal {
    
    inline def setObjectId(value: Double): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
  }
}
