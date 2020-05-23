package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReasonString extends js.Object {
  var reason: js.UndefOr[String] = js.undefined
}

object ReasonString {
  @scala.inline
  def apply(reason: String = null): ReasonString = {
    val __obj = js.Dynamic.literal()
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReasonString]
  }
}

