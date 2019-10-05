package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Activity extends js.Object {
  /**
    * Metadata of the commenting activity. This is an optional field and is filled for commenting activities.
    */
  var CommentMetadata: js.UndefOr[typings.awsDashSdk.clientsWorkdocsMod.CommentMetadata] = js.undefined
  /**
    * The user who performed the action.
    */
  var Initiator: js.UndefOr[UserMetadata] = js.undefined
  /**
    * Indicates whether an activity is indirect or direct. An indirect activity results from a direct activity performed on a parent resource. For example, sharing a parent folder (the direct activity) shares all of the subfolders and documents within the parent folder (the indirect activity).
    */
  var IsIndirectActivity: js.UndefOr[BooleanType] = js.undefined
  /**
    * The ID of the organization.
    */
  var OrganizationId: js.UndefOr[IdType] = js.undefined
  /**
    * The original parent of the resource. This is an optional field and is filled for move activities.
    */
  var OriginalParent: js.UndefOr[ResourceMetadata] = js.undefined
  /**
    * The list of users or groups impacted by this action. This is an optional field and is filled for the following sharing activities: DOCUMENT_SHARED, DOCUMENT_SHARED, DOCUMENT_UNSHARED, FOLDER_SHARED, FOLDER_UNSHARED.
    */
  var Participants: js.UndefOr[typings.awsDashSdk.clientsWorkdocsMod.Participants] = js.undefined
  /**
    * The metadata of the resource involved in the user action.
    */
  var ResourceMetadata: js.UndefOr[typings.awsDashSdk.clientsWorkdocsMod.ResourceMetadata] = js.undefined
  /**
    * The timestamp when the action was performed.
    */
  var TimeStamp: js.UndefOr[TimestampType] = js.undefined
  /**
    * The activity type.
    */
  var Type: js.UndefOr[ActivityType] = js.undefined
}

object Activity {
  @scala.inline
  def apply(
    CommentMetadata: CommentMetadata = null,
    Initiator: UserMetadata = null,
    IsIndirectActivity: js.UndefOr[Boolean] = js.undefined,
    OrganizationId: IdType = null,
    OriginalParent: ResourceMetadata = null,
    Participants: Participants = null,
    ResourceMetadata: ResourceMetadata = null,
    TimeStamp: TimestampType = null,
    Type: ActivityType = null
  ): Activity = {
    val __obj = js.Dynamic.literal()
    if (CommentMetadata != null) __obj.updateDynamic("CommentMetadata")(CommentMetadata)
    if (Initiator != null) __obj.updateDynamic("Initiator")(Initiator)
    if (!js.isUndefined(IsIndirectActivity)) __obj.updateDynamic("IsIndirectActivity")(IsIndirectActivity)
    if (OrganizationId != null) __obj.updateDynamic("OrganizationId")(OrganizationId)
    if (OriginalParent != null) __obj.updateDynamic("OriginalParent")(OriginalParent)
    if (Participants != null) __obj.updateDynamic("Participants")(Participants)
    if (ResourceMetadata != null) __obj.updateDynamic("ResourceMetadata")(ResourceMetadata)
    if (TimeStamp != null) __obj.updateDynamic("TimeStamp")(TimeStamp)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activity]
  }
}

