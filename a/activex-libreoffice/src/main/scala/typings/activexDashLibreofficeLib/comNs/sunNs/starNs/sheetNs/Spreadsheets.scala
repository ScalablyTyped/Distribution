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
    ElementNames: stdLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: () => scala.Unit,
    copyByName: (java.lang.String, java.lang.String, scala.Double) => scala.Unit,
    createEnumeration: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration,
    getByIndex: scala.Double => js.Any,
    getByName: java.lang.String => js.Any,
    getCellByPosition: (scala.Double, scala.Double, scala.Double) => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCell,
    getCellRangeByPosition: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange,
    getCellRangesByName: java.lang.String => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange],
    getCount: () => scala.Double,
    getElementNames: () => stdLib.SafeArray[java.lang.String],
    getElementType: () => activexDashLibreofficeLib.`type`,
    hasByName: java.lang.String => scala.Boolean,
    hasElements: () => scala.Boolean,
    insertByName: (java.lang.String, js.Any) => scala.Unit,
    insertNewByName: (java.lang.String, scala.Double) => scala.Unit,
    moveByName: (java.lang.String, scala.Double) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeByName: java.lang.String => scala.Unit,
    replaceByName: (java.lang.String, js.Any) => scala.Unit
  ): Spreadsheets = {
    val __obj = js.Dynamic.literal(Count = Count, ElementNames = ElementNames, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), copyByName = js.Any.fromFunction3(copyByName), createEnumeration = js.Any.fromFunction0(createEnumeration), getByIndex = js.Any.fromFunction1(getByIndex), getByName = js.Any.fromFunction1(getByName), getCellByPosition = js.Any.fromFunction3(getCellByPosition), getCellRangeByPosition = js.Any.fromFunction5(getCellRangeByPosition), getCellRangesByName = js.Any.fromFunction1(getCellRangesByName), getCount = js.Any.fromFunction0(getCount), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), insertByName = js.Any.fromFunction2(insertByName), insertNewByName = js.Any.fromFunction2(insertNewByName), moveByName = js.Any.fromFunction2(moveByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName), replaceByName = js.Any.fromFunction2(replaceByName))
  
    __obj.asInstanceOf[Spreadsheets]
  }
}

