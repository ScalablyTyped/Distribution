package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCommentRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  /**
    * The ID of the document.
    */
  var DocumentId: ResourceIdType
  /**
    * Set this parameter to TRUE to send an email out to the document collaborators after the comment is created.
    */
  var NotifyCollaborators: js.UndefOr[BooleanType] = js.undefined
  /**
    * The ID of the parent comment.
    */
  var ParentId: js.UndefOr[CommentIdType] = js.undefined
  /**
    * The text of the comment.
    */
  var Text: CommentTextType
  /**
    * The ID of the root comment in the thread.
    */
  var ThreadId: js.UndefOr[CommentIdType] = js.undefined
  /**
    * The ID of the document version.
    */
  var VersionId: DocumentVersionIdType
  /**
    * The visibility of the comment. Options are either PRIVATE, where the comment is visible only to the comment author and document owner and co-owners, or PUBLIC, where the comment is visible to document owners, co-owners, and contributors.
    */
  var Visibility: js.UndefOr[CommentVisibilityType] = js.undefined
}

object CreateCommentRequest {
  @scala.inline
  def apply(
    DocumentId: ResourceIdType,
    Text: CommentTextType,
    VersionId: DocumentVersionIdType,
    AuthenticationToken: AuthenticationHeaderType = null,
    NotifyCollaborators: js.UndefOr[BooleanType] = js.undefined,
    ParentId: CommentIdType = null,
    ThreadId: CommentIdType = null,
    Visibility: CommentVisibilityType = null
  ): CreateCommentRequest = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId, Text = Text, VersionId = VersionId)
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken)
    if (!js.isUndefined(NotifyCollaborators)) __obj.updateDynamic("NotifyCollaborators")(NotifyCollaborators)
    if (ParentId != null) __obj.updateDynamic("ParentId")(ParentId)
    if (ThreadId != null) __obj.updateDynamic("ThreadId")(ThreadId)
    if (Visibility != null) __obj.updateDynamic("Visibility")(Visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCommentRequest]
  }
}

