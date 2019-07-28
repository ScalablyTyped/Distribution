package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** extends a text range by method to modify its position. */
trait XMarkingAccess extends js.Object {
  def invalidateMarkings(nType: Double): Unit
}

object XMarkingAccess {
  @scala.inline
  def apply(invalidateMarkings: Double => Unit): XMarkingAccess = {
    val __obj = js.Dynamic.literal(invalidateMarkings = js.Any.fromFunction1(invalidateMarkings))
  
    __obj.asInstanceOf[XMarkingAccess]
  }
}

