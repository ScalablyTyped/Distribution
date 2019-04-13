package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFolderRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  /**
    * The name of the new folder.
    */
  var Name: js.UndefOr[ResourceNameType] = js.undefined
  /**
    * The ID of the parent folder.
    */
  var ParentFolderId: ResourceIdType
}

object CreateFolderRequest {
  @scala.inline
  def apply(
    ParentFolderId: ResourceIdType,
    AuthenticationToken: AuthenticationHeaderType = null,
    Name: ResourceNameType = null
  ): CreateFolderRequest = {
    val __obj = js.Dynamic.literal(ParentFolderId = ParentFolderId)
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[CreateFolderRequest]
  }
}

