package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostCommentReplyInput extends js.Object {
  /**
    * A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request will return information about the initial request that used that token.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  /**
    * The contents of your reply to a comment.
    */
  var content: Content
  /**
    * The system-generated ID of the comment to which you want to reply. To get this ID, use GetCommentsForComparedCommit or GetCommentsForPullRequest.
    */
  var inReplyTo: CommentId
}

object PostCommentReplyInput {
  @scala.inline
  def apply(content: Content, inReplyTo: CommentId, clientRequestToken: ClientRequestToken = null): PostCommentReplyInput = {
    val __obj = js.Dynamic.literal(content = content, inReplyTo = inReplyTo)
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken)
    __obj.asInstanceOf[PostCommentReplyInput]
  }
}

