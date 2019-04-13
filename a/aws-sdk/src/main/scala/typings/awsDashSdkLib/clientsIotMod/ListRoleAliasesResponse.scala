package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRoleAliasesResponse extends js.Object {
  /**
    * A marker used to get the next set of results.
    */
  var nextMarker: js.UndefOr[Marker] = js.undefined
  /**
    * The role aliases.
    */
  var roleAliases: js.UndefOr[RoleAliases] = js.undefined
}

object ListRoleAliasesResponse {
  @scala.inline
  def apply(nextMarker: Marker = null, roleAliases: RoleAliases = null): ListRoleAliasesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextMarker != null) __obj.updateDynamic("nextMarker")(nextMarker)
    if (roleAliases != null) __obj.updateDynamic("roleAliases")(roleAliases)
    __obj.asInstanceOf[ListRoleAliasesResponse]
  }
}

