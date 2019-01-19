package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.IndoorMap")
@js.native
class IndoorMap protected () extends js.Object {
  def this(opts: amapDashJsDashSdkLib.Anon_AlwaysShow) = this()
  def getOpacity(): scala.Double = js.native
  def getSelectedBuilding(): java.lang.String = js.native
  def getSelectedBuildingId(): java.lang.String = js.native
  def hide(): scala.Unit = js.native
  def hideFloorBar(): scala.Unit = js.native
  def hideLabels(): scala.Unit = js.native
  def setMap(map: Map): scala.Unit = js.native
  def setOpacity(alpha: scala.Double): scala.Unit = js.native
  def setzIndex(): scala.Unit = js.native
  def show(): scala.Unit = js.native
  def showFloor(floor: scala.Double, noMove: scala.Boolean): scala.Unit = js.native
  def showFloorBar(): scala.Unit = js.native
  def showIndoorMap(indoorid: java.lang.String, floor: scala.Double, shopid: java.lang.String): scala.Unit = js.native
  def showLabels(): scala.Unit = js.native
}

