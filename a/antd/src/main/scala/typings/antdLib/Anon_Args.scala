package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var linkRender: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]]
  var nameRender: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]]
  var params: propDashTypesLib.propDashTypesMod.Requireable[js.Object]
  var prefixCls: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
  var routes: propDashTypesLib.propDashTypesMod.Requireable[js.Array[_]]
  var separator: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactNodeLike]
}

object Anon_Args {
  @scala.inline
  def apply(
    linkRender: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]],
    nameRender: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]],
    params: propDashTypesLib.propDashTypesMod.Requireable[js.Object],
    prefixCls: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String],
    routes: propDashTypesLib.propDashTypesMod.Requireable[js.Array[_]],
    separator: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactNodeLike]
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(linkRender = linkRender, nameRender = nameRender, params = params, prefixCls = prefixCls, routes = routes, separator = separator)
  
    __obj.asInstanceOf[Anon_Args]
  }
}

