package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IButtonConfig extends js.Object {
  /**
    * @default: 'active'
    */
  var activeClass: js.UndefOr[String] = js.native
  /**
    * @default: 'Click'
    */
  var toggleEvent: js.UndefOr[String] = js.native
}

object IButtonConfig {
  @scala.inline
  def apply(): IButtonConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IButtonConfig]
  }
  @scala.inline
  implicit class IButtonConfigOps[Self <: IButtonConfig] (val x: Self) extends AnyVal {
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
    def setActiveClass(value: String): Self = this.set("activeClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveClass: Self = this.set("activeClass", js.undefined)
    @scala.inline
    def setToggleEvent(value: String): Self = this.set("toggleEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggleEvent: Self = this.set("toggleEvent", js.undefined)
  }
  
}

