package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents a sheet which has print areas. */
trait XPrintAreas
  extends StObject
     with XInterface {
  
  /** returns a sequence containing all print areas of the sheet. */
  var PrintAreas: SafeArray[CellRangeAddress]
  
  /** returns, whether the title columns are repeated on all subsequent print pages to the right. */
  var PrintTitleColumns: Boolean
  
  /** returns, whether the title rows are repeated on all subsequent print pages to the bottom. */
  var PrintTitleRows: Boolean
  
  /**
    * returns the range that is specified as title columns range.
    *
    * Title columns can be automatically repeated on all subsequent print pages to the right, using {@link XPrintAreas.setPrintTitleColumns()} .
    * @returns the range of columns that is specified as title columns range.
    */
  var TitleColumns: CellRangeAddress
  
  /**
    * returns the range that is specified as title rows range.
    *
    * Title rows can be automatically repeated on all subsequent print pages to the bottom, using {@link XPrintAreas.setPrintTitleRows()} .
    * @returns the range of rows that is specified as title rows range.
    */
  var TitleRows: CellRangeAddress
  
  /** returns a sequence containing all print areas of the sheet. */
  def getPrintAreas(): SafeArray[CellRangeAddress]
  
  /** returns, whether the title columns are repeated on all subsequent print pages to the right. */
  def getPrintTitleColumns(): Boolean
  
  /** returns, whether the title rows are repeated on all subsequent print pages to the bottom. */
  def getPrintTitleRows(): Boolean
  
  /**
    * returns the range that is specified as title columns range.
    *
    * Title columns can be automatically repeated on all subsequent print pages to the right, using {@link XPrintAreas.setPrintTitleColumns()} .
    * @returns the range of columns that is specified as title columns range.
    */
  def getTitleColumns(): CellRangeAddress
  
  /**
    * returns the range that is specified as title rows range.
    *
    * Title rows can be automatically repeated on all subsequent print pages to the bottom, using {@link XPrintAreas.setPrintTitleRows()} .
    * @returns the range of rows that is specified as title rows range.
    */
  def getTitleRows(): CellRangeAddress
  
  /**
    * sets the print areas of the sheet.
    *
    * If none of the sheets in a document have print areas, the whole sheets are printed. If any sheet contains print areas, other sheets without print
    * areas are not printed.
    * @param aPrintAreas a sequence containing all print areas for this sheet.
    */
  def setPrintAreas(aPrintAreas: SeqEquiv[CellRangeAddress]): Unit
  
  /**
    * specifies whether the title columns are repeated on all subsequent print pages to the right.
    * @param bPrintTitleColumns if `TRUE` , title columns are repeated on each page.
    */
  def setPrintTitleColumns(bPrintTitleColumns: Boolean): Unit
  
  /**
    * specifies whether the title rows are repeated on all subsequent print pages to the bottom.
    * @param bPrintTitleRows if `TRUE` , title rows are repeated on each page.
    */
  def setPrintTitleRows(bPrintTitleRows: Boolean): Unit
  
  /**
    * specifies a range of columns as title columns range.
    *
    * The rows of the passed range are ignored.
    *
    * Title columns can be automatically repeated on all subsequent print pages to the right, using {@link XPrintAreas.setPrintTitleColumns()} .
    * @param aTitleColumns the title columns range.
    */
  def setTitleColumns(aTitleColumns: CellRangeAddress): Unit
  
  /**
    * specifies a range of rows as title rows range.
    *
    * The columns of the passed range are ignored.
    *
    * Title rows can be automatically repeated on all subsequent print pages to the bottom, using {@link XPrintAreas.setPrintTitleRows()} .
    * @param aTitleRows the title rows range.
    */
  def setTitleRows(aTitleRows: CellRangeAddress): Unit
}
object XPrintAreas {
  
