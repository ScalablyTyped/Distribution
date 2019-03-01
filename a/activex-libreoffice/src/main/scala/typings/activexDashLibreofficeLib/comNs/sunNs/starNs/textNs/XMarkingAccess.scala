package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** extends a text range by method to modify its position. */
trait XMarkingAccess extends js.Object {
  def invalidateMarkings(nType: scala.Double): scala.Unit
}

object XMarkingAccess {
  @scala.inline
  def apply(invalidateMarkings: js.Function1[scala.Double, scala.Unit]): XMarkingAccess = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("invalidateMarkings")(invalidateMarkings)
    __obj.asInstanceOf[XMarkingAccess]
  }
}

