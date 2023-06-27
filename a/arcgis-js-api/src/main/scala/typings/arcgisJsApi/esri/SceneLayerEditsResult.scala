package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneLayerEditsResult extends StObject {
  
  /**
  		 * Result of adding features.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#EditsResult)
  		 */
  var addFeatureResults: js.Array[FeatureEditResult]
  
  /**
  		 * Result of deleting features.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#EditsResult)
  		 */
  var deleteFeatureResults: js.Array[FeatureEditResult]
  
  /**
  		 * Result of updating features.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#EditsResult)
  		 */
  var updateFeatureResults: js.Array[FeatureEditResult]
}
object SceneLayerEditsResult {
  
  inline def apply(
    addFeatureResults: js.Array[FeatureEditResult],
    deleteFeatureResults: js.Array[FeatureEditResult],
    updateFeatureResults: js.Array[FeatureEditResult]
  ): SceneLayerEditsResult = {
    val __obj = js.Dynamic.literal(addFeatureResults = addFeatureResults.asInstanceOf[js.Any], deleteFeatureResults = deleteFeatureResults.asInstanceOf[js.Any], updateFeatureResults = updateFeatureResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneLayerEditsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SceneLayerEditsResult] (val x: Self) extends AnyVal {
    
    inline def setAddFeatureResults(value: js.Array[FeatureEditResult]): Self = StObject.set(x, "addFeatureResults", value.asInstanceOf[js.Any])
    
    inline def setAddFeatureResultsVarargs(value: FeatureEditResult*): Self = StObject.set(x, "addFeatureResults", js.Array(value*))
    
    inline def setDeleteFeatureResults(value: js.Array[FeatureEditResult]): Self = StObject.set(x, "deleteFeatureResults", value.asInstanceOf[js.Any])
    
    inline def setDeleteFeatureResultsVarargs(value: FeatureEditResult*): Self = StObject.set(x, "deleteFeatureResults", js.Array(value*))
    
    inline def setUpdateFeatureResults(value: js.Array[FeatureEditResult]): Self = StObject.set(x, "updateFeatureResults", value.asInstanceOf[js.Any])
    
    inline def setUpdateFeatureResultsVarargs(value: FeatureEditResult*): Self = StObject.set(x, "updateFeatureResults", js.Array(value*))
  }
}
