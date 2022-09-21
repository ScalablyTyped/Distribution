package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to access the spreadsheets by name and to insert, copy, remove and rearrange spreadsheets.
  * @see com.sun.star.sheet.Spreadsheets
  */
trait XSpreadsheets
  extends StObject
     with XNameContainer {
  
  /**
    * copies a sheet within the collection.
    * @param aName the name of the spreadsheet to copy.
    * @param aCopy the name of the copy of the spreadsheet.
    * @param nDestination the index of the copy in the collection.
    */
  def copyByName(aName: String, aCopy: String, nDestination: Double): Unit
  
  /**
    * inserts a new sheet into the collection.
    * @param aName the name of the new spreadsheet.
    * @param nPosition the index of the new spreadsheet in the collection.
    */
  def insertNewByName(aName: String, nPosition: Double): Unit
  
  /**
    * moves a sheet within the collection.
    * @param aName the name of the spreadsheet to move.
    * @param nDestination the new index of the spreadsheet in the collection.
    */
  def moveByName(aName: String, nDestination: Double): Unit
}
object XSpreadsheets {
  
  inline def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    copyByName: (String, String, Double) => Unit,
    getByName: String => Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    insertByName: (String, Any) => Unit,
    insertNewByName: (String, Double) => Unit,
    moveByName: (String, Double) => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeByName: String => Unit,
    replaceByName: (String, Any) => Unit
  ): XSpreadsheets = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), copyByName = js.Any.fromFunction3(copyByName), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), insertByName = js.Any.fromFunction2(insertByName), insertNewByName = js.Any.fromFunction2(insertNewByName), moveByName = js.Any.fromFunction2(moveByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName), replaceByName = js.Any.fromFunction2(replaceByName))
    __obj.asInstanceOf[XSpreadsheets]
  }
  
  extension [Self <: XSpreadsheets](x: Self) {
    
    inline def setCopyByName(value: (String, String, Double) => Unit): Self = StObject.set(x, "copyByName", js.Any.fromFunction3(value))
    
    inline def setInsertNewByName(value: (String, Double) => Unit): Self = StObject.set(x, "insertNewByName", js.Any.fromFunction2(value))
    
    inline def setMoveByName(value: (String, Double) => Unit): Self = StObject.set(x, "moveByName", js.Any.fromFunction2(value))
  }
}
