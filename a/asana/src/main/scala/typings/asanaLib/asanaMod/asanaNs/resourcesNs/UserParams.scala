package typings
package asanaLib.asanaMod.asanaNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserParams extends js.Object {
  var user: java.lang.String | scala.Double
}

object UserParams {
  @scala.inline
  def apply(user: java.lang.String | scala.Double): UserParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserParams]
  }
}

