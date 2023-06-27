package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoxelRangeFilter extends StObject {
  
  /**
  		 * Whether or not the filter is enabled.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelTransferFunctionStyle.html#VoxelRangeFilter)
  		 */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The data range to render, specified as [minimum, maximum].
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelTransferFunctionStyle.html#VoxelRangeFilter)
  		 */
  var range: js.Array[Double]
}
object VoxelRangeFilter {
  
  inline def apply(range: js.Array[Double]): VoxelRangeFilter = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxelRangeFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VoxelRangeFilter] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setRange(value: js.Array[Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeVarargs(value: Double*): Self = StObject.set(x, "range", js.Array(value*))
  }
}
