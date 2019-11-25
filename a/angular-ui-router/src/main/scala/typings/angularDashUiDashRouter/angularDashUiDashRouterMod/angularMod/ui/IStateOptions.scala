package typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStateOptions extends js.Object {
  /**
    *  {boolean=true}, If true will inherit url parameters from current url.
    */
  var inherit: js.UndefOr[Boolean] = js.undefined
  /**
    * {boolean=true|string=} - If true will update the url in the location bar, if false will not. If string, must be "replace", which will update url and also replace last history record.
    */
  var location: js.UndefOr[Boolean | String] = js.undefined
  /**
    * {boolean=true}, If true will broadcast $stateChangeStart and $stateChangeSuccess events.
    */
  @JSName("notify")
  var notify_FIStateOptions: js.UndefOr[Boolean] = js.undefined
  /**
    * {object=$state.$current}, When transitioning with relative path (e.g '^'), defines which state to be relative from.
    */
  var relative: js.UndefOr[typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IState] = js.undefined
  /**
    * {boolean=false|string|IState}, If true will force transition even if the state or params have not changed, aka a reload of the same state. It differs from reloadOnSearch because you'd use this when you want to force a reload when everything is the same, including search params.
    */
  var reload: js.UndefOr[
    Boolean | String | typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IState
  ] = js.undefined
}

object IStateOptions {
  @scala.inline
  def apply(
    inherit: js.UndefOr[Boolean] = js.undefined,
    location: Boolean | String = null,
    notify: js.UndefOr[Boolean] = js.undefined,
    relative: typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IState = null,
    reload: Boolean | String | typings.angularDashUiDashRouter.angularDashUiDashRouterMod.angularMod.ui.IState = null
  ): IStateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(notify)) __obj.updateDynamic("notify")(notify.asInstanceOf[js.Any])
    if (relative != null) __obj.updateDynamic("relative")(relative.asInstanceOf[js.Any])
    if (reload != null) __obj.updateDynamic("reload")(reload.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStateOptions]
  }
}

