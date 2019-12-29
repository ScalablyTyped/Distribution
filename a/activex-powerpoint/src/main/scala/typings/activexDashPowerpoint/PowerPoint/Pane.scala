package typings.activexDashPowerpoint.PowerPoint

import typings.activexDashOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Pane")
@js.native
class Pane protected () extends js.Object {
  val Active: MsoTriState = js.native
  val Application: typings.activexDashPowerpoint.PowerPoint.Application = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Pane_typekey")
  var PowerPointDotPane_typekey: Pane = js.native
  val ViewType: PpViewType = js.native
  def Activate(): Unit = js.native
}

