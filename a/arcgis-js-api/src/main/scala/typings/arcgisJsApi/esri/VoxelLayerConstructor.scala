package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoxelLayerConstructor
  extends StObject
     with /**
  * A voxel layer represents multidimensional volumetric data.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html)
  */
Instantiable0[VoxelLayer]
     with Instantiable1[/* properties */ VoxelLayerProperties, VoxelLayer] {
  
  def fromJSON(json: Any): VoxelLayer = js.native
}
