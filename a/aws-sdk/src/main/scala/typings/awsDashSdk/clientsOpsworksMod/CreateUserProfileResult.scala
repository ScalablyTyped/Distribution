package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUserProfileResult extends js.Object {
  /**
    * The user's IAM ARN.
    */
  var IamUserArn: js.UndefOr[String] = js.undefined
}

object CreateUserProfileResult {
  @scala.inline
  def apply(IamUserArn: String = null): CreateUserProfileResult = {
    val __obj = js.Dynamic.literal()
    if (IamUserArn != null) __obj.updateDynamic("IamUserArn")(IamUserArn)
    __obj.asInstanceOf[CreateUserProfileResult]
  }
}

