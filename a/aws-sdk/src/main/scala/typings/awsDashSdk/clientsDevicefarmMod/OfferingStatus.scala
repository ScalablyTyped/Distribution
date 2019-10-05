package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OfferingStatus extends js.Object {
  /**
    * The date on which the offering is effective.
    */
  var effectiveOn: js.UndefOr[DateTime] = js.undefined
  /**
    * Represents the metadata of an offering status.
    */
  var offering: js.UndefOr[Offering] = js.undefined
  /**
    * The number of available devices in the offering.
    */
  var quantity: js.UndefOr[Integer] = js.undefined
  /**
    * The type specified for the offering status.
    */
  var `type`: js.UndefOr[OfferingTransactionType] = js.undefined
}

object OfferingStatus {
  @scala.inline
  def apply(
    effectiveOn: DateTime = null,
    offering: Offering = null,
    quantity: Int | scala.Double = null,
    `type`: OfferingTransactionType = null
  ): OfferingStatus = {
    val __obj = js.Dynamic.literal()
    if (effectiveOn != null) __obj.updateDynamic("effectiveOn")(effectiveOn)
    if (offering != null) __obj.updateDynamic("offering")(offering)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfferingStatus]
  }
}

