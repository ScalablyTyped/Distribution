package typings.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewView extends js.Object {
  var Cancel: Boolean
  val NewView: js.Any
}

object NewView {
  @scala.inline
  def apply(Cancel: Boolean, NewView: js.Any): NewView = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], NewView = NewView.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewView]
  }
}

