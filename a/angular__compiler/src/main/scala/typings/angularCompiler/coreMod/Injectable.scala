package typings.angularCompiler.coreMod

import typings.angularCompiler.angularCompilerStrings.root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Injectable extends js.Object {
  var deps: js.UndefOr[js.Array[Type | js.Array[_]]] = js.native
  var providedIn: js.UndefOr[Type | root | js.Any] = js.native
  var useClass: js.UndefOr[Type | js.Any] = js.native
  var useExisting: js.UndefOr[Type | js.Any] = js.native
  var useFactory: js.UndefOr[Type | js.Any] = js.native
  var useValue: js.UndefOr[js.Any] = js.native
}

object Injectable {
  @scala.inline
  def apply(): Injectable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Injectable]
  }
  @scala.inline
  implicit class InjectableOps[Self <: Injectable] (val x: Self) extends AnyVal {
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
    def setDepsVarargs(value: (Type | js.Array[js.Any])*): Self = this.set("deps", js.Array(value :_*))
    @scala.inline
    def setDeps(value: js.Array[Type | js.Array[_]]): Self = this.set("deps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeps: Self = this.set("deps", js.undefined)
    @scala.inline
    def setProvidedIn(value: Type | root | js.Any): Self = this.set("providedIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvidedIn: Self = this.set("providedIn", js.undefined)
    @scala.inline
    def setUseClass(value: Type | js.Any): Self = this.set("useClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseClass: Self = this.set("useClass", js.undefined)
    @scala.inline
    def setUseExisting(value: Type | js.Any): Self = this.set("useExisting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseExisting: Self = this.set("useExisting", js.undefined)
    @scala.inline
    def setUseFactory(value: Type | js.Any): Self = this.set("useFactory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseFactory: Self = this.set("useFactory", js.undefined)
    @scala.inline
    def setUseValue(value: js.Any): Self = this.set("useValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseValue: Self = this.set("useValue", js.undefined)
  }
  
}

