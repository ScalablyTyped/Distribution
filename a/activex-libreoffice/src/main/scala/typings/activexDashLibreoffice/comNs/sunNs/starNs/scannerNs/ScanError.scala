package typings.activexDashLibreoffice.comNs.sunNs.starNs.scannerNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** enum ScanError describes error codes of scanner component */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
*/
trait ScanError extends js.Object

object ScanError {
  /** InvalidContext: a device was requested that does not exist */
  @scala.inline
  def InvalidContext: `5` = this.cast(5)
  /** ScanCanceled: the scan was canceled by the user */
  @scala.inline
  def ScanCanceled: `4` = this.cast(4)
  /** ScanErrorNone: no error occurred */
  @scala.inline
  def ScanErrorNone: `0` = this.cast(0)
  /** ScanFailed: an error occurred during scanning */
  @scala.inline
  def ScanFailed: `2` = this.cast(2)
  /** ScanInProgress: a scan is already in progress on this device that has to end before a new one can be started */
  @scala.inline
  def ScanInProgress: `3` = this.cast(3)
  /** ScannerNotAvailable: the requested device could not be opened */
  @scala.inline
  def ScannerNotAvailable: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

