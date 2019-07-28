package typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the settings of a chart object in a table or spreadsheet.
  * @see com.sun.star.table.TableChart
  */
trait XTableChart extends XInterface {
  /** returns, whether the cells of the topmost row of the source data are interpreted as column headers. */
  var HasColumnHeaders: Boolean
  /** returns, whether the cells of the leftmost column of the source data are interpreted as row headers. */
  var HasRowHeaders: Boolean
  /** returns the cell ranges that contain the data for the chart. */
  var Ranges: SafeArray[CellRangeAddress]
  /** returns, whether the cells of the topmost row of the source data are interpreted as column headers. */
  def getHasColumnHeaders(): Boolean
  /** returns, whether the cells of the leftmost column of the source data are interpreted as row headers. */
  def getHasRowHeaders(): Boolean
  /** returns the cell ranges that contain the data for the chart. */
  def getRanges(): SafeArray[CellRangeAddress]
  /** specifies whether the cells of the topmost row of the source data are interpreted as column headers. */
  def setHasColumnHeaders(bHasColumnHeaders: Boolean): Unit
  /** specifies whether the cells of the leftmost column of the source data are interpreted as row headers. */
  def setHasRowHeaders(bHasRowHeaders: Boolean): Unit
  /** sets the cell ranges that contain the data for the chart. */
  def setRanges(aRanges: SeqEquiv[CellRangeAddress]): Unit
}

object XTableChart {
  @scala.inline
  def apply(
    HasColumnHeaders: Boolean,
    HasRowHeaders: Boolean,
    Ranges: SafeArray[CellRangeAddress],
    acquire: () => Unit,
    getHasColumnHeaders: () => Boolean,
    getHasRowHeaders: () => Boolean,
    getRanges: () => SafeArray[CellRangeAddress],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setHasColumnHeaders: Boolean => Unit,
    setHasRowHeaders: Boolean => Unit,
    setRanges: SeqEquiv[CellRangeAddress] => Unit
  ): XTableChart = {
    val __obj = js.Dynamic.literal(HasColumnHeaders = HasColumnHeaders, HasRowHeaders = HasRowHeaders, Ranges = Ranges, acquire = js.Any.fromFunction0(acquire), getHasColumnHeaders = js.Any.fromFunction0(getHasColumnHeaders), getHasRowHeaders = js.Any.fromFunction0(getHasRowHeaders), getRanges = js.Any.fromFunction0(getRanges), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setHasColumnHeaders = js.Any.fromFunction1(setHasColumnHeaders), setHasRowHeaders = js.Any.fromFunction1(setHasRowHeaders), setRanges = js.Any.fromFunction1(setRanges))
  
    __obj.asInstanceOf[XTableChart]
  }
}

