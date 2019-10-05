package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteCustomMetadataRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  /**
    * Flag to indicate removal of all custom metadata properties from the specified resource.
    */
  var DeleteAll: js.UndefOr[BooleanType] = js.undefined
  /**
    * List of properties to remove.
    */
  var Keys: js.UndefOr[CustomMetadataKeyList] = js.undefined
  /**
    * The ID of the resource, either a document or folder.
    */
  var ResourceId: ResourceIdType
  /**
    * The ID of the version, if the custom metadata is being deleted from a document version.
    */
  var VersionId: js.UndefOr[DocumentVersionIdType] = js.undefined
}

object DeleteCustomMetadataRequest {
  @scala.inline
  def apply(
    ResourceId: ResourceIdType,
    AuthenticationToken: AuthenticationHeaderType = null,
    DeleteAll: js.UndefOr[Boolean] = js.undefined,
    Keys: CustomMetadataKeyList = null,
    VersionId: DocumentVersionIdType = null
  ): DeleteCustomMetadataRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId)
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken)
    if (!js.isUndefined(DeleteAll)) __obj.updateDynamic("DeleteAll")(DeleteAll)
    if (Keys != null) __obj.updateDynamic("Keys")(Keys)
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[DeleteCustomMetadataRequest]
  }
}

