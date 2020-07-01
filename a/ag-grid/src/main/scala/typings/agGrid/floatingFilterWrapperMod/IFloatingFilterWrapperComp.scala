package typings.agGrid.floatingFilterWrapperMod

import typings.agGrid.floatingFilterMod.FloatingFilterChange
import typings.agGrid.floatingFilterMod.IFloatingFilterParams
import typings.agGrid.iComponentMod.IAfterGuiAttachedParams
import typings.agGrid.iComponentMod.IComponent
import typings.agGrid.utilsMod.Promise
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFloatingFilterWrapperComp[M, F /* <: FloatingFilterChange */, PC /* <: IFloatingFilterParams[M, F] */, P /* <: IFloatingFilterWrapperParams[M, F, PC] */]
  extends IFloatingFilterWrapper[M]
     with IComponent[P]

object IFloatingFilterWrapperComp {
  @scala.inline
  def apply[M, /* <: typings.agGrid.floatingFilterMod.FloatingFilterChange */ F, /* <: typings.agGrid.floatingFilterMod.IFloatingFilterParams[M, F] */ PC, /* <: typings.agGrid.floatingFilterWrapperMod.IFloatingFilterWrapperParams[M, F, PC] */ P](
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

