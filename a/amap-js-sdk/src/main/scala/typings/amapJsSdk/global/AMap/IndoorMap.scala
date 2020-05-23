package typings.amapJsSdk.global.AMap

import typings.amapJsSdk.anon.AlwaysShow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.IndoorMap")
@js.native
class IndoorMap protected ()
  extends typings.amapJsSdk.AMap.IndoorMap {
  def this(opts: AlwaysShow) = this()
  /* CompleteClass */
  override def getOpacity(): Double = js.native
  /* CompleteClass */
  override def getSelectedBuilding(): String = js.native
  /* CompleteClass */
  override def getSelectedBuildingId(): String = js.native
  /* CompleteClass */
  override def hide(): Unit = js.native
  /* CompleteClass */
  override def hideFloorBar(): Unit = js.native
  /* CompleteClass */
  override def hideLabels(): Unit = js.native
  /* CompleteClass */
  override def setMap(map: typings.amapJsSdk.AMap.Map): Unit = js.native
  /* CompleteClass */
  override def setOpacity(alpha: Double): Unit = js.native
  /* CompleteClass */
  override def setzIndex(): Unit = js.native
  /* CompleteClass */
  override def show(): Unit = js.native
  /* CompleteClass */
  override def showFloor(floor: Double, noMove: Boolean): Unit = js.native
  /* CompleteClass */
  override def showFloorBar(): Unit = js.native
  /* CompleteClass */
  override def showIndoorMap(indoorid: String, floor: Double, shopid: String): Unit = js.native
  /* CompleteClass */
  override def showLabels(): Unit = js.native
}

