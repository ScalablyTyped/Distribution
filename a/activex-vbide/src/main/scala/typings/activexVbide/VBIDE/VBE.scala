package typings.activexVbide.VBIDE

import typings.activexOffice.Office.CommandBar
import typings.activexOffice.Office.CommandBars
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VBE extends StObject {
  
  var ActiveCodePane: CodePane
  
  var ActiveVBProject: VBProject
  
  val ActiveWindow: Window
  
  def Addins(index: js.Any): AddIn
  @JSName("Addins")
  val Addins_Original: Addins
  
  def CodePanes(index: js.Any): CodePane
  @JSName("CodePanes")
  val CodePanes_Original: CodePanes
  
  def CommandBars(Index: String): CommandBar
  def CommandBars(Index: Double): CommandBar
  @JSName("CommandBars")
  val CommandBars_Original: CommandBars
  
  val Events: typings.activexVbide.VBIDE.Events
  
  val MainWindow: Window
  
  val SelectedVBComponent: VBComponent
  
  /* private */ @JSName("VBIDE.VBE_typekey")
  var VBIDEDotVBE_typekey: VBE
  
  def VBProjects(index: js.Any): VBProject
  @JSName("VBProjects")
  val VBProjects_Original: VBProjects
  
  val Version: String
  
  def Windows(index: js.Any): Window
  @JSName("Windows")
  val Windows_Original: Windows
}
object VBE {
  
  inline def apply(
    ActiveCodePane: CodePane,
    ActiveVBProject: VBProject,
    ActiveWindow: Window,
    Addins: Addins,
    CodePanes: CodePanes,
    CommandBars: CommandBars,
    Events: Events,
    MainWindow: Window,
    SelectedVBComponent: VBComponent,
    VBIDEDotVBE_typekey: VBE,
    VBProjects: VBProjects,
    Version: String,
    Windows: Windows
  ): VBE = {
    val __obj = js.Dynamic.literal(ActiveCodePane = ActiveCodePane.asInstanceOf[js.Any], ActiveVBProject = ActiveVBProject.asInstanceOf[js.Any], ActiveWindow = ActiveWindow.asInstanceOf[js.Any], Addins = Addins.asInstanceOf[js.Any], CodePanes = CodePanes.asInstanceOf[js.Any], CommandBars = CommandBars.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], MainWindow = MainWindow.asInstanceOf[js.Any], SelectedVBComponent = SelectedVBComponent.asInstanceOf[js.Any], VBProjects = VBProjects.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any], Windows = Windows.asInstanceOf[js.Any])
    __obj.updateDynamic("VBIDE.VBE_typekey")(VBIDEDotVBE_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[VBE]
  }
  
  extension [Self <: VBE](x: Self) {
    
    inline def setActiveCodePane(value: CodePane): Self = StObject.set(x, "ActiveCodePane", value.asInstanceOf[js.Any])
    
    inline def setActiveVBProject(value: VBProject): Self = StObject.set(x, "ActiveVBProject", value.asInstanceOf[js.Any])
    
    inline def setActiveWindow(value: Window): Self = StObject.set(x, "ActiveWindow", value.asInstanceOf[js.Any])
    
    inline def setAddins(value: Addins): Self = StObject.set(x, "Addins", value.asInstanceOf[js.Any])
    
    inline def setCodePanes(value: CodePanes): Self = StObject.set(x, "CodePanes", value.asInstanceOf[js.Any])
    
    inline def setCommandBars(value: CommandBars): Self = StObject.set(x, "CommandBars", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: Events): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setMainWindow(value: Window): Self = StObject.set(x, "MainWindow", value.asInstanceOf[js.Any])
    
    inline def setSelectedVBComponent(value: VBComponent): Self = StObject.set(x, "SelectedVBComponent", value.asInstanceOf[js.Any])
    
    inline def setVBIDEDotVBE_typekey(value: VBE): Self = StObject.set(x, "VBIDE.VBE_typekey", value.asInstanceOf[js.Any])
    
    inline def setVBProjects(value: VBProjects): Self = StObject.set(x, "VBProjects", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setWindows(value: Windows): Self = StObject.set(x, "Windows", value.asInstanceOf[js.Any])
  }
}
