package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to let the user to select a cell range.
  * @see com.sun.star.sheet.SpreadsheetView
  */
trait XRangeSelection
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** aborts the range selection. */
  def abortRangeSelection(): scala.Unit
  /** adds a listener that is notified when the selected range is changed. */
  def addRangeSelectionChangeListener(aListener: XRangeSelectionChangeListener): scala.Unit
  /** adds a listener that is notified when range selection is completed or aborted. */
  def addRangeSelectionListener(aListener: XRangeSelectionListener): scala.Unit
  /** removes the specified listener. */
  def removeRangeSelectionChangeListener(aListener: XRangeSelectionChangeListener): scala.Unit
  /** removes the specified listener. */
  def removeRangeSelectionListener(aListener: XRangeSelectionListener): scala.Unit
  /**
    * starts the range selection.
    * @param aArguments the {@link RangeSelectionArguments} that specify how the range selection is done.
    */
  def startRangeSelection(
    aArguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
}

