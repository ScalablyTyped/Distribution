package typings.angularBreadcrumb.mod.angularAugmentingMod.ncy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait breadcrumbProvider extends js.Object {
  /**
    * Setter for options defined in a module.config block
    **/
  def setOptions(options: breadcrumbProviderOptions): Unit = js.native
}

object breadcrumbProvider {
  @scala.inline
  def apply(setOptions: breadcrumbProviderOptions => Unit): breadcrumbProvider = {
    val __obj = js.Dynamic.literal(setOptions = js.Any.fromFunction1(setOptions))
    __obj.asInstanceOf[breadcrumbProvider]
  }
  @scala.inline
  implicit class breadcrumbProviderOps[Self <: breadcrumbProvider] (val x: Self) extends AnyVal {
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
    def setSetOptions(value: breadcrumbProviderOptions => Unit): Self = this.set("setOptions", js.Any.fromFunction1(value))
  }
  
}

