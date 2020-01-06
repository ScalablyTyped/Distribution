package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserProfileResult extends js.Object {
  /**
    * The user's IAM ARN.
    */
  var IamUserArn: js.UndefOr[String] = js.native
}

object CreateUserProfileResult {
  @scala.inline
  def apply(IamUserArn: String = null): CreateUserProfileResult = {
    val __obj = js.Dynamic.literal()
    if (IamUserArn != null) __obj.updateDynamic("IamUserArn")(IamUserArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserProfileResult]
  }
}

