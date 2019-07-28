package typings.antd.libCollapseCollapseMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var extra: js.UndefOr[ReactNode] = js.undefined
  var forceRender: js.UndefOr[Boolean] = js.undefined
  var header: js.UndefOr[ReactNode] = js.undefined
  var isActive: js.UndefOr[Boolean] = js.undefined
  var showArrow: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object PanelProps {
  @scala.inline
  def apply(
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    extra: ReactNode = null,
    forceRender: js.UndefOr[Boolean] = js.undefined,
    header: ReactNode = null,
    isActive: js.UndefOr[Boolean] = js.undefined,
    showArrow: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): PanelProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRender)) __obj.updateDynamic("forceRender")(forceRender)
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive)
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[PanelProps]
  }
}

