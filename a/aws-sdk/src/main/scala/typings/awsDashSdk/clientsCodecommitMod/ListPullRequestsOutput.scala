package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPullRequestsOutput extends js.Object {
  /**
    * An enumeration token that allows the operation to batch the next results of the operation.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The system-generated IDs of the pull requests.
    */
  var pullRequestIds: PullRequestIdList = js.native
}

object ListPullRequestsOutput {
  @scala.inline
  def apply(pullRequestIds: PullRequestIdList, nextToken: NextToken = null): ListPullRequestsOutput = {
    val __obj = js.Dynamic.literal(pullRequestIds = pullRequestIds.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPullRequestsOutput]
  }
}

