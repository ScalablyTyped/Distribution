package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FolderMetadata extends js.Object {
  /**
    * The time when the folder was created.
    */
  var CreatedTimestamp: js.UndefOr[TimestampType] = js.undefined
  /**
    * The ID of the creator.
    */
  var CreatorId: js.UndefOr[IdType] = js.undefined
  /**
    * The ID of the folder.
    */
  var Id: js.UndefOr[ResourceIdType] = js.undefined
  /**
    * List of labels on the folder.
    */
  var Labels: js.UndefOr[SharedLabels] = js.undefined
  /**
    * The size of the latest version of the folder metadata.
    */
  var LatestVersionSize: js.UndefOr[SizeType] = js.undefined
  /**
    * The time when the folder was updated.
    */
  var ModifiedTimestamp: js.UndefOr[TimestampType] = js.undefined
  /**
    * The name of the folder.
    */
  var Name: js.UndefOr[ResourceNameType] = js.undefined
  /**
    * The ID of the parent folder.
    */
  var ParentFolderId: js.UndefOr[ResourceIdType] = js.undefined
  /**
    * The resource state of the folder.
    */
  var ResourceState: js.UndefOr[ResourceStateType] = js.undefined
  /**
    * The unique identifier created from the subfolders and documents of the folder.
    */
  var Signature: js.UndefOr[HashType] = js.undefined
  /**
    * The size of the folder metadata.
    */
  var Size: js.UndefOr[SizeType] = js.undefined
}

object FolderMetadata {
  @scala.inline
  def apply(
    CreatedTimestamp: TimestampType = null,
    CreatorId: IdType = null,
    Id: ResourceIdType = null,
    Labels: SharedLabels = null,
    LatestVersionSize: js.UndefOr[SizeType] = js.undefined,
    ModifiedTimestamp: TimestampType = null,
    Name: ResourceNameType = null,
    ParentFolderId: ResourceIdType = null,
    ResourceState: ResourceStateType = null,
    Signature: HashType = null,
    Size: js.UndefOr[SizeType] = js.undefined
  ): FolderMetadata = {
    val __obj = js.Dynamic.literal()
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp)
    if (CreatorId != null) __obj.updateDynamic("CreatorId")(CreatorId)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Labels != null) __obj.updateDynamic("Labels")(Labels)
    if (!js.isUndefined(LatestVersionSize)) __obj.updateDynamic("LatestVersionSize")(LatestVersionSize)
    if (ModifiedTimestamp != null) __obj.updateDynamic("ModifiedTimestamp")(ModifiedTimestamp)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (ParentFolderId != null) __obj.updateDynamic("ParentFolderId")(ParentFolderId)
    if (ResourceState != null) __obj.updateDynamic("ResourceState")(ResourceState.asInstanceOf[js.Any])
    if (Signature != null) __obj.updateDynamic("Signature")(Signature)
    if (!js.isUndefined(Size)) __obj.updateDynamic("Size")(Size)
    __obj.asInstanceOf[FolderMetadata]
  }
}

