package typings.activexPowerpoint

import typings.activexPowerpoint.PowerPoint.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSel extends js.Object {
  val Sel: Selection
}

object AnonSel {
  @scala.inline
  def apply(Sel: Selection): AnonSel = {
    val __obj = js.Dynamic.literal(Sel = Sel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSel]
  }
}

