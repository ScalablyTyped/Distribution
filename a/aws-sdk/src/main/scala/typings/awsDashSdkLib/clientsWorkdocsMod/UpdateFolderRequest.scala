package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFolderRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  /**
    * The ID of the folder.
    */
  var FolderId: ResourceIdType
  /**
    * The name of the folder.
    */
  var Name: js.UndefOr[ResourceNameType] = js.undefined
  /**
    * The ID of the parent folder.
    */
  var ParentFolderId: js.UndefOr[ResourceIdType] = js.undefined
  /**
    * The resource state of the folder. Only ACTIVE and RECYCLED are accepted values from the API.
    */
  var ResourceState: js.UndefOr[ResourceStateType] = js.undefined
}

object UpdateFolderRequest {
  @scala.inline
  def apply(
    FolderId: ResourceIdType,
    AuthenticationToken: AuthenticationHeaderType = null,
    Name: ResourceNameType = null,
    ParentFolderId: ResourceIdType = null,
    ResourceState: ResourceStateType = null
  ): UpdateFolderRequest = {
    val __obj = js.Dynamic.literal(FolderId = FolderId)
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (ParentFolderId != null) __obj.updateDynamic("ParentFolderId")(ParentFolderId)
    if (ResourceState != null) __obj.updateDynamic("ResourceState")(ResourceState.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFolderRequest]
  }
}

