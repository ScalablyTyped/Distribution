package typings.amapDashJsDashSdk.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Polyline")
@js.native
class Polyline () extends EventBindable {
  def this(options: PolylineOptions) = this()
  def getBounds(): Bounds = js.native
  def getExtData(): js.Any = js.native
  def getLength(): Double = js.native
  def getOptions(): PolylineOptions = js.native
  def getPath(): js.Array[LngLat] = js.native
  def hide(): Unit = js.native
  def setExtData(ext: js.Any): Unit = js.native
  def setMap(map: Map): Unit = js.native
  def setOptions(opt: PolylineOptions): Unit = js.native
  def setPath(path: js.Array[LngLat]): Unit = js.native
  def show(): Unit = js.native
}

