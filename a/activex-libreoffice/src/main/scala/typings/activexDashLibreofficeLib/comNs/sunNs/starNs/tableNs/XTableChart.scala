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
  var Ranges: activexDashInteropLib.SafeArray[CellRangeAddress]
  /** returns, whether the cells of the topmost row of the source data are interpreted as column headers. */
  def getHasColumnHeaders(): scala.Boolean
  /** returns, whether the cells of the leftmost column of the source data are interpreted as row headers. */
  def getHasRowHeaders(): scala.Boolean
  /** returns the cell ranges that contain the data for the chart. */
  def getRanges(): activexDashInteropLib.SafeArray[CellRangeAddress]
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
    Ranges: activexDashInteropLib.SafeArray[CellRangeAddress],
    acquire: js.Function0[scala.Unit],
    getHasColumnHeaders: js.Function0[scala.Boolean],
    getHasRowHeaders: js.Function0[scala.Boolean],
    getRanges: js.Function0[activexDashInteropLib.SafeArray[CellRangeAddress]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setHasColumnHeaders: js.Function1[scala.Boolean, scala.Unit],
    setHasRowHeaders: js.Function1[scala.Boolean, scala.Unit],
    setRanges: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[CellRangeAddress], scala.Unit]
  ): XTableChart = {
    val __obj = js.Dynamic.literal(HasColumnHeaders = HasColumnHeaders, HasRowHeaders = HasRowHeaders, Ranges = Ranges, acquire = acquire, getHasColumnHeaders = getHasColumnHeaders, getHasRowHeaders = getHasRowHeaders, getRanges = getRanges, queryInterface = queryInterface, release = release, setHasColumnHeaders = setHasColumnHeaders, setHasRowHeaders = setHasRowHeaders, setRanges = setRanges)
  
    __obj.asInstanceOf[XTableChart]
  }
}

