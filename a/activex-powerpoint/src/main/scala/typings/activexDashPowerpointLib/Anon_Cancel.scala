package typings
package activexDashPowerpointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancel extends js.Object {
  var Cancel: scala.Boolean
  val Pres: activexDashPowerpointLib.PowerPointNs.Presentation
}

object Anon_Cancel {
  @scala.inline
  def apply(Cancel: scala.Boolean, Pres: activexDashPowerpointLib.PowerPointNs.Presentation): Anon_Cancel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Cancel")(Cancel)
    __obj.updateDynamic("Pres")(Pres)
    __obj.asInstanceOf[Anon_Cancel]
  }
}

