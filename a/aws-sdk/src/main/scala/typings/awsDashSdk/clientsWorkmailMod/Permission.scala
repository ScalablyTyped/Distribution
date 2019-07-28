package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permission extends js.Object {
  /**
    * The identifier of the user, group, or resource to which the permissions are granted.
    */
  var GranteeId: WorkMailIdentifier
  /**
    * The type of user, group, or resource referred to in GranteeId.
    */
  var GranteeType: MemberType
  /**
    * The permissions granted to the grantee. SEND_AS allows the grantee to send email as the owner of the mailbox (the grantee is not mentioned on these emails). SEND_ON_BEHALF allows the grantee to send email on behalf of the owner of the mailbox (the grantee is not mentioned as the physical sender of these emails). FULL_ACCESS allows the grantee full access to the mailbox, irrespective of other folder-level permissions set on the mailbox.
    */
  var PermissionValues: typings.awsDashSdk.clientsWorkmailMod.PermissionValues
}

object Permission {
  @scala.inline
  def apply(GranteeId: WorkMailIdentifier, GranteeType: MemberType, PermissionValues: PermissionValues): Permission = {
    val __obj = js.Dynamic.literal(GranteeId = GranteeId, GranteeType = GranteeType.asInstanceOf[js.Any], PermissionValues = PermissionValues)
  
    __obj.asInstanceOf[Permission]
  }
}

