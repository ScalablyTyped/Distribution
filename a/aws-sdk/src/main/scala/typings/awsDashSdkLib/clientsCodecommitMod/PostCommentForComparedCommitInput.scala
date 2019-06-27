package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostCommentForComparedCommitInput extends js.Object {
  /**
    * To establish the directionality of the comparison, the full commit ID of the 'after' commit.
    */
  var afterCommitId: CommitId
  /**
    * To establish the directionality of the comparison, the full commit ID of the 'before' commit.  This is required for commenting on any commit unless that commit is the initial commit. 
    */
  var beforeCommitId: js.UndefOr[CommitId] = js.undefined
  /**
    * A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request will return information about the initial request that used that token.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  /**
    * The content of the comment you want to make.
    */
  var content: Content
  /**
    * The location of the comparison where you want to comment.
    */
  var location: js.UndefOr[Location] = js.undefined
  /**
    * The name of the repository where you want to post a comment on the comparison between commits.
    */
  var repositoryName: RepositoryName
}

object PostCommentForComparedCommitInput {
  @scala.inline
  def apply(
    afterCommitId: CommitId,
    content: Content,
    repositoryName: RepositoryName,
    beforeCommitId: CommitId = null,
    clientRequestToken: ClientRequestToken = null,
    location: Location = null
  ): PostCommentForComparedCommitInput = {
    val __obj = js.Dynamic.literal(afterCommitId = afterCommitId, content = content, repositoryName = repositoryName)
    if (beforeCommitId != null) __obj.updateDynamic("beforeCommitId")(beforeCommitId)
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[PostCommentForComparedCommitInput]
  }
}

