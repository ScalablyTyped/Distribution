package typings
package antdLib.esDescriptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescriptionsItemProps extends js.Object {
  var children: reactLib.reactMod.Global.JSXNs.Element
  var label: reactLib.reactMod.ReactNode
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var span: js.UndefOr[scala.Double] = js.undefined
}

object DescriptionsItemProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.Global.JSXNs.Element,
    label: reactLib.reactMod.ReactNode,
    prefixCls: java.lang.String = null,
    span: scala.Int | scala.Double = null
  ): DescriptionsItemProps = {
    val __obj = js.Dynamic.literal(children = children, label = label.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionsItemProps]
  }
}

