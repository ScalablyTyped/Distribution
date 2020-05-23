package typings.antd.cellMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellProps extends js.Object {
  var bordered: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var colon: js.UndefOr[Boolean] = js.undefined
  var component: String
  var content: js.UndefOr[ReactNode] = js.undefined
  var itemPrefixCls: String
  var label: js.UndefOr[ReactNode] = js.undefined
  var span: Double
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object CellProps {
  @scala.inline
  def apply(
    component: String,
    itemPrefixCls: String,
    span: Double,
    bordered: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    colon: js.UndefOr[Boolean] = js.undefined,
    content: ReactNode = null,
    label: ReactNode = null,
    style: CSSProperties = null
  ): CellProps = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], itemPrefixCls = itemPrefixCls.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(colon)) __obj.updateDynamic("colon")(colon.get.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellProps]
  }
}

