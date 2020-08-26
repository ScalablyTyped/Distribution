package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Termination extends js.Object {
  /**
    * The countries to which calls are allowed, in ISO 3166-1 alpha-2 format. Required.
    */
  var CallingRegions: js.UndefOr[CallingRegionList] = js.native
  /**
    * The IP addresses allowed to make calls, in CIDR format. Required.
    */
  var CidrAllowedList: js.UndefOr[StringList] = js.native
  /**
    * The limit on calls per second. Max value based on account service quota. Default value of 1.
    */
  var CpsLimit: js.UndefOr[typings.awsSdk.chimeMod.CpsLimit] = js.native
  /**
    * The default caller ID phone number.
    */
  var DefaultPhoneNumber: js.UndefOr[E164PhoneNumber] = js.native
  /**
    * When termination settings are disabled, outbound calls can not be made.
    */
  var Disabled: js.UndefOr[Boolean] = js.native
}

object Termination {
  @scala.inline
  def apply(): Termination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Termination]
  }
  @scala.inline
  implicit class TerminationOps[Self <: Termination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCallingRegionsVarargs(value: CallingRegion*): Self = this.set("CallingRegions", js.Array(value :_*))
    @scala.inline
    def setCallingRegions(value: CallingRegionList): Self = this.set("CallingRegions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallingRegions: Self = this.set("CallingRegions", js.undefined)
    @scala.inline
    def setCidrAllowedListVarargs(value: String*): Self = this.set("CidrAllowedList", js.Array(value :_*))
    @scala.inline
    def setCidrAllowedList(value: StringList): Self = this.set("CidrAllowedList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCidrAllowedList: Self = this.set("CidrAllowedList", js.undefined)
    @scala.inline
    def setCpsLimit(value: CpsLimit): Self = this.set("CpsLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCpsLimit: Self = this.set("CpsLimit", js.undefined)
    @scala.inline
    def setDefaultPhoneNumber(value: E164PhoneNumber): Self = this.set("DefaultPhoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultPhoneNumber: Self = this.set("DefaultPhoneNumber", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("Disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("Disabled", js.undefined)
  }
  
}

