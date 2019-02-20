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

