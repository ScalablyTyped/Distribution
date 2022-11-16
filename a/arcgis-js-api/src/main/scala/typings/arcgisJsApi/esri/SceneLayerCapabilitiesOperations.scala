package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneLayerCapabilitiesOperations extends StObject {
  
  /**
    * Indicates if new features can be [added](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#applyEdits) to the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#capabilities)
    */
  var supportsAdd: Boolean
  
  /**
    * Indicates if features can be [deleted](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#applyEdits) from the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#capabilities)
    */
  var supportsDelete: Boolean
  
  /**
    * Indicates if features in the layer can be [edited](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#applyEdits).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#capabilities)
    */
  var supportsEditing: Boolean
  
  /**
    * Indicates if features in the layer can be [updated](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#applyEdits).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#capabilities)
    */
  var supportsUpdate: Boolean
}
object SceneLayerCapabilitiesOperations {
  
  inline def apply(supportsAdd: Boolean, supportsDelete: Boolean, supportsEditing: Boolean, supportsUpdate: Boolean): SceneLayerCapabilitiesOperations = {
    val __obj = js.Dynamic.literal(supportsAdd = supportsAdd.asInstanceOf[js.Any], supportsDelete = supportsDelete.asInstanceOf[js.Any], supportsEditing = supportsEditing.asInstanceOf[js.Any], supportsUpdate = supportsUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneLayerCapabilitiesOperations]
  }
  
  extension [Self <: SceneLayerCapabilitiesOperations](x: Self) {
    
    inline def setSupportsAdd(value: Boolean): Self = StObject.set(x, "supportsAdd", value.asInstanceOf[js.Any])
    
    inline def setSupportsDelete(value: Boolean): Self = StObject.set(x, "supportsDelete", value.asInstanceOf[js.Any])
    
    inline def setSupportsEditing(value: Boolean): Self = StObject.set(x, "supportsEditing", value.asInstanceOf[js.Any])
    
    inline def setSupportsUpdate(value: Boolean): Self = StObject.set(x, "supportsUpdate", value.asInstanceOf[js.Any])
  }
}
