package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** used to specify how invalid cell contents are treated. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
*/
trait ValidationAlertStyle extends js.Object

object ValidationAlertStyle {
  /** information message is shown and the user is asked whether the change will be accepted (defaulted to "Yes"). */
  @scala.inline
  def INFO: `2` = this.cast(2)
  /** macro is executed. */
  @scala.inline
  def MACRO: `3` = this.cast(3)
  /** error message is shown and the change is rejected. */
  @scala.inline
  def STOP: `0` = this.cast(0)
  /** warning message is shown and the user is asked whether the change will be accepted (defaulted to "No"). */
  @scala.inline
  def WARNING: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

