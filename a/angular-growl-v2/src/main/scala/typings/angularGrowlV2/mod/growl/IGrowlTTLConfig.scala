package typings.angularGrowlV2.mod.growl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Global Time-To-Leave configuration.
  */
@js.native
trait IGrowlTTLConfig extends js.Object {
  var error: js.UndefOr[Double] = js.native
  var info: js.UndefOr[Double] = js.native
  var success: js.UndefOr[Double] = js.native
  var warning: js.UndefOr[Double] = js.native
}

object IGrowlTTLConfig {
  @scala.inline
  def apply(): IGrowlTTLConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGrowlTTLConfig]
  }
  @scala.inline
  implicit class IGrowlTTLConfigOps[Self <: IGrowlTTLConfig] (val x: Self) extends AnyVal {
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
    def setError(value: Double): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setInfo(value: Double): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setSuccess(value: Double): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setWarning(value: Double): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

