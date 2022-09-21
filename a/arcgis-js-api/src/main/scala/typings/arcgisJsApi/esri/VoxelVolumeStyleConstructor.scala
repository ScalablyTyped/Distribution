package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoxelVolumeStyleConstructor
  extends StObject
     with /**
  * The VolumeStyle allows you to define rendering properties that apply to the volume itself, such as vertical exaggeration and offset.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VoxelVolumeStyle.html)
  */
Instantiable0[VoxelVolumeStyle]
     with Instantiable1[/* properties */ VoxelVolumeStyleProperties, VoxelVolumeStyle] {
  
  def fromJSON(json: Any): VoxelVolumeStyle = js.native
}
