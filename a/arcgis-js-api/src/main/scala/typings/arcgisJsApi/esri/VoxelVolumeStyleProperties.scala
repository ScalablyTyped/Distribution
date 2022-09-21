package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoxelVolumeStyleProperties extends StObject {
  
  /**
    * The vertical exaggeration factor.
    *
    * @default 1
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VoxelVolumeStyle.html#verticalExaggeration)
    */
  var verticalExaggeration: js.UndefOr[Double] = js.undefined
  
  /**
    * The vertical offset amount.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VoxelVolumeStyle.html#verticalOffset)
    */
  var verticalOffset: js.UndefOr[Double] = js.undefined
}
object VoxelVolumeStyleProperties {
  
  inline def apply(): VoxelVolumeStyleProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoxelVolumeStyleProperties]
  }
  
  extension [Self <: VoxelVolumeStyleProperties](x: Self) {
    
    inline def setVerticalExaggeration(value: Double): Self = StObject.set(x, "verticalExaggeration", value.asInstanceOf[js.Any])
    
    inline def setVerticalExaggerationUndefined: Self = StObject.set(x, "verticalExaggeration", js.undefined)
    
    inline def setVerticalOffset(value: Double): Self = StObject.set(x, "verticalOffset", value.asInstanceOf[js.Any])
    
    inline def setVerticalOffsetUndefined: Self = StObject.set(x, "verticalOffset", js.undefined)
  }
}
