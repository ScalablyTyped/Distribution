package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pane extends js.Object {
  var pane: typings.atom.mod.Pane
}

object Pane {
  @scala.inline
  def apply(pane: typings.atom.mod.Pane): Pane = {
    val __obj = js.Dynamic.literal(pane = pane.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pane]
  }
}

