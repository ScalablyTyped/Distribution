package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOfferingsResponse extends js.Object {
  /**
    * Token to retrieve the next page of results
    */
  var NextToken: js.UndefOr[__string] = js.undefined
  /**
    * List of offerings
    */
  var Offerings: js.UndefOr[__listOfOffering] = js.undefined
}

object ListOfferingsResponse {
  @scala.inline
  def apply(NextToken: __string = null, Offerings: __listOfOffering = null): ListOfferingsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Offerings != null) __obj.updateDynamic("Offerings")(Offerings)
    __obj.asInstanceOf[ListOfferingsResponse]
  }
}

