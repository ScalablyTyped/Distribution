package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderOverride extends js.Object {
  var deprecatedBehavior: Boolean
  var deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _]
  var flags: ɵNodeFlags
  var token: js.Any
  var value: js.Any
}

object ProviderOverride {
  @scala.inline
  def apply(
    deprecatedBehavior: Boolean,
    deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _],
    flags: ɵNodeFlags,
    token: js.Any,
    value: js.Any
  ): ProviderOverride = {
    val __obj = js.Dynamic.literal(deprecatedBehavior = deprecatedBehavior.asInstanceOf[js.Any], deps = deps.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderOverride]
  }
}

