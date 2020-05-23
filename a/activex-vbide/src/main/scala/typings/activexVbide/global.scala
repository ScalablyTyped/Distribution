package typings.activexVbide

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object VBIDE extends js.Object {
    @js.native
    class AddIn protected ()
      extends typings.activexVbide.VBIDE.AddIn
    
    @js.native
    class Application protected ()
      extends typings.activexVbide.VBIDE.Application {
      /* CompleteClass */
      @JSName("VBIDE.Application_typekey")
      override var VBIDEDotApplication_typekey: typings.activexVbide.VBIDE.Application = js.native
      /* CompleteClass */
      override val Version: String = js.native
    }
    
    @js.native
    class CodeModule protected ()
      extends typings.activexVbide.VBIDE.CodeModule
    
    @js.native
    class CodePane protected ()
      extends typings.activexVbide.VBIDE.CodePane
    
    @js.native
    class CommandBarEvents protected ()
      extends typings.activexVbide.VBIDE.CommandBarEvents {
      /* CompleteClass */
      @JSName("VBIDE.CommandBarEvents_typekey")
      override var VBIDEDotCommandBarEvents_typekey: typings.activexVbide.VBIDE.CommandBarEvents = js.native
    }
    
    @js.native
    class Component protected ()
      extends typings.activexVbide.VBIDE.Component
    
    @js.native
    class Events protected ()
      extends typings.activexVbide.VBIDE.Events {
      /* CompleteClass */
      @JSName("VBIDE.Events_typekey")
      override var VBIDEDotEvents_typekey: typings.activexVbide.VBIDE.Events = js.native
      /* CompleteClass */
      override def CommandBarEvents(CommandBarControl: js.Any): typings.activexVbide.VBIDE.CommandBarEvents = js.native
      /* CompleteClass */
      override def ReferencesEvents(VBProject: typings.activexVbide.VBIDE.VBProject): typings.activexVbide.VBIDE.ReferencesEvents = js.native
    }
    
    @js.native
    class ProjectTemplate protected ()
      extends typings.activexVbide.VBIDE.ProjectTemplate {
      /* CompleteClass */
      override val Application: typings.activexVbide.VBIDE.Application = js.native
      /* CompleteClass */
      override val Parent: typings.activexVbide.VBIDE.Application = js.native
      /* CompleteClass */
      @JSName("VBIDE.ProjectTemplate_typekey")
      override var VBIDEDotProjectTemplate_typekey: typings.activexVbide.VBIDE.ProjectTemplate = js.native
    }
    
    @js.native
    class Property protected ()
      extends typings.activexVbide.VBIDE.Property
    
    @js.native
    class Reference protected ()
      extends typings.activexVbide.VBIDE.Reference
    
    @js.native
    class ReferencesEvents protected ()
      extends typings.activexVbide.VBIDE.ReferencesEvents {
      /* CompleteClass */
      @JSName("VBIDE.ReferencesEvents_typekey")
      override var VBIDEDotReferencesEvents_typekey: typings.activexVbide.VBIDE.ReferencesEvents = js.native
    }
    
    @js.native
    class VBComponent protected ()
      extends typings.activexVbide.VBIDE.VBComponent
    
    @js.native
    class VBE protected ()
      extends typings.activexVbide.VBIDE.VBE
    
    @js.native
    class VBProject protected ()
      extends typings.activexVbide.VBIDE.VBProject
    
    @js.native
    class Window protected ()
      extends typings.activexVbide.VBIDE.Window
    
  }
  
}

