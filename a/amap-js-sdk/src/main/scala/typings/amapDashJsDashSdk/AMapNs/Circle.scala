package typings.amapDashJsDashSdk.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Circle")
@js.native
class Circle () extends js.Object {
  def this(options: CircleOptions) = this()
  def contains(point: LngLat): Boolean = js.native
  def getBounds(): Bounds = js.native
  def getCenter(): LngLat = js.native
  def getExtData(): js.Any = js.native
  def getOptions(): CircleOptions = js.native
  def getRadius(): Double = js.native
  def hide(): Unit = js.native
  def setCenter(lnglat: LngLat): Unit = js.native
  def setExtData(ext: js.Any): Unit = js.native
  def setMap(map: Map): Unit = js.native
  def setOptions(circleopt: CircleOptions): Unit = js.native
  def setRadius(radius: Double): Unit = js.native
  def show(): Unit = js.native
}

