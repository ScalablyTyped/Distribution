package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddResourcePermissionsRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  /**
    * The notification options.
    */
  var NotificationOptions: js.UndefOr[NotificationOptions] = js.undefined
  /**
    * The users, groups, or organization being granted permission.
    */
  var Principals: SharePrincipalList
  /**
    * The ID of the resource.
    */
  var ResourceId: ResourceIdType
}

object AddResourcePermissionsRequest {
  @scala.inline
  def apply(
    Principals: SharePrincipalList,
    ResourceId: ResourceIdType,
    AuthenticationToken: AuthenticationHeaderType = null,
    NotificationOptions: NotificationOptions = null
  ): AddResourcePermissionsRequest = {
    val __obj = js.Dynamic.literal(Principals = Principals, ResourceId = ResourceId)
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken)
    if (NotificationOptions != null) __obj.updateDynamic("NotificationOptions")(NotificationOptions)
    __obj.asInstanceOf[AddResourcePermissionsRequest]
  }
}

