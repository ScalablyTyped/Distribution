package typings.awsDashSdk.clientsChimeMod

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
    * The limit on calls per second. Max value based on account service limit. Default value of 1.
    */
  var CpsLimit: js.UndefOr[typings.awsDashSdk.clientsChimeMod.CpsLimit] = js.native
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
  def apply(
    CallingRegions: CallingRegionList = null,
    CidrAllowedList: StringList = null,
    CpsLimit: Int | Double = null,
    DefaultPhoneNumber: E164PhoneNumber = null,
    Disabled: js.UndefOr[scala.Boolean] = js.undefined
  ): Termination = {
    val __obj = js.Dynamic.literal()
    if (CallingRegions != null) __obj.updateDynamic("CallingRegions")(CallingRegions.asInstanceOf[js.Any])
    if (CidrAllowedList != null) __obj.updateDynamic("CidrAllowedList")(CidrAllowedList.asInstanceOf[js.Any])
    if (CpsLimit != null) __obj.updateDynamic("CpsLimit")(CpsLimit.asInstanceOf[js.Any])
    if (DefaultPhoneNumber != null) __obj.updateDynamic("DefaultPhoneNumber")(DefaultPhoneNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(Disabled)) __obj.updateDynamic("Disabled")(Disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Termination]
  }
}