  inline def apply(
    PrintAreas: SafeArray[CellRangeAddress],
    PrintTitleColumns: Boolean,
    PrintTitleRows: Boolean,
    TitleColumns: CellRangeAddress,
    TitleRows: CellRangeAddress,
    acquire: () => Unit,
    getPrintAreas: () => SafeArray[CellRangeAddress],
    getPrintTitleColumns: () => Boolean,
    getPrintTitleRows: () => Boolean,
    getTitleColumns: () => CellRangeAddress,
    getTitleRows: () => CellRangeAddress,
    queryInterface: `type` => Any,
    release: () => Unit,
    setPrintAreas: SeqEquiv[CellRangeAddress] => Unit,
    setPrintTitleColumns: Boolean => Unit,
    setPrintTitleRows: Boolean => Unit,
    setTitleColumns: CellRangeAddress => Unit,
    setTitleRows: CellRangeAddress => Unit
  ): XPrintAreas = {
    val __obj = js.Dynamic.literal(PrintAreas = PrintAreas.asInstanceOf[js.Any], PrintTitleColumns = PrintTitleColumns.asInstanceOf[js.Any], PrintTitleRows = PrintTitleRows.asInstanceOf[js.Any], TitleColumns = TitleColumns.asInstanceOf[js.Any], TitleRows = TitleRows.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getPrintAreas = js.Any.fromFunction0(getPrintAreas), getPrintTitleColumns = js.Any.fromFunction0(getPrintTitleColumns), getPrintTitleRows = js.Any.fromFunction0(getPrintTitleRows), getTitleColumns = js.Any.fromFunction0(getTitleColumns), getTitleRows = js.Any.fromFunction0(getTitleRows), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setPrintAreas = js.Any.fromFunction1(setPrintAreas), setPrintTitleColumns = js.Any.fromFunction1(setPrintTitleColumns), setPrintTitleRows = js.Any.fromFunction1(setPrintTitleRows), setTitleColumns = js.Any.fromFunction1(setTitleColumns), setTitleRows = js.Any.fromFunction1(setTitleRows))
    __obj.asInstanceOf[XPrintAreas]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XPrintAreas] (val x: Self) extends AnyVal {
    
    inline def setGetPrintAreas(value: () => SafeArray[CellRangeAddress]): Self = StObject.set(x, "getPrintAreas", js.Any.fromFunction0(value))
    
    inline def setGetPrintTitleColumns(value: () => Boolean): Self = StObject.set(x, "getPrintTitleColumns", js.Any.fromFunction0(value))
    
    inline def setGetPrintTitleRows(value: () => Boolean): Self = StObject.set(x, "getPrintTitleRows", js.Any.fromFunction0(value))
    
    inline def setGetTitleColumns(value: () => CellRangeAddress): Self = StObject.set(x, "getTitleColumns", js.Any.fromFunction0(value))
    
    inline def setGetTitleRows(value: () => CellRangeAddress): Self = StObject.set(x, "getTitleRows", js.Any.fromFunction0(value))
    
    inline def setPrintAreas(value: SafeArray[CellRangeAddress]): Self = StObject.set(x, "PrintAreas", value.asInstanceOf[js.Any])
    
    inline def setPrintTitleColumns(value: Boolean): Self = StObject.set(x, "PrintTitleColumns", value.asInstanceOf[js.Any])
    
    inline def setPrintTitleRows(value: Boolean): Self = StObject.set(x, "PrintTitleRows", value.asInstanceOf[js.Any])
    
    inline def setSetPrintAreas(value: SeqEquiv[CellRangeAddress] => Unit): Self = StObject.set(x, "setPrintAreas", js.Any.fromFunction1(value))
    
    inline def setSetPrintTitleColumns(value: Boolean => Unit): Self = StObject.set(x, "setPrintTitleColumns", js.Any.fromFunction1(value))
    
    inline def setSetPrintTitleRows(value: Boolean => Unit): Self = StObject.set(x, "setPrintTitleRows", js.Any.fromFunction1(value))
    
    inline def setSetTitleColumns(value: CellRangeAddress => Unit): Self = StObject.set(x, "setTitleColumns", js.Any.fromFunction1(value))
    
    inline def setSetTitleRows(value: CellRangeAddress => Unit): Self = StObject.set(x, "setTitleRows", js.Any.fromFunction1(value))
    
    inline def setTitleColumns(value: CellRangeAddress): Self = StObject.set(x, "TitleColumns", value.asInstanceOf[js.Any])
    
    inline def setTitleRows(value: CellRangeAddress): Self = StObject.set(x, "TitleRows", value.asInstanceOf[js.Any])
  }
}
