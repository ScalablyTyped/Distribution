package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellRangeAddress
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XModifyBroadcaster
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XModifyListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a data pilot table on a spreadsheet. */
trait DataPilotTable
  extends XDataPilotDescriptor
     with XDataPilotTable
     with XModifyBroadcaster

object DataPilotTable {
  @scala.inline
  def apply(
    ColumnFields: XIndexAccess,
    DataFields: XIndexAccess,
    DataPilotFields: XIndexAccess,
    FilterDescriptor: XSheetFilterDescriptor,
    HiddenFields: XIndexAccess,
    Name: String,
    OutputRange: CellRangeAddress,
    PageFields: XIndexAccess,
    RowFields: XIndexAccess,
    SourceRange: CellRangeAddress,
    Tag: String,
    acquire: () => Unit,
    addModifyListener: XModifyListener => Unit,
    getColumnFields: () => XIndexAccess,
    getDataFields: () => XIndexAccess,
    getDataPilotFields: () => XIndexAccess,
    getFilterDescriptor: () => XSheetFilterDescriptor,
    getHiddenFields: () => XIndexAccess,
    getName: () => String,
    getOutputRange: () => CellRangeAddress,
    getPageFields: () => XIndexAccess,
    getRowFields: () => XIndexAccess,
    getSourceRange: () => CellRangeAddress,
    getTag: () => String,
    queryInterface: `type` => js.Any,
    refresh: () => Unit,
    release: () => Unit,
    removeModifyListener: XModifyListener => Unit,
    setName: String => Unit,
    setSourceRange: CellRangeAddress => Unit,
    setTag: String => Unit
  ): DataPilotTable = {
    val __obj = js.Dynamic.literal(ColumnFields = ColumnFields, DataFields = DataFields, DataPilotFields = DataPilotFields, FilterDescriptor = FilterDescriptor, HiddenFields = HiddenFields, Name = Name, OutputRange = OutputRange, PageFields = PageFields, RowFields = RowFields, SourceRange = SourceRange, Tag = Tag, acquire = js.Any.fromFunction0(acquire), addModifyListener = js.Any.fromFunction1(addModifyListener), getColumnFields = js.Any.fromFunction0(getColumnFields), getDataFields = js.Any.fromFunction0(getDataFields), getDataPilotFields = js.Any.fromFunction0(getDataPilotFields), getFilterDescriptor = js.Any.fromFunction0(getFilterDescriptor), getHiddenFields = js.Any.fromFunction0(getHiddenFields), getName = js.Any.fromFunction0(getName), getOutputRange = js.Any.fromFunction0(getOutputRange), getPageFields = js.Any.fromFunction0(getPageFields), getRowFields = js.Any.fromFunction0(getRowFields), getSourceRange = js.Any.fromFunction0(getSourceRange), getTag = js.Any.fromFunction0(getTag), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removeModifyListener = js.Any.fromFunction1(removeModifyListener), setName = js.Any.fromFunction1(setName), setSourceRange = js.Any.fromFunction1(setSourceRange), setTag = js.Any.fromFunction1(setTag))
  
    __obj.asInstanceOf[DataPilotTable]
  }
}

