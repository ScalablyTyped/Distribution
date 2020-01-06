package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTopicsResponse extends js.Object {
  /**
    * Token to pass along to the next ListTopics request. This element is returned if there are additional topics to retrieve.
    */
  var NextToken: js.UndefOr[nextToken] = js.native
  /**
    * A list of topic ARNs.
    */
  var Topics: js.UndefOr[TopicsList] = js.native
}

object ListTopicsResponse {
  @scala.inline
  def apply(NextToken: nextToken = null, Topics: TopicsList = null): ListTopicsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Topics != null) __obj.updateDynamic("Topics")(Topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTopicsResponse]
  }
}

