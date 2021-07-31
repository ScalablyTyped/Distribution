package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoJSONLayerEditsEventUpdatedFeatures
  extends StObject
     with Object {
  
  var objectId: Double
}
object GeoJSONLayerEditsEventUpdatedFeatures {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    objectId: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): GeoJSONLayerEditsEventUpdatedFeatures = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), objectId = objectId.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[GeoJSONLayerEditsEventUpdatedFeatures]
  }
  
  @scala.inline
  implicit class GeoJSONLayerEditsEventUpdatedFeaturesMutableBuilder[Self <: GeoJSONLayerEditsEventUpdatedFeatures] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: Double): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
  }
}
