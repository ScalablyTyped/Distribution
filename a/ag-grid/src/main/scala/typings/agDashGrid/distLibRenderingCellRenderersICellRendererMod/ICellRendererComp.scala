package typings.agDashGrid.distLibRenderingCellRenderersICellRendererMod

import typings.agDashGrid.distLibInterfacesIComponentMod.IAfterGuiAttachedParams
import typings.agDashGrid.distLibInterfacesIComponentMod.IComponent
import typings.agDashGrid.distLibUtilsMod.Promise
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICellRendererComp
  extends ICellRenderer
     with IComponent[ICellRendererParams]

object ICellRendererComp {
  @scala.inline
  def apply(
    getGui: () => HTMLElement,
    refresh: js.Any => Boolean,
    afterGuiAttached: /* params */ js.UndefOr[IAfterGuiAttachedParams] => Unit = null,
    destroy: () => Unit = null,
    init: ICellRendererParams => Promise[Unit] | Unit = null
  ): ICellRendererComp = {
    val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui), refresh = js.Any.fromFunction1(refresh))
    if (afterGuiAttached != null) __obj.updateDynamic("afterGuiAttached")(js.Any.fromFunction1(afterGuiAttached))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    __obj.asInstanceOf[ICellRendererComp]
  }
}

