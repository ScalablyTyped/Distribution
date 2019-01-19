package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Polyline")
@js.native
class Polyline () extends EventBindable {
  def this(options: PolylineOptions) = this()
  def getBounds(): Bounds = js.native
  def getExtData(): js.Any = js.native
  def getLength(): scala.Double = js.native
  def getOptions(): PolylineOptions = js.native
  def getPath(): js.Array[LngLat] = js.native
  def hide(): scala.Unit = js.native
  def setExtData(ext: js.Any): scala.Unit = js.native
  def setMap(map: Map): scala.Unit = js.native
  def setOptions(opt: PolylineOptions): scala.Unit = js.native
  def setPath(path: js.Array[LngLat]): scala.Unit = js.native
  def show(): scala.Unit = js.native
}

