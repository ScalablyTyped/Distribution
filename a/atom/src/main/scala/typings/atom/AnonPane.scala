package typings.atom

import typings.atom.mod.Pane
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPane extends js.Object {
  var pane: Pane
}

object AnonPane {
  @scala.inline
  def apply(pane: Pane): AnonPane = {
    val __obj = js.Dynamic.literal(pane = pane.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPane]
  }
}

