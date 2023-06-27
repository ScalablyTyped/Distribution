package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegratedMeshLayerProperties
  extends StObject
     with LayerProperties
     with SceneServiceProperties
     with PortalLayerProperties
     with ScaleRangeLayerProperties
     with APIKeyMixinProperties {
  
  /**
  		 * Specifies how the mesh is placed on the vertical axis (z).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html#elevationInfo)
  		 */
  var elevationInfo: js.UndefOr[IntegratedMeshLayerElevationInfo] = js.undefined
  
  /**
  		 * A collection of [SceneModification](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneModification.html) with polygons and types to apply client-side modifications.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html#modifications)
  		 */
  var modifications: js.UndefOr[SceneModificationsProperties] = js.undefined
}
object IntegratedMeshLayerProperties {
  
  inline def apply(): IntegratedMeshLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegratedMeshLayerProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntegratedMeshLayerProperties] (val x: Self) extends AnyVal {
    
    inline def setElevationInfo(value: IntegratedMeshLayerElevationInfo): Self = StObject.set(x, "elevationInfo", value.asInstanceOf[js.Any])
    
    inline def setElevationInfoUndefined: Self = StObject.set(x, "elevationInfo", js.undefined)
    
    inline def setModifications(value: SceneModificationsProperties): Self = StObject.set(x, "modifications", value.asInstanceOf[js.Any])
    
    inline def setModificationsUndefined: Self = StObject.set(x, "modifications", js.undefined)
  }
}
