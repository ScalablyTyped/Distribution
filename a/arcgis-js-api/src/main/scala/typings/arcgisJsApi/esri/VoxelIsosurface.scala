package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoxelIsosurface extends StObject {
  
  /**
    * The color to render this isosurface with.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariableStyle.html#VoxelIsosurface)
    */
  var color: Color_
  
  /**
    * Whether or not the isosurface color is automatically updated when the variable's transfer function's color stops change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariableStyle.html#VoxelIsosurface)
    */
  var colorLocked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether or not to render this isosurface.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariableStyle.html#VoxelIsosurface)
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The label string for this isosurface.
    *
    * [Read more...](global.html)
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * The data value for this isosurface.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariableStyle.html#VoxelIsosurface)
    */
  var value: Double
}
object VoxelIsosurface {
  
  inline def apply(color: Color_, value: Double): VoxelIsosurface = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxelIsosurface]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VoxelIsosurface] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorLocked(value: Boolean): Self = StObject.set(x, "colorLocked", value.asInstanceOf[js.Any])
    
    inline def setColorLockedUndefined: Self = StObject.set(x, "colorLocked", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
