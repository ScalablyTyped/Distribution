package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.CommandBar
import typings.activexOffice.Office.CommandBars
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Global extends js.Object {
  
  val ActivePresentation: Presentation = js.native
  
  val ActiveProtectedViewWindow: ProtectedViewWindow = js.native
  
  val ActiveWindow: DocumentWindow = js.native
  
  val AddIns: typings.activexPowerpoint.PowerPoint.AddIns = js.native
  
  val AnswerWizard: typings.activexOffice.Office.AnswerWizard = js.native
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val Assistant: typings.activexOffice.Office.Assistant = js.native
  
  def CommandBars(Index: String): CommandBar = js.native
  def CommandBars(Index: Double): CommandBar = js.native
  @JSName("CommandBars")
  val CommandBars_Original: CommandBars = js.native
  
  val Dialogs: js.Any = js.native
  
  val FileConverters: typings.activexPowerpoint.PowerPoint.FileConverters = js.native
  
  val IsSandboxed: Boolean = js.native
  
  @JSName("PowerPoint.Global_typekey")
  var PowerPointDotGlobal_typekey: Global = js.native
  
  val Presentations: typings.activexPowerpoint.PowerPoint.Presentations = js.native
  
  val ProtectedViewWindows: typings.activexPowerpoint.PowerPoint.ProtectedViewWindows = js.native
  
  val SlideShowWindows: typings.activexPowerpoint.PowerPoint.SlideShowWindows = js.native
  
  val Windows: DocumentWindows = js.native
}
