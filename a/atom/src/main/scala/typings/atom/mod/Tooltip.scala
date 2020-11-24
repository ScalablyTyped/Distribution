package typings.atom.mod

import typings.atom.atomStrings.in
import typings.atom.atomStrings.out
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tooltip extends js.Object {
  
  def disable(): Unit = js.native
  
  val element: HTMLElement = js.native
  
  def enable(): Unit = js.native
  
  val enabled: Boolean = js.native
  
  def getArrowElement(): HTMLElement = js.native
  
  def getTitle(): String = js.native
  
  def getTooltipElement(): HTMLElement = js.native
  
  val hoverState: in | out | Null = js.native
  
  val options: TooltipOptions = js.native
  
  def recalculatePosition(): Unit = js.native
  
  val timeout: Double = js.native
  
  def toggle(): Unit = js.native
  
  def toggleEnabled(): Unit = js.native
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
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), element = element.asInstanceOf[js.Any], enable = js.Any.fromFunction0(enable), enabled = enabled.asInstanceOf[js.Any], getArrowElement = js.Any.fromFunction0(getArrowElement), getTitle = js.Any.fromFunction0(getTitle), getTooltipElement = js.Any.fromFunction0(getTooltipElement), options = options.asInstanceOf[js.Any], recalculatePosition = js.Any.fromFunction0(recalculatePosition), timeout = timeout.asInstanceOf[js.Any], toggle = js.Any.fromFunction0(toggle), toggleEnabled = js.Any.fromFunction0(toggleEnabled))
    __obj.asInstanceOf[Tooltip]
  }
  
  @scala.inline
  implicit class TooltipOps[Self <: Tooltip] (val x: Self) extends AnyVal {
    
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
    def setDisable(value: () => Unit): Self = this.set("disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnable(value: () => Unit): Self = this.set("enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetArrowElement(value: () => HTMLElement): Self = this.set("getArrowElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTitle(value: () => String): Self = this.set("getTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTooltipElement(value: () => HTMLElement): Self = this.set("getTooltipElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOptions(value: TooltipOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecalculatePosition(value: () => Unit): Self = this.set("recalculatePosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggle(value: () => Unit): Self = this.set("toggle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggleEnabled(value: () => Unit): Self = this.set("toggleEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHoverState(value: in | out): Self = this.set("hoverState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverStateNull: Self = this.set("hoverState", null)
  }
}
