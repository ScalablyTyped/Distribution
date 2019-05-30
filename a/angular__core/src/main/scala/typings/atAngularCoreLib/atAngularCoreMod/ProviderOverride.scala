package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderOverride extends js.Object {
  var deprecatedBehavior: scala.Boolean
  var deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _]
  var flags: ɵNodeFlags
  var token: js.Any
  var value: js.Any
}

object ProviderOverride {
  @scala.inline
  def apply(
    deprecatedBehavior: scala.Boolean,
    deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _],
    flags: ɵNodeFlags,
    token: js.Any,
    value: js.Any
  ): ProviderOverride = {
    val __obj = js.Dynamic.literal(deprecatedBehavior = deprecatedBehavior, deps = deps, flags = flags, token = token, value = value)
  
    __obj.asInstanceOf[ProviderOverride]
  }
}

