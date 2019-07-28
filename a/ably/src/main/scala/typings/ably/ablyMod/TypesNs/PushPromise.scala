package typings.ably.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushPromise extends js.Object {
  var admin: PushAdminPromise
}

object PushPromise {
  @scala.inline
  def apply(admin: PushAdminPromise): PushPromise = {
    val __obj = js.Dynamic.literal(admin = admin)
  
    __obj.asInstanceOf[PushPromise]
  }
}

