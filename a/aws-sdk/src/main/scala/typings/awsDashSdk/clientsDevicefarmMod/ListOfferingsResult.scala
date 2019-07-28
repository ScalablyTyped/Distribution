package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOfferingsResult extends js.Object {
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * A value representing the list offering results.
    */
  var offerings: js.UndefOr[Offerings] = js.undefined
}

object ListOfferingsResult {
  @scala.inline
  def apply(nextToken: PaginationToken = null, offerings: Offerings = null): ListOfferingsResult = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (offerings != null) __obj.updateDynamic("offerings")(offerings)
    __obj.asInstanceOf[ListOfferingsResult]
  }
}

