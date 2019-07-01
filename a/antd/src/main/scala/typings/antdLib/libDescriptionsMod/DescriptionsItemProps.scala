package typings
package antdLib.libDescriptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescriptionsItemProps extends js.Object {
  var children: reactLib.reactMod.ReactNode
  var className: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var span: js.UndefOr[scala.Double] = js.undefined
}

object DescriptionsItemProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    className: java.lang.String = null,
    label: reactLib.reactMod.ReactNode = null,
    prefixCls: java.lang.String = null,
    span: scala.Int | scala.Double = null
  ): DescriptionsItemProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionsItemProps]
  }
}

