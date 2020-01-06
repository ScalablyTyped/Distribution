package typings.awsDashSdk.clientsAcmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPermissionsResponse extends js.Object {
  /**
    * When the list is truncated, this value is present and should be used for the NextToken parameter in a subsequent pagination request. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAcmpcaMod.NextToken] = js.native
  /**
    * Summary information about each permission assigned by the specified private CA, including the action enabled, the policy provided, and the time of creation.
    */
  var Permissions: js.UndefOr[PermissionList] = js.native
}

object ListPermissionsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Permissions: PermissionList = null): ListPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Permissions != null) __obj.updateDynamic("Permissions")(Permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPermissionsResponse]
  }
}

