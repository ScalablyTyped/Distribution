package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCommentsForComparedCommitOutput extends js.Object {
  /**
    * A list of comment objects on the compared commit.
    */
  var commentsForComparedCommitData: js.UndefOr[CommentsForComparedCommitData] = js.undefined
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object GetCommentsForComparedCommitOutput {
  @scala.inline
  def apply(commentsForComparedCommitData: CommentsForComparedCommitData = null, nextToken: NextToken = null): GetCommentsForComparedCommitOutput = {
    val __obj = js.Dynamic.literal()
    if (commentsForComparedCommitData != null) __obj.updateDynamic("commentsForComparedCommitData")(commentsForComparedCommitData)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[GetCommentsForComparedCommitOutput]
  }
}

