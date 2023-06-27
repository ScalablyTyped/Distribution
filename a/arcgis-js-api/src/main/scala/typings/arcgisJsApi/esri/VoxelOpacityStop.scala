package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoxelOpacityStop extends StObject {
  
  /**
  		 * The opacity value (0 = transparent, 1 = opaque) to apply to data at this position.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelTransferFunctionStyle.html#VoxelOpacityStop)
  		 */
  var opacity: Double
  
  /**
  		 * The normalized (i.e.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelTransferFunctionStyle.html#VoxelOpacityStop)
  		 */
  var position: Double
}
object VoxelOpacityStop {
  
  inline def apply(opacity: Double, position: Double): VoxelOpacityStop = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxelOpacityStop]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VoxelOpacityStop] (val x: Self) extends AnyVal {
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
