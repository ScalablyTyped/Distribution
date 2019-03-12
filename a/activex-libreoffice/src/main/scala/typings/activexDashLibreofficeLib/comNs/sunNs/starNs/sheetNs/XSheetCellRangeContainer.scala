package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to access cell ranges in a collection via index and to add and remove cell ranges.
  * @see com.sun.star.sheet.SheetCellRanges
  */
trait XSheetCellRangeContainer extends XSheetCellRanges {
  /**
    * adds the given range to the collection of cell ranges.
    * @param aCellRangeAddress contains the address of the new range.
    * @param bMergeRanges defines how the range should be added. To merge the ranges takes more time, but the memory usage is lower.
    */
  def addRangeAddress(
    aCellRangeAddress: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress,
    bMergeRanges: scala.Boolean
  ): scala.Unit
  /**
    * adds the given ranges to the collection of cell ranges.
    * @param aCellRangeAddresses contains a sequence of addresses of all new ranges.
    * @param bMergeRanges defines how the ranges should be added. To merge the ranges takes more time, but the memory usage is lower.
    */
  def addRangeAddresses(
    aCellRangeAddresses: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress],
    bMergeRanges: scala.Boolean
  ): scala.Unit
  /**
    * removes the given range from the collection of cell ranges.
    * @param aCellRangeAddress contains the address of the range to be removed.  The specified range must fit exactly to an element of the collection. The met
    * @throws com::sun::star::container::NoSuchElementException if the collection does not contain the specified range.
    */
  def removeRangeAddress(aCellRangeAddress: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress): scala.Unit
  /**
    * removes the given ranges from the collection of cell ranges.
    * @param aCellRangeAddresses contains a sequence of addresses of all ranges to be removed.  All specified ranges must fit exactly to elements of the colle
    * @throws com::sun::star::container::NoSuchElementException if the collection does not contain any of the specified ranges.
    */
  def removeRangeAddresses(
    aCellRangeAddresses: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress]
  ): scala.Unit
}

object XSheetCellRangeContainer {
  @scala.inline
  def apply(
    Cells: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess,
    Count: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    RangeAddresses: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress],
    RangeAddressesAsString: java.lang.String,
    acquire: () => scala.Unit,
    addRangeAddress: (activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress, scala.Boolean) => scala.Unit,
    addRangeAddresses: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress], scala.Boolean) => scala.Unit,
    getByIndex: scala.Double => js.Any,
    getCells: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess,
    getCount: () => scala.Double,
    getElementType: () => activexDashLibreofficeLib.`type`,
    getRangeAddresses: () => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress],
    getRangeAddressesAsString: () => java.lang.String,
    hasElements: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeRangeAddress: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress => scala.Unit,
    removeRangeAddresses: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress] => scala.Unit
  ): XSheetCellRangeContainer = {
    val __obj = js.Dynamic.literal(Cells = Cells, Count = Count, ElementType = ElementType, RangeAddresses = RangeAddresses, RangeAddressesAsString = RangeAddressesAsString, acquire = js.Any.fromFunction0(acquire), addRangeAddress = js.Any.fromFunction2(addRangeAddress), addRangeAddresses = js.Any.fromFunction2(addRangeAddresses), getByIndex = js.Any.fromFunction1(getByIndex), getCells = js.Any.fromFunction0(getCells), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getRangeAddresses = js.Any.fromFunction0(getRangeAddresses), getRangeAddressesAsString = js.Any.fromFunction0(getRangeAddressesAsString), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeRangeAddress = js.Any.fromFunction1(removeRangeAddress), removeRangeAddresses = js.Any.fromFunction1(removeRangeAddresses))
  
    __obj.asInstanceOf[XSheetCellRangeContainer]
  }
}

