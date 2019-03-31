package typings
package antdDashMobileDashRnLib.libPopoverPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverPropsType extends js.Object {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var onSelect: js.UndefOr[
    js.Function2[/* node */ js.Any, /* index */ js.UndefOr[scala.Double], scala.Unit]
  ] = js.undefined
  var overlay: reactLib.reactMod.ReactNs.ReactNode
}

object PopoverPropsType {
  @scala.inline
  def apply(
    overlay: reactLib.reactMod.ReactNs.ReactNode,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    onSelect: (/* node */ js.Any, /* index */ js.UndefOr[scala.Double]) => scala.Unit = null
  ): PopoverPropsType = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    __obj.asInstanceOf[PopoverPropsType]
  }
}

