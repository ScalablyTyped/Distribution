package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReservedNodeOfferingsMessage extends js.Object {
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * A list of ReservedNodeOffering objects.
    */
  var ReservedNodeOfferings: js.UndefOr[ReservedNodeOfferingList] = js.undefined
}

object ReservedNodeOfferingsMessage {
  @scala.inline
  def apply(Marker: String = null, ReservedNodeOfferings: ReservedNodeOfferingList = null): ReservedNodeOfferingsMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (ReservedNodeOfferings != null) __obj.updateDynamic("ReservedNodeOfferings")(ReservedNodeOfferings)
    __obj.asInstanceOf[ReservedNodeOfferingsMessage]
  }
}

