package typings
package atAntDashDesignReactDashNativeLib.esButtonPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonPropsType extends js.Object {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var loading: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[
    atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.large | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.small
  ] = js.undefined
  var `type`: js.UndefOr[
    atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.primary | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.warning | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.ghost
  ] = js.undefined
}

object ButtonPropsType {
  @scala.inline
  def apply(
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    size: atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.large | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.small = null,
    `type`: atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.primary | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.warning | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.ghost = null
  ): ButtonPropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonPropsType]
  }
}

