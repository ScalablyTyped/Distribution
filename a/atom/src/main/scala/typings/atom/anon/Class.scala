package typings.atom.anon

import typings.atom.atomStrings.click
import typings.atom.atomStrings.focus
import typings.atom.atomStrings.hover
import typings.atom.atomStrings.manual
import typings.atom.mod.TooltipPlacement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Class extends StObject {
  
  var `class`: js.UndefOr[String] = js.undefined
  
  var delay: js.UndefOr[Hide] = js.undefined
  
  var html: js.UndefOr[Boolean] = js.undefined
  
  var keyBindingCommand: js.UndefOr[String] = js.undefined
  
  var keyBindingTarget: js.UndefOr[HTMLElement] = js.undefined
  
  var placement: js.UndefOr[TooltipPlacement | js.Function0[TooltipPlacement]] = js.undefined
  
  var title: js.UndefOr[String | js.Function0[String]] = js.undefined
  
  var trigger: js.UndefOr[click | hover | focus | manual] = js.undefined
}
object Class {
  
  @scala.inline
  def apply(): Class = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Class]
  }
  
  @scala.inline
  implicit class ClassMutableBuilder[Self <: Class] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    @scala.inline
    def setDelay(value: Hide): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    @scala.inline
    def setKeyBindingCommand(value: String): Self = StObject.set(x, "keyBindingCommand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyBindingCommandUndefined: Self = StObject.set(x, "keyBindingCommand", js.undefined)
    
    @scala.inline
    def setKeyBindingTarget(value: HTMLElement): Self = StObject.set(x, "keyBindingTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyBindingTargetUndefined: Self = StObject.set(x, "keyBindingTarget", js.undefined)
    
    @scala.inline
    def setPlacement(value: TooltipPlacement | js.Function0[TooltipPlacement]): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementFunction0(value: () => TooltipPlacement): Self = StObject.set(x, "placement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    @scala.inline
    def setTitle(value: String | js.Function0[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFunction0(value: () => String): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTrigger(value: click | hover | focus | manual): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
