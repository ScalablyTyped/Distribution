package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This enumeration defines the escape direction a connector takes on a glue point. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`6`
*/
trait EscapeDirection extends js.Object

object EscapeDirection {
  @scala.inline
  def DOWN: `4` = this.cast(4)
  /** mirror to the horizontal axis */
  @scala.inline
  def HORIZONTAL: `5` = this.cast(5)
  /**
    * the connection line leaves the connected object to the left,
    *
    * The text is positioned to the left.
    *
    * The left edge of the text is adjusted to the left edge of the shape.
    */
  @scala.inline
  def LEFT: `1` = this.cast(1)
  /**
    * the connection line leaves the connected object to the right,
    *
    * The text is positioned to the right.
    *
    * The right edge of the text is adjusted to the right edge of the shape.
    */
  @scala.inline
  def RIGHT: `2` = this.cast(2)
  @scala.inline
  def SMART: `0` = this.cast(0)
  @scala.inline
  def UP: `3` = this.cast(3)
  /** mirror to the vertical axis */
  @scala.inline
  def VERTICAL: `6` = this.cast(6)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

