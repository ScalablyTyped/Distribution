package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The HatchStyle defines the style of the lines in a hatch. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
*/
trait HatchStyle extends js.Object

object HatchStyle {
  /** the hatch has a horizontal and a vertical line */
  @scala.inline
  def DOUBLE: `1` = this.cast(1)
  /** the hatch consists of a single horizontal line */
  @scala.inline
  def SINGLE: `0` = this.cast(0)
  /** the hatch has a horizontal, a vertical and a diagonal line */
  @scala.inline
  def TRIPLE: `2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

