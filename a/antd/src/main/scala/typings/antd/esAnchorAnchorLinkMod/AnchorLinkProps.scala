package typings.antd.esAnchorAnchorLinkMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorLinkProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var href: String
  var prefixCls: js.UndefOr[String] = js.undefined
  var title: ReactNode
}

object AnchorLinkProps {
  @scala.inline
  def apply(
    href: String,
    title: ReactNode,
    children: ReactNode = null,
    className: String = null,
    prefixCls: String = null
  ): AnchorLinkProps = {
    val __obj = js.Dynamic.literal(href = href, title = title.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    __obj.asInstanceOf[AnchorLinkProps]
  }
}

