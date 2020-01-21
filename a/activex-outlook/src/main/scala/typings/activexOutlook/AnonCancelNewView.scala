package typings.activexOutlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelNewView extends js.Object {
  var Cancel: Boolean
  val NewView: js.Any
}

object AnonCancelNewView {
  @scala.inline
  def apply(Cancel: Boolean, NewView: js.Any): AnonCancelNewView = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], NewView = NewView.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCancelNewView]
  }
}

