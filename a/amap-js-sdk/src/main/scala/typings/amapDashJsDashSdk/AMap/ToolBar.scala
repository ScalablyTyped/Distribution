package typings.amapDashJsDashSdk.AMap

import typings.amapDashJsDashSdk.Anon_AutoPosition
import typings.amapDashJsDashSdk.Anon_Lat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.ToolBar")
@js.native
class ToolBar ()
  extends EventBindable
     with MapControl {
  def this(options: Anon_AutoPosition) = this()
  def doLocation(): Unit = js.native
  def getLocation(): Anon_Lat = js.native
  def getOffset(): Pixel = js.native
  /* CompleteClass */
  override def hide(): Unit = js.native
  def hideDirection(): Unit = js.native
  def hideLocation(): Unit = js.native
  def hideRuler(): Unit = js.native
  def setOffset(offset: Pixel): Unit = js.native
  /* CompleteClass */
  override def show(): Unit = js.native
  def showDirection(): Unit = js.native
  def showLocation(): Unit = js.native
  def showRuler(): Unit = js.native
}

