package typings.alksNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlksAccount extends js.Object {
  var account: String
  var iam: js.UndefOr[Boolean] = js.undefined
  var role: String
}

object AlksAccount {
  @scala.inline
  def apply(account: String, role: String, iam: js.UndefOr[Boolean] = js.undefined): AlksAccount = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    if (!js.isUndefined(iam)) __obj.updateDynamic("iam")(iam.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlksAccount]
  }
}

