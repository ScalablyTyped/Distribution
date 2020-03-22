package typings.angularAria.mod.aria

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ key in angular-aria.angular.aria.IAriaAttribute ]:? boolean} */
trait IAriaProviderOptions extends js.Object {
  var ariaChecked: js.UndefOr[Boolean] = js.undefined
  var ariaDisabled: js.UndefOr[Boolean] = js.undefined
  var ariaHidden: js.UndefOr[Boolean] = js.undefined
  var ariaInvalid: js.UndefOr[Boolean] = js.undefined
  var ariaReadonly: js.UndefOr[Boolean] = js.undefined
  var ariaRequired: js.UndefOr[Boolean] = js.undefined
  var ariaValue: js.UndefOr[Boolean] = js.undefined
  var bindKeydown: js.UndefOr[Boolean] = js.undefined
  var bindRoleForClick: js.UndefOr[Boolean] = js.undefined
  var tabindex: js.UndefOr[Boolean] = js.undefined
}

object IAriaProviderOptions {
  @scala.inline
  def apply(
    ariaChecked: js.UndefOr[Boolean] = js.undefined,
    ariaDisabled: js.UndefOr[Boolean] = js.undefined,
    ariaHidden: js.UndefOr[Boolean] = js.undefined,
    ariaInvalid: js.UndefOr[Boolean] = js.undefined,
    ariaReadonly: js.UndefOr[Boolean] = js.undefined,
    ariaRequired: js.UndefOr[Boolean] = js.undefined,
    ariaValue: js.UndefOr[Boolean] = js.undefined,
    bindKeydown: js.UndefOr[Boolean] = js.undefined,
    bindRoleForClick: js.UndefOr[Boolean] = js.undefined,
    tabindex: js.UndefOr[Boolean] = js.undefined
  ): IAriaProviderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ariaChecked)) __obj.updateDynamic("ariaChecked")(ariaChecked.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaDisabled)) __obj.updateDynamic("ariaDisabled")(ariaDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaHidden)) __obj.updateDynamic("ariaHidden")(ariaHidden.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaInvalid)) __obj.updateDynamic("ariaInvalid")(ariaInvalid.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaReadonly)) __obj.updateDynamic("ariaReadonly")(ariaReadonly.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaRequired)) __obj.updateDynamic("ariaRequired")(ariaRequired.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaValue)) __obj.updateDynamic("ariaValue")(ariaValue.asInstanceOf[js.Any])
    if (!js.isUndefined(bindKeydown)) __obj.updateDynamic("bindKeydown")(bindKeydown.asInstanceOf[js.Any])
    if (!js.isUndefined(bindRoleForClick)) __obj.updateDynamic("bindRoleForClick")(bindRoleForClick.asInstanceOf[js.Any])
    if (!js.isUndefined(tabindex)) __obj.updateDynamic("tabindex")(tabindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAriaProviderOptions]
  }
}

