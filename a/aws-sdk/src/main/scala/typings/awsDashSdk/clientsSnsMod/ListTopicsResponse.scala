package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTopicsResponse extends js.Object {
  /**
    * Token to pass along to the next ListTopics request. This element is returned if there are additional topics to retrieve.
    */
  var NextToken: js.UndefOr[nextToken] = js.undefined
  /**
    * A list of topic ARNs.
    */
  var Topics: js.UndefOr[TopicsList] = js.undefined
}

object ListTopicsResponse {
  @scala.inline
  def apply(NextToken: nextToken = null, Topics: TopicsList = null): ListTopicsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Topics != null) __obj.updateDynamic("Topics")(Topics)
    __obj.asInstanceOf[ListTopicsResponse]
  }
}

