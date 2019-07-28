package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Principal extends js.Object {
  /**
    * The ID of the resource.
    */
  var Id: js.UndefOr[IdType] = js.undefined
  /**
    * The permission information for the resource.
    */
  var Roles: js.UndefOr[PermissionInfoList] = js.undefined
  /**
    * The type of resource.
    */
  var Type: js.UndefOr[PrincipalType] = js.undefined
}

object Principal {
  @scala.inline
  def apply(Id: IdType = null, Roles: PermissionInfoList = null, Type: PrincipalType = null): Principal = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Roles != null) __obj.updateDynamic("Roles")(Roles)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Principal]
  }
}

