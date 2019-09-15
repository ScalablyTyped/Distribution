package typings.antd.libDescriptionsMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescriptionsItemProps extends js.Object {
  var children: ReactNode
  var className: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[ReactNode] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var span: js.UndefOr[Double] = js.undefined
}

object DescriptionsItemProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    className: String = null,
    label: ReactNode = null,
    prefixCls: String = null,
    span: Int | Double = null
  ): DescriptionsItemProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionsItemProps]
  }
}

