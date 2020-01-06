package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateServiceRoleToAccountResponse extends js.Object {
  /**
    * The time when the service role was associated with the account.
    */
  var AssociatedAt: js.UndefOr[__string] = js.native
}

object AssociateServiceRoleToAccountResponse {
  @scala.inline
  def apply(AssociatedAt: __string = null): AssociateServiceRoleToAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (AssociatedAt != null) __obj.updateDynamic("AssociatedAt")(AssociatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateServiceRoleToAccountResponse]
  }
}

