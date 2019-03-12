package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the settings of a chart object in a table or spreadsheet.
  * @see com.sun.star.table.TableChart
  */
trait XTableChart
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns, whether the cells of the topmost row of the source data are interpreted as column headers. */
  var HasColumnHeaders: scala.Boolean
  /** returns, whether the cells of the leftmost column of the source data are interpreted as row headers. */
  var HasRowHeaders: scala.Boolean
  /** returns the cell ranges that contain the data for the chart. */
  var Ranges: stdLib.SafeArray[CellRangeAddress]
  /** returns, whether the cells of the topmost row of the source data are interpreted as column headers. */
  def getHasColumnHeaders(): scala.Boolean
  /** returns, whether the cells of the leftmost column of the source data are interpreted as row headers. */
  def getHasRowHeaders(): scala.Boolean
  /** returns the cell ranges that contain the data for the chart. */
  def getRanges(): stdLib.SafeArray[CellRangeAddress]
  /** specifies whether the cells of the topmost row of the source data are interpreted as column headers. */
  def setHasColumnHeaders(bHasColumnHeaders: scala.Boolean): scala.Unit
  /** specifies whether the cells of the leftmost column of the source data are interpreted as row headers. */
  def setHasRowHeaders(bHasRowHeaders: scala.Boolean): scala.Unit
  /** sets the cell ranges that contain the data for the chart. */
  def setRanges(aRanges: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[CellRangeAddress]): scala.Unit
}

object XTableChart {
  @scala.inline
  def apply(
    HasColumnHeaders: scala.Boolean,
    HasRowHeaders: scala.Boolean,
    Ranges: stdLib.SafeArray[CellRangeAddress],
    acquire: () => scala.Unit,
    getHasColumnHeaders: () => scala.Boolean,
    getHasRowHeaders: () => scala.Boolean,
    getRanges: () => stdLib.SafeArray[CellRangeAddress],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setHasColumnHeaders: scala.Boolean => scala.Unit,
    setHasRowHeaders: scala.Boolean => scala.Unit,
    setRanges: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[CellRangeAddress] => scala.Unit
  ): XTableChart = {
    val __obj = js.Dynamic.literal(HasColumnHeaders = HasColumnHeaders, HasRowHeaders = HasRowHeaders, Ranges = Ranges, acquire = js.Any.fromFunction0(acquire), getHasColumnHeaders = js.Any.fromFunction0(getHasColumnHeaders), getHasRowHeaders = js.Any.fromFunction0(getHasRowHeaders), getRanges = js.Any.fromFunction0(getRanges), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setHasColumnHeaders = js.Any.fromFunction1(setHasColumnHeaders), setHasRowHeaders = js.Any.fromFunction1(setHasRowHeaders), setRanges = js.Any.fromFunction1(setRanges))
  
    __obj.asInstanceOf[XTableChart]
  }
}

