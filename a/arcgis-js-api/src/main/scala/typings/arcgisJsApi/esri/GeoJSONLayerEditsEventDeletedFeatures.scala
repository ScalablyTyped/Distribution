package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoJSONLayerEditsEventDeletedFeatures
  extends StObject
     with Object {
  
  var objectId: Double
}
object GeoJSONLayerEditsEventDeletedFeatures {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    objectId: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): GeoJSONLayerEditsEventDeletedFeatures = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), objectId = objectId.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[GeoJSONLayerEditsEventDeletedFeatures]
  }
  
  @scala.inline
  implicit class GeoJSONLayerEditsEventDeletedFeaturesMutableBuilder[Self <: GeoJSONLayerEditsEventDeletedFeatures] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: Double): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
  }
}
