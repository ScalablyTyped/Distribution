package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNamed
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellRangeAddress
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.XCellRange
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XRefreshListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XRefreshable
import typings.std.SafeArray
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
     with XPropertySet
     with XNamed
     with XRefreshable {
  /**
    * specifies whether the AutoFilter is enabled or not.
    * @since OOo 1.1.2
    */
  var AutoFilter: Boolean
  /**
    * specifies whether this range includes a top row of headers.
    * @since LibreOffice 5.0
    */
  var ContainsHeader: Boolean
  /**
    * specifies the range where the filter can find the filter criteria.
    *
    * This is only used if SheetFilterDescriptor::UseFilterCriteriaSource is `TRUE` .
    * @since OOo 1.1.2
    */
  var FilterCriteriaSource: CellRangeAddress
  /**
    * specifies whether the imported data is only a selection of the database.
    * @since OOo 2.0
    */
  var FromSelection: Boolean
  /** if this property is set, cell formats are extended when the size of the range is changed by an update operation. */
  var KeepFormats: Boolean
  /** if this property is set, columns or rows are inserted or deleted when the size of the range is changed by an update operation. */
  var MoveCells: Boolean
  /**
    * specifies the time between two refresh actions in seconds.
    * @since OOo 2.0
    */
  var RefreshPeriod: Double
  /** if this property is set, the cell contents within the database range are left out when the document is saved. */
  var StripData: Boolean
  /**
    * returns the index used to refer to this range in token arrays.
    *
    * A token describing a database range shall contain the op-code obtained from the {@link FormulaMapGroupSpecialOffset.DB_AREA} and this index as data
    * part.
    * @see com.sun.star.sheet.FormulaToken
    * @see com.sun.star.sheet.FormulaMapGroupSpecialOffset.DB_AREA
    * @since OOo 3.0
    */
  var TokenIndex: Double
  /**
    * specifies whether this range includes a bottom row of totals.
    * @since LibreOffice 5.0
    */
  var TotalsRow: Boolean
  /**
    * specifies whether the filter criteria should be taken from a CellRange.
    * @since OOo 1.1.2
    */
  var UseFilterCriteriaSource: Boolean
  /** executes the stored import, filter, sorting, and subtotals descriptors again. */
  /* InferMemberOverrides */
  override def refresh(): Unit
}

object DatabaseRange {
  @scala.inline
  def apply(
    AutoFilter: Boolean,
    ContainsHeader: Boolean,
    DataArea: CellRangeAddress,
    FilterCriteriaSource: CellRangeAddress,
    FilterDescriptor: XSheetFilterDescriptor,
    FromSelection: Boolean,
    ImportDescriptor: SafeArray[PropertyValue],
    KeepFormats: Boolean,
    MoveCells: Boolean,
    Name: String,
    PropertySetInfo: XPropertySetInfo,
    ReferredCells: XCellRange,
    RefreshPeriod: Double,
    SortDescriptor: SafeArray[PropertyValue],
    StripData: Boolean,
    SubTotalDescriptor: XSubTotalDescriptor,
    TokenIndex: Double,
    TotalsRow: Boolean,
    UseFilterCriteriaSource: Boolean,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addRefreshListener: XRefreshListener => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getDataArea: () => CellRangeAddress,
    getFilterDescriptor: () => XSheetFilterDescriptor,
    getImportDescriptor: () => SafeArray[PropertyValue],
    getName: () => String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getReferredCells: () => XCellRange,
    getSortDescriptor: () => SafeArray[PropertyValue],
    getSubTotalDescriptor: () => XSubTotalDescriptor,
    queryInterface: `type` => js.Any,
    refresh: () => Unit,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeRefreshListener: XRefreshListener => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setDataArea: CellRangeAddress => Unit,
    setName: String => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): DatabaseRange = {
    val __obj = js.Dynamic.literal(AutoFilter = AutoFilter, ContainsHeader = ContainsHeader, DataArea = DataArea, FilterCriteriaSource = FilterCriteriaSource, FilterDescriptor = FilterDescriptor, FromSelection = FromSelection, ImportDescriptor = ImportDescriptor, KeepFormats = KeepFormats, MoveCells = MoveCells, Name = Name, PropertySetInfo = PropertySetInfo, ReferredCells = ReferredCells, RefreshPeriod = RefreshPeriod, SortDescriptor = SortDescriptor, StripData = StripData, SubTotalDescriptor = SubTotalDescriptor, TokenIndex = TokenIndex, TotalsRow = TotalsRow, UseFilterCriteriaSource = UseFilterCriteriaSource, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addRefreshListener = js.Any.fromFunction1(addRefreshListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getDataArea = js.Any.fromFunction0(getDataArea), getFilterDescriptor = js.Any.fromFunction0(getFilterDescriptor), getImportDescriptor = js.Any.fromFunction0(getImportDescriptor), getName = js.Any.fromFunction0(getName), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getReferredCells = js.Any.fromFunction0(getReferredCells), getSortDescriptor = js.Any.fromFunction0(getSortDescriptor), getSubTotalDescriptor = js.Any.fromFunction0(getSubTotalDescriptor), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setDataArea = js.Any.fromFunction1(setDataArea), setName = js.Any.fromFunction1(setName), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[DatabaseRange]
  }
}

