package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to access the spreadsheets by name and to insert, copy, remove and rearrange spreadsheets.
  * @see com.sun.star.sheet.Spreadsheets
  */
trait XSpreadsheets
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer {
  /**
    * copies a sheet within the collection.
    * @param aName the name of the spreadsheet to copy.
    * @param aCopy the name of the copy of the spreadsheet.
    * @param nDestination the index of the copy in the collection.
    */
  def copyByName(aName: java.lang.String, aCopy: java.lang.String, nDestination: scala.Double): scala.Unit
  /**
    * inserts a new sheet into the collection.
    * @param aName the name of the new spreadsheet.
    * @param nPosition the index of the new spreadsheet in the collection.
    */
  def insertNewByName(aName: java.lang.String, nPosition: scala.Double): scala.Unit
  /**
    * moves a sheet within the collection.
    * @param aName the name of the spreadsheet to move.
    * @param nDestination the new index of the spreadsheet in the collection.
    */
  def moveByName(aName: java.lang.String, nDestination: scala.Double): scala.Unit
}

object XSpreadsheets {
  @scala.inline
  def apply(
    ElementNames: stdLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: () => scala.Unit,
    copyByName: (java.lang.String, java.lang.String, scala.Double) => scala.Unit,
    getByName: java.lang.String => js.Any,
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
  ): XSpreadsheets = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), copyByName = js.Any.fromFunction3(copyByName), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), insertByName = js.Any.fromFunction2(insertByName), insertNewByName = js.Any.fromFunction2(insertNewByName), moveByName = js.Any.fromFunction2(moveByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName), replaceByName = js.Any.fromFunction2(replaceByName))
  
    __obj.asInstanceOf[XSpreadsheets]
  }
}

