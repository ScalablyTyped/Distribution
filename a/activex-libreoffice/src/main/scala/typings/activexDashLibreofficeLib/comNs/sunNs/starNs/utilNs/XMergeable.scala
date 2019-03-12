package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a range of cells that can be merged. */
trait XMergeable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns `TRUE` if the area specified by this object is merged, or `FALSE` otherwise. */
  val IsMerged: scala.Boolean
  /** @returns `TRUE` if the area specified by this object is merged, or `FALSE` otherwise. */
  def getIsMerged(): scala.Boolean
  /** merges/unmerges the area specified by this object. */
  def merge(bMerge: scala.Boolean): scala.Unit
}

object XMergeable {
  @scala.inline
  def apply(
    IsMerged: scala.Boolean,
    acquire: () => scala.Unit,
    getIsMerged: () => scala.Boolean,
    merge: scala.Boolean => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XMergeable = {
    val __obj = js.Dynamic.literal(IsMerged = IsMerged, acquire = js.Any.fromFunction0(acquire), getIsMerged = js.Any.fromFunction0(getIsMerged), merge = js.Any.fromFunction1(merge), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XMergeable]
  }
}

