package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessKeyDetails extends js.Object {
  /**
    * Access key ID of the user.
    */
  var AccessKeyId: js.UndefOr[__string] = js.undefined
  /**
    * The principal ID of the user.
    */
  var PrincipalId: js.UndefOr[__string] = js.undefined
  /**
    * The name of the user.
    */
  var UserName: js.UndefOr[__string] = js.undefined
  /**
    * The type of the user.
    */
  var UserType: js.UndefOr[__string] = js.undefined
}

object AccessKeyDetails {
  @scala.inline
  def apply(
    AccessKeyId: __string = null,
    PrincipalId: __string = null,
    UserName: __string = null,
    UserType: __string = null
  ): AccessKeyDetails = {
    val __obj = js.Dynamic.literal()
    if (AccessKeyId != null) __obj.updateDynamic("AccessKeyId")(AccessKeyId)
    if (PrincipalId != null) __obj.updateDynamic("PrincipalId")(PrincipalId)
    if (UserName != null) __obj.updateDynamic("UserName")(UserName)
    if (UserType != null) __obj.updateDynamic("UserType")(UserType)
    __obj.asInstanceOf[AccessKeyDetails]
  }
}

