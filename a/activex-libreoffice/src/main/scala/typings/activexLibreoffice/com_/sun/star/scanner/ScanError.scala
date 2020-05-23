package typings.activexLibreoffice.com_.sun.star.scanner

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import typings.activexLibreoffice.activexLibreofficeNumbers.`4`
import typings.activexLibreoffice.activexLibreofficeNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** enum ScanError describes error codes of scanner component */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`5`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
*/
trait ScanError extends js.Object

object ScanError {
  /** InvalidContext: a device was requested that does not exist */
  @scala.inline
  def InvalidContext: `5` = 5.asInstanceOf[`5`]
  /** ScanCanceled: the scan was canceled by the user */
  @scala.inline
  def ScanCanceled: `4` = 4.asInstanceOf[`4`]
  /** ScanErrorNone: no error occurred */
  @scala.inline
  def ScanErrorNone: `0` = 0.asInstanceOf[`0`]
  /** ScanFailed: an error occurred during scanning */
  @scala.inline
  def ScanFailed: `2` = 2.asInstanceOf[`2`]
  /** ScanInProgress: a scan is already in progress on this device that has to end before a new one can be started */
  @scala.inline
  def ScanInProgress: `3` = 3.asInstanceOf[`3`]
  /** ScannerNotAvailable: the requested device could not be opened */
  @scala.inline
  def ScannerNotAvailable: `1` = 1.asInstanceOf[`1`]
}

