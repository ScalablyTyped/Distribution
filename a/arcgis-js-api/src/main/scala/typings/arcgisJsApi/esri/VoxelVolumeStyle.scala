package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoxelVolumeStyle
  extends StObject
     with JSONSupport {
  
  /**
    * The vertical exaggeration factor.
    *
    * @default 1
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VoxelVolumeStyle.html#verticalExaggeration)
    */
  var verticalExaggeration: Double
  
  /**
    * The vertical offset amount.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VoxelVolumeStyle.html#verticalOffset)
    */
  var verticalOffset: Double
  
  /**
    * Id of the volume.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VoxelVolumeStyle.html#volumeId)
    */
  val volumeId: Double
}
object VoxelVolumeStyle {
  
  inline def apply(toJSON: () => Any, verticalExaggeration: Double, verticalOffset: Double, volumeId: Double): VoxelVolumeStyle = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON), verticalExaggeration = verticalExaggeration.asInstanceOf[js.Any], verticalOffset = verticalOffset.asInstanceOf[js.Any], volumeId = volumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxelVolumeStyle]
  }
  
  extension [Self <: VoxelVolumeStyle](x: Self) {
    
    inline def setVerticalExaggeration(value: Double): Self = StObject.set(x, "verticalExaggeration", value.asInstanceOf[js.Any])
    
    inline def setVerticalOffset(value: Double): Self = StObject.set(x, "verticalOffset", value.asInstanceOf[js.Any])
    
    inline def setVolumeId(value: Double): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
  }
}
