package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrantAccessRequest extends js.Object {
  /**
    * The instance's AWS OpsWorks Stacks ID.
    */
  var InstanceId: String
  /**
    * The length of time (in minutes) that the grant is valid. When the grant expires at the end of this period, the user will no longer be able to use the credentials to log in. If the user is logged in at the time, he or she automatically will be logged out.
    */
  var ValidForInMinutes: js.UndefOr[ValidForInMinutes] = js.undefined
}

object GrantAccessRequest {
  @scala.inline
  def apply(InstanceId: String, ValidForInMinutes: js.UndefOr[ValidForInMinutes] = js.undefined): GrantAccessRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId)
    if (!js.isUndefined(ValidForInMinutes)) __obj.updateDynamic("ValidForInMinutes")(ValidForInMinutes)
    __obj.asInstanceOf[GrantAccessRequest]
  }
}

