package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoxelUniqueValue extends StObject {
  
  /**
    * The color to render this value with.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariableStyle.html#VoxelUniqueValue)
    */
  var color: Color_
  
  /**
    * Whether or not to render data with this value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariableStyle.html#VoxelUniqueValue)
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The label string for this value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariableStyle.html#VoxelUniqueValue)
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * The data value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariableStyle.html#VoxelUniqueValue)
    */
  var value: Double
}
object VoxelUniqueValue {
  
  inline def apply(color: Color_, value: Double): VoxelUniqueValue = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxelUniqueValue]
  }
  
  extension [Self <: VoxelUniqueValue](x: Self) {
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
