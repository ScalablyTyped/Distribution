package typings
package antdLib.libCollapseCollapseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var forceRender: js.UndefOr[scala.Boolean] = js.undefined
  var header: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var isActive: js.UndefOr[scala.Boolean] = js.undefined
  var showArrow: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object PanelProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    forceRender: js.UndefOr[scala.Boolean] = js.undefined,
    header: reactLib.reactMod.ReactNs.ReactNode = null,
    isActive: js.UndefOr[scala.Boolean] = js.undefined,
    showArrow: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): PanelProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(forceRender)) __obj.updateDynamic("forceRender")(forceRender)
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive)
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[PanelProps]
  }
}

