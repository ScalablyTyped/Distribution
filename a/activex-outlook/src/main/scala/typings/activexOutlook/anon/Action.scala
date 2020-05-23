package typings.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  val Action: js.Any
  var Cancel: Boolean
  val Response: js.Any
}

object Action {
  @scala.inline
  def apply(Action: js.Any, Cancel: Boolean, Response: js.Any): Action = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Cancel = Cancel.asInstanceOf[js.Any], Response = Response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

