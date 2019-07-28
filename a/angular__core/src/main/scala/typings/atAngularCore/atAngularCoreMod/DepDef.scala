package typings.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DepDef extends js.Object {
  var flags: ɵDepFlags
  var token: js.Any
  var tokenKey: String
}

object DepDef {
  @scala.inline
  def apply(flags: ɵDepFlags, token: js.Any, tokenKey: String): DepDef = {
    val __obj = js.Dynamic.literal(flags = flags, token = token, tokenKey = tokenKey)
  
    __obj.asInstanceOf[DepDef]
  }
}

