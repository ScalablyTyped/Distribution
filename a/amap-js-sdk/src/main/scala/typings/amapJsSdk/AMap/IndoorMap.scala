package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndoorMap extends js.Object {
  def getOpacity(): Double
  def getSelectedBuilding(): String
  def getSelectedBuildingId(): String
  def hide(): Unit
  def hideFloorBar(): Unit
  def hideLabels(): Unit
  def setMap(map: Map): Unit
  def setOpacity(alpha: Double): Unit
  def setzIndex(): Unit
  def show(): Unit
  def showFloor(floor: Double, noMove: Boolean): Unit
  def showFloorBar(): Unit
  def showIndoorMap(indoorid: String, floor: Double, shopid: String): Unit
  def showLabels(): Unit
}

object IndoorMap {
  @scala.inline
  def apply(
    getOpacity: () => Double,
    getSelectedBuilding: () => String,
    getSelectedBuildingId: () => String,
    hide: () => Unit,
    hideFloorBar: () => Unit,
    hideLabels: () => Unit,
    setMap: Map => Unit,
    setOpacity: Double => Unit,
    setzIndex: () => Unit,
    show: () => Unit,
    showFloor: (Double, Boolean) => Unit,
    showFloorBar: () => Unit,
    showIndoorMap: (String, Double, String) => Unit,
    showLabels: () => Unit
  ): IndoorMap = {
    val __obj = js.Dynamic.literal(getOpacity = js.Any.fromFunction0(getOpacity), getSelectedBuilding = js.Any.fromFunction0(getSelectedBuilding), getSelectedBuildingId = js.Any.fromFunction0(getSelectedBuildingId), hide = js.Any.fromFunction0(hide), hideFloorBar = js.Any.fromFunction0(hideFloorBar), hideLabels = js.Any.fromFunction0(hideLabels), setMap = js.Any.fromFunction1(setMap), setOpacity = js.Any.fromFunction1(setOpacity), setzIndex = js.Any.fromFunction0(setzIndex), show = js.Any.fromFunction0(show), showFloor = js.Any.fromFunction2(showFloor), showFloorBar = js.Any.fromFunction0(showFloorBar), showIndoorMap = js.Any.fromFunction3(showIndoorMap), showLabels = js.Any.fromFunction0(showLabels))
    __obj.asInstanceOf[IndoorMap]
  }
}

