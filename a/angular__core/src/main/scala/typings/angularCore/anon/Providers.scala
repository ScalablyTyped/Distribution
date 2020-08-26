package typings.angularCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Providers extends js.Object {
  var providers: js.UndefOr[js.Array[_]] = js.native
  var useJit: js.UndefOr[Boolean] = js.native
}

object Providers {
  @scala.inline
  def apply(): Providers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Providers]
  }
  @scala.inline
  implicit class ProvidersOps[Self <: Providers] (val x: Self) extends AnyVal {
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
    def setProvidersVarargs(value: js.Any*): Self = this.set("providers", js.Array(value :_*))
    @scala.inline
    def setProviders(value: js.Array[_]): Self = this.set("providers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviders: Self = this.set("providers", js.undefined)
    @scala.inline
    def setUseJit(value: Boolean): Self = this.set("useJit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseJit: Self = this.set("useJit", js.undefined)
  }
  
}

