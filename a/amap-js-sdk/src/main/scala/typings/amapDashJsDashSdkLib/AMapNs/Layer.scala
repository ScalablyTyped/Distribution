package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Layer")
@js.native
abstract class Layer () extends EventBindable {
  def getTiles(): js.Array[java.lang.String] = js.native
  def getZooms(): js.Array[scala.Double] = js.native
  def hide(): scala.Unit = js.native
  def reload(): scala.Unit = js.native
  def setMap(map: Map): scala.Unit = js.native
  def setOpacity(alpha: scala.Double): scala.Unit = js.native
  def setTileUrl(): scala.Unit = js.native
  def setzIndex(index: scala.Double): scala.Unit = js.native
  def show(): scala.Unit = js.native
}

