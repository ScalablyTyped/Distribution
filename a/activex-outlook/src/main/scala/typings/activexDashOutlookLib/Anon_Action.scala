package typings
package activexDashOutlookLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action extends js.Object {
  val Action: js.Any
  var Cancel: scala.Boolean
  val Response: js.Any
}

object Anon_Action {
  @scala.inline
  def apply(Action: js.Any, Cancel: scala.Boolean, Response: js.Any): Anon_Action = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Action")(Action)
    __obj.updateDynamic("Cancel")(Cancel)
    __obj.updateDynamic("Response")(Response)
    __obj.asInstanceOf[Anon_Action]
  }
}

