package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUsersResponse extends js.Object {
  /**
    * Required. The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: js.UndefOr[__string] = js.undefined
  /**
    * Required. The maximum number of ActiveMQ users that can be returned per page (20 by default). This value must be an integer from 5 to 100.
    */
  var MaxResults: js.UndefOr[__integerMin5Max100] = js.undefined
  /**
    * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
  /**
    * Required. The list of all ActiveMQ usernames for the specified broker.
    */
  var Users: js.UndefOr[__listOfUserSummary] = js.undefined
}

object ListUsersResponse {
  @scala.inline
  def apply(
    BrokerId: __string = null,
    MaxResults: Int | Double = null,
    NextToken: __string = null,
    Users: __listOfUserSummary = null
  ): ListUsersResponse = {
    val __obj = js.Dynamic.literal()
    if (BrokerId != null) __obj.updateDynamic("BrokerId")(BrokerId)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Users != null) __obj.updateDynamic("Users")(Users)
    __obj.asInstanceOf[ListUsersResponse]
  }
}

