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
    acquire: js.Function0[scala.Unit],
    getIsMerged: js.Function0[scala.Boolean],
    merge: js.Function1[scala.Boolean, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XMergeable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("IsMerged")(IsMerged)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getIsMerged")(getIsMerged)
    __obj.updateDynamic("merge")(merge)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XMergeable]
  }
}

