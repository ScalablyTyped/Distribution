package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the orientation of a cell. */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
*/
trait CellOrientation extends js.Object

object CellOrientation {
  /** contents are printed from bottom to top. */
  @scala.inline
  def BOTTOMTOP: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /** contents are printed from top to bottom with individual characters in normal (horizontal) orientation. */
  @scala.inline
  def STACKED: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /**
    * default alignment is used (left for numbers, right for text).
    *
    * contents are printed from left to right.
    *
    * default alignment is used.
    */
  @scala.inline
  def STANDARD: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /** contents are printed from top to bottom. */
  @scala.inline
  def TOPBOTTOM: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

