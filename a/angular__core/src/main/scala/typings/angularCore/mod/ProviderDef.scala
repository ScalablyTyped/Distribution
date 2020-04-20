package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderDef extends js.Object {
  var deps: js.Array[DepDef]
  var token: js.Any
  var value: js.Any
}

object ProviderDef {
  @scala.inline
  def apply(deps: js.Array[DepDef], token: js.Any, value: js.Any): ProviderDef = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderDef]
  }
}

