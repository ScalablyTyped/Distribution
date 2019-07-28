package typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.uiNs

import typings.angular.angularMod.Global.Function
import typings.angular.angularMod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStateProvider extends IServiceProvider {
  def decorator(): js.Any = js.native
  def decorator(name: String): js.Any = js.native
  def decorator(
    name: String,
    decorator: js.Function2[
      /* state */ typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.uiNs.IState, 
      /* parent */ Function, 
      _
    ]
  ): js.Any = js.native
  def state(config: typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.uiNs.IState): typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.uiNs.IStateProvider = js.native
  def state(
    name: String,
    config: typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.uiNs.IState
  ): typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.uiNs.IStateProvider = js.native
}

