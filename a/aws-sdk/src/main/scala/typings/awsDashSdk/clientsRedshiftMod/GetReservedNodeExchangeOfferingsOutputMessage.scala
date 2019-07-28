package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReservedNodeExchangeOfferingsOutputMessage extends js.Object {
  /**
    * An optional parameter that specifies the starting point for returning a set of response records. When the results of a GetReservedNodeExchangeOfferings request exceed the value specified in MaxRecords, Amazon Redshift returns a value in the marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the marker parameter and retrying the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * Returns an array of ReservedNodeOffering objects.
    */
  var ReservedNodeOfferings: js.UndefOr[ReservedNodeOfferingList] = js.undefined
}

object GetReservedNodeExchangeOfferingsOutputMessage {
  @scala.inline
  def apply(Marker: String = null, ReservedNodeOfferings: ReservedNodeOfferingList = null): GetReservedNodeExchangeOfferingsOutputMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (ReservedNodeOfferings != null) __obj.updateDynamic("ReservedNodeOfferings")(ReservedNodeOfferings)
    __obj.asInstanceOf[GetReservedNodeExchangeOfferingsOutputMessage]
  }
}

