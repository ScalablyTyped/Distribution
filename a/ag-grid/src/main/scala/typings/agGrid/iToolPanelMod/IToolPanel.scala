package typings.agGrid.iToolPanelMod

import typings.agGrid.gridPanelMod.GridPanel
import typings.agGrid.iComponentMod.IAfterGuiAttachedParams
import typings.agGrid.iComponentMod.IComponent
import typings.agGrid.utilsMod.Promise
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToolPanel
  extends IComponent[js.Any] {
  def getPreferredWidth(): Double
  def isToolPanelShowing(): Boolean
  def refresh(): Unit
  def registerGridComp(gridPanel: GridPanel): Unit
  def showToolPanel(show: Boolean): Unit
}

object IToolPanel {
  @scala.inline
  def apply(
    getGui: () => HTMLElement,
    getPreferredWidth: () => Double,
    isToolPanelShowing: () => Boolean,
    refresh: () => Unit,
    registerGridComp: GridPanel => Unit,
    showToolPanel: Boolean => Unit,
    afterGuiAttached: /* params */ js.UndefOr[IAfterGuiAttachedParams] => Unit = null,
    destroy: () => Unit = null,
    init: js.Any => Promise[Unit] | Unit = null
  ): IToolPanel = {
    val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui), getPreferredWidth = js.Any.fromFunction0(getPreferredWidth), isToolPanelShowing = js.Any.fromFunction0(isToolPanelShowing), refresh = js.Any.fromFunction0(refresh), registerGridComp = js.Any.fromFunction1(registerGridComp), showToolPanel = js.Any.fromFunction1(showToolPanel))
    if (afterGuiAttached != null) __obj.updateDynamic("afterGuiAttached")(js.Any.fromFunction1(afterGuiAttached))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    __obj.asInstanceOf[IToolPanel]
  }
}

