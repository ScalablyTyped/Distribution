package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoJSONLayerApplyEditsEdits extends Object {
  
  /**
    * An array or a [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of features to be added.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#applyEdits)
    */
  var addFeatures: js.UndefOr[js.Array[Graphic] | Collection[Graphic]] = js.native
  
  /**
    * An array or a [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of features, or objects to be deleted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#applyEdits)
    */
  var deleteFeatures: js.UndefOr[(js.Array[_ | Graphic]) | Collection[Graphic]] = js.native
  
  /**
    * An array or a [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of features to be updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#applyEdits)
    */
  var updateFeatures: js.UndefOr[js.Array[Graphic] | Collection[Graphic]] = js.native
}
object GeoJSONLayerApplyEditsEdits {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): GeoJSONLayerApplyEditsEdits = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[GeoJSONLayerApplyEditsEdits]
  }
  
  @scala.inline
  implicit class GeoJSONLayerApplyEditsEditsMutableBuilder[Self <: GeoJSONLayerApplyEditsEdits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddFeatures(value: js.Array[Graphic] | Collection[Graphic]): Self = StObject.set(x, "addFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddFeaturesUndefined: Self = StObject.set(x, "addFeatures", js.undefined)
    
    @scala.inline
    def setAddFeaturesVarargs(value: Graphic*): Self = StObject.set(x, "addFeatures", js.Array(value :_*))
    
    @scala.inline
    def setDeleteFeatures(value: (js.Array[_ | Graphic]) | Collection[Graphic]): Self = StObject.set(x, "deleteFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteFeaturesUndefined: Self = StObject.set(x, "deleteFeatures", js.undefined)
    
    @scala.inline
    def setDeleteFeaturesVarargs(value: (js.Any | Graphic)*): Self = StObject.set(x, "deleteFeatures", js.Array(value :_*))
    
    @scala.inline
    def setUpdateFeatures(value: js.Array[Graphic] | Collection[Graphic]): Self = StObject.set(x, "updateFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateFeaturesUndefined: Self = StObject.set(x, "updateFeatures", js.undefined)
    
    @scala.inline
    def setUpdateFeaturesVarargs(value: Graphic*): Self = StObject.set(x, "updateFeatures", js.Array(value :_*))
  }
}
