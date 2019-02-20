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

