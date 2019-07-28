package typings.antd.libCollapseCollapsePanelMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapsePanelProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var extra: js.UndefOr[ReactNode] = js.undefined
  var forceRender: js.UndefOr[Boolean] = js.undefined
  var header: ReactNode
  var id: js.UndefOr[String] = js.undefined
  var key: String | Double
  var prefixCls: js.UndefOr[String] = js.undefined
  var showArrow: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object CollapsePanelProps {
  @scala.inline
  def apply(
    header: ReactNode,
    key: String | Double,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    extra: ReactNode = null,
    forceRender: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    prefixCls: String = null,
    showArrow: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): CollapsePanelProps = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRender)) __obj.updateDynamic("forceRender")(forceRender)
    if (id != null) __obj.updateDynamic("id")(id)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[CollapsePanelProps]
  }
}

