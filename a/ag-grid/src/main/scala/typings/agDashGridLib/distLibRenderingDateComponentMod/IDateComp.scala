package typings
package agDashGridLib.distLibRenderingDateComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateComp
  extends agDashGridLib.distLibInterfacesIComponentMod.IComponent[IDateParams]
     with IDate

object IDateComp {
  @scala.inline
  def apply(
    getDate: () => stdLib.Date,
    getGui: () => stdLib.HTMLElement,
    setDate: stdLib.Date => scala.Unit,
    afterGuiAttached: /* params */ js.UndefOr[agDashGridLib.distLibInterfacesIComponentMod.IAfterGuiAttachedParams] => scala.Unit = null,
    destroy: () => scala.Unit = null,
    init: IDateParams => agDashGridLib.distLibUtilsMod.Promise[scala.Unit] | scala.Unit = null
  ): IDateComp = {
    val __obj = js.Dynamic.literal(getDate = js.Any.fromFunction0(getDate), getGui = js.Any.fromFunction0(getGui), setDate = js.Any.fromFunction1(setDate))
    if (afterGuiAttached != null) __obj.updateDynamic("afterGuiAttached")(js.Any.fromFunction1(afterGuiAttached))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    __obj.asInstanceOf[IDateComp]
  }
}

