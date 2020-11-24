package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Polygon extends EventBindable {
  
  def contains(point: LngLat): Boolean = js.native
  
  def getArea(): Double = js.native
  
  def getBounds(): Bounds = js.native
  
  def getExtData(): js.Any = js.native
  
  def getOptions(): PolygonOptions = js.native
  
  def getPath(): js.Array[js.Array[LngLat] | LngLat] = js.native
  
  def hide(): Unit = js.native
  
  def setExtData(ext: js.Any): Unit = js.native
  
  def setMap(map: Map): Unit = js.native
  
  def setOptions(opt: PolygonOptions): Unit = js.native
  
  def setPath(path: js.Array[js.Array[LngLat] | LngLat]): Unit = js.native
  
  def show(): Unit = js.native
}
