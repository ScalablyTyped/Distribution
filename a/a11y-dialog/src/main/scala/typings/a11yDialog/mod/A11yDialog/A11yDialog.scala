package typings.a11yDialog.mod.A11yDialog

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait A11yDialog extends js.Object {
  
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
