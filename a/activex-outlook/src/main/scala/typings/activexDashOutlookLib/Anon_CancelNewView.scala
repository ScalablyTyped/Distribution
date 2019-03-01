package typings
package activexDashOutlookLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelNewView extends js.Object {
  var Cancel: scala.Boolean
  val NewView: js.Any
}

object Anon_CancelNewView {
  @scala.inline
  def apply(Cancel: scala.Boolean, NewView: js.Any): Anon_CancelNewView = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Cancel")(Cancel)
    __obj.updateDynamic("NewView")(NewView)
    __obj.asInstanceOf[Anon_CancelNewView]
  }
}

