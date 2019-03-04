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
    RangeAddresses: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress],
    RangeAddressesAsString: java.lang.String,
    acquire: js.Function0[scala.Unit],
    addRangeAddress: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress, 
      scala.Boolean, 
      scala.Unit
    ],
    addRangeAddresses: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress], 
      scala.Boolean, 
      scala.Unit
    ],
    getByIndex: js.Function1[scala.Double, js.Any],
    getCells: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getRangeAddresses: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress]
    ],
    getRangeAddressesAsString: js.Function0[java.lang.String],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeRangeAddress: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress, scala.Unit],
    removeRangeAddresses: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress], 
      scala.Unit
    ]
  ): XSheetCellRangeContainer = {
    val __obj = js.Dynamic.literal(Cells = Cells, Count = Count, ElementType = ElementType, RangeAddresses = RangeAddresses, RangeAddressesAsString = RangeAddressesAsString, acquire = acquire, addRangeAddress = addRangeAddress, addRangeAddresses = addRangeAddresses, getByIndex = getByIndex, getCells = getCells, getCount = getCount, getElementType = getElementType, getRangeAddresses = getRangeAddresses, getRangeAddressesAsString = getRangeAddressesAsString, hasElements = hasElements, queryInterface = queryInterface, release = release, removeRangeAddress = removeRangeAddress, removeRangeAddresses = removeRangeAddresses)
  
    __obj.asInstanceOf[XSheetCellRangeContainer]
  }
}

