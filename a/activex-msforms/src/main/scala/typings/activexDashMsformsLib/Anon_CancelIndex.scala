package typings
package activexDashMsformsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelIndex extends js.Object {
  val Cancel: activexDashMsformsLib.MSFormsNs.ReturnBoolean
  val Index: scala.Double
}

object Anon_CancelIndex {
  @scala.inline
  def apply(Cancel: activexDashMsformsLib.MSFormsNs.ReturnBoolean, Index: scala.Double): Anon_CancelIndex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Cancel")(Cancel)
    __obj.updateDynamic("Index")(Index)
    __obj.asInstanceOf[Anon_CancelIndex]
  }
}

