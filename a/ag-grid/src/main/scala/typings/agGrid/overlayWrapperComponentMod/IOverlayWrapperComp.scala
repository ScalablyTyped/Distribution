package typings.agGrid.overlayWrapperComponentMod

import typings.agGrid.iComponentMod.IComponent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOverlayWrapperComp extends IComponent[IOverlayWrapperParams] {
  
  def hideOverlay(eOverlayWrapper: HTMLElement): Unit = js.native
  
  def showLoadingOverlay(eOverlayWrapper: HTMLElement): Unit = js.native
  
  def showNoRowsOverlay(eOverlayWrapper: HTMLElement): Unit = js.native
}
object IOverlayWrapperComp {
  
  @scala.inline
  def apply(
    getGui: () => HTMLElement,
    hideOverlay: HTMLElement => Unit,
    showLoadingOverlay: HTMLElement => Unit,
    showNoRowsOverlay: HTMLElement => Unit
  ): IOverlayWrapperComp = {
    val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui), hideOverlay = js.Any.fromFunction1(hideOverlay), showLoadingOverlay = js.Any.fromFunction1(showLoadingOverlay), showNoRowsOverlay = js.Any.fromFunction1(showNoRowsOverlay))
    __obj.asInstanceOf[IOverlayWrapperComp]
  }
  
  @scala.inline
  implicit class IOverlayWrapperCompOps[Self <: IOverlayWrapperComp] (val x: Self) extends AnyVal {
    
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
    def setHideOverlay(value: HTMLElement => Unit): Self = this.set("hideOverlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowLoadingOverlay(value: HTMLElement => Unit): Self = this.set("showLoadingOverlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowNoRowsOverlay(value: HTMLElement => Unit): Self = this.set("showNoRowsOverlay", js.Any.fromFunction1(value))
  }
}
