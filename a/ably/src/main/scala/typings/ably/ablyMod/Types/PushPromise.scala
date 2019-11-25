package typings.ably.ablyMod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushPromise extends js.Object {
  var admin: PushAdminPromise
}

object PushPromise {
  @scala.inline
  def apply(admin: PushAdminPromise): PushPromise = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PushPromise]
  }
}

