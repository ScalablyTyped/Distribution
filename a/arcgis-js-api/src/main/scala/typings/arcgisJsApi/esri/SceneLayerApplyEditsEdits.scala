package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneLayerApplyEditsEdits extends StObject {
  
  /**
  		 * An array or a [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of features to be added.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#applyEdits)
  		 */
  var addFeatures: js.UndefOr[js.Array[Graphic] | Collection[Graphic]] = js.undefined
  
  /**
  		 * An array or a [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of features, or an array of objects with [globalId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#globalIdField) of each feature to be deleted.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#applyEdits)
  		 */
  var deleteFeatures: js.UndefOr[(js.Array[Any | Graphic]) | Collection[Graphic]] = js.undefined
  
  /**
  		 * An array or a [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of features to be updated.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#applyEdits)
  		 */
  var updateFeatures: js.UndefOr[js.Array[Graphic] | Collection[Graphic]] = js.undefined
}
object SceneLayerApplyEditsEdits {
  
  inline def apply(): SceneLayerApplyEditsEdits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneLayerApplyEditsEdits]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SceneLayerApplyEditsEdits] (val x: Self) extends AnyVal {
    
    inline def setAddFeatures(value: js.Array[Graphic] | Collection[Graphic]): Self = StObject.set(x, "addFeatures", value.asInstanceOf[js.Any])
    
    inline def setAddFeaturesUndefined: Self = StObject.set(x, "addFeatures", js.undefined)
    
    inline def setAddFeaturesVarargs(value: Graphic*): Self = StObject.set(x, "addFeatures", js.Array(value*))
    
    inline def setDeleteFeatures(value: (js.Array[Any | Graphic]) | Collection[Graphic]): Self = StObject.set(x, "deleteFeatures", value.asInstanceOf[js.Any])
    
    inline def setDeleteFeaturesUndefined: Self = StObject.set(x, "deleteFeatures", js.undefined)
    
    inline def setDeleteFeaturesVarargs(value: (Any | Graphic)*): Self = StObject.set(x, "deleteFeatures", js.Array(value*))
    
    inline def setUpdateFeatures(value: js.Array[Graphic] | Collection[Graphic]): Self = StObject.set(x, "updateFeatures", value.asInstanceOf[js.Any])
    
    inline def setUpdateFeaturesUndefined: Self = StObject.set(x, "updateFeatures", js.undefined)
    
    inline def setUpdateFeaturesVarargs(value: Graphic*): Self = StObject.set(x, "updateFeatures", js.Array(value*))
  }
}
