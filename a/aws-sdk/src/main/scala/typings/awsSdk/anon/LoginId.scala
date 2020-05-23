package typings.awsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoginId extends js.Object {
  var LoginId: js.UndefOr[String] = js.native
}

object LoginId {
  @scala.inline
  def apply(LoginId: String = null): LoginId = {
    val __obj = js.Dynamic.literal()
    if (LoginId != null) __obj.updateDynamic("LoginId")(LoginId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginId]
  }
}

