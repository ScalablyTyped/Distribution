package typings.ably.ablyMod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushCallbacks extends js.Object {
  var admin: PushAdminCallbacks
}

object PushCallbacks {
  @scala.inline
  def apply(admin: PushAdminCallbacks): PushCallbacks = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PushCallbacks]
  }
}

