package typings.autobahn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPublishOptions extends js.Object {
  var acknowledge: js.UndefOr[Boolean] = js.native
  var disclose_me: js.UndefOr[Boolean] = js.native
  var eligible: js.UndefOr[js.Array[Double]] = js.native
  var eligible_authid: js.UndefOr[js.Array[String]] = js.native
  var eligible_authrole: js.UndefOr[js.Array[String]] = js.native
  var exclude: js.UndefOr[js.Array[Double]] = js.native
  var exclude_authid: js.UndefOr[js.Array[String]] = js.native
  var exclude_authrole: js.UndefOr[js.Array[String]] = js.native
  var exclude_me: js.UndefOr[Boolean] = js.native
  var retain: js.UndefOr[Boolean] = js.native
}

object IPublishOptions {
  @scala.inline
  def apply(): IPublishOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPublishOptions]
  }
  @scala.inline
  implicit class IPublishOptionsOps[Self <: IPublishOptions] (val x: Self) extends AnyVal {
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
    def setAcknowledge(value: Boolean): Self = this.set("acknowledge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcknowledge: Self = this.set("acknowledge", js.undefined)
    @scala.inline
    def setDisclose_me(value: Boolean): Self = this.set("disclose_me", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisclose_me: Self = this.set("disclose_me", js.undefined)
    @scala.inline
    def setEligibleVarargs(value: Double*): Self = this.set("eligible", js.Array(value :_*))
    @scala.inline
    def setEligible(value: js.Array[Double]): Self = this.set("eligible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEligible: Self = this.set("eligible", js.undefined)
    @scala.inline
    def setEligible_authidVarargs(value: String*): Self = this.set("eligible_authid", js.Array(value :_*))
    @scala.inline
    def setEligible_authid(value: js.Array[String]): Self = this.set("eligible_authid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEligible_authid: Self = this.set("eligible_authid", js.undefined)
    @scala.inline
    def setEligible_authroleVarargs(value: String*): Self = this.set("eligible_authrole", js.Array(value :_*))
    @scala.inline
    def setEligible_authrole(value: js.Array[String]): Self = this.set("eligible_authrole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEligible_authrole: Self = this.set("eligible_authrole", js.undefined)
    @scala.inline
    def setExcludeVarargs(value: Double*): Self = this.set("exclude", js.Array(value :_*))
    @scala.inline
    def setExclude(value: js.Array[Double]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    @scala.inline
    def setExclude_authidVarargs(value: String*): Self = this.set("exclude_authid", js.Array(value :_*))
    @scala.inline
    def setExclude_authid(value: js.Array[String]): Self = this.set("exclude_authid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude_authid: Self = this.set("exclude_authid", js.undefined)
    @scala.inline
    def setExclude_authroleVarargs(value: String*): Self = this.set("exclude_authrole", js.Array(value :_*))
    @scala.inline
    def setExclude_authrole(value: js.Array[String]): Self = this.set("exclude_authrole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude_authrole: Self = this.set("exclude_authrole", js.undefined)
    @scala.inline
    def setExclude_me(value: Boolean): Self = this.set("exclude_me", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude_me: Self = this.set("exclude_me", js.undefined)
    @scala.inline
    def setRetain(value: Boolean): Self = this.set("retain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetain: Self = this.set("retain", js.undefined)
  }
  
}

