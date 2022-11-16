package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.xyt
import typings.arcgisJsApi.arcgisJsApiStrings.xyz
import typings.arcgisJsApi.arcgisJsApiStrings.xyzt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The VoxelVolume exposes properties that describe the volume and methods to convert to and from voxel space.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVolume.html)
  */
trait VoxelVolume extends StObject {
  
  /**
    * Convert a position in voxel space to the spatialReference of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVolume.html#computeLayerSpaceLocation)
    */
  def computeLayerSpaceLocation(posInVoxelSpace: js.Array[Double]): Point
  
  /**
    * Convert a position from the layer's spatialReference to voxel space for XYZ or XYZT volumes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVolume.html#computeVoxelSpaceLocation)
    */
  def computeVoxelSpaceLocation(pos: Point): js.Array[Double]
  
  /**
    * The unique identifier for the volume.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVolume.html#id)
    */
  val id: Double
  
  /**
    * A 3-component array containing the volume size in voxels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVolume.html#sizeInVoxels)
    */
  var sizeInVoxels: js.Array[Double]
  
  /**
    * Returns the type of the current variable's volume.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVolume.html#volumeType)
    */
  var volumeType: xyz | xyzt | xyt
}
object VoxelVolume {
  
  inline def apply(
    computeLayerSpaceLocation: js.Array[Double] => Point,
    computeVoxelSpaceLocation: Point => js.Array[Double],
    id: Double,
    sizeInVoxels: js.Array[Double],
    volumeType: xyz | xyzt | xyt
  ): VoxelVolume = {
    val __obj = js.Dynamic.literal(computeLayerSpaceLocation = js.Any.fromFunction1(computeLayerSpaceLocation), computeVoxelSpaceLocation = js.Any.fromFunction1(computeVoxelSpaceLocation), id = id.asInstanceOf[js.Any], sizeInVoxels = sizeInVoxels.asInstanceOf[js.Any], volumeType = volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxelVolume]
  }
  
  extension [Self <: VoxelVolume](x: Self) {
    
    inline def setComputeLayerSpaceLocation(value: js.Array[Double] => Point): Self = StObject.set(x, "computeLayerSpaceLocation", js.Any.fromFunction1(value))
    
    inline def setComputeVoxelSpaceLocation(value: Point => js.Array[Double]): Self = StObject.set(x, "computeVoxelSpaceLocation", js.Any.fromFunction1(value))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSizeInVoxels(value: js.Array[Double]): Self = StObject.set(x, "sizeInVoxels", value.asInstanceOf[js.Any])
    
    inline def setSizeInVoxelsVarargs(value: Double*): Self = StObject.set(x, "sizeInVoxels", js.Array(value*))
    
    inline def setVolumeType(value: xyz | xyzt | xyt): Self = StObject.set(x, "volumeType", value.asInstanceOf[js.Any])
  }
}
