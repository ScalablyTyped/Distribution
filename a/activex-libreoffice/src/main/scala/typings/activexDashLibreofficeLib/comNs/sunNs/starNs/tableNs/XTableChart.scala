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

