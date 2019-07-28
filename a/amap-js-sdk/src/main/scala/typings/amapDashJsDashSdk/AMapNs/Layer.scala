package typings.amapDashJsDashSdk.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Layer")
@js.native
abstract class Layer () extends EventBindable {
  def getTiles(): js.Array[String] = js.native
  def getZooms(): js.Array[Double] = js.native
  def hide(): Unit = js.native
  def reload(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  def setOpacity(alpha: Double): Unit = js.native
  def setTileUrl(): Unit = js.native
  def setzIndex(index: Double): Unit = js.native
  def show(): Unit = js.native
}

