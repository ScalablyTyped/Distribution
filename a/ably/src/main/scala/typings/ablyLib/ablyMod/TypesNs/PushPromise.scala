package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushPromise extends js.Object {
  var admin: PushAdminPromise
}

object PushPromise {
  @scala.inline
  def apply(admin: PushAdminPromise): PushPromise = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("admin")(admin)
    __obj.asInstanceOf[PushPromise]
  }
}

