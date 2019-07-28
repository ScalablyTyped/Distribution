package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateServiceRoleFromAccountResponse extends js.Object {
  /**
    * The time when the service role was disassociated from the account.
    */
  var DisassociatedAt: js.UndefOr[__string] = js.undefined
}

object DisassociateServiceRoleFromAccountResponse {
  @scala.inline
  def apply(DisassociatedAt: __string = null): DisassociateServiceRoleFromAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (DisassociatedAt != null) __obj.updateDynamic("DisassociatedAt")(DisassociatedAt)
    __obj.asInstanceOf[DisassociateServiceRoleFromAccountResponse]
  }
}

