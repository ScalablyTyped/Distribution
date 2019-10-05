package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReservedNodeExchangeOfferingsInputMessage extends js.Object {
  /**
    * A value that indicates the starting point for the next set of ReservedNodeOfferings.
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * An integer setting the maximum number of ReservedNodeOfferings to retrieve.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * A string representing the node identifier for the DC1 Reserved Node to be exchanged.
    */
  var ReservedNodeId: String
}

object GetReservedNodeExchangeOfferingsInputMessage {
  @scala.inline
  def apply(ReservedNodeId: String, Marker: String = null, MaxRecords: Int | scala.Double = null): GetReservedNodeExchangeOfferingsInputMessage = {
    val __obj = js.Dynamic.literal(ReservedNodeId = ReservedNodeId)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReservedNodeExchangeOfferingsInputMessage]
  }
}

