package typings.activexDashPowerpoint.PowerPoint

import typings.activexDashOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.ProtectedViewWindow")
@js.native
class ProtectedViewWindow protected () extends js.Object {
  val Active: MsoTriState = js.native
  val Application: typings.activexDashPowerpoint.PowerPoint.Application = js.native
  val Caption: String = js.native
  var Height: Double = js.native
  var Left: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.ProtectedViewWindow_typekey")
  var PowerPointDotProtectedViewWindow_typekey: ProtectedViewWindow = js.native
  val Presentation: typings.activexDashPowerpoint.PowerPoint.Presentation = js.native
  val SourceName: String = js.native
  val SourcePath: String = js.native
  var Top: Double = js.native
  var Width: Double = js.native
  var WindowState: PpWindowState = js.native
  def Activate(): Unit = js.native
  def Close(): Unit = js.native
  /** @param string [ModifyPassword=''] */
  def Edit(): typings.activexDashPowerpoint.PowerPoint.Presentation = js.native
  def Edit(ModifyPassword: String): typings.activexDashPowerpoint.PowerPoint.Presentation = js.native
}

