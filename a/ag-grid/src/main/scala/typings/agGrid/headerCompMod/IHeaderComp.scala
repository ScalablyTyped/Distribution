package typings.agGrid.headerCompMod

import typings.agGrid.iComponentMod.IAfterGuiAttachedParams
import typings.agGrid.iComponentMod.IComponent
import typings.agGrid.utilsMod.Promise
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHeaderComp
  extends IHeader
     with IComponent[IHeaderParams]

object IHeaderComp {
  @scala.inline
  def apply(
    getGui: () => HTMLElement,
    afterGuiAttached: /* params */ js.UndefOr[IAfterGuiAttachedParams] => Unit = null,
    destroy: () => Unit = null,
    init: IHeaderParams => Promise[Unit] | Unit = null
  ): IHeaderComp = {
    val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui))
    if (afterGuiAttached != null) __obj.updateDynamic("afterGuiAttached")(js.Any.fromFunction1(afterGuiAttached))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    __obj.asInstanceOf[IHeaderComp]
  }
}

