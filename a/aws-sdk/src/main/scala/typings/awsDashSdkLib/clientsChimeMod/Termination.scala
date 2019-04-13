package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Termination extends js.Object {
  /**
    * The countries to which calls are allowed.
    */
  var CallingRegions: js.UndefOr[CallingRegionList] = js.undefined
  /**
    * The IP addresses allowed to make calls, in CIDR format.
    */
  var CidrAllowedList: js.UndefOr[StringList] = js.undefined
  /**
    * The limit on calls per second. Max value based on account service limit. Default value of 1.
    */
  var CpsLimit: js.UndefOr[CpsLimit] = js.undefined
  /**
    * The default caller ID phone number.
    */
  var DefaultPhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined
  /**
    * When termination settings are disabled, outbound calls can not be made.
    */
  var Disabled: js.UndefOr[Boolean] = js.undefined
}

object Termination {
  @scala.inline
  def apply(
    CallingRegions: CallingRegionList = null,
    CidrAllowedList: StringList = null,
    CpsLimit: js.UndefOr[CpsLimit] = js.undefined,
    DefaultPhoneNumber: E164PhoneNumber = null,
    Disabled: js.UndefOr[Boolean] = js.undefined
  ): Termination = {
    val __obj = js.Dynamic.literal()
    if (CallingRegions != null) __obj.updateDynamic("CallingRegions")(CallingRegions)
    if (CidrAllowedList != null) __obj.updateDynamic("CidrAllowedList")(CidrAllowedList)
    if (!js.isUndefined(CpsLimit)) __obj.updateDynamic("CpsLimit")(CpsLimit)
    if (DefaultPhoneNumber != null) __obj.updateDynamic("DefaultPhoneNumber")(DefaultPhoneNumber)
    if (!js.isUndefined(Disabled)) __obj.updateDynamic("Disabled")(Disabled)
    __obj.asInstanceOf[Termination]
  }
}

