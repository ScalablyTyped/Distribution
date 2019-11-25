package typings.activexDashOutlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action extends js.Object {
  val Action: js.Any
  var Cancel: Boolean
  val Response: js.Any
}

object Anon_Action {
  @scala.inline
  def apply(Action: js.Any, Cancel: Boolean, Response: js.Any): Anon_Action = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Cancel = Cancel.asInstanceOf[js.Any], Response = Response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Action]
  }
}

