package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentMetadata extends js.Object {
  /**
    * The ID of the comment.
    */
  var CommentId: js.UndefOr[CommentIdType] = js.undefined
  /**
    * The status of the comment.
    */
  var CommentStatus: js.UndefOr[CommentStatusType] = js.undefined
  /**
    * The user who made the comment.
    */
  var Contributor: js.UndefOr[User] = js.undefined
  /**
    * The timestamp that the comment was created.
    */
  var CreatedTimestamp: js.UndefOr[TimestampType] = js.undefined
  /**
    * The ID of the user being replied to.
    */
  var RecipientId: js.UndefOr[IdType] = js.undefined
}

object CommentMetadata {
  @scala.inline
  def apply(
    CommentId: CommentIdType = null,
    CommentStatus: CommentStatusType = null,
    Contributor: User = null,
    CreatedTimestamp: TimestampType = null,
    RecipientId: IdType = null
  ): CommentMetadata = {
    val __obj = js.Dynamic.literal()
    if (CommentId != null) __obj.updateDynamic("CommentId")(CommentId)
    if (CommentStatus != null) __obj.updateDynamic("CommentStatus")(CommentStatus.asInstanceOf[js.Any])
    if (Contributor != null) __obj.updateDynamic("Contributor")(Contributor)
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp)
    if (RecipientId != null) __obj.updateDynamic("RecipientId")(RecipientId)
    __obj.asInstanceOf[CommentMetadata]
  }
}

