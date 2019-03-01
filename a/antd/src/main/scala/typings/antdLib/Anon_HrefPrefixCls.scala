package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HrefPrefixCls extends js.Object {
  var href: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
  var prefixCls: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
  var separator: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String | propDashTypesLib.propDashTypesMod.ReactElementLike]
}

object Anon_HrefPrefixCls {
  @scala.inline
  def apply(
    href: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String],
    prefixCls: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String],
    separator: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String | propDashTypesLib.propDashTypesMod.ReactElementLike]
  ): Anon_HrefPrefixCls = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("href")(href)
    __obj.updateDynamic("prefixCls")(prefixCls)
    __obj.updateDynamic("separator")(separator)
    __obj.asInstanceOf[Anon_HrefPrefixCls]
  }
}

