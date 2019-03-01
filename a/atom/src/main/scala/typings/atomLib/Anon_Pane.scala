package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pane extends js.Object {
  var pane: atomLib.atomMod.Pane
}

object Anon_Pane {
  @scala.inline
  def apply(pane: atomLib.atomMod.Pane): Anon_Pane = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pane")(pane)
    __obj.asInstanceOf[Anon_Pane]
  }
}

