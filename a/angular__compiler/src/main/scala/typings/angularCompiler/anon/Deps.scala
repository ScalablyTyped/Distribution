package typings.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deps extends js.Object {
  var deps: js.UndefOr[js.Array[js.Object] | Null] = js.native
  var multi: js.UndefOr[Boolean] = js.native
  var useClass: js.UndefOr[typings.angularCompiler.coreMod.Type] = js.native
  var useExisting: js.UndefOr[js.Any] = js.native
  var useFactory: js.UndefOr[js.Function | Null] = js.native
  var useValue: js.UndefOr[js.Any] = js.native
}

object Deps {
  @scala.inline
  def apply(): Deps = {
    val __obj = js.Dynamic.literal()
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
    def setDepsVarargs(value: js.Object*): Self = this.set("deps", js.Array(value :_*))
    @scala.inline
    def setDeps(value: js.Array[js.Object]): Self = this.set("deps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeps: Self = this.set("deps", js.undefined)
    @scala.inline
    def setDepsNull: Self = this.set("deps", null)
    @scala.inline
    def setMulti(value: Boolean): Self = this.set("multi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMulti: Self = this.set("multi", js.undefined)
    @scala.inline
    def setUseClass(value: typings.angularCompiler.coreMod.Type): Self = this.set("useClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseClass: Self = this.set("useClass", js.undefined)
    @scala.inline
    def setUseExisting(value: js.Any): Self = this.set("useExisting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseExisting: Self = this.set("useExisting", js.undefined)
    @scala.inline
    def setUseFactory(value: js.Function): Self = this.set("useFactory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseFactory: Self = this.set("useFactory", js.undefined)
    @scala.inline
    def setUseFactoryNull: Self = this.set("useFactory", null)
    @scala.inline
    def setUseValue(value: js.Any): Self = this.set("useValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseValue: Self = this.set("useValue", js.undefined)
  }
  
}

