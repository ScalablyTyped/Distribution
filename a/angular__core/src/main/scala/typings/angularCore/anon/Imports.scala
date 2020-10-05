package typings.angularCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Imports extends js.Object {
  var imports: js.UndefOr[js.Array[_]] = js.native
  var providers: js.UndefOr[js.Array[_]] = js.native
  def factory(): js.Any = js.native
}

object Imports {
  @scala.inline
  def apply(factory: () => js.Any): Imports = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory))
    __obj.asInstanceOf[Imports]
  }
  @scala.inline
  implicit class ImportsOps[Self <: Imports] (val x: Self) extends AnyVal {
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
    def setFactory(value: () => js.Any): Self = this.set("factory", js.Any.fromFunction0(value))
    @scala.inline
    def setImportsVarargs(value: js.Any*): Self = this.set("imports", js.Array(value :_*))
    @scala.inline
    def setImports(value: js.Array[_]): Self = this.set("imports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImports: Self = this.set("imports", js.undefined)
    @scala.inline
    def setProvidersVarargs(value: js.Any*): Self = this.set("providers", js.Array(value :_*))
    @scala.inline
    def setProviders(value: js.Array[_]): Self = this.set("providers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviders: Self = this.set("providers", js.undefined)
  }
  
}

