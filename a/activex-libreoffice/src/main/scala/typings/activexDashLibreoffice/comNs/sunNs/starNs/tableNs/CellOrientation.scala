package typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the orientation of a cell. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
*/
trait CellOrientation extends js.Object

object CellOrientation {
  /** contents are printed from bottom to top. */
  @scala.inline
  def BOTTOMTOP: `2` = this.cast(2)
  /** contents are printed from top to bottom with individual characters in normal (horizontal) orientation. */
  @scala.inline
  def STACKED: `3` = this.cast(3)
  /**
    * default alignment is used (left for numbers, right for text).
    *
    * contents are printed from left to right.
    *
    * default alignment is used.
    */
  @scala.inline
  def STANDARD: `0` = this.cast(0)
  /** contents are printed from top to bottom. */
  @scala.inline
  def TOPBOTTOM: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

