package typings.awsDashSdk.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shipment extends js.Object {
  /**
    * Status information for a shipment.
    */
  var Status: js.UndefOr[String] = js.undefined
  /**
    * The tracking number for this job. Using this tracking number with your region's carrier's website, you can track a Snowball as the carrier transports it. For India, the carrier is Amazon Logistics. For all other regions, UPS is the carrier.
    */
  var TrackingNumber: js.UndefOr[String] = js.undefined
}

object Shipment {
  @scala.inline
  def apply(Status: String = null, TrackingNumber: String = null): Shipment = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (TrackingNumber != null) __obj.updateDynamic("TrackingNumber")(TrackingNumber)
    __obj.asInstanceOf[Shipment]
  }
}

