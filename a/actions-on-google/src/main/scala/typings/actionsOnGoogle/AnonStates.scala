package typings.actionsOnGoogle

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStates extends js.Object {
  var states: ApiClientObjectMap[_]
}

object AnonStates {
  @scala.inline
  def apply(states: ApiClientObjectMap[_]): AnonStates = {
    val __obj = js.Dynamic.literal(states = states.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStates]
  }
}

