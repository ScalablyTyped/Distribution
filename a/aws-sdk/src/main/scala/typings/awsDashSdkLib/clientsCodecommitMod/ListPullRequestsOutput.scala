package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPullRequestsOutput extends js.Object {
  /**
    * An enumeration token that when provided in a request, returns the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The system-generated IDs of the pull requests.
    */
  var pullRequestIds: PullRequestIdList
}

object ListPullRequestsOutput {
  @scala.inline
  def apply(pullRequestIds: PullRequestIdList, nextToken: NextToken = null): ListPullRequestsOutput = {
    val __obj = js.Dynamic.literal(pullRequestIds = pullRequestIds)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListPullRequestsOutput]
  }
}

