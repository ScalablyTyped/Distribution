package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * used to specify how the DDE server application converts its data into numbers.
  * @see com.sun.star.sheet.XDDELinks
  * @since OOo 3.0
  */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
*/
trait DDELinkMode extends js.Object

object DDELinkMode {
  /** numbers are converted into the default format. */
  @scala.inline
  def DEFAULT: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /** numbers are converted into the English default format. */
  @scala.inline
  def ENGLISH: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /** numbers are not converted, but treated as text. */
  @scala.inline
  def TEXT: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

