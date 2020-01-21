package typings.agGrid.iStatusBarMod

import typings.agGrid.gridPanelMod.GridPanel
import typings.agGrid.iComponentMod.IAfterGuiAttachedParams
import typings.agGrid.iComponentMod.IComponent
import typings.agGrid.utilsMod.Promise
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStatusBar
  extends IComponent[js.Any] {
  def registerGridPanel(gridPanel: GridPanel): Unit
}

object IStatusBar {
  @scala.inline
  def apply(
    getGui: () => HTMLElement,
    registerGridPanel: GridPanel => Unit,
    afterGuiAttached: /* params */ js.UndefOr[IAfterGuiAttachedParams] => Unit = null,
    destroy: () => Unit = null,
    init: js.Any => Promise[Unit] | Unit = null
  ): IStatusBar = {
    val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui), registerGridPanel = js.Any.fromFunction1(registerGridPanel))
    if (afterGuiAttached != null) __obj.updateDynamic("afterGuiAttached")(js.Any.fromFunction1(afterGuiAttached))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    __obj.asInstanceOf[IStatusBar]
  }
}

