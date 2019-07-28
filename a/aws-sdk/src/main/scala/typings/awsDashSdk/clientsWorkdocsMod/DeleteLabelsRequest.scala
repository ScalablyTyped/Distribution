package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteLabelsRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  /**
    * Flag to request removal of all labels from the specified resource.
    */
  var DeleteAll: js.UndefOr[BooleanType] = js.undefined
  /**
    * List of labels to delete from the resource.
    */
  var Labels: js.UndefOr[SharedLabels] = js.undefined
  /**
    * The ID of the resource.
    */
  var ResourceId: ResourceIdType
}

object DeleteLabelsRequest {
  @scala.inline
  def apply(
    ResourceId: ResourceIdType,
    AuthenticationToken: AuthenticationHeaderType = null,
    DeleteAll: js.UndefOr[BooleanType] = js.undefined,
    Labels: SharedLabels = null
  ): DeleteLabelsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId)
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken)
    if (!js.isUndefined(DeleteAll)) __obj.updateDynamic("DeleteAll")(DeleteAll)
    if (Labels != null) __obj.updateDynamic("Labels")(Labels)
    __obj.asInstanceOf[DeleteLabelsRequest]
  }
}

