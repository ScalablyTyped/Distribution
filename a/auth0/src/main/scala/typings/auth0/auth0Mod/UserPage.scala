package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPage[A, U] extends Page {
  var users: js.Array[User[A, U]]
}

object UserPage {
  @scala.inline
  def apply[A, U](length: Double, limit: Double, start: Double, total: Double, users: js.Array[User[A, U]]): UserPage[A, U] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserPage[A, U]]
  }
}

