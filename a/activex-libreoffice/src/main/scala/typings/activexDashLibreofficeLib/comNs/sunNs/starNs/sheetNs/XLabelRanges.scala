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

object XLabelRanges {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    addNew: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress, 
      scala.Unit
    ],
    getByIndex: js.Function1[scala.Double, js.Any],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByIndex: js.Function1[scala.Double, scala.Unit]
  ): XLabelRanges = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, acquire = acquire, addNew = addNew, getByIndex = getByIndex, getCount = getCount, getElementType = getElementType, hasElements = hasElements, queryInterface = queryInterface, release = release, removeByIndex = removeByIndex)
  
    __obj.asInstanceOf[XLabelRanges]
  }
}

