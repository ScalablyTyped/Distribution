package typings
package agDashGridLib.distLibRenderingCellRenderersICellRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICellRendererComp
  extends ICellRenderer
     with agDashGridLib.distLibInterfacesIComponentMod.IComponent[ICellRendererParams]

object ICellRendererComp {
  @scala.inline
  def apply(
    getGui: () => stdLib.HTMLElement,
    refresh: js.Any => scala.Boolean,
    afterGuiAttached: /* params */ js.UndefOr[agDashGridLib.distLibInterfacesIComponentMod.IAfterGuiAttachedParams] => scala.Unit = null,
    destroy: () => scala.Unit = null,
    init: ICellRendererParams => agDashGridLib.distLibUtilsMod.Promise[scala.Unit] | scala.Unit = null
  ): ICellRendererComp = {
    val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui), refresh = js.Any.fromFunction1(refresh))
    if (afterGuiAttached != null) __obj.updateDynamic("afterGuiAttached")(js.Any.fromFunction1(afterGuiAttached))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    __obj.asInstanceOf[ICellRendererComp]
  }
}

