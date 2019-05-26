package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Params extends js.Object {
  var params: propDashTypesLib.propDashTypesMod.Requireable[js.Object]
  var prefixCls: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
  var routes: propDashTypesLib.propDashTypesMod.Requireable[js.Array[_]]
  var separator: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactNodeLike]
}

object Anon_Params {
  @scala.inline
  def apply(
    params: propDashTypesLib.propDashTypesMod.Requireable[js.Object],
    prefixCls: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String],
    routes: propDashTypesLib.propDashTypesMod.Requireable[js.Array[_]],
    separator: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactNodeLike]
  ): Anon_Params = {
    val __obj = js.Dynamic.literal(params = params, prefixCls = prefixCls, routes = routes, separator = separator)
  
    __obj.asInstanceOf[Anon_Params]
  }
}

