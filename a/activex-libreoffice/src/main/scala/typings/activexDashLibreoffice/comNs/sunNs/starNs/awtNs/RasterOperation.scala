package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** These values are used to specify the binary pixel-operation applied when pixels are written to the device. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
*/
trait RasterOperation extends js.Object

object RasterOperation {
  /** All bits which are affected by this operation are set to 1. */
  @scala.inline
  def ALLBITS: `3` = this.cast(3)
  /** All bits which are affected by this operation are inverted. */
  @scala.inline
  def INVERT: `4` = this.cast(4)
  /** sets all pixel as written in the output operation. */
  @scala.inline
  def OVERPAINT: `0` = this.cast(0)
  /** uses the pixel written as one and the current pixel as the other operator of an exclusive or-operation. */
  @scala.inline
  def XOR: `1` = this.cast(1)
  /** All bits which are affected by this operation are set to 0. */
  @scala.inline
  def ZEROBITS: `2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

