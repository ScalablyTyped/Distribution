package typings.accessibility.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HotKeys extends js.Object {
  
  /** @default false */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** @default true */
  var helpTitles: js.UndefOr[Boolean] = js.native
  
  var keys: js.UndefOr[StringDictionary[HotKeyDefinition]] = js.native
}
object HotKeys {
  
  @scala.inline
  def apply(): HotKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HotKeys]
  }
  
  @scala.inline
  implicit class HotKeysOps[Self <: HotKeys] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setHelpTitles(value: Boolean): Self = this.set("helpTitles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelpTitles: Self = this.set("helpTitles", js.undefined)
    
    @scala.inline
    def setKeys(value: StringDictionary[HotKeyDefinition]): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
  }
}
