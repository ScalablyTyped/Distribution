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
    * Controls whether or not to globally disable all dynamic sections in the current [VoxelVolumeStyle](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVolumeStyle.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html#enableDynamicSections)
    */
  var enableDynamicSections: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls whether or not to globally disable all isosurfaces in the current [VoxelVariableStyle](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariableStyle.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html#enableIsosurfaces)
    */
  var enableIsosurfaces: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls whether or not to globally disable all slices in the current [VoxelVolumeStyle](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVolumeStyle.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html#enableSlices)
    */
  var enableSlices: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html#legendEnabled)
    */
  var legendEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to display popups when voxels in the layer are clicked.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html#popupEnabled)
    */
  var popupEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Current rendering mode for the [VoxelLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html).
    *
    * @default "volume"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html#renderMode)
    */
  var renderMode: js.UndefOr[volume | surfaces] = js.undefined
  
  /**
    * The collection of variable styles, containing exactly one [VoxelVariableStyle](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariableStyle.html) for each [VoxelVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariable.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html#variableStyles)
    */
  var variableStyles: js.UndefOr[CollectionProperties[VoxelVariableStyleProperties]] = js.undefined
  
  /**
    * The collection of volume styles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html#volumeStyles)
    */
  var volumeStyles: js.UndefOr[CollectionProperties[voxelVoxelVolumeStyleProperties]] = js.undefined
}
object VoxelLayerProperties {
  
  inline def apply(): VoxelLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoxelLayerProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VoxelLayerProperties] (val x: Self) extends AnyVal {
    
    inline def setCurrentVariableId(value: Double): Self = StObject.set(x, "currentVariableId", value.asInstanceOf[js.Any])
    
    inline def setCurrentVariableIdUndefined: Self = StObject.set(x, "currentVariableId", js.undefined)
    
    inline def setEnableDynamicSections(value: Boolean): Self = StObject.set(x, "enableDynamicSections", value.asInstanceOf[js.Any])
    
    inline def setEnableDynamicSectionsUndefined: Self = StObject.set(x, "enableDynamicSections", js.undefined)
    
    inline def setEnableIsosurfaces(value: Boolean): Self = StObject.set(x, "enableIsosurfaces", value.asInstanceOf[js.Any])
    
    inline def setEnableIsosurfacesUndefined: Self = StObject.set(x, "enableIsosurfaces", js.undefined)
    
    inline def setEnableSlices(value: Boolean): Self = StObject.set(x, "enableSlices", value.asInstanceOf[js.Any])
    
    inline def setEnableSlicesUndefined: Self = StObject.set(x, "enableSlices", js.undefined)
    
    inline def setLegendEnabled(value: Boolean): Self = StObject.set(x, "legendEnabled", value.asInstanceOf[js.Any])
    
    inline def setLegendEnabledUndefined: Self = StObject.set(x, "legendEnabled", js.undefined)
    
    inline def setPopupEnabled(value: Boolean): Self = StObject.set(x, "popupEnabled", value.asInstanceOf[js.Any])
    
    inline def setPopupEnabledUndefined: Self = StObject.set(x, "popupEnabled", js.undefined)
    
    inline def setRenderMode(value: volume | surfaces): Self = StObject.set(x, "renderMode", value.asInstanceOf[js.Any])
    
    inline def setRenderModeUndefined: Self = StObject.set(x, "renderMode", js.undefined)
    
    inline def setVariableStyles(value: CollectionProperties[VoxelVariableStyleProperties]): Self = StObject.set(x, "variableStyles", value.asInstanceOf[js.Any])
    
    inline def setVariableStylesUndefined: Self = StObject.set(x, "variableStyles", js.undefined)
    
    inline def setVariableStylesVarargs(value: VoxelVariableStyleProperties*): Self = StObject.set(x, "variableStyles", js.Array(value*))
    
    inline def setVolumeStyles(value: CollectionProperties[voxelVoxelVolumeStyleProperties]): Self = StObject.set(x, "volumeStyles", value.asInstanceOf[js.Any])
    
    inline def setVolumeStylesUndefined: Self = StObject.set(x, "volumeStyles", js.undefined)
    
    inline def setVolumeStylesVarargs(value: voxelVoxelVolumeStyleProperties*): Self = StObject.set(x, "volumeStyles", js.Array(value*))
  }
}
