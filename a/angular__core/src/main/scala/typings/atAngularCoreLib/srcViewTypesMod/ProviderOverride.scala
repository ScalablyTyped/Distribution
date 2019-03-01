package typings
package atAngularCoreLib.srcViewTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderOverride extends js.Object {
  var deprecatedBehavior: scala.Boolean
  var deps: js.Array[(js.Tuple2[DepFlags, _]) | _]
  var flags: NodeFlags
  var token: js.Any
  var value: js.Any
}

object ProviderOverride {
  @scala.inline
  def apply(
    deprecatedBehavior: scala.Boolean,
    deps: js.Array[(js.Tuple2[DepFlags, _]) | _],
    flags: NodeFlags,
    token: js.Any,
    value: js.Any
  ): ProviderOverride = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deprecatedBehavior")(deprecatedBehavior)
    __obj.updateDynamic("deps")(deps)
    __obj.updateDynamic("flags")(flags)
    __obj.updateDynamic("token")(token)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ProviderOverride]
  }
}

