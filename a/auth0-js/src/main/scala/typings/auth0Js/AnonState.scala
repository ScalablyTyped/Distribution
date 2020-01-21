package typings.auth0Js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonState extends js.Object {
  var state: js.UndefOr[String] = js.undefined
}

object AnonState {
  @scala.inline
  def apply(state: String = null): AnonState = {
    val __obj = js.Dynamic.literal()
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonState]
  }
}

