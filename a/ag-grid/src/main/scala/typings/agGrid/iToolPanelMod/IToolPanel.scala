package typings.agGrid.iToolPanelMod

import typings.agGrid.gridPanelMod.GridPanel
import typings.agGrid.iComponentMod.IComponent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IToolPanel
  extends IComponent[js.Any] {
  
  def getPreferredWidth(): Double = js.native
  
  def isToolPanelShowing(): Boolean = js.native
  
  def refresh(): Unit = js.native
  
  def registerGridComp(gridPanel: GridPanel): Unit = js.native
  
  def showToolPanel(show: Boolean): Unit = js.native
}
object IToolPanel {
  
  @scala.inline
  def apply(
    getGui: () => HTMLElement,
    getPreferredWidth: () => Double,
    isToolPanelShowing: () => Boolean,
    refresh: () => Unit,
    registerGridComp: GridPanel => Unit,
    showToolPanel: Boolean => Unit
  ): IToolPanel = {
    val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui), getPreferredWidth = js.Any.fromFunction0(getPreferredWidth), isToolPanelShowing = js.Any.fromFunction0(isToolPanelShowing), refresh = js.Any.fromFunction0(refresh), registerGridComp = js.Any.fromFunction1(registerGridComp), showToolPanel = js.Any.fromFunction1(showToolPanel))
    __obj.asInstanceOf[IToolPanel]
  }
  
  @scala.inline
  implicit class IToolPanelOps[Self <: IToolPanel] (val x: Self) extends AnyVal {
    
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
    def setGetPreferredWidth(value: () => Double): Self = this.set("getPreferredWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsToolPanelShowing(value: () => Boolean): Self = this.set("isToolPanelShowing", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = this.set("refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegisterGridComp(value: GridPanel => Unit): Self = this.set("registerGridComp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowToolPanel(value: Boolean => Unit): Self = this.set("showToolPanel", js.Any.fromFunction1(value))
  }
}
