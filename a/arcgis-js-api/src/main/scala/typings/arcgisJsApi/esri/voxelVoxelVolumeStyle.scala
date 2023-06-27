package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait voxelVoxelVolumeStyle
  extends StObject
     with JSONSupport {
  
  /**
  		 * The collection of [VoxelDynamicSection](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelDynamicSection.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVolumeStyle.html#dynamicSections)
  		 */
  var dynamicSections: Collection[VoxelDynamicSection]
  
  /**
  		 * The collection of [VoxelSlice](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelSlice.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVolumeStyle.html#slices)
  		 */
  var slices: Collection[VoxelSlice]
  
  /**
  		 * The vertical exaggeration factor.
  		 *
  		 * @default 1
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVolumeStyle.html#verticalExaggeration)
  		 */
  var verticalExaggeration: Double
  
  /**
  		 * The vertical offset amount.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVolumeStyle.html#verticalOffset)
  		 */
  var verticalOffset: Double
  
  /**
  		 * Id of the volume.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVolumeStyle.html#volumeId)
  		 */
  val volumeId: Double
}
object voxelVoxelVolumeStyle {
  
  inline def apply(
    dynamicSections: Collection[VoxelDynamicSection],
    slices: Collection[VoxelSlice],
    toJSON: () => Any,
    verticalExaggeration: Double,
    verticalOffset: Double,
    volumeId: Double
  ): voxelVoxelVolumeStyle = {
    val __obj = js.Dynamic.literal(dynamicSections = dynamicSections.asInstanceOf[js.Any], slices = slices.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), verticalExaggeration = verticalExaggeration.asInstanceOf[js.Any], verticalOffset = verticalOffset.asInstanceOf[js.Any], volumeId = volumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[voxelVoxelVolumeStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: voxelVoxelVolumeStyle] (val x: Self) extends AnyVal {
    
    inline def setDynamicSections(value: Collection[VoxelDynamicSection]): Self = StObject.set(x, "dynamicSections", value.asInstanceOf[js.Any])
    
    inline def setSlices(value: Collection[VoxelSlice]): Self = StObject.set(x, "slices", value.asInstanceOf[js.Any])
    
    inline def setVerticalExaggeration(value: Double): Self = StObject.set(x, "verticalExaggeration", value.asInstanceOf[js.Any])
    
    inline def setVerticalOffset(value: Double): Self = StObject.set(x, "verticalOffset", value.asInstanceOf[js.Any])
    
    inline def setVolumeId(value: Double): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
  }
}
