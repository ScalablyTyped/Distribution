package typings
package agDashGridLib.distLibHeaderRenderingHeaderGroupHeaderGroupCompMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHeaderGroupComp
  extends IHeaderGroup
     with agDashGridLib.distLibInterfacesIComponentMod.IComponent[IHeaderGroupParams]

object IHeaderGroupComp {
  @scala.inline
  def apply(
    getGui: () => stdLib.HTMLElement,
    afterGuiAttached: /* params */ js.UndefOr[agDashGridLib.distLibInterfacesIComponentMod.IAfterGuiAttachedParams] => scala.Unit = null,
    destroy: () => scala.Unit = null,
    init: IHeaderGroupParams => agDashGridLib.distLibUtilsMod.Promise[scala.Unit] | scala.Unit = null
  ): IHeaderGroupComp = {
    val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui))
    if (afterGuiAttached != null) __obj.updateDynamic("afterGuiAttached")(js.Any.fromFunction1(afterGuiAttached))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    __obj.asInstanceOf[IHeaderGroupComp]
  }
}

