package typings.antd

import typings.propDashTypes.propDashTypesMod.ReactNodeLike
import typings.propDashTypes.propDashTypesMod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Params extends js.Object {
  var params: Requireable[js.Object]
  var prefixCls: Requireable[String]
  var routes: Requireable[js.Array[_]]
  var separator: Requireable[ReactNodeLike]
}

object Anon_Params {
  @scala.inline
  def apply(
    params: Requireable[js.Object],
    prefixCls: Requireable[String],
    routes: Requireable[js.Array[_]],
    separator: Requireable[ReactNodeLike]
  ): Anon_Params = {
    val __obj = js.Dynamic.literal(params = params, prefixCls = prefixCls, routes = routes, separator = separator)
  
    __obj.asInstanceOf[Anon_Params]
  }
}

