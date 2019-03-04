package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a data pilot table on a spreadsheet. */
trait DataPilotTable
  extends XDataPilotDescriptor
     with XDataPilotTable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyBroadcaster

object DataPilotTable {
  @scala.inline
  def apply(
    ColumnFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    DataFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    DataPilotFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    FilterDescriptor: XSheetFilterDescriptor,
    HiddenFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    Name: java.lang.String,
    OutputRange: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress,
    PageFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    RowFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    SourceRange: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress,
    Tag: java.lang.String,
    acquire: js.Function0[scala.Unit],
    addModifyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
    getColumnFields: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    getDataFields: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    getDataPilotFields: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    getFilterDescriptor: js.Function0[XSheetFilterDescriptor],
    getHiddenFields: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    getName: js.Function0[java.lang.String],
    getOutputRange: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress],
    getPageFields: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    getRowFields: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    getSourceRange: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress],
    getTag: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    refresh: js.Function0[scala.Unit],
    release: js.Function0[scala.Unit],
    removeModifyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit],
    setSourceRange: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress, scala.Unit],
    setTag: js.Function1[java.lang.String, scala.Unit]
  ): DataPilotTable = {
    val __obj = js.Dynamic.literal(ColumnFields = ColumnFields, DataFields = DataFields, DataPilotFields = DataPilotFields, FilterDescriptor = FilterDescriptor, HiddenFields = HiddenFields, Name = Name, OutputRange = OutputRange, PageFields = PageFields, RowFields = RowFields, SourceRange = SourceRange, Tag = Tag, acquire = acquire, addModifyListener = addModifyListener, getColumnFields = getColumnFields, getDataFields = getDataFields, getDataPilotFields = getDataPilotFields, getFilterDescriptor = getFilterDescriptor, getHiddenFields = getHiddenFields, getName = getName, getOutputRange = getOutputRange, getPageFields = getPageFields, getRowFields = getRowFields, getSourceRange = getSourceRange, getTag = getTag, queryInterface = queryInterface, refresh = refresh, release = release, removeModifyListener = removeModifyListener, setName = setName, setSourceRange = setSourceRange, setTag = setTag)
  
    __obj.asInstanceOf[DataPilotTable]
  }
}

