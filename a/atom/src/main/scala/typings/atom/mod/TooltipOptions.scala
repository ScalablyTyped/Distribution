package typings.atom.mod

import typings.atom.anon.Hide
import typings.atom.atomBooleans.`false`
import typings.atom.atomStrings.auto
import typings.atom.atomStrings.bottom_
import typings.atom.atomStrings.left_
import typings.atom.atomStrings.right_
import typings.atom.atomStrings.top_
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipOptions extends StObject {
  
  /** Apply a CSS fade transition to the tooltip. */
  var animation: js.UndefOr[Boolean] = js.undefined
  
  /** Appends the tooltip to a specific element. */
  var container: js.UndefOr[String | HTMLElement | `false`] = js.undefined
  
  /**
    *  Delay showing and hiding the tooltip (ms) - does not apply to manual
    *  trigger type.
    */
  var delay: js.UndefOr[Double | Hide] = js.undefined
  
  /** Allow HTML in the tooltip. */
  var html: js.UndefOr[Boolean] = js.undefined
  
  /** How to position the tooltip. */
  var placement: js.UndefOr[top_ | bottom_ | left_ | right_ | auto] = js.undefined
  
  /**
    *  If a selector is provided, tooltip objects will be delegated to the
    *  specified targets.
    */
  var selector: js.UndefOr[String] = js.undefined
  
  /** Base HTML to use when creating the tooltip. */
  var template: js.UndefOr[String] = js.undefined
  
  /**
    *  Default title value if title attribute isn't present.
    *  If a function is given, it will be called with its this reference set to
    *  the element that the tooltip is attached to.
    */
  var title: js.UndefOr[String | HTMLElement | js.Function0[String]] = js.undefined
  
  /**
    *  How tooltip is triggered - click | hover | focus | manual.
    *  You may pass multiple triggers; separate them with a space.
    */
  var trigger: js.UndefOr[String] = js.undefined
}
object TooltipOptions {
  
  @scala.inline
  def apply(): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipOptions]
  }
  
  @scala.inline
  implicit class TooltipOptionsMutableBuilder[Self <: TooltipOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setContainer(value: String | HTMLElement | `false`): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setDelay(value: Double | Hide): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    @scala.inline
    def setPlacement(value: top_ | bottom_ | left_ | right_ | auto): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setTitle(value: String | HTMLElement | js.Function0[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFunction0(value: () => String): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
