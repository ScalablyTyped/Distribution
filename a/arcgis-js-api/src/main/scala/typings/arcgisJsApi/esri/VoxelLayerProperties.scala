package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.surfaces
import typings.arcgisJsApi.arcgisJsApiStrings.volume
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoxelLayerProperties
  extends StObject
     with LayerProperties
     with SceneServiceProperties
     with PortalLayerProperties
     with ScaleRangeLayerProperties
     with APIKeyMixinProperties {
  
  /**
    * The variable that is being displayed.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html#currentVariableId)
    */
  var currentVariableId: js.UndefOr[Double] = js.undefined
  
  /**
    * Current rendering mode for the [VoxelLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html).
    *
    * @default "volume"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html#renderMode)
    */
  var renderMode: js.UndefOr[volume | surfaces] = js.undefined
  
  /**
    * The collection of volume styles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html#volumeStyles)
    */
  var volumeStyles: js.UndefOr[CollectionProperties[VoxelVolumeStyleProperties]] = js.undefined
}
object VoxelLayerProperties {
  
  inline def apply(): VoxelLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoxelLayerProperties]
  }
  
  extension [Self <: VoxelLayerProperties](x: Self) {
    
    inline def setCurrentVariableId(value: Double): Self = StObject.set(x, "currentVariableId", value.asInstanceOf[js.Any])
    
    inline def setCurrentVariableIdUndefined: Self = StObject.set(x, "currentVariableId", js.undefined)
    
    inline def setRenderMode(value: volume | surfaces): Self = StObject.set(x, "renderMode", value.asInstanceOf[js.Any])
    
    inline def setRenderModeUndefined: Self = StObject.set(x, "renderMode", js.undefined)
    
    inline def setVolumeStyles(value: CollectionProperties[VoxelVolumeStyleProperties]): Self = StObject.set(x, "volumeStyles", value.asInstanceOf[js.Any])
    
    inline def setVolumeStylesUndefined: Self = StObject.set(x, "volumeStyles", js.undefined)
    
    inline def setVolumeStylesVarargs(value: VoxelVolumeStyleProperties*): Self = StObject.set(x, "volumeStyles", js.Array(value*))
  }
}
