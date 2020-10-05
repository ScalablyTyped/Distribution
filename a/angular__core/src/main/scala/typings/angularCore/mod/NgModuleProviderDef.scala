package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NgModuleProviderDef extends js.Object {
  var deps: js.Array[DepDef] = js.native
  var flags: ɵNodeFlags = js.native
  var index: Double = js.native
  var token: js.Any = js.native
  var value: js.Any = js.native
}

object NgModuleProviderDef {
  @scala.inline
  def apply(deps: js.Array[DepDef], flags: ɵNodeFlags, index: Double, token: js.Any, value: js.Any): NgModuleProviderDef = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgModuleProviderDef]
  }
  @scala.inline
  implicit class NgModuleProviderDefOps[Self <: NgModuleProviderDef] (val x: Self) extends AnyVal {
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
    def setDepsVarargs(value: DepDef*): Self = this.set("deps", js.Array(value :_*))
    @scala.inline
    def setDeps(value: js.Array[DepDef]): Self = this.set("deps", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlags(value: ɵNodeFlags): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: js.Any): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

