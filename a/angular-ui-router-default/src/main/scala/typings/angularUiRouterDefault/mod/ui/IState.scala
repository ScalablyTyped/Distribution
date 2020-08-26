package typings.angularUiRouterDefault.mod.ui

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IState extends js.Object {
  var default: js.UndefOr[StateDefaultSpecifier] = js.native
}

object IState {
  @scala.inline
  def apply(): IState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IState]
  }
  @scala.inline
  implicit class IStateOps[Self <: IState] (val x: Self) extends AnyVal {
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
    def setDefaultVarargs(value: ((js.Function1[/* repeated */ js.Any, IPromise[String] | String]) | String)*): Self = this.set("default", js.Array(value :_*))
    @scala.inline
    def setDefaultFunction1(value: /* repeated */ js.Any => IPromise[String] | String): Self = this.set("default", js.Any.fromFunction1(value))
    @scala.inline
    def setDefault(value: StateDefaultSpecifier): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
  }
  
}

