package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NgModuleProviderDef extends js.Object {
  var deps: js.Array[DepDef]
  var flags: ɵNodeFlags
  var index: Double
  var token: js.Any
  var value: js.Any
}

object NgModuleProviderDef {
  @scala.inline
  def apply(deps: js.Array[DepDef], flags: ɵNodeFlags, index: Double, token: js.Any, value: js.Any): NgModuleProviderDef = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NgModuleProviderDef]
  }
}

