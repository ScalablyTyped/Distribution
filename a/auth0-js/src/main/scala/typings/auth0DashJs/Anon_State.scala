package typings.auth0DashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_State extends js.Object {
  var state: js.UndefOr[String] = js.undefined
}

object Anon_State {
  @scala.inline
  def apply(state: String = null): Anon_State = {
    val __obj = js.Dynamic.literal()
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Anon_State]
  }
}

