package typings.agDashGrid.distLibRenderingDateComponentMod

import typings.agDashGrid.distLibInterfacesIComponentMod.IAfterGuiAttachedParams
import typings.agDashGrid.distLibInterfacesIComponentMod.IComponent
import typings.agDashGrid.distLibUtilsMod.Promise
import typings.std.Date
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateComp
  extends IComponent[IDateParams]
     with IDate

object IDateComp {
  @scala.inline
  def apply(
    getDate: () => Date,
    getGui: () => HTMLElement,
    setDate: Date => Unit,
    afterGuiAttached: /* params */ js.UndefOr[IAfterGuiAttachedParams] => Unit = null,
    destroy: () => Unit = null,
    init: IDateParams => Promise[Unit] | Unit = null
  ): IDateComp = {
    val __obj = js.Dynamic.literal(getDate = js.Any.fromFunction0(getDate), getGui = js.Any.fromFunction0(getGui), setDate = js.Any.fromFunction1(setDate))
    if (afterGuiAttached != null) __obj.updateDynamic("afterGuiAttached")(js.Any.fromFunction1(afterGuiAttached))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    __obj.asInstanceOf[IDateComp]
  }
}

