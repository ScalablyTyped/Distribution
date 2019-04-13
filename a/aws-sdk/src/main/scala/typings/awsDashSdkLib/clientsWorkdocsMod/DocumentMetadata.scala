package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentMetadata extends js.Object {
  /**
    * The time when the document was created.
    */
  var CreatedTimestamp: js.UndefOr[TimestampType] = js.undefined
  /**
    * The ID of the creator.
    */
  var CreatorId: js.UndefOr[IdType] = js.undefined
  /**
    * The ID of the document.
    */
  var Id: js.UndefOr[ResourceIdType] = js.undefined
  /**
    * List of labels on the document.
    */
  var Labels: js.UndefOr[SharedLabels] = js.undefined
  /**
    * The latest version of the document.
    */
  var LatestVersionMetadata: js.UndefOr[DocumentVersionMetadata] = js.undefined
  /**
    * The time when the document was updated.
    */
  var ModifiedTimestamp: js.UndefOr[TimestampType] = js.undefined
  /**
    * The ID of the parent folder.
    */
  var ParentFolderId: js.UndefOr[ResourceIdType] = js.undefined
  /**
    * The resource state.
    */
  var ResourceState: js.UndefOr[ResourceStateType] = js.undefined
}

object DocumentMetadata {
  @scala.inline
  def apply(
    CreatedTimestamp: TimestampType = null,
    CreatorId: IdType = null,
    Id: ResourceIdType = null,
    Labels: SharedLabels = null,
    LatestVersionMetadata: DocumentVersionMetadata = null,
    ModifiedTimestamp: TimestampType = null,
    ParentFolderId: ResourceIdType = null,
    ResourceState: ResourceStateType = null
  ): DocumentMetadata = {
    val __obj = js.Dynamic.literal()
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp)
    if (CreatorId != null) __obj.updateDynamic("CreatorId")(CreatorId)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Labels != null) __obj.updateDynamic("Labels")(Labels)
    if (LatestVersionMetadata != null) __obj.updateDynamic("LatestVersionMetadata")(LatestVersionMetadata)
    if (ModifiedTimestamp != null) __obj.updateDynamic("ModifiedTimestamp")(ModifiedTimestamp)
    if (ParentFolderId != null) __obj.updateDynamic("ParentFolderId")(ParentFolderId)
    if (ResourceState != null) __obj.updateDynamic("ResourceState")(ResourceState.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentMetadata]
  }
}

