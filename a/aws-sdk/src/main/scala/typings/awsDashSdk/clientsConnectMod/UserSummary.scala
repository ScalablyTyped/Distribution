package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserSummary extends js.Object {
  /**
    * The ARN for the user account.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  /**
    * The identifier for the user account.
    */
  var Id: js.UndefOr[UserId] = js.undefined
  /**
    * The Amazon Connect user name for the user account.
    */
  var Username: js.UndefOr[AgentUsername] = js.undefined
}

object UserSummary {
  @scala.inline
  def apply(Arn: ARN = null, Id: UserId = null, Username: AgentUsername = null): UserSummary = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Username != null) __obj.updateDynamic("Username")(Username)
    __obj.asInstanceOf[UserSummary]
  }
}

