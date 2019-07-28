package typings.alksDashNode.alksDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth extends js.Object {
  var password: js.UndefOr[String] = js.undefined
  var token: js.UndefOr[String] = js.undefined
}

object Auth {
  @scala.inline
  def apply(password: String = null, token: String = null): Auth = {
    val __obj = js.Dynamic.literal()
    if (password != null) __obj.updateDynamic("password")(password)
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[Auth]
  }
}

