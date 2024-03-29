package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.Float32
import typings.arcgisJsApi.arcgisJsApiStrings.Int16
import typings.arcgisJsApi.arcgisJsApiStrings.Int32
import typings.arcgisJsApi.arcgisJsApiStrings.Int8
import typings.arcgisJsApi.arcgisJsApiStrings.UInt16
import typings.arcgisJsApi.arcgisJsApiStrings.UInt32
import typings.arcgisJsApi.arcgisJsApiStrings.UInt8
import typings.arcgisJsApi.arcgisJsApiStrings.continuous
import typings.arcgisJsApi.arcgisJsApiStrings.discrete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait voxelVoxelVariableRenderingFormat extends StObject {
  
  /**
  		 * Whether or not the data is discrete or continuous.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariable.html#renderingFormat)
  		 */
  var continuity: discrete | continuous
  
  /**
  		 * Whether or not the data has a value representing NoData.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariable.html#renderingFormat)
  		 */
  var hasNoData: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The NoData value if there is one.
  		 *
  		 * @default 0.0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariable.html#renderingFormat)
  		 */
  var noData: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Indicates how the data are encoded.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariable.html#renderingFormat)
  		 */
  var `type`: Int8 | UInt8 | Int16 | UInt16 | Int32 | UInt32 | Float32
}
object voxelVoxelVariableRenderingFormat {
  
  inline def apply(
    continuity: discrete | continuous,
    `type`: Int8 | UInt8 | Int16 | UInt16 | Int32 | UInt32 | Float32
  ): voxelVoxelVariableRenderingFormat = {
    val __obj = js.Dynamic.literal(continuity = continuity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[voxelVoxelVariableRenderingFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: voxelVoxelVariableRenderingFormat] (val x: Self) extends AnyVal {
    
    inline def setContinuity(value: discrete | continuous): Self = StObject.set(x, "continuity", value.asInstanceOf[js.Any])
    
    inline def setHasNoData(value: Boolean): Self = StObject.set(x, "hasNoData", value.asInstanceOf[js.Any])
    
    inline def setHasNoDataUndefined: Self = StObject.set(x, "hasNoData", js.undefined)
    
    inline def setNoData(value: Double): Self = StObject.set(x, "noData", value.asInstanceOf[js.Any])
    
    inline def setNoDataUndefined: Self = StObject.set(x, "noData", js.undefined)
    
    inline def setType(value: Int8 | UInt8 | Int16 | UInt16 | Int32 | UInt32 | Float32): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
