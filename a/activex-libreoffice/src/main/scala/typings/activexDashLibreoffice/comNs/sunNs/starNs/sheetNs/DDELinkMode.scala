package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * used to specify how the DDE server application converts its data into numbers.
  * @see com.sun.star.sheet.XDDELinks
  * @since OOo 3.0
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
*/
trait DDELinkMode extends js.Object

object DDELinkMode {
  /** numbers are converted into the default format. */
  @scala.inline
  def DEFAULT: `0` = this.cast(0)
  /** numbers are converted into the English default format. */
  @scala.inline
  def ENGLISH: `1` = this.cast(1)
  /** numbers are not converted, but treated as text. */
  @scala.inline
  def TEXT: `2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

