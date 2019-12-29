package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserBlocks extends js.Object {
  var blocked_for: js.Array[BlockedForEntry]
}

object UserBlocks {
  @scala.inline
  def apply(blocked_for: js.Array[BlockedForEntry]): UserBlocks = {
    val __obj = js.Dynamic.literal(blocked_for = blocked_for.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserBlocks]
  }
}

