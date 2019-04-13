package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLabelsRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  /**
    * List of labels to add to the resource.
    */
  var Labels: SharedLabels
  /**
    * The ID of the resource.
    */
  var ResourceId: ResourceIdType
}

object CreateLabelsRequest {
  @scala.inline
  def apply(
    Labels: SharedLabels,
    ResourceId: ResourceIdType,
    AuthenticationToken: AuthenticationHeaderType = null
  ): CreateLabelsRequest = {
    val __obj = js.Dynamic.literal(Labels = Labels, ResourceId = ResourceId)
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken)
    __obj.asInstanceOf[CreateLabelsRequest]
  }
}

