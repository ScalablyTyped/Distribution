package typings.atAntDashDesignReactDashNative.esButtonPropsTypeMod

import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.ghost
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.large
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.primary
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.small
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonPropsType extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[large | small] = js.undefined
  var `type`: js.UndefOr[primary | warning | ghost] = js.undefined
}

object ButtonPropsType {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    size: large | small = null,
    `type`: primary | warning | ghost = null
  ): ButtonPropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonPropsType]
  }
}

