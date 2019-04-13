package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveResourcePermissionRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  /**
    * The principal ID of the resource.
    */
  var PrincipalId: IdType
  /**
    * The principal type of the resource.
    */
  var PrincipalType: js.UndefOr[PrincipalType] = js.undefined
  /**
    * The ID of the resource.
    */
  var ResourceId: ResourceIdType
}

object RemoveResourcePermissionRequest {
  @scala.inline
  def apply(
    PrincipalId: IdType,
    ResourceId: ResourceIdType,
    AuthenticationToken: AuthenticationHeaderType = null,
    PrincipalType: PrincipalType = null
  ): RemoveResourcePermissionRequest = {
    val __obj = js.Dynamic.literal(PrincipalId = PrincipalId, ResourceId = ResourceId)
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken)
    if (PrincipalType != null) __obj.updateDynamic("PrincipalType")(PrincipalType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveResourcePermissionRequest]
  }
}

