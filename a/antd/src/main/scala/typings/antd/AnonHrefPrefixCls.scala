package typings.antd

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHrefPrefixCls extends js.Object {
  var href: Requireable[String]
  var prefixCls: Requireable[String]
  var separator: Requireable[String | ReactElementLike]
}

object AnonHrefPrefixCls {
  @scala.inline
  def apply(
    href: Requireable[String],
    prefixCls: Requireable[String],
    separator: Requireable[String | ReactElementLike]
  ): AnonHrefPrefixCls = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHrefPrefixCls]
  }
}

