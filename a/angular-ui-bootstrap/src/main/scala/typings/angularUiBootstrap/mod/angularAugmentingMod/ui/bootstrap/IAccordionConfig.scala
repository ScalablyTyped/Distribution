package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAccordionConfig extends js.Object {
  /**
    * Controls whether expanding an item will cause the other items to close.
    *
    * @default true
    */
  var closeOthers: js.UndefOr[Boolean] = js.native
}

object IAccordionConfig {
  @scala.inline
  def apply(): IAccordionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAccordionConfig]
  }
  @scala.inline
  implicit class IAccordionConfigOps[Self <: IAccordionConfig] (val x: Self) extends AnyVal {
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
    def setCloseOthers(value: Boolean): Self = this.set("closeOthers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOthers: Self = this.set("closeOthers", js.undefined)
  }
  
}

