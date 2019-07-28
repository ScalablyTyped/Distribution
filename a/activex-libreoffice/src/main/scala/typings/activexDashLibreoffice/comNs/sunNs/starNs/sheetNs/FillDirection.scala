package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** used to specify the direction of filling cells, for example, with a series. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
*/
trait FillDirection extends js.Object

object FillDirection {
  /** specifies that rows are filled from top to bottom. */
  @scala.inline
  def TO_BOTTOM: `0` = this.cast(0)
  /** specifies that columns are filled from right to left. */
  @scala.inline
  def TO_LEFT: `3` = this.cast(3)
  /** specifies that columns are filled from left to right. */
  @scala.inline
  def TO_RIGHT: `1` = this.cast(1)
  /** specifies that rows are filled from bottom to top. */
  @scala.inline
  def TO_TOP: `2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

