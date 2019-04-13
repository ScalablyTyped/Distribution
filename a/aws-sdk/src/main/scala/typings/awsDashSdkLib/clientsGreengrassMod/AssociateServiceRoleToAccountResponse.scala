package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateServiceRoleToAccountResponse extends js.Object {
  /**
    * The time when the service role was associated with the account.
    */
  var AssociatedAt: js.UndefOr[__string] = js.undefined
}

object AssociateServiceRoleToAccountResponse {
  @scala.inline
  def apply(AssociatedAt: __string = null): AssociateServiceRoleToAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (AssociatedAt != null) __obj.updateDynamic("AssociatedAt")(AssociatedAt)
    __obj.asInstanceOf[AssociateServiceRoleToAccountResponse]
  }
}

