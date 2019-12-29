package typings.activexDashPowerpoint.PowerPoint

import typings.activexDashOffice.Office.CommandBar
import typings.activexDashOffice.Office.CommandBars
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Global")
@js.native
class Global protected () extends js.Object {
  val ActivePresentation: Presentation = js.native
  val ActiveProtectedViewWindow: ProtectedViewWindow = js.native
  val ActiveWindow: DocumentWindow = js.native
  val AddIns: typings.activexDashPowerpoint.PowerPoint.AddIns = js.native
  val AnswerWizard: typings.activexDashOffice.Office.AnswerWizard = js.native
  val Application: typings.activexDashPowerpoint.PowerPoint.Application = js.native
  val Assistant: typings.activexDashOffice.Office.Assistant = js.native
  @JSName("CommandBars")
  val CommandBars_Original: CommandBars = js.native
  val Dialogs: js.Any = js.native
  val FileConverters: typings.activexDashPowerpoint.PowerPoint.FileConverters = js.native
  val IsSandboxed: Boolean = js.native
  @JSName("PowerPoint.Global_typekey")
  var PowerPointDotGlobal_typekey: Global = js.native
  val Presentations: typings.activexDashPowerpoint.PowerPoint.Presentations = js.native
  val ProtectedViewWindows: typings.activexDashPowerpoint.PowerPoint.ProtectedViewWindows = js.native
  val SlideShowWindows: typings.activexDashPowerpoint.PowerPoint.SlideShowWindows = js.native
  val Windows: DocumentWindows = js.native
  def CommandBars(Index: String): CommandBar = js.native
  def CommandBars(Index: Double): CommandBar = js.native
}

