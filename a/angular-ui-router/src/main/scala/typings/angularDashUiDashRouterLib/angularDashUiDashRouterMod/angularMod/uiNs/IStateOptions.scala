package typings
package angularDashUiDashRouterLib.angularDashUiDashRouterMod.angularMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStateOptions extends js.Object {
  /**
    *  {boolean=true}, If true will inherit url parameters from current url.
    */
  var inherit: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * {boolean=true|string=} - If true will update the url in the location bar, if false will not. If string, must be "replace", which will update url and also replace last history record.
    */
  var location: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
    * {boolean=true}, If true will broadcast $stateChangeStart and $stateChangeSuccess events.
    */
  @JSName("notify")
  var notify_FIStateOptions: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * {object=$state.$current}, When transitioning with relative path (e.g '^'), defines which state to be relative from.
    */
  var relative: js.UndefOr[IState] = js.undefined
  /**
    * {boolean=false|string|IState}, If true will force transition even if the state or params have not changed, aka a reload of the same state. It differs from reloadOnSearch because you'd use this when you want to force a reload when everything is the same, including search params.
    */
  var reload: js.UndefOr[scala.Boolean | java.lang.String | IState] = js.undefined
}

object IStateOptions {
  @scala.inline
  def apply(
    inherit: js.UndefOr[scala.Boolean] = js.undefined,
    location: scala.Boolean | java.lang.String = null,
    notify: js.UndefOr[scala.Boolean] = js.undefined,
    relative: IState = null,
    reload: scala.Boolean | java.lang.String | IState = null
  ): IStateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit)
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(notify)) __obj.updateDynamic("notify")(notify)
    if (relative != null) __obj.updateDynamic("relative")(relative)
    if (reload != null) __obj.updateDynamic("reload")(reload.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStateOptions]
  }
}

