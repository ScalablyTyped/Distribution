package typings
package alksDashNodeLib.alksDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlksAccount extends js.Object {
  var account: java.lang.String
  var iam: js.UndefOr[scala.Boolean] = js.undefined
  var role: java.lang.String
}

object AlksAccount {
  @scala.inline
  def apply(account: java.lang.String, role: java.lang.String, iam: js.UndefOr[scala.Boolean] = js.undefined): AlksAccount = {
    val __obj = js.Dynamic.literal(account = account, role = role)
    if (!js.isUndefined(iam)) __obj.updateDynamic("iam")(iam)
    __obj.asInstanceOf[AlksAccount]
  }
}

