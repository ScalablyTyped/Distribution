package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushCallbacks extends js.Object {
  var admin: PushAdminCallbacks
}

object PushCallbacks {
  @scala.inline
  def apply(admin: PushAdminCallbacks): PushCallbacks = {
    val __obj = js.Dynamic.literal(admin = admin)
  
    __obj.asInstanceOf[PushCallbacks]
  }
}

