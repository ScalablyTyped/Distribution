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

