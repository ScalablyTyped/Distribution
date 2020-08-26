package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to a collection of spreadsheets.
  * @see com.sun.star.sheet.SpreadsheetDocument
  */
@js.native
trait XSpreadsheetDocument extends XInterface {
  /**
    * returns the collection of sheets in the document.
    * @see com.sun.star.sheet.Spreadsheets
    */
  val Sheets: XSpreadsheets = js.native
  /**
    * returns the collection of sheets in the document.
    * @see com.sun.star.sheet.Spreadsheets
    */
  def getSheets(): XSpreadsheets = js.native
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
    val __obj = js.Dynamic.literal(Sheets = Sheets.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getSheets = js.Any.fromFunction0(getSheets), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSpreadsheetDocument]
  }
  @scala.inline
  implicit class XSpreadsheetDocumentOps[Self <: XSpreadsheetDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSheets(value: XSpreadsheets): Self = this.set("Sheets", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetSheets(value: () => XSpreadsheets): Self = this.set("getSheets", js.Any.fromFunction0(value))
  }
  
}

