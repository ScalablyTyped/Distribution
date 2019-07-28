package typings.activexDashLibreoffice.comNs.sunNs.starNs.linguistic2Ns

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Conversion direction to be used with {@link XConversionDictionary} when looking for conversions.
  * @since OOo 1.1.2
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
*/
trait ConversionDirection extends js.Object

object ConversionDirection {
  /** the text to be looked for should match the left part of a dictionary entry. */
  @scala.inline
  def FROM_LEFT: `0` = this.cast(0)
  /** the text to be looked for should match the right part of a dictionary entry. */
  @scala.inline
  def FROM_RIGHT: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

