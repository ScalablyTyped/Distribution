package typings
package alksDashNodeLib.alksDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth extends js.Object {
  var password: js.UndefOr[java.lang.String] = js.undefined
  var token: js.UndefOr[java.lang.String] = js.undefined
}

object Auth {
  @scala.inline
  def apply(password: java.lang.String = null, token: java.lang.String = null): Auth = {
    val __obj = js.Dynamic.literal()
    if (password != null) __obj.updateDynamic("password")(password)
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[Auth]
  }
}

