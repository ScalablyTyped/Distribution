package typings
package atAngularCoreLib.srcViewTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DepDef extends js.Object {
  var flags: DepFlags
  var token: js.Any
  var tokenKey: java.lang.String
}

object DepDef {
  @scala.inline
  def apply(flags: DepFlags, token: js.Any, tokenKey: java.lang.String): DepDef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("flags")(flags)
    __obj.updateDynamic("token")(token)
    __obj.updateDynamic("tokenKey")(tokenKey)
    __obj.asInstanceOf[DepDef]
  }
}

