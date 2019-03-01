package typings
package activexDashOutlookLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelResponse extends js.Object {
  var Cancel: scala.Boolean
  val Response: js.Any
}

object Anon_CancelResponse {
  @scala.inline
  def apply(Cancel: scala.Boolean, Response: js.Any): Anon_CancelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Cancel")(Cancel)
    __obj.updateDynamic("Response")(Response)
    __obj.asInstanceOf[Anon_CancelResponse]
  }
}

