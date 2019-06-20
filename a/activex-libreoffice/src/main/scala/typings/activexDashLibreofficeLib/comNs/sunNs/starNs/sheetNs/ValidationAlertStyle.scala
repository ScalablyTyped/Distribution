package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** used to specify how invalid cell contents are treated. */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
*/
trait ValidationAlertStyle extends js.Object

object ValidationAlertStyle {
  /** information message is shown and the user is asked whether the change will be accepted (defaulted to "Yes"). */
  @scala.inline
  def INFO: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /** macro is executed. */
  @scala.inline
  def MACRO: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /** error message is shown and the change is rejected. */
  @scala.inline
  def STOP: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /** warning message is shown and the user is asked whether the change will be accepted (defaulted to "No"). */
  @scala.inline
  def WARNING: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

