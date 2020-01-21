package typings.activexPowerpoint

import typings.activexPowerpoint.PowerPoint.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelSel extends js.Object {
  var Cancel: Boolean
  val Sel: Selection
}

object AnonCancelSel {
  @scala.inline
  def apply(Cancel: Boolean, Sel: Selection): AnonCancelSel = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Sel = Sel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCancelSel]
  }
}

