package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Circle")
@js.native
class Circle () extends js.Object {
  def this(options: CircleOptions) = this()
  def contains(point: LngLat): scala.Boolean = js.native
  def getBounds(): Bounds = js.native
  def getCenter(): LngLat = js.native
  def getExtData(): js.Any = js.native
  def getOptions(): CircleOptions = js.native
  def getRadius(): scala.Double = js.native
  def hide(): scala.Unit = js.native
  def setCenter(lnglat: LngLat): scala.Unit = js.native
  def setExtData(ext: js.Any): scala.Unit = js.native
  def setMap(map: Map): scala.Unit = js.native
  def setOptions(circleopt: CircleOptions): scala.Unit = js.native
  def setRadius(radius: scala.Double): scala.Unit = js.native
  def show(): scala.Unit = js.native
}

