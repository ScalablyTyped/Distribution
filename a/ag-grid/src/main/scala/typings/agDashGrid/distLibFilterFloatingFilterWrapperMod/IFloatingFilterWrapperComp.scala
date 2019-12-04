package typings.agDashGrid.distLibFilterFloatingFilterWrapperMod

import typings.agDashGrid.distLibFilterFloatingFilterMod.FloatingFilterChange
import typings.agDashGrid.distLibFilterFloatingFilterMod.IFloatingFilterParams
import typings.agDashGrid.distLibInterfacesIComponentMod.IAfterGuiAttachedParams
import typings.agDashGrid.distLibInterfacesIComponentMod.IComponent
import typings.agDashGrid.distLibUtilsMod.Promise
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFloatingFilterWrapperComp[M, F /* <: FloatingFilterChange */, PC /* <: IFloatingFilterParams[M, F] */, P /* <: IFloatingFilterWrapperParams[M, F, PC] */]
  extends IFloatingFilterWrapper[M]
     with IComponent[P]

object IFloatingFilterWrapperComp {
  @scala.inline
  def apply[M, F /* <: FloatingFilterChange */, PC /* <: IFloatingFilterParams[M, F] */, P /* <: IFloatingFilterWrapperParams[M, F, PC] */](
    getGui: () => HTMLElement,
    onParentModelChanged: M => Unit,
    afterGuiAttached: /* params */ js.UndefOr[IAfterGuiAttachedParams] => Unit = null,
    destroy: () => Unit = null,
    init: P => Promise[Unit] | Unit = null
  ): IFloatingFilterWrapperComp[M, F, PC, P] = {
    val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui), onParentModelChanged = js.Any.fromFunction1(onParentModelChanged))
    if (afterGuiAttached != null) __obj.updateDynamic("afterGuiAttached")(js.Any.fromFunction1(afterGuiAttached))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    __obj.asInstanceOf[IFloatingFilterWrapperComp[M, F, PC, P]]
  }
}

