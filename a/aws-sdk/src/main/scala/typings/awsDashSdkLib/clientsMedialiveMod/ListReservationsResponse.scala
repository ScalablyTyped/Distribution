package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReservationsResponse extends js.Object {
  /**
    * Token to retrieve the next page of results
    */
  var NextToken: js.UndefOr[__string] = js.undefined
  /**
    * List of reservations
    */
  var Reservations: js.UndefOr[__listOfReservation] = js.undefined
}

object ListReservationsResponse {
  @scala.inline
  def apply(NextToken: __string = null, Reservations: __listOfReservation = null): ListReservationsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Reservations != null) __obj.updateDynamic("Reservations")(Reservations)
    __obj.asInstanceOf[ListReservationsResponse]
  }
}

