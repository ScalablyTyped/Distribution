package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Database
trait DatabaseUser extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var extra: js.UndefOr[js.Object] = js.undefined
  var passwd: js.UndefOr[String] = js.undefined
  var username: String
}

object DatabaseUser {
  @scala.inline
  def apply(
    username: String,
    active: js.UndefOr[Boolean] = js.undefined,
    extra: js.Object = null,
    passwd: String = null
  ): DatabaseUser = {
    val __obj = js.Dynamic.literal(username = username)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (passwd != null) __obj.updateDynamic("passwd")(passwd)
    __obj.asInstanceOf[DatabaseUser]
  }
}

