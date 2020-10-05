package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProviderOverride extends js.Object {
  var deprecatedBehavior: Boolean = js.native
  var deps: js.Array[(js.Tuple2[ɵDepFlags, _]) | _] = js.native
  var flags: ɵNodeFlags = js.native
  var token: js.Any = js.native
  var value: js.Any = js.native
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
  @scala.inline
  implicit class ProviderOverrideOps[Self <: ProviderOverride] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeprecatedBehavior(value: Boolean): Self = this.set("deprecatedBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepsVarargs(value: ((js.Tuple2[ɵDepFlags, js.Any]) | js.Any)*): Self = this.set("deps", js.Array(value :_*))
    @scala.inline
    def setDeps(value: js.Array[(js.Tuple2[ɵDepFlags, _]) | _]): Self = this.set("deps", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlags(value: ɵNodeFlags): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: js.Any): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

