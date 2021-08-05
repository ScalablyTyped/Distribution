package typings.activexVbide

import typings.activexOffice.Office.CommandBar
import typings.activexOffice.Office.CommandBars
import typings.activexVbide.VBIDE.Addins
import typings.activexVbide.VBIDE.CodePanes
import typings.activexVbide.VBIDE.Components
import typings.activexVbide.VBIDE.LinkedWindows
import typings.activexVbide.VBIDE.Properties
import typings.activexVbide.VBIDE.References
import typings.activexVbide.VBIDE.VBComponents
import typings.activexVbide.VBIDE.VBProjects
import typings.activexVbide.VBIDE.Windows
import typings.activexVbide.VBIDE.vbextCodePaneview
import typings.activexVbide.VBIDE.vbextComponentType
import typings.activexVbide.VBIDE.vbextProjectProtection
import typings.activexVbide.VBIDE.vbextProjectType
import typings.activexVbide.VBIDE.vbextRefKind
import typings.activexVbide.VBIDE.vbextVBAMode
import typings.activexVbide.VBIDE.vbextWindowState
import typings.activexVbide.VBIDE.vbextWindowType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object VBIDE {
    
    @JSGlobal("VBIDE.AddIn")
    @js.native
    /* private */ class AddIn ()
      extends StObject
         with typings.activexVbide.VBIDE.AddIn {
      
      /* CompleteClass */
      override def Collection(index: js.Any): typings.activexVbide.VBIDE.AddIn = js.native
      /* CompleteClass */
      @JSName("Collection")
      override val Collection_Original: Addins = js.native
      
      /* CompleteClass */
      var Connect: Boolean = js.native
      
      /* CompleteClass */
      var Description: String = js.native
      
      /* CompleteClass */
      override val Guid: String = js.native
      
      /* CompleteClass */
      var Object: js.Any = js.native
      
      /* CompleteClass */
      override val ProgId: String = js.native
      
      /* CompleteClass */
      override val VBE: typings.activexVbide.VBIDE.VBE = js.native
      
      /* private */ /* CompleteClass */
      @JSName("VBIDE.AddIn_typekey")
      var VBIDEDotAddIn_typekey: typings.activexVbide.VBIDE.AddIn = js.native
    }
    
    @JSGlobal("VBIDE.Application")
    @js.native
    /* private */ class Application ()
      extends StObject
         with typings.activexVbide.VBIDE.Application {
      
      /* private */ /* CompleteClass */
      @JSName("VBIDE.Application_typekey")
      var VBIDEDotApplication_typekey: typings.activexVbide.VBIDE.Application = js.native
      
      /* CompleteClass */
      override val Version: String = js.native
    }
    
    @JSGlobal("VBIDE.CodeModule")
    @js.native
    /* private */ class CodeModule ()
      extends StObject
         with typings.activexVbide.VBIDE.CodeModule
    
    @JSGlobal("VBIDE.CodePane")
    @js.native
    /* private */ class CodePane ()
      extends StObject
         with typings.activexVbide.VBIDE.CodePane {
      
      /* CompleteClass */
      override val CodeModule: typings.activexVbide.VBIDE.CodeModule = js.native
      
      /* CompleteClass */
      override val CodePaneView: vbextCodePaneview = js.native
      
      /* CompleteClass */
      override def Collection(index: js.Any): typings.activexVbide.VBIDE.CodePane = js.native
      /* CompleteClass */
      @JSName("Collection")
      override val Collection_Original: CodePanes = js.native
      
      /* CompleteClass */
      override val CountOfVisibleLines: Double = js.native
      
      /* CompleteClass */
      override def GetSelection(StartLine: Double, StartColumn: Double, EndLine: Double, EndColumn: Double): Unit = js.native
      
      /* CompleteClass */
      override def SetSelection(StartLine: Double, StartColumn: Double, EndLine: Double, EndColumn: Double): Unit = js.native
      
      /* CompleteClass */
      override def Show(): Unit = js.native
      
      /* CompleteClass */
      var TopLine: Double = js.native
      
      /* CompleteClass */
      override val VBE: typings.activexVbide.VBIDE.VBE = js.native
      
      /* private */ /* CompleteClass */
      @JSName("VBIDE.CodePane_typekey")
      var VBIDEDotCodePane_typekey: typings.activexVbide.VBIDE.CodePane = js.native
      
      /* CompleteClass */
      override val Window: typings.activexVbide.VBIDE.Window = js.native
    }
    
    @JSGlobal("VBIDE.CommandBarEvents")
    @js.native
    /* private */ class CommandBarEvents ()
      extends StObject
         with typings.activexVbide.VBIDE.CommandBarEvents {
      
      /* private */ /* CompleteClass */
      @JSName("VBIDE.CommandBarEvents_typekey")
      var VBIDEDotCommandBarEvents_typekey: typings.activexVbide.VBIDE.CommandBarEvents = js.native
    }
    
    @JSGlobal("VBIDE.Component")
    @js.native
    /* private */ class Component ()
      extends StObject
         with typings.activexVbide.VBIDE.Component {
      
      /* CompleteClass */
      override val Application: typings.activexVbide.VBIDE.Application = js.native
      
      /* CompleteClass */
      var IsDirty: Boolean = js.native
      
      /* CompleteClass */
      var Name: String = js.native
      
      /* CompleteClass */
      override def Parent(index: js.Any): typings.activexVbide.VBIDE.Component = js.native
      /* CompleteClass */
      @JSName("Parent")
      override val Parent_Original: Components = js.native
      
      /* private */ /* CompleteClass */
      @JSName("VBIDE.Component_typekey")
      var VBIDEDotComponent_typekey: typings.activexVbide.VBIDE.Component = js.native
    }
    
    @JSGlobal("VBIDE.Events")
    @js.native
    /* private */ class Events ()
      extends StObject
         with typings.activexVbide.VBIDE.Events {
      
      /* CompleteClass */
      override def CommandBarEvents(CommandBarControl: js.Any): typings.activexVbide.VBIDE.CommandBarEvents = js.native
      
      /* CompleteClass */
      override def ReferencesEvents(VBProject: typings.activexVbide.VBIDE.VBProject): typings.activexVbide.VBIDE.ReferencesEvents = js.native
      
      /* private */ /* CompleteClass */
      @JSName("VBIDE.Events_typekey")
      var VBIDEDotEvents_typekey: typings.activexVbide.VBIDE.Events = js.native
    }
    
    @JSGlobal("VBIDE.ProjectTemplate")
    @js.native
    /* private */ class ProjectTemplate ()
      extends StObject
         with typings.activexVbide.VBIDE.ProjectTemplate {
      
      /* CompleteClass */
      override val Application: typings.activexVbide.VBIDE.Application = js.native
      
      /* CompleteClass */
      override val Parent: typings.activexVbide.VBIDE.Application = js.native
      
      /* private */ /* CompleteClass */
      @JSName("VBIDE.ProjectTemplate_typekey")
      var VBIDEDotProjectTemplate_typekey: typings.activexVbide.VBIDE.ProjectTemplate = js.native
    }
    
    @JSGlobal("VBIDE.Property")
    @js.native
    /* private */ class Property ()
      extends StObject
         with typings.activexVbide.VBIDE.Property
    
    @JSGlobal("VBIDE.Reference")
    @js.native
    /* private */ class Reference ()
      extends StObject
         with typings.activexVbide.VBIDE.Reference {
      
      /* CompleteClass */
      override val BuiltIn: Boolean = js.native
      
      /* CompleteClass */
      override def Collection(index: js.Any): typings.activexVbide.VBIDE.Reference = js.native
      /* CompleteClass */
      @JSName("Collection")
      override val Collection_Original: References = js.native
      
      /* CompleteClass */
      override val Description: String = js.native
      
      /* CompleteClass */
      override val FullPath: String = js.native
      
      /* CompleteClass */
      override val Guid: String = js.native
      
      /* CompleteClass */
      override val IsBroken: Boolean = js.native
      
      /* CompleteClass */
      override val Major: Double = js.native
      
      /* CompleteClass */
      override val Minor: Double = js.native
      
      /* CompleteClass */
      override val Name: String = js.native
      
      /* CompleteClass */
      override val Type: vbextRefKind = js.native
      
      /* CompleteClass */
      override val VBE: typings.activexVbide.VBIDE.VBE = js.native
      
      /* private */ /* CompleteClass */
      @JSName("VBIDE.Reference_typekey")
      var VBIDEDotReference_typekey: typings.activexVbide.VBIDE.Reference = js.native
    }
    
    @JSGlobal("VBIDE.ReferencesEvents")
    @js.native
    /* private */ class ReferencesEvents ()
      extends StObject
         with typings.activexVbide.VBIDE.ReferencesEvents {
      
      /* private */ /* CompleteClass */
      @JSName("VBIDE.ReferencesEvents_typekey")
      var VBIDEDotReferencesEvents_typekey: typings.activexVbide.VBIDE.ReferencesEvents = js.native
    }
    
    @JSGlobal("VBIDE.VBComponent")
    @js.native
    /* private */ class VBComponent ()
      extends StObject
         with typings.activexVbide.VBIDE.VBComponent {
      
      /* CompleteClass */
      override def Activate(): Unit = js.native
      
      /* CompleteClass */
      override val CodeModule: typings.activexVbide.VBIDE.CodeModule = js.native
      
      /* CompleteClass */
      override def Collection(index: js.Any): typings.activexVbide.VBIDE.VBComponent = js.native
      /* CompleteClass */
      @JSName("Collection")
      override val Collection_Original: VBComponents = js.native
      
      /* CompleteClass */
      override val Designer: js.Any = js.native
      
      /* CompleteClass */
      override val DesignerID: String = js.native
      
      /* CompleteClass */
      override def DesignerWindow(): typings.activexVbide.VBIDE.Window = js.native
      
      /* CompleteClass */
      override def Export(FileName: String): Unit = js.native
      
      /* CompleteClass */
      override val HasOpenDesigner: Boolean = js.native
      
      /* CompleteClass */
      var Name: String = js.native
      
      /* CompleteClass */
      override def Properties(index: js.Any): typings.activexVbide.VBIDE.Property = js.native
      /* CompleteClass */
      @JSName("Properties")
      override val Properties_Original: Properties = js.native
      
      /* CompleteClass */
      override val Saved: Boolean = js.native
      
      /* CompleteClass */
      override val Type: vbextComponentType = js.native
      
      /* CompleteClass */
      override val VBE: typings.activexVbide.VBIDE.VBE = js.native
      
      /* private */ /* CompleteClass */
      @JSName("VBIDE.VBComponent_typekey")
      var VBIDEDotVBComponent_typekey: typings.activexVbide.VBIDE.VBComponent = js.native
    }
    
    @JSGlobal("VBIDE.VBE")
    @js.native
    /* private */ class VBE ()
      extends StObject
         with typings.activexVbide.VBIDE.VBE {
      
      /* CompleteClass */
      var ActiveCodePane: typings.activexVbide.VBIDE.CodePane = js.native
      
      /* CompleteClass */
      var ActiveVBProject: typings.activexVbide.VBIDE.VBProject = js.native
      
      /* CompleteClass */
      override val ActiveWindow: typings.activexVbide.VBIDE.Window = js.native
      
      /* CompleteClass */
      override def Addins(index: js.Any): typings.activexVbide.VBIDE.AddIn = js.native
      /* CompleteClass */
      @JSName("Addins")
      override val Addins_Original: Addins = js.native
      
      /* CompleteClass */
      override def CodePanes(index: js.Any): typings.activexVbide.VBIDE.CodePane = js.native
      /* CompleteClass */
      @JSName("CodePanes")
      override val CodePanes_Original: CodePanes = js.native
      
      /* CompleteClass */
      override def CommandBars(Index: String): CommandBar = js.native
      /* CompleteClass */
      override def CommandBars(Index: Double): CommandBar = js.native
      /* CompleteClass */
      @JSName("CommandBars")
      override val CommandBars_Original: CommandBars = js.native
      
      /* CompleteClass */
      override val Events: typings.activexVbide.VBIDE.Events = js.native
      
      /* CompleteClass */
      override val MainWindow: typings.activexVbide.VBIDE.Window = js.native
      
      /* CompleteClass */
      override val SelectedVBComponent: typings.activexVbide.VBIDE.VBComponent = js.native
      
      /* private */ /* CompleteClass */
      @JSName("VBIDE.VBE_typekey")
      var VBIDEDotVBE_typekey: typings.activexVbide.VBIDE.VBE = js.native
      
      /* CompleteClass */
      override def VBProjects(index: js.Any): typings.activexVbide.VBIDE.VBProject = js.native
      /* CompleteClass */
      @JSName("VBProjects")
      override val VBProjects_Original: VBProjects = js.native
      
      /* CompleteClass */
      override val Version: String = js.native
      
      /* CompleteClass */
      override def Windows(index: js.Any): typings.activexVbide.VBIDE.Window = js.native
      /* CompleteClass */
      @JSName("Windows")
      override val Windows_Original: Windows = js.native
    }
    
    @JSGlobal("VBIDE.VBProject")
    @js.native
    /* private */ class VBProject ()
      extends StObject
         with typings.activexVbide.VBIDE.VBProject {
      
      /* CompleteClass */
      override val Application: typings.activexVbide.VBIDE.Application = js.native
      
      /* CompleteClass */
      var BuildFileName: String = js.native
      
      /* CompleteClass */
      override def Collection(index: js.Any): typings.activexVbide.VBIDE.VBProject = js.native
      /* CompleteClass */
      @JSName("Collection")
      override val Collection_Original: VBProjects = js.native
      
      /* CompleteClass */
      var Description: String = js.native
      
      /* CompleteClass */
      override val FileName: String = js.native
      
      /* CompleteClass */
      var HelpContextID: Double = js.native
      
      /* CompleteClass */
      var HelpFile: String = js.native
      
      /* CompleteClass */
      override def MakeCompiledFile(): Unit = js.native
      
      /* CompleteClass */
      override val Mode: vbextVBAMode = js.native
      
      /* CompleteClass */
      var Name: String = js.native
      
      /* CompleteClass */
      override val Parent: typings.activexVbide.VBIDE.Application = js.native
      
      /* CompleteClass */
      override val Protection: vbextProjectProtection = js.native
      
      /* CompleteClass */
      override def References(index: js.Any): typings.activexVbide.VBIDE.Reference = js.native
      /* CompleteClass */
      @JSName("References")
      override val References_Original: References = js.native
      
      /* CompleteClass */
      override def SaveAs(FileName: String): Unit = js.native
      
      /* CompleteClass */
      override val Saved: Boolean = js.native
      
      /* CompleteClass */
      override val Type: vbextProjectType = js.native
      
      /* CompleteClass */
      override def VBComponents(index: js.Any): typings.activexVbide.VBIDE.VBComponent = js.native
      /* CompleteClass */
      @JSName("VBComponents")
      override val VBComponents_Original: VBComponents = js.native
      
      /* CompleteClass */
      override val VBE: typings.activexVbide.VBIDE.VBE = js.native
      
      /* private */ /* CompleteClass */
      @JSName("VBIDE.VBProject_typekey")
      var VBIDEDotVBProject_typekey: typings.activexVbide.VBIDE.VBProject = js.native
    }
    
    @JSGlobal("VBIDE.Window")
    @js.native
    /* private */ class Window ()
      extends StObject
         with typings.activexVbide.VBIDE.Window {
      
      /* CompleteClass */
      override val Caption: String = js.native
      
      /* CompleteClass */
      override def Close(): Unit = js.native
      
      /* CompleteClass */
      override def Collection(index: js.Any): typings.activexVbide.VBIDE.Window = js.native
      /* CompleteClass */
      @JSName("Collection")
      override val Collection_Original: Windows = js.native
      
      /* CompleteClass */
      override val HWnd: Double = js.native
      
      /* CompleteClass */
      var Height: Double = js.native
      
      /* CompleteClass */
      var Left: Double = js.native
      
      /* CompleteClass */
      override val LinkedWindowFrame: typings.activexVbide.VBIDE.Window = js.native
      
      /* CompleteClass */
      override def LinkedWindows(index: js.Any): typings.activexVbide.VBIDE.Window = js.native
      /* CompleteClass */
      @JSName("LinkedWindows")
      override val LinkedWindows_Original: LinkedWindows = js.native
      
      /* CompleteClass */
      override def SetFocus(): Unit = js.native
      
      /* CompleteClass */
      var Top: Double = js.native
      
      /* CompleteClass */
      override val Type: vbextWindowType = js.native
      
      /* CompleteClass */
      override val VBE: typings.activexVbide.VBIDE.VBE = js.native
      
      /* private */ /* CompleteClass */
      @JSName("VBIDE.Window_typekey")
      var VBIDEDotWindow_typekey: typings.activexVbide.VBIDE.Window = js.native
      
      /* CompleteClass */
      var Visible: Boolean = js.native
      
      /* CompleteClass */
      var Width: Double = js.native
      
      /* CompleteClass */
      var WindowState: vbextWindowState = js.native
    }
  }
}
