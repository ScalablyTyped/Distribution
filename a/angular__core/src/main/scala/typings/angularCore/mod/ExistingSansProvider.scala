package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExistingSansProvider extends InjectableProvider {
  /**
    * Existing `token` to return. (Equivalent to `injector.get(useExisting)`)
    */
  var useExisting: js.Any = js.native
}

object ExistingSansProvider {
  @scala.inline
  def apply(useExisting: js.Any): ExistingSansProvider = {
    val __obj = js.Dynamic.literal(useExisting = useExisting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExistingSansProvider]
  }
  @scala.inline
  implicit class ExistingSansProviderOps[Self <: ExistingSansProvider] (val x: Self) extends AnyVal {
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
    def setUseExisting(value: js.Any): Self = this.set("useExisting", value.asInstanceOf[js.Any])
  }
  
}

