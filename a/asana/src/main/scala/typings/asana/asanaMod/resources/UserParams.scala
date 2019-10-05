package typings.asana.asanaMod.resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserParams extends js.Object {
  var user: String | Double
}

object UserParams {
  @scala.inline
  def apply(user: String | Double): UserParams = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserParams]
  }
}

