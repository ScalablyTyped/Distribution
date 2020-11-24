package typings.angularHotkeys.mod.angularAugmentingMod.hotkeys

import typings.angularHotkeys.angularHotkeysStrings.INPUT
import typings.angularHotkeys.angularHotkeysStrings.SELECT
import typings.angularHotkeys.angularHotkeysStrings.TEXTAREA
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hotkey extends js.Object {
  
  /**
    * The type of event to listen for, such as keypress, keydown or keyup.
    * Usage of this parameter is discouraged as the underlying library will pick the most suitable option automatically.
    * This should only be necessary in advanced situations.
    */
  var action: js.UndefOr[String] = js.native
  
  /**
    * An array of tag names to allow this combo in ('INPUT', 'SELECT', and/or 'TEXTAREA')
    */
  var allowIn: js.UndefOr[js.Array[INPUT | SELECT | TEXTAREA]] = js.native
  
  /**
    * The function to execute when the key(s) are pressed. Passes along two arguments, event and hotkey
    */
  def callback(event: Event, hotkey: Hotkey): Unit = js.native
  
  /**
    * They keyboard combo (shortcut) you want to bind to.
    */
  var combo: String | js.Array[String] = js.native
  
  /**
    * The description for what the combo does and is only used for the Cheat Sheet.
    * If it is not supplied, it will not show up, and in effect, allows you to have unlisted hotkeys.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Whether the hotkey persists navigation events
    */
  var persistent: js.UndefOr[Boolean] = js.native
}
object Hotkey {
  
  @scala.inline
  def apply(callback: (Event, Hotkey) => Unit, combo: String | js.Array[String]): Hotkey = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), combo = combo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hotkey]
  }
  
  @scala.inline
  implicit class HotkeyOps[Self <: Hotkey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCallback(value: (Event, Hotkey) => Unit): Self = this.set("callback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setComboVarargs(value: String*): Self = this.set("combo", js.Array(value :_*))
    
    @scala.inline
    def setCombo(value: String | js.Array[String]): Self = this.set("combo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setAllowInVarargs(value: (INPUT | SELECT | TEXTAREA)*): Self = this.set("allowIn", js.Array(value :_*))
    
    @scala.inline
    def setAllowIn(value: js.Array[INPUT | SELECT | TEXTAREA]): Self = this.set("allowIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowIn: Self = this.set("allowIn", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setPersistent(value: Boolean): Self = this.set("persistent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersistent: Self = this.set("persistent", js.undefined)
  }
}
