package typings.angularUiRouter.mod.angularAugmentingMod.ui

import typings.angularUiRouter.anon.Globals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResolvedState extends js.Object {
  var locals: Globals = js.native
}

object IResolvedState {
  @scala.inline
  def apply(locals: Globals): IResolvedState = {
    val __obj = js.Dynamic.literal(locals = locals.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResolvedState]
  }
  @scala.inline
  implicit class IResolvedStateOps[Self <: IResolvedState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLocals(value: Globals): Self = this.set("locals", value.asInstanceOf[js.Any])
  }
  
}

