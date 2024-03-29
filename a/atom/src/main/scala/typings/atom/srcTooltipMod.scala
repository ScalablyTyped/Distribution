package typings.atom

import typings.atom.anon.Hide
import typings.atom.atomBooleans.`false`
import typings.atom.atomStrings.auto
import typings.atom.atomStrings.bottom_
import typings.atom.atomStrings.in
import typings.atom.atomStrings.left_
import typings.atom.atomStrings.out
import typings.atom.atomStrings.right_
import typings.atom.atomStrings.top_
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTooltipMod {
  
  trait Tooltip extends StObject {
    
    def disable(): Unit
    
    val element: HTMLElement
    
    def enable(): Unit
    
    val enabled: Boolean
    
    def getArrowElement(): HTMLElement
    
    def getTitle(): String
    
    def getTooltipElement(): HTMLElement
    
    val hoverState: in | out | Null
    
    val options: TooltipOptions
    
    def recalculatePosition(): Unit
    
    val timeout: Double
    
    def toggle(): Unit
    
    def toggleEnabled(): Unit
  }
  object Tooltip {
    
    inline def apply(
      disable: () => Unit,
      element: HTMLElement,
      enable: () => Unit,
      enabled: Boolean,
      getArrowElement: () => HTMLElement,
      getTitle: () => String,
      getTooltipElement: () => HTMLElement,
      options: TooltipOptions,
      recalculatePosition: () => Unit,
      timeout: Double,
      toggle: () => Unit,
      toggleEnabled: () => Unit
    ): Tooltip = {
      val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), element = element.asInstanceOf[js.Any], enable = js.Any.fromFunction0(enable), enabled = enabled.asInstanceOf[js.Any], getArrowElement = js.Any.fromFunction0(getArrowElement), getTitle = js.Any.fromFunction0(getTitle), getTooltipElement = js.Any.fromFunction0(getTooltipElement), options = options.asInstanceOf[js.Any], recalculatePosition = js.Any.fromFunction0(recalculatePosition), timeout = timeout.asInstanceOf[js.Any], toggle = js.Any.fromFunction0(toggle), toggleEnabled = js.Any.fromFunction0(toggleEnabled), hoverState = null)
      __obj.asInstanceOf[Tooltip]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tooltip] (val x: Self) extends AnyVal {
      
      inline def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setGetArrowElement(value: () => HTMLElement): Self = StObject.set(x, "getArrowElement", js.Any.fromFunction0(value))
      
      inline def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
      
      inline def setGetTooltipElement(value: () => HTMLElement): Self = StObject.set(x, "getTooltipElement", js.Any.fromFunction0(value))
      
      inline def setHoverState(value: in | out): Self = StObject.set(x, "hoverState", value.asInstanceOf[js.Any])
      
      inline def setHoverStateNull: Self = StObject.set(x, "hoverState", null)
      
      inline def setOptions(value: TooltipOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setRecalculatePosition(value: () => Unit): Self = StObject.set(x, "recalculatePosition", js.Any.fromFunction0(value))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
      
      inline def setToggleEnabled(value: () => Unit): Self = StObject.set(x, "toggleEnabled", js.Any.fromFunction0(value))
    }
  }
  
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
    
    inline def apply(): TooltipOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipOptions] (val x: Self) extends AnyVal {
      
      inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setContainer(value: String | HTMLElement | `false`): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDelay(value: Double | Hide): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setPlacement(value: top_ | bottom_ | left_ | right_ | auto): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTitle(value: String | HTMLElement | js.Function0[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleFunction0(value: () => String): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    }
  }
}
