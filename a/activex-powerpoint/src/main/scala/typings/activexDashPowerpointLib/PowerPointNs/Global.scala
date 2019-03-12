package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Global")
@js.native
class Global protected () extends js.Object {
  val ActivePresentation: Presentation = js.native
  val ActiveProtectedViewWindow: ProtectedViewWindow = js.native
  val ActiveWindow: DocumentWindow = js.native
  val AddIns: activexDashPowerpointLib.PowerPointNs.AddIns = js.native
  val AnswerWizard: activexDashOfficeLib.OfficeNs.AnswerWizard = js.native
  val Application: activexDashPowerpointLib.PowerPointNs.Application = js.native
  val Assistant: activexDashOfficeLib.OfficeNs.Assistant = js.native
  @JSName("CommandBars")
  val CommandBars_Original: activexDashOfficeLib.OfficeNs.CommandBars = js.native
  val Dialogs: js.Any = js.native
  val FileConverters: activexDashPowerpointLib.PowerPointNs.FileConverters = js.native
  val IsSandboxed: scala.Boolean = js.native
  var `PowerPoint.Global_typekey`: Global = js.native
  val Presentations: activexDashPowerpointLib.PowerPointNs.Presentations = js.native
  val ProtectedViewWindows: activexDashPowerpointLib.PowerPointNs.ProtectedViewWindows = js.native
  val SlideShowWindows: activexDashPowerpointLib.PowerPointNs.SlideShowWindows = js.native
  val Windows: DocumentWindows = js.native
  def CommandBars(Index: java.lang.String): activexDashOfficeLib.OfficeNs.CommandBar = js.native
  def CommandBars(Index: scala.Double): activexDashOfficeLib.OfficeNs.CommandBar = js.native
}

