package typings
package agDashGridLib.distLibHeaderRenderingHeaderHeaderCompMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHeaderComp
  extends IHeader
     with agDashGridLib.distLibInterfacesIComponentMod.IComponent[IHeaderParams]

object IHeaderComp {
  @scala.inline
  def apply(
    getGui: () => stdLib.HTMLElement,
    afterGuiAttached: /* params */ js.UndefOr[agDashGridLib.distLibInterfacesIComponentMod.IAfterGuiAttachedParams] => scala.Unit = null,
    destroy: () => scala.Unit = null,
    init: IHeaderParams => agDashGridLib.distLibUtilsMod.Promise[scala.Unit] | scala.Unit = null
  ): IHeaderComp = {
    val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui))
    if (afterGuiAttached != null) __obj.updateDynamic("afterGuiAttached")(js.Any.fromFunction1(afterGuiAttached))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    __obj.asInstanceOf[IHeaderComp]
  }
}

