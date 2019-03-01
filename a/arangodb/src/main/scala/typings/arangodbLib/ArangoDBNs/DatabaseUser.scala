package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Database
trait DatabaseUser extends js.Object {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var extra: js.UndefOr[js.Object] = js.undefined
  var passwd: js.UndefOr[java.lang.String] = js.undefined
  var username: java.lang.String
}

object DatabaseUser {
  @scala.inline
  def apply(
    username: java.lang.String,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    extra: js.Object = null,
    passwd: java.lang.String = null
  ): DatabaseUser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("username")(username)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (passwd != null) __obj.updateDynamic("passwd")(passwd)
    __obj.asInstanceOf[DatabaseUser]
  }
}

