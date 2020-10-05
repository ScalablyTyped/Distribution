package typings.angularCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deps extends js.Object {
  var deps: js.Array[_] = js.native
  var useFactory: js.Function = js.native
}

object Deps {
  @scala.inline
  def apply(deps: js.Array[_], useFactory: js.Function): Deps = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], useFactory = useFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deps]
  }
  @scala.inline
  implicit class DepsOps[Self <: Deps] (val x: Self) extends AnyVal {
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
    def setDepsVarargs(value: js.Any*): Self = this.set("deps", js.Array(value :_*))
    @scala.inline
    def setDeps(value: js.Array[_]): Self = this.set("deps", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseFactory(value: js.Function): Self = this.set("useFactory", value.asInstanceOf[js.Any])
  }
  
}

