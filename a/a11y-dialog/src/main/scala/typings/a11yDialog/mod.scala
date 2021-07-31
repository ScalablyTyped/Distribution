package typings.a11yDialog

import typings.a11yDialog.mod.A11yDialog.A11yDialog
import typings.a11yDialog.mod.A11yDialog.Targets
import typings.std.Element
import typings.std.Event
import typings.std.NodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("a11y-dialog", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with A11yDialog {
    def this(node: Element) = this()
    def this(node: Element, targets: Targets) = this()
  }
  
  object A11yDialog {
    
    @js.native
    trait A11yDialog extends StObject {
      
      /* private */ def _bindKeypress(event: Event): Unit = js.native
      
      /* private */ def _fire(`type`: EventType, event: Event): Unit = js.native
      
      /* private */ def _maintainFocus(event: Event): Unit = js.native
      
      def create(targets: Targets): typings.a11yDialog.mod.A11yDialog.A11yDialog = js.native
      
      def destroy(): typings.a11yDialog.mod.A11yDialog.A11yDialog = js.native
      
      def hide(): typings.a11yDialog.mod.A11yDialog.A11yDialog = js.native
      def hide(event: Event): typings.a11yDialog.mod.A11yDialog.A11yDialog = js.native
      
      def off(`type`: EventType, handler: EventHandler): typings.a11yDialog.mod.A11yDialog.A11yDialog = js.native
      
      def on(`type`: EventType, handler: EventHandler): typings.a11yDialog.mod.A11yDialog.A11yDialog = js.native
      
      def show(): typings.a11yDialog.mod.A11yDialog.A11yDialog = js.native
      def show(event: Event): typings.a11yDialog.mod.A11yDialog.A11yDialog = js.native
    }
    
    type EventHandler = js.Function2[/* node */ Element, /* event */ js.UndefOr[Event], Unit]
    
    /* Rewritten from type alias, can be one of: 
      - typings.a11yDialog.a11yDialogStrings.show
      - typings.a11yDialog.a11yDialogStrings.hide
      - typings.a11yDialog.a11yDialogStrings.destroy
      - typings.a11yDialog.a11yDialogStrings.create
    */
    trait EventType extends StObject
    object EventType {
      
      @scala.inline
      def create: typings.a11yDialog.a11yDialogStrings.create = "create".asInstanceOf[typings.a11yDialog.a11yDialogStrings.create]
      
      @scala.inline
      def destroy: typings.a11yDialog.a11yDialogStrings.destroy = "destroy".asInstanceOf[typings.a11yDialog.a11yDialogStrings.destroy]
      
      @scala.inline
      def hide: typings.a11yDialog.a11yDialogStrings.hide = "hide".asInstanceOf[typings.a11yDialog.a11yDialogStrings.hide]
      
      @scala.inline
      def show: typings.a11yDialog.a11yDialogStrings.show = "show".asInstanceOf[typings.a11yDialog.a11yDialogStrings.show]
    }
    
    type Targets = NodeList | Element | String
  }
}
