package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBrokersResponse extends js.Object {
  /**
    * A list of information about all brokers.
    */
  var BrokerSummaries: js.UndefOr[__listOfBrokerSummary] = js.undefined
  /**
    * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListBrokersResponse {
  @scala.inline
  def apply(BrokerSummaries: __listOfBrokerSummary = null, NextToken: __string = null): ListBrokersResponse = {
    val __obj = js.Dynamic.literal()
    if (BrokerSummaries != null) __obj.updateDynamic("BrokerSummaries")(BrokerSummaries)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListBrokersResponse]
  }
}

