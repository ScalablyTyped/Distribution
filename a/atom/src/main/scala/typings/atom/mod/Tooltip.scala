package typings.atom.mod

import typings.atom.atomStrings.in
import typings.atom.atomStrings.out
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  def apply(
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
  implicit class TooltipMutableBuilder[Self <: Tooltip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetArrowElement(value: () => HTMLElement): Self = StObject.set(x, "getArrowElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTooltipElement(value: () => HTMLElement): Self = StObject.set(x, "getTooltipElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHoverState(value: in | out): Self = StObject.set(x, "hoverState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverStateNull: Self = StObject.set(x, "hoverState", null)
    
    @scala.inline
    def setOptions(value: TooltipOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecalculatePosition(value: () => Unit): Self = StObject.set(x, "recalculatePosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggleEnabled(value: () => Unit): Self = StObject.set(x, "toggleEnabled", js.Any.fromFunction0(value))
  }
}
