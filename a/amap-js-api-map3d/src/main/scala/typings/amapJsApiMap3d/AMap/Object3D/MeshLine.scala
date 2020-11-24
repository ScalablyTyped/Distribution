package typings.amapJsApiMap3d.AMap.Object3D

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApi.AMap.Pixel
import typings.amapJsApiMap3d.anon.Color
import typings.amapJsApiMap3d.anon.Geometry3DreadonlyvertexI
import typings.amapJsApiMap3d.anon.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// inherit from WideLine
@js.native
trait MeshLine
  extends typings.amapJsApiMap3d.AMap.Object3D {
  
  @JSName("geometry")
  val geometry_MeshLine: Geometry3DreadonlyvertexI = js.native
  
  def setColor(color: String): Unit = js.native
  
  def setHeight(height: js.Array[Double]): Unit = js.native
  def setHeight(height: Double): Unit = js.native
  
  def setPath(path: js.Array[LngLat | Pixel | (js.Tuple2[Double, Double])]): Unit = js.native
  
  def setWidth(width: Double): Unit = js.native
  
  var width: Double = js.native
}
@JSGlobal("AMap.Object3D.MeshLine")
@js.native
object MeshLine extends js.Object {
  
  type Options = Color with (Path | typings.amapJsApiMap3d.anon.Unit)
}
