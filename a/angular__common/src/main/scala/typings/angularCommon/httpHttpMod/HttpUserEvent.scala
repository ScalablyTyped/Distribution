package typings.angularCommon.httpHttpMod

import typings.angularCommon.httpHttpMod.HttpEventType.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpUserEvent[T] extends HttpEvent[T] {
  var `type`: User = js.native
}

object HttpUserEvent {
  @scala.inline
  def apply[T](`type`: User): HttpUserEvent[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpUserEvent[T]]
  }
  @scala.inline
  implicit class HttpUserEventOps[Self <: HttpUserEvent[_], T] (val x: Self with HttpUserEvent[T]) extends AnyVal {
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
    def setType(value: User): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

