package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoxelVolumeStyleProperties extends StObject {
  
  /**
  		 * The collection of [VoxelDynamicSection](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelDynamicSection.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VoxelVolumeStyle.html#dynamicSections)
  		 */
  var dynamicSections: js.UndefOr[CollectionProperties[VoxelDynamicSectionProperties]] = js.undefined
  
  /**
  		 * The collection of [VoxelSlice](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelSlice.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VoxelVolumeStyle.html#slices)
  		 */
  var slices: js.UndefOr[CollectionProperties[VoxelSliceProperties]] = js.undefined
  
  /**
  		 * The vertical exaggeration factor.
  		 *
  		 * @default 1
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VoxelVolumeStyle.html#verticalExaggeration)
  		 */
  var verticalExaggeration: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The vertical offset amount.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VoxelVolumeStyle.html#verticalOffset)
  		 */
  var verticalOffset: js.UndefOr[Double] = js.undefined
}
object VoxelVolumeStyleProperties {
  
  inline def apply(): VoxelVolumeStyleProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoxelVolumeStyleProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VoxelVolumeStyleProperties] (val x: Self) extends AnyVal {
    
    inline def setDynamicSections(value: CollectionProperties[VoxelDynamicSectionProperties]): Self = StObject.set(x, "dynamicSections", value.asInstanceOf[js.Any])
    
    inline def setDynamicSectionsUndefined: Self = StObject.set(x, "dynamicSections", js.undefined)
    
    inline def setDynamicSectionsVarargs(value: VoxelDynamicSectionProperties*): Self = StObject.set(x, "dynamicSections", js.Array(value*))
    
    inline def setSlices(value: CollectionProperties[VoxelSliceProperties]): Self = StObject.set(x, "slices", value.asInstanceOf[js.Any])
    
    inline def setSlicesUndefined: Self = StObject.set(x, "slices", js.undefined)
    
    inline def setSlicesVarargs(value: VoxelSliceProperties*): Self = StObject.set(x, "slices", js.Array(value*))
    
    inline def setVerticalExaggeration(value: Double): Self = StObject.set(x, "verticalExaggeration", value.asInstanceOf[js.Any])
    
    inline def setVerticalExaggerationUndefined: Self = StObject.set(x, "verticalExaggeration", js.undefined)
    
    inline def setVerticalOffset(value: Double): Self = StObject.set(x, "verticalOffset", value.asInstanceOf[js.Any])
    
    inline def setVerticalOffsetUndefined: Self = StObject.set(x, "verticalOffset", js.undefined)
  }
}
