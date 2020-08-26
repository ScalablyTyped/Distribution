package typings.agGrid.iStatusBarMod

import typings.agGrid.gridPanelMod.GridPanel
import typings.agGrid.iComponentMod.IComponent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStatusBar
  extends IComponent[js.Any] {
  def registerGridPanel(gridPanel: GridPanel): Unit = js.native
}

object IStatusBar {
  @scala.inline
  def apply(getGui: () => HTMLElement, registerGridPanel: GridPanel => Unit): IStatusBar = {
    val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui), registerGridPanel = js.Any.fromFunction1(registerGridPanel))
    __obj.asInstanceOf[IStatusBar]
  }
  @scala.inline
  implicit class IStatusBarOps[Self <: IStatusBar] (val x: Self) extends AnyVal {
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
    def setRegisterGridPanel(value: GridPanel => Unit): Self = this.set("registerGridPanel", js.Any.fromFunction1(value))
  }
  
}

