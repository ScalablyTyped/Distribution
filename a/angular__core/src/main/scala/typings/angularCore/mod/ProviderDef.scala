package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProviderDef extends js.Object {
  var deps: js.Array[DepDef] = js.native
  var token: js.Any = js.native
  var value: js.Any = js.native
}

object ProviderDef {
  @scala.inline
  def apply(deps: js.Array[DepDef], token: js.Any, value: js.Any): ProviderDef = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderDef]
  }
  @scala.inline
  implicit class ProviderDefOps[Self <: ProviderDef] (val x: Self) extends AnyVal {
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
    def setToken(value: js.Any): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

