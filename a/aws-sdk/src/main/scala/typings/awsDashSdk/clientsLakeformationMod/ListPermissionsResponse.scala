package typings.awsDashSdk.clientsLakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPermissionsResponse extends js.Object {
  /**
    * A continuation token, if this is not the first call to retrieve this list.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  /**
    * A list of principals and their permissions on the resource for the specified principal and resource types.
    */
  var PrincipalResourcePermissions: js.UndefOr[PrincipalResourcePermissionsList] = js.undefined
}

object ListPermissionsResponse {
  @scala.inline
  def apply(NextToken: Token = null, PrincipalResourcePermissions: PrincipalResourcePermissionsList = null): ListPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (PrincipalResourcePermissions != null) __obj.updateDynamic("PrincipalResourcePermissions")(PrincipalResourcePermissions)
    __obj.asInstanceOf[ListPermissionsResponse]
  }
}

