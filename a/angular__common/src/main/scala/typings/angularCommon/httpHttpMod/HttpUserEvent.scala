package typings.angularCommon.httpHttpMod

import typings.angularCommon.httpHttpMod.HttpEventType.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpUserEvent[T] extends HttpEvent[T] {
  var `type`: User
}

object HttpUserEvent {
  @scala.inline
  def apply[T](`type`: User): HttpUserEvent[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpUserEvent[T]]
  }
}

