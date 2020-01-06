package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Principal extends js.Object {
  /**
    * The ID of the resource.
    */
  var Id: js.UndefOr[IdType] = js.native
  /**
    * The permission information for the resource.
    */
  var Roles: js.UndefOr[PermissionInfoList] = js.native
  /**
    * The type of resource.
    */
  var Type: js.UndefOr[PrincipalType] = js.native
}

object Principal {
  @scala.inline
  def apply(Id: IdType = null, Roles: PermissionInfoList = null, Type: PrincipalType = null): Principal = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Roles != null) __obj.updateDynamic("Roles")(Roles.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Principal]
  }
}

