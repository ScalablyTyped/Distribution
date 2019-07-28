package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the person who posted the comment.
    */
  var authorArn: js.UndefOr[Arn] = js.undefined
  /**
    * A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request will return information about the initial request that used that token.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  /**
    * The system-generated comment ID.
    */
  var commentId: js.UndefOr[CommentId] = js.undefined
  /**
    * The content of the comment.
    */
  var content: js.UndefOr[Content] = js.undefined
  /**
    * The date and time the comment was created, in timestamp format.
    */
  var creationDate: js.UndefOr[CreationDate] = js.undefined
  /**
    * A Boolean value indicating whether the comment has been deleted.
    */
  var deleted: js.UndefOr[IsCommentDeleted] = js.undefined
  /**
    * The ID of the comment for which this comment is a reply, if any.
    */
  var inReplyTo: js.UndefOr[CommentId] = js.undefined
  /**
    * The date and time the comment was most recently modified, in timestamp format.
    */
  var lastModifiedDate: js.UndefOr[LastModifiedDate] = js.undefined
}

object Comment {
  @scala.inline
  def apply(
    authorArn: Arn = null,
    clientRequestToken: ClientRequestToken = null,
    commentId: CommentId = null,
    content: Content = null,
    creationDate: CreationDate = null,
    deleted: js.UndefOr[IsCommentDeleted] = js.undefined,
    inReplyTo: CommentId = null,
    lastModifiedDate: LastModifiedDate = null
  ): Comment = {
    val __obj = js.Dynamic.literal()
    if (authorArn != null) __obj.updateDynamic("authorArn")(authorArn)
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken)
    if (commentId != null) __obj.updateDynamic("commentId")(commentId)
    if (content != null) __obj.updateDynamic("content")(content)
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted)
    if (inReplyTo != null) __obj.updateDynamic("inReplyTo")(inReplyTo)
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate)
    __obj.asInstanceOf[Comment]
  }
}

