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

