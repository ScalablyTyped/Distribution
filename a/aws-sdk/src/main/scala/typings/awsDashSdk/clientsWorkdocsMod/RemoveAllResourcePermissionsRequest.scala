package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveAllResourcePermissionsRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  /**
    * The ID of the resource.
    */
  var ResourceId: ResourceIdType
}

object RemoveAllResourcePermissionsRequest {
  @scala.inline
  def apply(ResourceId: ResourceIdType, AuthenticationToken: AuthenticationHeaderType = null): RemoveAllResourcePermissionsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId)
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken)
    __obj.asInstanceOf[RemoveAllResourcePermissionsRequest]
  }
}

