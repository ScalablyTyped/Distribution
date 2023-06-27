package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * Describes a single variable in the [VoxelLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html).
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariable.html)
	 */
trait voxelVoxelVariable extends StObject {
  
  /**
  		 * The original data source description of the variable.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariable.html#description)
  		 */
  val description: String
  
  /**
  		 * The unique identifier for the variable.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariable.html#id)
  		 */
  val id: Double
  
  /**
  		 * The original data source name of the variable.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariable.html#name)
  		 */
  val name: String
  
  /**
  		 * A description of various properties of the variable as it is represented on the GPU.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariable.html#renderingFormat)
  		 */
  val renderingFormat: voxelVoxelVariableRenderingFormat
  
  /**
  		 * The variable units.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariable.html#unit)
  		 */
  val unit: String
  
  /**
  		 * The volumeId of the variable.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariable.html#volumeId)
  		 */
  val volumeId: Double
}
object voxelVoxelVariable {
  
  inline def apply(
    description: String,
    id: Double,
    name: String,
    renderingFormat: voxelVoxelVariableRenderingFormat,
    unit: String,
    volumeId: Double
  ): voxelVoxelVariable = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], renderingFormat = renderingFormat.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], volumeId = volumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[voxelVoxelVariable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: voxelVoxelVariable] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRenderingFormat(value: voxelVoxelVariableRenderingFormat): Self = StObject.set(x, "renderingFormat", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setVolumeId(value: Double): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
  }
}
