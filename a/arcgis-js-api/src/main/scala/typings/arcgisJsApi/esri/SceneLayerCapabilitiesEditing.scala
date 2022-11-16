package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneLayerCapabilitiesEditing extends StObject {
  
  /**
    * Indicates if the geometry of the features in the layer can be edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#capabilities)
    */
  var supportsGeometryUpdate: Boolean
  
  /**
    * Indicates if the `globalId` values provided by the client are used in [applyEdits](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#applyEdits).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#capabilities)
    */
  var supportsGlobalId: Boolean
  
  /**
    * Indicates if the `rollbackOnFailureEnabled` parameter can be set to `true` or `false` when editing features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#capabilities)
    */
  var supportsRollbackOnFailure: Boolean
}
object SceneLayerCapabilitiesEditing {
  
  inline def apply(supportsGeometryUpdate: Boolean, supportsGlobalId: Boolean, supportsRollbackOnFailure: Boolean): SceneLayerCapabilitiesEditing = {
    val __obj = js.Dynamic.literal(supportsGeometryUpdate = supportsGeometryUpdate.asInstanceOf[js.Any], supportsGlobalId = supportsGlobalId.asInstanceOf[js.Any], supportsRollbackOnFailure = supportsRollbackOnFailure.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneLayerCapabilitiesEditing]
  }
  
  extension [Self <: SceneLayerCapabilitiesEditing](x: Self) {
    
    inline def setSupportsGeometryUpdate(value: Boolean): Self = StObject.set(x, "supportsGeometryUpdate", value.asInstanceOf[js.Any])
    
    inline def setSupportsGlobalId(value: Boolean): Self = StObject.set(x, "supportsGlobalId", value.asInstanceOf[js.Any])
    
    inline def setSupportsRollbackOnFailure(value: Boolean): Self = StObject.set(x, "supportsRollbackOnFailure", value.asInstanceOf[js.Any])
  }
}
