package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCommentsForPullRequestOutput extends js.Object {
  /**
    * An array of comment objects on the pull request.
    */
  var commentsForPullRequestData: js.UndefOr[CommentsForPullRequestData] = js.undefined
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object GetCommentsForPullRequestOutput {
  @scala.inline
  def apply(commentsForPullRequestData: CommentsForPullRequestData = null, nextToken: NextToken = null): GetCommentsForPullRequestOutput = {
    val __obj = js.Dynamic.literal()
    if (commentsForPullRequestData != null) __obj.updateDynamic("commentsForPullRequestData")(commentsForPullRequestData)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[GetCommentsForPullRequestOutput]
  }
}

