package typings.awsDashSdk.clientsSesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSuppressedDestinationsRequest extends js.Object {
  /**
    * Used to filter the list of suppressed email destinations so that it only includes addresses that were added to the list before a specific date. The date that you specify should be in Unix time format.
    */
  var EndDate: js.UndefOr[Timestamp] = js.native
  /**
    * A token returned from a previous call to ListSuppressedDestinations to indicate the position in the list of suppressed email addresses.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSesv2Mod.NextToken] = js.native
  /**
    * The number of results to show in a single call to ListSuppressedDestinations. If the number of results is larger than the number you specified in this parameter, then the response includes a NextToken element, which you can use to obtain additional results.
    */
  var PageSize: js.UndefOr[MaxItems] = js.native
  /**
    * The factors that caused the email address to be added to .
    */
  var Reasons: js.UndefOr[SuppressionListReasons] = js.native
  /**
    * Used to filter the list of suppressed email destinations so that it only includes addresses that were added to the list after a specific date. The date that you specify should be in Unix time format.
    */
  var StartDate: js.UndefOr[Timestamp] = js.native
}

object ListSuppressedDestinationsRequest {
  @scala.inline
  def apply(
    EndDate: Timestamp = null,
    NextToken: NextToken = null,
    PageSize: Int | Double = null,
    Reasons: SuppressionListReasons = null,
    StartDate: Timestamp = null
  ): ListSuppressedDestinationsRequest = {
    val __obj = js.Dynamic.literal()
    if (EndDate != null) __obj.updateDynamic("EndDate")(EndDate.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize.asInstanceOf[js.Any])
    if (Reasons != null) __obj.updateDynamic("Reasons")(Reasons.asInstanceOf[js.Any])
    if (StartDate != null) __obj.updateDynamic("StartDate")(StartDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSuppressedDestinationsRequest]
  }
}

