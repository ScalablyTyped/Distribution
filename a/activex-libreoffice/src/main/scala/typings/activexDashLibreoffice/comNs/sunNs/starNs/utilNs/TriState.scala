package typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This enumeration represents a tristate value.
  *
  * This enumeration defines three values, `TRUE` , `FALSE` and a don't know value.
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
*/
trait TriState extends js.Object

object TriState {
  /** The value is indeterminate. */
  @scala.inline
  def INDETERMINATE: `2` = this.cast(2)
  /** The value is equivalent to `FALSE` . */
  @scala.inline
  def NO: `0` = this.cast(0)
  /** The value is equivalent to `TRUE` . */
  @scala.inline
  def YES: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

