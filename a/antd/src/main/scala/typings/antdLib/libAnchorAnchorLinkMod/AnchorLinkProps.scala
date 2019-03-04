package typings
package antdLib.libAnchorAnchorLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorLinkProps extends js.Object {
  var children: js.UndefOr[js.Any] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var href: java.lang.String
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var title: reactLib.reactMod.ReactNs.ReactNode
}

object AnchorLinkProps {
  @scala.inline
  def apply(
    href: java.lang.String,
    title: reactLib.reactMod.ReactNs.ReactNode,
    children: js.Any = null,
    className: java.lang.String = null,
    prefixCls: java.lang.String = null
  ): AnchorLinkProps = {
    val __obj = js.Dynamic.literal(href = href, title = title.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children)
    if (className != null) __obj.updateDynamic("className")(className)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    __obj.asInstanceOf[AnchorLinkProps]
  }
}

