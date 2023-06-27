package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoxelTransferFunctionStyle
  extends StObject
     with JSONSupport {
  
  /**
  		 * A collection of colors and normalized positions which describe how to colorize the data values that are within the [stretchRange](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelTransferFunctionStyle.html#stretchRange).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelTransferFunctionStyle.html#colorStops)
  		 */
  var colorStops: Collection[VoxelColorStop]
  
  /**
  		 * A collection of transparency values and normalized positions which describe how to apply transparency to the data values that are within the [stretchRange](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelTransferFunctionStyle.html#stretchRange).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelTransferFunctionStyle.html#opacityStops)
  		 */
  var opacityStops: Collection[VoxelOpacityStop]
  
  /**
  		 * Defines the data range which will be rendered.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelTransferFunctionStyle.html#rangeFilter)
  		 */
  var rangeFilter: VoxelRangeFilter
  
  /**
  		 * The data range to apply the color and alpha stops to, specified as [minimum, maximum] in the units of the data.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelTransferFunctionStyle.html#stretchRange)
  		 */
  var stretchRange: js.Array[Double]
}
object VoxelTransferFunctionStyle {
  
  inline def apply(
    colorStops: Collection[VoxelColorStop],
    opacityStops: Collection[VoxelOpacityStop],
    rangeFilter: VoxelRangeFilter,
    stretchRange: js.Array[Double],
    toJSON: () => Any
  ): VoxelTransferFunctionStyle = {
    val __obj = js.Dynamic.literal(colorStops = colorStops.asInstanceOf[js.Any], opacityStops = opacityStops.asInstanceOf[js.Any], rangeFilter = rangeFilter.asInstanceOf[js.Any], stretchRange = stretchRange.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[VoxelTransferFunctionStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VoxelTransferFunctionStyle] (val x: Self) extends AnyVal {
    
    inline def setColorStops(value: Collection[VoxelColorStop]): Self = StObject.set(x, "colorStops", value.asInstanceOf[js.Any])
    
    inline def setOpacityStops(value: Collection[VoxelOpacityStop]): Self = StObject.set(x, "opacityStops", value.asInstanceOf[js.Any])
    
    inline def setRangeFilter(value: VoxelRangeFilter): Self = StObject.set(x, "rangeFilter", value.asInstanceOf[js.Any])
    
    inline def setStretchRange(value: js.Array[Double]): Self = StObject.set(x, "stretchRange", value.asInstanceOf[js.Any])
    
    inline def setStretchRangeVarargs(value: Double*): Self = StObject.set(x, "stretchRange", js.Array(value*))
  }
}
