package typings.awsSdk

import typings.awsSdk.iamMod.existingUserNameType
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/iam.GetUserRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait GetUserRequestwaiterWaite extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The name of the user to get information about. This parameter is optional. If it is not included, it defaults to the user making the request. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: js.UndefOr[existingUserNameType] = js.native
}

object GetUserRequestwaiterWaite {
  @scala.inline
  def apply($waiter: WaiterConfiguration = null, UserName: existingUserNameType = null): GetUserRequestwaiterWaite = {
    val __obj = js.Dynamic.literal()
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    if (UserName != null) __obj.updateDynamic("UserName")(UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserRequestwaiterWaite]
  }
}

