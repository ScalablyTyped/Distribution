package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPage extends Page {
  var users: js.Array[User]
}

object UserPage {
  @scala.inline
  def apply(
    length: scala.Double,
    limit: scala.Double,
    start: scala.Double,
    total: scala.Double,
    users: js.Array[User]
  ): UserPage = {
    val __obj = js.Dynamic.literal(length = length, limit = limit, start = start, total = total, users = users)
  
    __obj.asInstanceOf[UserPage]
  }
}

