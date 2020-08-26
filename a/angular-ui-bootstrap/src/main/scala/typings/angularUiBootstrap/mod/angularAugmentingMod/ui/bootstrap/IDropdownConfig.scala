package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDropdownConfig extends js.Object {
  /**
    * @default: 'uib-dropdown-open'
    */
  var appendToOpenClass: js.UndefOr[String] = js.native
  /**
    * @default: 'open'
    */
  var openClass: js.UndefOr[String] = js.native
}

object IDropdownConfig {
  @scala.inline
  def apply(): IDropdownConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDropdownConfig]
  }
  @scala.inline
  implicit class IDropdownConfigOps[Self <: IDropdownConfig] (val x: Self) extends AnyVal {
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
    def setAppendToOpenClass(value: String): Self = this.set("appendToOpenClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendToOpenClass: Self = this.set("appendToOpenClass", js.undefined)
    @scala.inline
    def setOpenClass(value: String): Self = this.set("openClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenClass: Self = this.set("openClass", js.undefined)
  }
  
}

