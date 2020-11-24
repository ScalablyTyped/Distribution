package typings.atom.anon

import typings.atom.atomStrings.click
import typings.atom.atomStrings.focus
import typings.atom.atomStrings.hover
import typings.atom.atomStrings.manual
import typings.atom.mod.TooltipPlacement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Class extends js.Object {
  
  var `class`: js.UndefOr[String] = js.native
  
  var delay: js.UndefOr[Hide] = js.native
  
  var html: js.UndefOr[Boolean] = js.native
  
  var keyBindingCommand: js.UndefOr[String] = js.native
  
  var keyBindingTarget: js.UndefOr[HTMLElement] = js.native
  
  var placement: js.UndefOr[TooltipPlacement | js.Function0[TooltipPlacement]] = js.native
  
  var title: js.UndefOr[String | js.Function0[String]] = js.native
  
  var trigger: js.UndefOr[click | hover | focus | manual] = js.native
}
object Class {
  
  @scala.inline
  def apply(): Class = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Class]
  }
  
  @scala.inline
  implicit class ClassOps[Self <: Class] (val x: Self) extends AnyVal {
    
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
    def setClass(value: String): Self = this.set("class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    
    @scala.inline
    def setDelay(value: Hide): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setHtml(value: Boolean): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
    @scala.inline
    def setKeyBindingCommand(value: String): Self = this.set("keyBindingCommand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyBindingCommand: Self = this.set("keyBindingCommand", js.undefined)
    
    @scala.inline
    def setKeyBindingTarget(value: HTMLElement): Self = this.set("keyBindingTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyBindingTarget: Self = this.set("keyBindingTarget", js.undefined)
    
    @scala.inline
    def setPlacementFunction0(value: () => TooltipPlacement): Self = this.set("placement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlacement(value: TooltipPlacement | js.Function0[TooltipPlacement]): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setTitleFunction0(value: () => String): Self = this.set("title", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTitle(value: String | js.Function0[String]): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTrigger(value: click | hover | focus | manual): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
  }
}
