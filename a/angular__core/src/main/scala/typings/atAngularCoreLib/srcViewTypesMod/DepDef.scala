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
    val __obj = js.Dynamic.literal(flags = flags, token = token, tokenKey = tokenKey)
  
    __obj.asInstanceOf[DepDef]
  }
}

