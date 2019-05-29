package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Polygon")
@js.native
class Polygon () extends EventBindable {
  def this(options: PolygonOptions) = this()
  def contains(point: LngLat): scala.Boolean = js.native
  def getArea(): scala.Double = js.native
  def getBounds(): Bounds = js.native
  def getExtData(): js.Any = js.native
  def getOptions(): PolygonOptions = js.native
  def getPath(): js.Array[js.Array[LngLat] | LngLat] = js.native
  def hide(): scala.Unit = js.native
  def setExtData(ext: js.Any): scala.Unit = js.native
  def setMap(map: Map): scala.Unit = js.native
  def setOptions(opt: PolygonOptions): scala.Unit = js.native
  def setPath(path: js.Array[js.Array[LngLat] | LngLat]): scala.Unit = js.native
  def show(): scala.Unit = js.native
}

