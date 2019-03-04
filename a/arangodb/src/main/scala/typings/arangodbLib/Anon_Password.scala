package typings
package arangodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Password extends js.Object {
  var password: js.UndefOr[java.lang.String] = js.undefined
  var username: java.lang.String
}

object Anon_Password {
  @scala.inline
  def apply(username: java.lang.String, password: java.lang.String = null): Anon_Password = {
    val __obj = js.Dynamic.literal(username = username)
    if (password != null) __obj.updateDynamic("password")(password)
    __obj.asInstanceOf[Anon_Password]
  }
}

