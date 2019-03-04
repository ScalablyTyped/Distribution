package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to a collection of spreadsheets.
  * @see com.sun.star.sheet.SpreadsheetDocument
  */
trait XSpreadsheetDocument
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
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
    acquire: js.Function0[scala.Unit],
    getSheets: js.Function0[XSpreadsheets],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XSpreadsheetDocument = {
    val __obj = js.Dynamic.literal(Sheets = Sheets, acquire = acquire, getSheets = getSheets, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XSpreadsheetDocument]
  }
}

