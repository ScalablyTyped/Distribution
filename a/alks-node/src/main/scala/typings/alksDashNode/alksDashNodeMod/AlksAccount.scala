package typings.alksDashNode.alksDashNodeMod

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
    val __obj = js.Dynamic.literal(account = account, role = role)
    if (!js.isUndefined(iam)) __obj.updateDynamic("iam")(iam)
    __obj.asInstanceOf[AlksAccount]
  }
}

