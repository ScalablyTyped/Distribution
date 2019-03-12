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

object DatabaseRange {
  @scala.inline
  def apply(
    AutoFilter: scala.Boolean,
    ContainsHeader: scala.Boolean,
    DataArea: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress,
    FilterCriteriaSource: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress,
    FilterDescriptor: XSheetFilterDescriptor,
    FromSelection: scala.Boolean,
    ImportDescriptor: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    KeepFormats: scala.Boolean,
    MoveCells: scala.Boolean,
    Name: java.lang.String,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    ReferredCells: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange,
    RefreshPeriod: scala.Double,
    SortDescriptor: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    StripData: scala.Boolean,
    SubTotalDescriptor: XSubTotalDescriptor,
    TokenIndex: scala.Double,
    TotalsRow: scala.Boolean,
    UseFilterCriteriaSource: scala.Boolean,
    acquire: () => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addRefreshListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshListener => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    getDataArea: () => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress,
    getFilterDescriptor: () => XSheetFilterDescriptor,
    getImportDescriptor: () => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    getName: () => java.lang.String,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    getReferredCells: () => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange,
    getSortDescriptor: () => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    getSubTotalDescriptor: () => XSubTotalDescriptor,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    refresh: () => scala.Unit,
    release: () => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeRefreshListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshListener => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setDataArea: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress => scala.Unit,
    setName: java.lang.String => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit
  ): DatabaseRange = {
    val __obj = js.Dynamic.literal(AutoFilter = AutoFilter, ContainsHeader = ContainsHeader, DataArea = DataArea, FilterCriteriaSource = FilterCriteriaSource, FilterDescriptor = FilterDescriptor, FromSelection = FromSelection, ImportDescriptor = ImportDescriptor, KeepFormats = KeepFormats, MoveCells = MoveCells, Name = Name, PropertySetInfo = PropertySetInfo, ReferredCells = ReferredCells, RefreshPeriod = RefreshPeriod, SortDescriptor = SortDescriptor, StripData = StripData, SubTotalDescriptor = SubTotalDescriptor, TokenIndex = TokenIndex, TotalsRow = TotalsRow, UseFilterCriteriaSource = UseFilterCriteriaSource, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addRefreshListener = js.Any.fromFunction1(addRefreshListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getDataArea = js.Any.fromFunction0(getDataArea), getFilterDescriptor = js.Any.fromFunction0(getFilterDescriptor), getImportDescriptor = js.Any.fromFunction0(getImportDescriptor), getName = js.Any.fromFunction0(getName), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getReferredCells = js.Any.fromFunction0(getReferredCells), getSortDescriptor = js.Any.fromFunction0(getSortDescriptor), getSubTotalDescriptor = js.Any.fromFunction0(getSubTotalDescriptor), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setDataArea = js.Any.fromFunction1(setDataArea), setName = js.Any.fromFunction1(setName), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[DatabaseRange]
  }
}

