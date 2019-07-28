package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  /**
    * The ID of the comment.
    */
  var CommentId: CommentIdType
  /**
    * The details of the user who made the comment.
    */
  var Contributor: js.UndefOr[User] = js.undefined
  /**
    * The time that the comment was created.
    */
  var CreatedTimestamp: js.UndefOr[TimestampType] = js.undefined
  /**
    * The ID of the parent comment.
    */
  var ParentId: js.UndefOr[CommentIdType] = js.undefined
  /**
    * If the comment is a reply to another user's comment, this field contains the user ID of the user being replied to.
    */
  var RecipientId: js.UndefOr[IdType] = js.undefined
  /**
    * The status of the comment.
    */
  var Status: js.UndefOr[CommentStatusType] = js.undefined
  /**
    * The text of the comment.
    */
  var Text: js.UndefOr[CommentTextType] = js.undefined
  /**
    * The ID of the root comment in the thread.
    */
  var ThreadId: js.UndefOr[CommentIdType] = js.undefined
  /**
    * The visibility of the comment. Options are either PRIVATE, where the comment is visible only to the comment author and document owner and co-owners, or PUBLIC, where the comment is visible to document owners, co-owners, and contributors.
    */
  var Visibility: js.UndefOr[CommentVisibilityType] = js.undefined
}

object Comment {
  @scala.inline
  def apply(
    CommentId: CommentIdType,
    Contributor: User = null,
    CreatedTimestamp: TimestampType = null,
    ParentId: CommentIdType = null,
    RecipientId: IdType = null,
    Status: CommentStatusType = null,
    Text: CommentTextType = null,
    ThreadId: CommentIdType = null,
    Visibility: CommentVisibilityType = null
  ): Comment = {
    val __obj = js.Dynamic.literal(CommentId = CommentId)
    if (Contributor != null) __obj.updateDynamic("Contributor")(Contributor)
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp)
    if (ParentId != null) __obj.updateDynamic("ParentId")(ParentId)
    if (RecipientId != null) __obj.updateDynamic("RecipientId")(RecipientId)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Text != null) __obj.updateDynamic("Text")(Text)
    if (ThreadId != null) __obj.updateDynamic("ThreadId")(ThreadId)
    if (Visibility != null) __obj.updateDynamic("Visibility")(Visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
}

