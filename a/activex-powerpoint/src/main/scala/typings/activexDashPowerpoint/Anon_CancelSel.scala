package typings.activexDashPowerpoint

import typings.activexDashPowerpoint.PowerPoint.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelSel extends js.Object {
  var Cancel: Boolean
  val Sel: Selection
}

object Anon_CancelSel {
  @scala.inline
  def apply(Cancel: Boolean, Sel: Selection): Anon_CancelSel = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, Sel = Sel)
  
    __obj.asInstanceOf[Anon_CancelSel]
  }
}

