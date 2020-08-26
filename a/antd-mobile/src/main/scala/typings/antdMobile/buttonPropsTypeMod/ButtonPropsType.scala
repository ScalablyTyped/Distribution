package typings.antdMobile.buttonPropsTypeMod

import typings.antdMobile.antdMobileStrings.ghost
import typings.antdMobile.antdMobileStrings.large
import typings.antdMobile.antdMobileStrings.primary
import typings.antdMobile.antdMobileStrings.small
import typings.antdMobile.antdMobileStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonPropsType extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.native
  var loading: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[large | small] = js.native
  var `type`: js.UndefOr[primary | warning | ghost] = js.native
}

object ButtonPropsType {
  @scala.inline
  def apply(): ButtonPropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonPropsType]
  }
  @scala.inline
  implicit class ButtonPropsTypeOps[Self <: ButtonPropsType] (val x: Self) extends AnyVal {
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setSize(value: large | small): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setType(value: primary | warning | ghost): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

