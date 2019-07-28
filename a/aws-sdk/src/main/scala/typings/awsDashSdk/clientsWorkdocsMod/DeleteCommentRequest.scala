package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteCommentRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  /**
    * The ID of the comment.
    */
  var CommentId: CommentIdType
  /**
    * The ID of the document.
    */
  var DocumentId: ResourceIdType
  /**
    * The ID of the document version.
    */
  var VersionId: DocumentVersionIdType
}

object DeleteCommentRequest {
  @scala.inline
  def apply(
    CommentId: CommentIdType,
    DocumentId: ResourceIdType,
    VersionId: DocumentVersionIdType,
    AuthenticationToken: AuthenticationHeaderType = null
  ): DeleteCommentRequest = {
    val __obj = js.Dynamic.literal(CommentId = CommentId, DocumentId = DocumentId, VersionId = VersionId)
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken)
    __obj.asInstanceOf[DeleteCommentRequest]
  }
}

