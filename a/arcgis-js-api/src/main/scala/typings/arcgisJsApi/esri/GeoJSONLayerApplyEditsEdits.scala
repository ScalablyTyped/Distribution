package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoJSONLayerApplyEditsEdits
  extends StObject
     with Object {
  
  /**
    * An array or a [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of features to be added.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#applyEdits)
    */
  var addFeatures: js.UndefOr[js.Array[Graphic] | Collection[Graphic]] = js.undefined
  
  /**
    * An array or a [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of features, or objects to be deleted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#applyEdits)
    */
  var deleteFeatures: js.UndefOr[(js.Array[js.Any | Graphic]) | Collection[Graphic]] = js.undefined
  
  /**
    * An array or a [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of features to be updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#applyEdits)
    */
  var updateFeatures: js.UndefOr[js.Array[Graphic] | Collection[Graphic]] = js.undefined
}
object GeoJSONLayerApplyEditsEdits {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): GeoJSONLayerApplyEditsEdits = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[GeoJSONLayerApplyEditsEdits]
  }
  
  extension [Self <: GeoJSONLayerApplyEditsEdits](x: Self) {
    
    inline def setAddFeatures(value: js.Array[Graphic] | Collection[Graphic]): Self = StObject.set(x, "addFeatures", value.asInstanceOf[js.Any])
    
    inline def setAddFeaturesUndefined: Self = StObject.set(x, "addFeatures", js.undefined)
    
    inline def setAddFeaturesVarargs(value: Graphic*): Self = StObject.set(x, "addFeatures", js.Array(value :_*))
    
    inline def setDeleteFeatures(value: (js.Array[js.Any | Graphic]) | Collection[Graphic]): Self = StObject.set(x, "deleteFeatures", value.asInstanceOf[js.Any])
    
    inline def setDeleteFeaturesUndefined: Self = StObject.set(x, "deleteFeatures", js.undefined)
    
    inline def setDeleteFeaturesVarargs(value: (js.Any | Graphic)*): Self = StObject.set(x, "deleteFeatures", js.Array(value :_*))
    
    inline def setUpdateFeatures(value: js.Array[Graphic] | Collection[Graphic]): Self = StObject.set(x, "updateFeatures", value.asInstanceOf[js.Any])
    
    inline def setUpdateFeaturesUndefined: Self = StObject.set(x, "updateFeatures", js.undefined)
    
    inline def setUpdateFeaturesVarargs(value: Graphic*): Self = StObject.set(x, "updateFeatures", js.Array(value :_*))
  }
}
