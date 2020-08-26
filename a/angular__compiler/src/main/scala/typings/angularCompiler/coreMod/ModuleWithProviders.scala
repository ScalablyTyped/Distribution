package typings.angularCompiler.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleWithProviders extends js.Object {
  var ngModule: Type = js.native
  var providers: js.UndefOr[js.Array[Provider]] = js.native
}

object ModuleWithProviders {
  @scala.inline
  def apply(ngModule: Type): ModuleWithProviders = {
    val __obj = js.Dynamic.literal(ngModule = ngModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleWithProviders]
  }
  @scala.inline
  implicit class ModuleWithProvidersOps[Self <: ModuleWithProviders] (val x: Self) extends AnyVal {
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
    def setNgModule(value: Type): Self = this.set("ngModule", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvidersVarargs(value: Provider*): Self = this.set("providers", js.Array(value :_*))
    @scala.inline
    def setProviders(value: js.Array[Provider]): Self = this.set("providers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviders: Self = this.set("providers", js.undefined)
  }
  
}

