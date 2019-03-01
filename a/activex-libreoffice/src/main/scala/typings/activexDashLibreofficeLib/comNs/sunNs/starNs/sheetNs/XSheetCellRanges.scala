package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to access cell ranges in a collection via index and other helper methods.
  * @see com.sun.star.sheet.SheetCellRanges
  */
trait XSheetCellRanges
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess {
  /**
    * returns the collection of all used cells.
    * @see com.sun.star.sheet.Cells
    */
  val Cells: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
  /**
    * creates a sequence with addresses of all contained cell ranges.
    * @returns a sequence with the addresses of all cell ranges.
    */
  val RangeAddresses: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress]
  /**
    * creates a string with addresses of all contained cell ranges.
    *
    * The range addresses are separated with semicolons. For instance the string could have the form "Sheet1.A1:C3;Sheet2.D5:F8".
    * @returns a string containing the addresses of all cell ranges.
    */
  val RangeAddressesAsString: java.lang.String
  /**
    * returns the collection of all used cells.
    * @see com.sun.star.sheet.Cells
    */
  def getCells(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
  /**
    * creates a sequence with addresses of all contained cell ranges.
    * @returns a sequence with the addresses of all cell ranges.
    */
  def getRangeAddresses(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress]
  /**
    * creates a string with addresses of all contained cell ranges.
    *
    * The range addresses are separated with semicolons. For instance the string could have the form "Sheet1.A1:C3;Sheet2.D5:F8".
    * @returns a string containing the addresses of all cell ranges.
    */
  def getRangeAddressesAsString(): java.lang.String
}

object XSheetCellRanges {
  @scala.inline
  def apply(
    Cells: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess,
    Count: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    RangeAddresses: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress],
    RangeAddressesAsString: java.lang.String,
    acquire: js.Function0[scala.Unit],
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
    release: js.Function0[scala.Unit]
  ): XSheetCellRanges = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Cells")(Cells)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("RangeAddresses")(RangeAddresses)
    __obj.updateDynamic("RangeAddressesAsString")(RangeAddressesAsString)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getByIndex")(getByIndex)
    __obj.updateDynamic("getCells")(getCells)
    __obj.updateDynamic("getCount")(getCount)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("getRangeAddresses")(getRangeAddresses)
    __obj.updateDynamic("getRangeAddressesAsString")(getRangeAddressesAsString)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XSheetCellRanges]
  }
}

