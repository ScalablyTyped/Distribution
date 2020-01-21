package typings.antd

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrefixCls extends js.Object {
  var prefixCls: Requireable[String]
  var routes: Requireable[js.Array[_]]
  var separator: Requireable[ReactNodeLike]
}

object AnonPrefixCls {
  @scala.inline
  def apply(
    prefixCls: Requireable[String],
    routes: Requireable[js.Array[_]],
    separator: Requireable[ReactNodeLike]
  ): AnonPrefixCls = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPrefixCls]
  }
}

