package typings.awsDashSdk.clientsLakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEffectivePermissionsForPathResponse extends js.Object {
  /**
    * A continuation token, if this is not the first call to retrieve this list.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  /**
    * A list of the permissions for the specified table or database resource located at the path in Amazon S3.
    */
  var Permissions: js.UndefOr[PrincipalResourcePermissionsList] = js.undefined
}

object GetEffectivePermissionsForPathResponse {
  @scala.inline
  def apply(NextToken: Token = null, Permissions: PrincipalResourcePermissionsList = null): GetEffectivePermissionsForPathResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Permissions != null) __obj.updateDynamic("Permissions")(Permissions)
    __obj.asInstanceOf[GetEffectivePermissionsForPathResponse]
  }
}

