package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLoginId extends js.Object {
  var LoginId: js.UndefOr[String] = js.native
}

object AnonLoginId {
  @scala.inline
  def apply(LoginId: String = null): AnonLoginId = {
    val __obj = js.Dynamic.literal()
    if (LoginId != null) __obj.updateDynamic("LoginId")(LoginId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLoginId]
  }
}

