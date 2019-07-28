package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBotsRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  /**
    * The maximum number of results to return in a single call. Default is 10.
    */
  var MaxResults: js.UndefOr[ResultMax] = js.undefined
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListBotsRequest {
  @scala.inline
  def apply(
    AccountId: NonEmptyString,
    MaxResults: js.UndefOr[ResultMax] = js.undefined,
    NextToken: String = null
  ): ListBotsRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListBotsRequest]
  }
}

