package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a database range in a spreadsheet document.
  *
  * A database range is a name for a cell range that also stores filtering, sorting, subtotal and data import settings and options.
  * @see com.sun.star.sheet.DatabaseRanges
  */
trait DatabaseRange
  extends XDatabaseRange
     with XCellRangeReferrer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshable {
  /**
    * specifies whether the AutoFilter is enabled or not.
    * @since OOo 1.1.2
    */
  var AutoFilter: scala.Boolean
  /**
    * specifies whether this range includes a top row of headers.
    * @since LibreOffice 5.0
    */
  var ContainsHeader: scala.Boolean
  /**
    * specifies the range where the filter can find the filter criteria.
    *
    * This is only used if SheetFilterDescriptor::UseFilterCriteriaSource is `TRUE` .
    * @since OOo 1.1.2
    */
  var FilterCriteriaSource: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress
  /**
    * specifies whether the imported data is only a selection of the database.
    * @since OOo 2.0
    */
  var FromSelection: scala.Boolean
  /** if this property is set, cell formats are extended when the size of the range is changed by an update operation. */
  var KeepFormats: scala.Boolean
  /** if this property is set, columns or rows are inserted or deleted when the size of the range is changed by an update operation. */
  var MoveCells: scala.Boolean
  /**
    * specifies the time between two refresh actions in seconds.
    * @since OOo 2.0
    */
  var RefreshPeriod: scala.Double
  /** if this property is set, the cell contents within the database range are left out when the document is saved. */
  var StripData: scala.Boolean
  /**
    * returns the index used to refer to this range in token arrays.
    *
    * A token describing a database range shall contain the op-code obtained from the {@link FormulaMapGroupSpecialOffset.DB_AREA} and this index as data
    * part.
    * @see com.sun.star.sheet.FormulaToken
    * @see com.sun.star.sheet.FormulaMapGroupSpecialOffset.DB_AREA
    * @since OOo 3.0
    */
  var TokenIndex: scala.Double
  /**
    * specifies whether this range includes a bottom row of totals.
    * @since LibreOffice 5.0
    */
  var TotalsRow: scala.Boolean
  /**
    * specifies whether the filter criteria should be taken from a CellRange.
    * @since OOo 1.1.2
    */
  var UseFilterCriteriaSource: scala.Boolean
  /** executes the stored import, filter, sorting, and subtotals descriptors again. */
  /* InferMemberOverrides */
  override def refresh(): scala.Unit
}

