package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoxelTransferFunctionStyleProperties extends StObject {
  
  /**
  		 * A collection of colors and normalized positions which describe how to colorize the data values that are within the [stretchRange](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelTransferFunctionStyle.html#stretchRange).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelTransferFunctionStyle.html#colorStops)
  		 */
  var colorStops: js.UndefOr[CollectionProperties[VoxelColorStop]] = js.undefined
  
  /**
  		 * A collection of transparency values and normalized positions which describe how to apply transparency to the data values that are within the [stretchRange](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelTransferFunctionStyle.html#stretchRange).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelTransferFunctionStyle.html#opacityStops)
  		 */
  var opacityStops: js.UndefOr[CollectionProperties[VoxelOpacityStop]] = js.undefined
  
  /**
  		 * Defines the data range which will be rendered.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelTransferFunctionStyle.html#rangeFilter)
  		 */
  var rangeFilter: js.UndefOr[VoxelRangeFilter] = js.undefined
  
  /**
  		 * The data range to apply the color and alpha stops to, specified as [minimum, maximum] in the units of the data.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelTransferFunctionStyle.html#stretchRange)
  		 */
  var stretchRange: js.UndefOr[js.Array[Double]] = js.undefined
}
object VoxelTransferFunctionStyleProperties {
  
  inline def apply(): VoxelTransferFunctionStyleProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoxelTransferFunctionStyleProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VoxelTransferFunctionStyleProperties] (val x: Self) extends AnyVal {
    
    inline def setColorStops(value: CollectionProperties[VoxelColorStop]): Self = StObject.set(x, "colorStops", value.asInstanceOf[js.Any])
    
    inline def setColorStopsUndefined: Self = StObject.set(x, "colorStops", js.undefined)
    
    inline def setColorStopsVarargs(value: VoxelColorStop*): Self = StObject.set(x, "colorStops", js.Array(value*))
    
    inline def setOpacityStops(value: CollectionProperties[VoxelOpacityStop]): Self = StObject.set(x, "opacityStops", value.asInstanceOf[js.Any])
    
    inline def setOpacityStopsUndefined: Self = StObject.set(x, "opacityStops", js.undefined)
    
    inline def setOpacityStopsVarargs(value: VoxelOpacityStop*): Self = StObject.set(x, "opacityStops", js.Array(value*))
    
    inline def setRangeFilter(value: VoxelRangeFilter): Self = StObject.set(x, "rangeFilter", value.asInstanceOf[js.Any])
    
    inline def setRangeFilterUndefined: Self = StObject.set(x, "rangeFilter", js.undefined)
    
    inline def setStretchRange(value: js.Array[Double]): Self = StObject.set(x, "stretchRange", value.asInstanceOf[js.Any])
    
    inline def setStretchRangeUndefined: Self = StObject.set(x, "stretchRange", js.undefined)
    
    inline def setStretchRangeVarargs(value: Double*): Self = StObject.set(x, "stretchRange", js.Array(value*))
  }
}
