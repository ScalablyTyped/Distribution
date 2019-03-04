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

object XLabelRange {
  @scala.inline
  def apply(
    DataArea: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress,
    LabelArea: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress,
    acquire: js.Function0[scala.Unit],
    getDataArea: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress],
    getLabelArea: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setDataArea: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress, scala.Unit],
    setLabelArea: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress, scala.Unit]
  ): XLabelRange = {
    val __obj = js.Dynamic.literal(DataArea = DataArea, LabelArea = LabelArea, acquire = acquire, getDataArea = getDataArea, getLabelArea = getLabelArea, queryInterface = queryInterface, release = release, setDataArea = setDataArea, setLabelArea = setLabelArea)
  
    __obj.asInstanceOf[XLabelRange]
  }
}

