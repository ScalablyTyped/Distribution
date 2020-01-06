package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOfferingsResult extends js.Object {
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * A value that represents the list offering results.
    */
  var offerings: js.UndefOr[Offerings] = js.native
}

object ListOfferingsResult {
  @scala.inline
  def apply(nextToken: PaginationToken = null, offerings: Offerings = null): ListOfferingsResult = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (offerings != null) __obj.updateDynamic("offerings")(offerings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOfferingsResult]
  }
}

