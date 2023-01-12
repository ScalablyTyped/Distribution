package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.AnswerWizard
import typings.activexOffice.Office.Assistant
import typings.activexOffice.Office.CommandBar
import typings.activexOffice.Office.CommandBars
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Global extends StObject {
  
  val ActivePresentation: Presentation
  
  val ActiveProtectedViewWindow: ProtectedViewWindow
  
  val ActiveWindow: DocumentWindow
  
  val AddIns: typings.activexPowerpoint.PowerPoint.AddIns
  
  val AnswerWizard: typings.activexOffice.Office.AnswerWizard
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val Assistant: typings.activexOffice.Office.Assistant
  
  def CommandBars(Index: String): CommandBar
  def CommandBars(Index: Double): CommandBar
  @JSName("CommandBars")
  val CommandBars_Original: CommandBars
  
  val Dialogs: Any
  
  val FileConverters: typings.activexPowerpoint.PowerPoint.FileConverters
  
  val IsSandboxed: Boolean
  
  /* private */ @JSName("PowerPoint.Global_typekey")
  var PowerPointDotGlobal_typekey: Global
  
  val Presentations: typings.activexPowerpoint.PowerPoint.Presentations
  
  val ProtectedViewWindows: typings.activexPowerpoint.PowerPoint.ProtectedViewWindows
  
  val SlideShowWindows: typings.activexPowerpoint.PowerPoint.SlideShowWindows
  
  val Windows: DocumentWindows
}
object Global {
  
  inline def apply(
    ActivePresentation: Presentation,
    ActiveProtectedViewWindow: ProtectedViewWindow,
    ActiveWindow: DocumentWindow,
    AddIns: AddIns,
    AnswerWizard: AnswerWizard,
    Application: Application,
    Assistant: Assistant,
    CommandBars: CommandBars,
    Dialogs: Any,
    FileConverters: FileConverters,
    IsSandboxed: Boolean,
    PowerPointDotGlobal_typekey: Global,
    Presentations: Presentations,
    ProtectedViewWindows: ProtectedViewWindows,
    SlideShowWindows: SlideShowWindows,
    Windows: DocumentWindows
  ): Global = {
    val __obj = js.Dynamic.literal(ActivePresentation = ActivePresentation.asInstanceOf[js.Any], ActiveProtectedViewWindow = ActiveProtectedViewWindow.asInstanceOf[js.Any], ActiveWindow = ActiveWindow.asInstanceOf[js.Any], AddIns = AddIns.asInstanceOf[js.Any], AnswerWizard = AnswerWizard.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Assistant = Assistant.asInstanceOf[js.Any], CommandBars = CommandBars.asInstanceOf[js.Any], Dialogs = Dialogs.asInstanceOf[js.Any], FileConverters = FileConverters.asInstanceOf[js.Any], IsSandboxed = IsSandboxed.asInstanceOf[js.Any], Presentations = Presentations.asInstanceOf[js.Any], ProtectedViewWindows = ProtectedViewWindows.asInstanceOf[js.Any], SlideShowWindows = SlideShowWindows.asInstanceOf[js.Any], Windows = Windows.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Global_typekey")(PowerPointDotGlobal_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Global]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Global] (val x: Self) extends AnyVal {
    
    inline def setActivePresentation(value: Presentation): Self = StObject.set(x, "ActivePresentation", value.asInstanceOf[js.Any])
    
    inline def setActiveProtectedViewWindow(value: ProtectedViewWindow): Self = StObject.set(x, "ActiveProtectedViewWindow", value.asInstanceOf[js.Any])
    
    inline def setActiveWindow(value: DocumentWindow): Self = StObject.set(x, "ActiveWindow", value.asInstanceOf[js.Any])
    
    inline def setAddIns(value: AddIns): Self = StObject.set(x, "AddIns", value.asInstanceOf[js.Any])
    
    inline def setAnswerWizard(value: AnswerWizard): Self = StObject.set(x, "AnswerWizard", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAssistant(value: Assistant): Self = StObject.set(x, "Assistant", value.asInstanceOf[js.Any])
    
    inline def setCommandBars(value: CommandBars): Self = StObject.set(x, "CommandBars", value.asInstanceOf[js.Any])
    
    inline def setDialogs(value: Any): Self = StObject.set(x, "Dialogs", value.asInstanceOf[js.Any])
    
    inline def setFileConverters(value: FileConverters): Self = StObject.set(x, "FileConverters", value.asInstanceOf[js.Any])
    
    inline def setIsSandboxed(value: Boolean): Self = StObject.set(x, "IsSandboxed", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotGlobal_typekey(value: Global): Self = StObject.set(x, "PowerPoint.Global_typekey", value.asInstanceOf[js.Any])
    
    inline def setPresentations(value: Presentations): Self = StObject.set(x, "Presentations", value.asInstanceOf[js.Any])
    
    inline def setProtectedViewWindows(value: ProtectedViewWindows): Self = StObject.set(x, "ProtectedViewWindows", value.asInstanceOf[js.Any])
    
    inline def setSlideShowWindows(value: SlideShowWindows): Self = StObject.set(x, "SlideShowWindows", value.asInstanceOf[js.Any])
    
    inline def setWindows(value: DocumentWindows): Self = StObject.set(x, "Windows", value.asInstanceOf[js.Any])
  }
}
