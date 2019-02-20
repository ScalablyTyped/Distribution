package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScanError extends js.Object

/** enum ScanError describes error codes of scanner component */
@JSGlobal("com.sun.star.scanner.ScanError")
@js.native
object ScanError extends js.Object {
  /** InvalidContext: a device was requested that does not exist */
  @js.native
  sealed trait InvalidContext
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scannerNs.ScanError
  
  /** ScanCanceled: the scan was canceled by the user */
  @js.native
  sealed trait ScanCanceled
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scannerNs.ScanError
  
  /** ScanErrorNone: no error occurred */
  @js.native
  sealed trait ScanErrorNone
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scannerNs.ScanError
  
  /** ScanFailed: an error occurred during scanning */
  @js.native
  sealed trait ScanFailed
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scannerNs.ScanError
  
  /** ScanInProgress: a scan is already in progress on this device that has to end before a new one can be started */
  @js.native
  sealed trait ScanInProgress
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scannerNs.ScanError
  
  /** ScannerNotAvailable: the requested device could not be opened */
  @js.native
  sealed trait ScannerNotAvailable
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.scannerNs.ScanError
  
  /* 5 */ val InvalidContext: InvalidContext with scala.Double = js.native
  /* 4 */ val ScanCanceled: ScanCanceled with scala.Double = js.native
  /* 0 */ val ScanErrorNone: ScanErrorNone with scala.Double = js.native
  /* 2 */ val ScanFailed: ScanFailed with scala.Double = js.native
  /* 3 */ val ScanInProgress: ScanInProgress with scala.Double = js.native
  /* 1 */ val ScannerNotAvailable: ScannerNotAvailable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.scannerNs.ScanError with scala.Double
  ] = js.native
}

