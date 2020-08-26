package typings.analyticsNode.anon

import typings.analyticsNode.mod.AnalyticsNode.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserId extends Identity {
  var userId: String | Double = js.native
}

object UserId {
  @scala.inline
  def apply(userId: String | Double): UserId = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserId]
  }
  @scala.inline
  implicit class UserIdOps[Self <: UserId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUserId(value: String | Double): Self = this.set("userId", value.asInstanceOf[js.Any])
  }
  
}

