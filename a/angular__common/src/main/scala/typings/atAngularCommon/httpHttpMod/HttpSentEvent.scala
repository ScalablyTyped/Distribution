package typings.atAngularCommon.httpHttpMod

import typings.atAngularCommon.httpHttpMod.HttpEventType.Sent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpSentEvent
  extends HttpEvent[js.Any] {
  var `type`: Sent
}

object HttpSentEvent {
  @scala.inline
  def apply(`type`: Sent): HttpSentEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpSentEvent]
  }
}

