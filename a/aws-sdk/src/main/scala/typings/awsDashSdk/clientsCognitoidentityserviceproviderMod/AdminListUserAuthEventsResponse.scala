package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminListUserAuthEventsResponse extends js.Object {
  /**
    * The response object. It includes the EventID, EventType, CreationDate, EventRisk, and EventResponse.
    */
  var AuthEvents: js.UndefOr[AuthEventsType] = js.undefined
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.undefined
}

object AdminListUserAuthEventsResponse {
  @scala.inline
  def apply(AuthEvents: AuthEventsType = null, NextToken: PaginationKey = null): AdminListUserAuthEventsResponse = {
    val __obj = js.Dynamic.literal()
    if (AuthEvents != null) __obj.updateDynamic("AuthEvents")(AuthEvents)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[AdminListUserAuthEventsResponse]
  }
}

