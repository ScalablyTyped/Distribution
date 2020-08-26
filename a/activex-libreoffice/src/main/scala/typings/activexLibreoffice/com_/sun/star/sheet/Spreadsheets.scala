package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import typings.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.table.XCell
import typings.activexLibreoffice.com_.sun.star.table.XCellRange
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents the collection of spreadsheets in a spreadsheet document.
  * @see com.sun.star.sheet.SpreadsheetDocument
  */
@js.native
trait Spreadsheets
  extends XSpreadsheets
     with XIndexAccess
     with XEnumerationAccess
     with XCellRangesAccess

object Spreadsheets {
  @scala.inline
  def apply(
    Count: Double,
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    copyByName: (String, String, Double) => Unit,
    createEnumeration: () => XEnumeration,
    getByIndex: Double => js.Any,
    getByName: String => js.Any,
    getCellByPosition: (Double, Double, Double) => XCell,
    getCellRangeByPosition: (Double, Double, Double, Double, Double) => XCellRange,
    getCellRangesByName: String => SafeArray[XCellRange],
    getCount: () => Double,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    insertByName: (String, js.Any) => Unit,
    insertNewByName: (String, Double) => Unit,
    moveByName: (String, Double) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByName: String => Unit,
    replaceByName: (String, js.Any) => Unit
  ): Spreadsheets = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), copyByName = js.Any.fromFunction3(copyByName), createEnumeration = js.Any.fromFunction0(createEnumeration), getByIndex = js.Any.fromFunction1(getByIndex), getByName = js.Any.fromFunction1(getByName), getCellByPosition = js.Any.fromFunction3(getCellByPosition), getCellRangeByPosition = js.Any.fromFunction5(getCellRangeByPosition), getCellRangesByName = js.Any.fromFunction1(getCellRangesByName), getCount = js.Any.fromFunction0(getCount), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), insertByName = js.Any.fromFunction2(insertByName), insertNewByName = js.Any.fromFunction2(insertNewByName), moveByName = js.Any.fromFunction2(moveByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName), replaceByName = js.Any.fromFunction2(replaceByName))
    __obj.asInstanceOf[Spreadsheets]
  }
}

