package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCustomMetadataRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.native
  /**
    * Custom metadata in the form of name-value pairs.
    */
  var CustomMetadata: CustomMetadataMap = js.native
  /**
    * The ID of the resource.
    */
  var ResourceId: ResourceIdType = js.native
  /**
    * The ID of the version, if the custom metadata is being added to a document version.
    */
  var VersionId: js.UndefOr[DocumentVersionIdType] = js.native
}

object CreateCustomMetadataRequest {
  @scala.inline
  def apply(
    CustomMetadata: CustomMetadataMap,
    ResourceId: ResourceIdType,
    AuthenticationToken: AuthenticationHeaderType = null,
    VersionId: DocumentVersionIdType = null
  ): CreateCustomMetadataRequest = {
    val __obj = js.Dynamic.literal(CustomMetadata = CustomMetadata.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomMetadataRequest]
  }
}

