package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTopicRuleDestinationsResponse extends js.Object {
  /**
    * Information about a topic rule destination.
    */
  var destinationSummaries: js.UndefOr[TopicRuleDestinationSummaries] = js.native
  /**
    * The token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListTopicRuleDestinationsResponse {
  @scala.inline
  def apply(destinationSummaries: TopicRuleDestinationSummaries = null, nextToken: NextToken = null): ListTopicRuleDestinationsResponse = {
    val __obj = js.Dynamic.literal()
    if (destinationSummaries != null) __obj.updateDynamic("destinationSummaries")(destinationSummaries.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTopicRuleDestinationsResponse]
  }
}

