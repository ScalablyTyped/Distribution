package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCommentsForComparedCommitInput extends js.Object {
  /**
    * To establish the directionality of the comparison, the full commit ID of the after commit.
    */
  var afterCommitId: CommitId = js.native
  /**
    * To establish the directionality of the comparison, the full commit ID of the before commit.
    */
  var beforeCommitId: js.UndefOr[CommitId] = js.native
  /**
    * A non-zero, non-negative integer used to limit the number of returned results. The default is 100 comments, but you can configure up to 500.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * An enumeration token that when provided in a request, returns the next batch of the results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The name of the repository where you want to compare commits.
    */
  var repositoryName: RepositoryName = js.native
}

object GetCommentsForComparedCommitInput {
  @scala.inline
  def apply(
    afterCommitId: CommitId,
    repositoryName: RepositoryName,
    beforeCommitId: CommitId = null,
    maxResults: Int | Double = null,
    nextToken: NextToken = null
  ): GetCommentsForComparedCommitInput = {
    val __obj = js.Dynamic.literal(afterCommitId = afterCommitId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    if (beforeCommitId != null) __obj.updateDynamic("beforeCommitId")(beforeCommitId.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCommentsForComparedCommitInput]
  }
}

