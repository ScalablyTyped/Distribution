package typings.antd

import typings.propDashTypes.propDashTypesMod.ReactElementLike
import typings.propDashTypes.propDashTypesMod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HrefPrefixCls extends js.Object {
  var href: Requireable[String]
  var prefixCls: Requireable[String]
  var separator: Requireable[String | ReactElementLike]
}

object Anon_HrefPrefixCls {
  @scala.inline
  def apply(
    href: Requireable[String],
    prefixCls: Requireable[String],
    separator: Requireable[String | ReactElementLike]
  ): Anon_HrefPrefixCls = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_HrefPrefixCls]
  }
}

