package typings.activexDashPowerpoint.PowerPointNs

import typings.activexDashOffice.OfficeNs.CommandBar
import typings.activexDashOffice.OfficeNs.CommandBars
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Global")
@js.native
class Global protected () extends js.Object {
  val ActivePresentation: Presentation = js.native
  val ActiveProtectedViewWindow: ProtectedViewWindow = js.native
  val ActiveWindow: DocumentWindow = js.native
  val AddIns: typings.activexDashPowerpoint.PowerPointNs.AddIns = js.native
  val AnswerWizard: typings.activexDashOffice.OfficeNs.AnswerWizard = js.native
  val Application: typings.activexDashPowerpoint.PowerPointNs.Application = js.native
  val Assistant: typings.activexDashOffice.OfficeNs.Assistant = js.native
  @JSName("CommandBars")
  val CommandBars_Original: CommandBars = js.native
  val Dialogs: js.Any = js.native
  val FileConverters: typings.activexDashPowerpoint.PowerPointNs.FileConverters = js.native
  val IsSandboxed: Boolean = js.native
  var `PowerPoint.Global_typekey`: Global = js.native
  val Presentations: typings.activexDashPowerpoint.PowerPointNs.Presentations = js.native
  val ProtectedViewWindows: typings.activexDashPowerpoint.PowerPointNs.ProtectedViewWindows = js.native
  val SlideShowWindows: typings.activexDashPowerpoint.PowerPointNs.SlideShowWindows = js.native
  val Windows: DocumentWindows = js.native
  def CommandBars(Index: String): CommandBar = js.native
  def CommandBars(Index: Double): CommandBar = js.native
}

