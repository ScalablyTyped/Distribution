package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to access the members of a label range collection and to insert and remove them.
  * @see com.sun.star.sheet.LabelRanges
  * @see com.sun.star.sheet.LabelRange
  */
trait XLabelRanges
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess {
  /**
    * adds a new label range to the collection.
    * @param aLabelArea the cell range containing the titles of the label range.
    * @param aDataArea the cell range containing the values of the label range.
    */
  def addNew(
    aLabelArea: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress,
    aDataArea: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress
  ): scala.Unit
  /** removes a label range from the collection. */
  def removeByIndex(nIndex: scala.Double): scala.Unit
}

