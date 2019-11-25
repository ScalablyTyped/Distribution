package typings.antd

import typings.propDashTypes.propDashTypesMod.ReactNodeLike
import typings.propDashTypes.propDashTypesMod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrefixCls extends js.Object {
  var prefixCls: Requireable[String]
  var routes: Requireable[js.Array[_]]
  var separator: Requireable[ReactNodeLike]
}

object Anon_PrefixCls {
  @scala.inline
  def apply(
    prefixCls: Requireable[String],
    routes: Requireable[js.Array[_]],
    separator: Requireable[ReactNodeLike]
  ): Anon_PrefixCls = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_PrefixCls]
  }
}

