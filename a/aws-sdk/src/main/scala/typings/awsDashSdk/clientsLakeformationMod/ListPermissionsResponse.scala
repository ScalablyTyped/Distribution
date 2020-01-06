package typings.awsDashSdk.clientsLakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPermissionsResponse extends js.Object {
  /**
    * A continuation token, if this is not the first call to retrieve this list.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * A list of principals and their permissions on the resource for the specified principal and resource types.
    */
  var PrincipalResourcePermissions: js.UndefOr[PrincipalResourcePermissionsList] = js.native
}

object ListPermissionsResponse {
  @scala.inline
  def apply(NextToken: Token = null, PrincipalResourcePermissions: PrincipalResourcePermissionsList = null): ListPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PrincipalResourcePermissions != null) __obj.updateDynamic("PrincipalResourcePermissions")(PrincipalResourcePermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPermissionsResponse]
  }
}

