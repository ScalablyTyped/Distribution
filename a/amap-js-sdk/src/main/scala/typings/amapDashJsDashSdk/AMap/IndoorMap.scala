package typings.amapDashJsDashSdk.AMap

import typings.amapDashJsDashSdk.Anon_AlwaysShow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.IndoorMap")
@js.native
class IndoorMap protected () extends js.Object {
  def this(opts: Anon_AlwaysShow) = this()
  def getOpacity(): Double = js.native
  def getSelectedBuilding(): String = js.native
  def getSelectedBuildingId(): String = js.native
  def hide(): Unit = js.native
  def hideFloorBar(): Unit = js.native
  def hideLabels(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  def setOpacity(alpha: Double): Unit = js.native
  def setzIndex(): Unit = js.native
  def show(): Unit = js.native
  def showFloor(floor: Double, noMove: Boolean): Unit = js.native
  def showFloorBar(): Unit = js.native
  def showIndoorMap(indoorid: String, floor: Double, shopid: String): Unit = js.native
  def showLabels(): Unit = js.native
}

