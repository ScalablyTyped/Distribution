package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the settings of a label range in a spreadsheet document.
  *
  * These can be column or row labels, depending on where they are used.
  * @see com.sun.star.sheet.LabelRange
  */
trait XLabelRange
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the cell range address for which the labels are valid. */
  var DataArea: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress
  /** returns the cell range address that contains the labels. */
  var LabelArea: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress
  /** returns the cell range address for which the labels are valid. */
  def getDataArea(): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress
  /** returns the cell range address that contains the labels. */
  def getLabelArea(): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress
  /** sets the cell range address for which the labels are valid. */
  def setDataArea(aDataArea: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress): scala.Unit
  /** sets the cell range address that contains the labels. */
  def setLabelArea(aLabelArea: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress): scala.Unit
}

