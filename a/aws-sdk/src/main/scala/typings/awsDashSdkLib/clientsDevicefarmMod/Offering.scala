package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Offering extends js.Object {
  /**
    * A string describing the offering.
    */
  var description: js.UndefOr[Message] = js.undefined
  /**
    * The ID that corresponds to a device offering.
    */
  var id: js.UndefOr[OfferingIdentifier] = js.undefined
  /**
    * The platform of the device (e.g., ANDROID or IOS).
    */
  var platform: js.UndefOr[DevicePlatform] = js.undefined
  /**
    * Specifies whether there are recurring charges for the offering.
    */
  var recurringCharges: js.UndefOr[RecurringCharges] = js.undefined
  /**
    * The type of offering (e.g., "RECURRING") for a device.
    */
  var `type`: js.UndefOr[OfferingType] = js.undefined
}

object Offering {
  @scala.inline
  def apply(
    description: Message = null,
    id: OfferingIdentifier = null,
    platform: DevicePlatform = null,
    recurringCharges: RecurringCharges = null,
    `type`: OfferingType = null
  ): Offering = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (recurringCharges != null) __obj.updateDynamic("recurringCharges")(recurringCharges)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offering]
  }
}

