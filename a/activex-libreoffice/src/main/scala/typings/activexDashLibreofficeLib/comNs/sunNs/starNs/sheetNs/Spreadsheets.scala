package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents the collection of spreadsheets in a spreadsheet document.
  * @see com.sun.star.sheet.SpreadsheetDocument
  */
trait Spreadsheets
  extends XSpreadsheets
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
     with XCellRangesAccess

object Spreadsheets {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    copyByName: js.Function3[java.lang.String, java.lang.String, scala.Double, scala.Unit],
    createEnumeration: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration],
    getByIndex: js.Function1[scala.Double, js.Any],
    getByName: js.Function1[java.lang.String, js.Any],
    getCellByPosition: js.Function3[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCell
    ],
    getCellRangeByPosition: js.Function5[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange
    ],
    getCellRangesByName: js.Function1[
      java.lang.String, 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange]
    ],
    getCount: js.Function0[scala.Double],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    insertByName: js.Function2[java.lang.String, js.Any, scala.Unit],
    insertNewByName: js.Function2[java.lang.String, scala.Double, scala.Unit],
    moveByName: js.Function2[java.lang.String, scala.Double, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByName: js.Function1[java.lang.String, scala.Unit],
    replaceByName: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): Spreadsheets = {
    val __obj = js.Dynamic.literal(Count = Count, ElementNames = ElementNames, ElementType = ElementType, acquire = acquire, copyByName = copyByName, createEnumeration = createEnumeration, getByIndex = getByIndex, getByName = getByName, getCellByPosition = getCellByPosition, getCellRangeByPosition = getCellRangeByPosition, getCellRangesByName = getCellRangesByName, getCount = getCount, getElementNames = getElementNames, getElementType = getElementType, hasByName = hasByName, hasElements = hasElements, insertByName = insertByName, insertNewByName = insertNewByName, moveByName = moveByName, queryInterface = queryInterface, release = release, removeByName = removeByName, replaceByName = replaceByName)
  
    __obj.asInstanceOf[Spreadsheets]
  }
}

