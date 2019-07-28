package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to a collection of spreadsheets.
  * @see com.sun.star.sheet.SpreadsheetDocument
  */
trait XSpreadsheetDocument extends XInterface {
  /**
    * returns the collection of sheets in the document.
    * @see com.sun.star.sheet.Spreadsheets
    */
  val Sheets: XSpreadsheets
  /**
    * returns the collection of sheets in the document.
    * @see com.sun.star.sheet.Spreadsheets
    */
  def getSheets(): XSpreadsheets
}

object XSpreadsheetDocument {
  @scala.inline
  def apply(
    Sheets: XSpreadsheets,
    acquire: () => Unit,
    getSheets: () => XSpreadsheets,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSpreadsheetDocument = {
    val __obj = js.Dynamic.literal(Sheets = Sheets, acquire = js.Any.fromFunction0(acquire), getSheets = js.Any.fromFunction0(getSheets), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSpreadsheetDocument]
  }
}

