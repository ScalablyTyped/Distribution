package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.ToolBar")
@js.native
class ToolBar ()
  extends EventBindable
     with MapControl {
  def this(options: amapDashJsDashSdkLib.Anon_AutoPosition) = this()
  def doLocation(): scala.Unit = js.native
  def getLocation(): amapDashJsDashSdkLib.Anon_Lat = js.native
  def getOffset(): Pixel = js.native
  /* CompleteClass */
  override def hide(): scala.Unit = js.native
  def hideDirection(): scala.Unit = js.native
  def hideLocation(): scala.Unit = js.native
  def hideRuler(): scala.Unit = js.native
  def setOffset(offset: Pixel): scala.Unit = js.native
  /* CompleteClass */
  override def show(): scala.Unit = js.native
  def showDirection(): scala.Unit = js.native
  def showLocation(): scala.Unit = js.native
  def showRuler(): scala.Unit = js.native
}

