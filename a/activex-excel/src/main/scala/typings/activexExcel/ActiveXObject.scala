package typings.activexExcel

import typings.activexExcel.Excel.Application
import typings.activexExcel.Excel.Chart
import typings.activexExcel.Excel.ControlFormat
import typings.activexExcel.Excel.EventHelperTypes.ApplicationInvokeArgNames
import typings.activexExcel.Excel.EventHelperTypes.ApplicationInvokeParameter
import typings.activexExcel.Excel.EventHelperTypes.ChartInvokeArgNames
import typings.activexExcel.Excel.EventHelperTypes.ChartInvokeParameter
import typings.activexExcel.Excel.EventHelperTypes.OLEObjectInvokeArgNames
import typings.activexExcel.Excel.EventHelperTypes.OLEObjectInvokeParameter
import typings.activexExcel.Excel.EventHelperTypes.QueryTableInvokeArgNames
import typings.activexExcel.Excel.EventHelperTypes.QueryTableInvokeParameter
import typings.activexExcel.Excel.EventHelperTypes.WorkbookInvokeArgNames
import typings.activexExcel.Excel.EventHelperTypes.WorkbookInvokeParameter
import typings.activexExcel.Excel.EventHelperTypes.WorksheetInvokeArgNames
import typings.activexExcel.Excel.EventHelperTypes.WorksheetInvokeParameter
import typings.activexExcel.Excel.OLEObject
import typings.activexExcel.Excel.PageSetup
import typings.activexExcel.Excel.PivotField
import typings.activexExcel.Excel.PivotFieldSubtotal
import typings.activexExcel.Excel.QueryTable
import typings.activexExcel.Excel.Range
import typings.activexExcel.Excel.Workbook
import typings.activexExcel.Excel.Worksheet
import typings.activexExcel.Excel.XlAxisGroup
import typings.activexExcel.Excel.XlAxisType
import typings.activexExcel.Excel.XlRangeValueDataType
import typings.activexExcel.activexExcelStrings.Activate
import typings.activexExcel.activexExcelStrings.AddRef
import typings.activexExcel.activexExcelStrings.AddinInstall
import typings.activexExcel.activexExcelStrings.AddinUninstall
import typings.activexExcel.activexExcelStrings.AfterCalculate
import typings.activexExcel.activexExcelStrings.AfterRefresh
import typings.activexExcel.activexExcelStrings.AfterSave
import typings.activexExcel.activexExcelStrings.AfterXmlExport
import typings.activexExcel.activexExcelStrings.AfterXmlImport
import typings.activexExcel.activexExcelStrings.Arg1
import typings.activexExcel.activexExcelStrings.Arg2
import typings.activexExcel.activexExcelStrings.BeforeClose
import typings.activexExcel.activexExcelStrings.BeforeDoubleClick
import typings.activexExcel.activexExcelStrings.BeforePrint
import typings.activexExcel.activexExcelStrings.BeforeRefresh
import typings.activexExcel.activexExcelStrings.BeforeRightClick
import typings.activexExcel.activexExcelStrings.BeforeSave
import typings.activexExcel.activexExcelStrings.BeforeXmlExport
import typings.activexExcel.activexExcelStrings.BeforeXmlImport
import typings.activexExcel.activexExcelStrings.Button
import typings.activexExcel.activexExcelStrings.Calculate
import typings.activexExcel.activexExcelStrings.Cancel
import typings.activexExcel.activexExcelStrings.Ch
import typings.activexExcel.activexExcelStrings.Change
import typings.activexExcel.activexExcelStrings.Colors
import typings.activexExcel.activexExcelStrings.Deactivate
import typings.activexExcel.activexExcelStrings.Description
import typings.activexExcel.activexExcelStrings.DragOver
import typings.activexExcel.activexExcelStrings.DragPlot
import typings.activexExcel.activexExcelStrings.ElementID
import typings.activexExcel.activexExcelStrings.FollowHyperlink
import typings.activexExcel.activexExcelStrings.GetIDsOfNames
import typings.activexExcel.activexExcelStrings.GetTypeInfo
import typings.activexExcel.activexExcelStrings.GetTypeInfoCount
import typings.activexExcel.activexExcelStrings.GotFocus
import typings.activexExcel.activexExcelStrings.HasAxis
import typings.activexExcel.activexExcelStrings.Invoke
import typings.activexExcel.activexExcelStrings.IsRefresh
import typings.activexExcel.activexExcelStrings.List
import typings.activexExcel.activexExcelStrings.LostFocus
import typings.activexExcel.activexExcelStrings.Map
import typings.activexExcel.activexExcelStrings.MouseDown
import typings.activexExcel.activexExcelStrings.MouseMove
import typings.activexExcel.activexExcelStrings.MouseUp
import typings.activexExcel.activexExcelStrings.NewChart
import typings.activexExcel.activexExcelStrings.NewSheet
import typings.activexExcel.activexExcelStrings.NewWorkbook
import typings.activexExcel.activexExcelStrings.Open
import typings.activexExcel.activexExcelStrings.PivotTableAfterValueChange
import typings.activexExcel.activexExcelStrings.PivotTableBeforeAllocateChanges
import typings.activexExcel.activexExcelStrings.PivotTableBeforeCommitChanges
import typings.activexExcel.activexExcelStrings.PivotTableBeforeDiscardChanges
import typings.activexExcel.activexExcelStrings.PivotTableChangeSync
import typings.activexExcel.activexExcelStrings.PivotTableCloseConnection
import typings.activexExcel.activexExcelStrings.PivotTableOpenConnection
import typings.activexExcel.activexExcelStrings.PivotTableUpdate
import typings.activexExcel.activexExcelStrings.PointIndex
import typings.activexExcel.activexExcelStrings.PrintQuality
import typings.activexExcel.activexExcelStrings.ProtectedViewWindowActivate
import typings.activexExcel.activexExcelStrings.ProtectedViewWindowBeforeClose
import typings.activexExcel.activexExcelStrings.ProtectedViewWindowBeforeEdit
import typings.activexExcel.activexExcelStrings.ProtectedViewWindowDeactivate
import typings.activexExcel.activexExcelStrings.ProtectedViewWindowOpen
import typings.activexExcel.activexExcelStrings.ProtectedViewWindowResize
import typings.activexExcel.activexExcelStrings.Pvw
import typings.activexExcel.activexExcelStrings.QueryInterface
import typings.activexExcel.activexExcelStrings.Reason
import typings.activexExcel.activexExcelStrings.Release
import typings.activexExcel.activexExcelStrings.Resize
import typings.activexExcel.activexExcelStrings.Result
import typings.activexExcel.activexExcelStrings.RowsetComplete
import typings.activexExcel.activexExcelStrings.SaveAsUI
import typings.activexExcel.activexExcelStrings.Select
import typings.activexExcel.activexExcelStrings.SelectionChange
import typings.activexExcel.activexExcelStrings.SeriesChange
import typings.activexExcel.activexExcelStrings.SeriesIndex
import typings.activexExcel.activexExcelStrings.Sh
import typings.activexExcel.activexExcelStrings.Sheet
import typings.activexExcel.activexExcelStrings.SheetActivate
import typings.activexExcel.activexExcelStrings.SheetBeforeDoubleClick
import typings.activexExcel.activexExcelStrings.SheetBeforeRightClick
import typings.activexExcel.activexExcelStrings.SheetCalculate
import typings.activexExcel.activexExcelStrings.SheetChange
import typings.activexExcel.activexExcelStrings.SheetDeactivate
import typings.activexExcel.activexExcelStrings.SheetFollowHyperlink
import typings.activexExcel.activexExcelStrings.SheetPivotTableAfterValueChange
import typings.activexExcel.activexExcelStrings.SheetPivotTableBeforeAllocateChanges
import typings.activexExcel.activexExcelStrings.SheetPivotTableBeforeCommitChanges
import typings.activexExcel.activexExcelStrings.SheetPivotTableBeforeDiscardChanges
import typings.activexExcel.activexExcelStrings.SheetPivotTableChangeSync
import typings.activexExcel.activexExcelStrings.SheetPivotTableUpdate
import typings.activexExcel.activexExcelStrings.SheetSelectionChange
import typings.activexExcel.activexExcelStrings.Shift
import typings.activexExcel.activexExcelStrings.Subtotals
import typings.activexExcel.activexExcelStrings.Success
import typings.activexExcel.activexExcelStrings.Sync
import typings.activexExcel.activexExcelStrings.SyncEventType
import typings.activexExcel.activexExcelStrings.Target
import typings.activexExcel.activexExcelStrings.TargetPivotTable
import typings.activexExcel.activexExcelStrings.TargetRange
import typings.activexExcel.activexExcelStrings.Url
import typings.activexExcel.activexExcelStrings.Value
import typings.activexExcel.activexExcelStrings.ValueChangeEnd
import typings.activexExcel.activexExcelStrings.ValueChangeStart
import typings.activexExcel.activexExcelStrings.Wb
import typings.activexExcel.activexExcelStrings.WindowActivate
import typings.activexExcel.activexExcelStrings.WindowDeactivate
import typings.activexExcel.activexExcelStrings.WindowResize
import typings.activexExcel.activexExcelStrings.Wn
import typings.activexExcel.activexExcelStrings.WorkbookActivate
import typings.activexExcel.activexExcelStrings.WorkbookAddinInstall
import typings.activexExcel.activexExcelStrings.WorkbookAddinUninstall
import typings.activexExcel.activexExcelStrings.WorkbookAfterSave
import typings.activexExcel.activexExcelStrings.WorkbookAfterXmlExport
import typings.activexExcel.activexExcelStrings.WorkbookAfterXmlImport
import typings.activexExcel.activexExcelStrings.WorkbookBeforeClose
import typings.activexExcel.activexExcelStrings.WorkbookBeforePrint
import typings.activexExcel.activexExcelStrings.WorkbookBeforeSave
import typings.activexExcel.activexExcelStrings.WorkbookBeforeXmlExport
import typings.activexExcel.activexExcelStrings.WorkbookBeforeXmlImport
import typings.activexExcel.activexExcelStrings.WorkbookDeactivate
import typings.activexExcel.activexExcelStrings.WorkbookNewChart
import typings.activexExcel.activexExcelStrings.WorkbookNewSheet
import typings.activexExcel.activexExcelStrings.WorkbookOpen
import typings.activexExcel.activexExcelStrings.WorkbookPivotTableCloseConnection
import typings.activexExcel.activexExcelStrings.WorkbookPivotTableOpenConnection
import typings.activexExcel.activexExcelStrings.WorkbookRowsetComplete
import typings.activexExcel.activexExcelStrings.WorkbookSync
import typings.activexExcel.activexExcelStrings.cNames
import typings.activexExcel.activexExcelStrings.itinfo
import typings.activexExcel.activexExcelStrings.lcid
import typings.activexExcel.activexExcelStrings.pctinfo
import typings.activexExcel.activexExcelStrings.pptinfo
import typings.activexExcel.activexExcelStrings.ppvObj
import typings.activexExcel.activexExcelStrings.rgdispid
import typings.activexExcel.activexExcelStrings.rgszNames
import typings.activexExcel.activexExcelStrings.riid
import typings.activexExcel.activexExcelStrings.x
import typings.activexExcel.activexExcelStrings.y
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: Application,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonCNames, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonItinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: NewWorkbook,
    argNames: js.Array[Wb],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonWb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowActivate,
    argNames: js.Array[Pvw],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPvw, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeClose,
    argNames: js.Tuple3[Pvw, Reason, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonCancel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeEdit,
    argNames: js.Tuple2[Pvw, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonCancelPvw, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowDeactivate,
    argNames: js.Array[Pvw],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPvw, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowOpen,
    argNames: js.Array[Pvw],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPvw, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowResize,
    argNames: js.Array[Pvw],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPvw, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonPpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetActivate,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonSh, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetBeforeDoubleClick,
    argNames: js.Tuple3[Sh, Target, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonCancelSh, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetBeforeRightClick,
    argNames: js.Tuple3[Sh, Target, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonCancelSh, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetCalculate,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonSh, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetChange,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonShTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetDeactivate,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonSh, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetFollowHyperlink,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonShTargetHyperlink, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetPivotTableAfterValueChange,
    argNames: js.Tuple3[Sh, TargetPivotTable, TargetRange],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonShTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetPivotTableBeforeAllocateChanges,
    argNames: js.Tuple5[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonCancelShTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetPivotTableBeforeCommitChanges,
    argNames: js.Tuple5[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonCancelShTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetPivotTableBeforeDiscardChanges,
    argNames: js.Tuple4[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonShTargetPivotTableValueChangeEnd, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetPivotTableUpdate,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonShTargetPivotTableWorksheet, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetSelectionChange,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonShTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowActivate,
    argNames: js.Tuple2[Wb, Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonWbWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowDeactivate,
    argNames: js.Tuple2[Wb, Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonWbWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowResize,
    argNames: js.Tuple2[Wb, Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonWbWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookActivate,
    argNames: js.Array[Wb],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonWb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookAddinInstall,
    argNames: js.Array[Wb],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonWb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookAddinUninstall,
    argNames: js.Array[Wb],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonWb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookAfterSave,
    argNames: js.Tuple2[Wb, Success],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonSuccess, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookAfterXmlExport,
    argNames: js.Tuple4[Wb, Map, Url, Result],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonMap, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookAfterXmlImport,
    argNames: js.Tuple4[Wb, Map, IsRefresh, Result],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonIsRefresh, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookBeforeClose,
    argNames: js.Tuple2[Wb, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonCancelWb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookBeforePrint,
    argNames: js.Tuple2[Wb, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonCancelWb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookBeforeSave,
    argNames: js.Tuple3[Wb, SaveAsUI, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonCancelSaveAsUI, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookBeforeXmlExport,
    argNames: js.Tuple4[Wb, Map, Url, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonCancelMap, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookBeforeXmlImport,
    argNames: js.Tuple5[Wb, Map, Url, IsRefresh, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonCancelIsRefresh, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookDeactivate,
    argNames: js.Array[Wb],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonWb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookNewChart,
    argNames: js.Tuple2[Wb, Ch],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonCh, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookNewSheet,
    argNames: js.Tuple2[Wb, Sh],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonShWb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookOpen,
    argNames: js.Array[Wb],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonWb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookPivotTableCloseConnection,
    argNames: js.Tuple2[Wb, Target],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookPivotTableOpenConnection,
    argNames: js.Tuple2[Wb, Target],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookRowsetComplete,
    argNames: js.Tuple4[Wb, Description, Sheet, Success],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonDescription, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookSync,
    argNames: js.Tuple2[Wb, SyncEventType],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ AnonSyncEventType, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: BeforeDoubleClick,
    argNames: js.Tuple4[ElementID, Arg1, Arg2, Cancel],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ AnonArg1, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: BeforeRightClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ AnonCNames, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ AnonPctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ AnonItinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, x, y],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, x, y],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, x, y],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ AnonButton, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ AnonPpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: Select,
    argNames: js.Tuple3[ElementID, Arg1, Arg2],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ AnonArg1Arg2, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: SeriesChange,
    argNames: js.Tuple2[SeriesIndex, PointIndex],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ AnonPointIndex, Unit]
  ): Unit = js.native
  def on(
    obj: OLEObject,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ AnonCNames, Unit]
  ): Unit = js.native
  def on(
    obj: OLEObject,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ AnonPctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: OLEObject,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ AnonItinfo, Unit]
  ): Unit = js.native
  def on(
    obj: OLEObject,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ AnonPpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: AfterRefresh,
    argNames: js.Array[Success],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ AnonSuccessBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: BeforeRefresh,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ AnonCNames, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ AnonPctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ AnonItinfo, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ AnonPpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: AfterSave,
    argNames: js.Array[Success],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonSuccessBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: AfterXmlExport,
    argNames: js.Tuple3[Map, Url, Result],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonMapResult, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: AfterXmlImport,
    argNames: js.Tuple3[Map, IsRefresh, Result],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonIsRefreshMap, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: BeforeClose,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: BeforePrint,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonCancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: BeforeSave,
    argNames: js.Tuple2[SaveAsUI, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonCancelSaveAsUIBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: BeforeXmlExport,
    argNames: js.Tuple3[Map, Url, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonCancelMapUrl, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: BeforeXmlImport,
    argNames: js.Tuple4[Map, Url, IsRefresh, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonCancelIsRefreshMap, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonCNames, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonPctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonItinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: NewChart,
    argNames: js.Array[Ch],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonChChart, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: NewSheet,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonSh, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: PivotTableCloseConnection,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: PivotTableOpenConnection,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonPpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: RowsetComplete,
    argNames: js.Tuple3[Description, Sheet, Success],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonDescriptionSheet, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetActivate,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonSh, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetBeforeDoubleClick,
    argNames: js.Tuple3[Sh, Target, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonCancelSh, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetBeforeRightClick,
    argNames: js.Tuple3[Sh, Target, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonCancelSh, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetCalculate,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonSh, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetChange,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonShTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetDeactivate,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonSh, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetFollowHyperlink,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonShTargetHyperlink, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetPivotTableAfterValueChange,
    argNames: js.Tuple3[Sh, TargetPivotTable, TargetRange],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonShTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetPivotTableBeforeAllocateChanges,
    argNames: js.Tuple5[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonCancelShTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetPivotTableBeforeCommitChanges,
    argNames: js.Tuple5[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonCancelShTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetPivotTableBeforeDiscardChanges,
    argNames: js.Tuple4[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonShTargetPivotTableValueChangeEnd, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetPivotTableChangeSync,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonShTargetPivotTableWorksheet, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetPivotTableUpdate,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonShTargetPivotTableWorksheet, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetSelectionChange,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonShTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: Sync,
    argNames: js.Array[SyncEventType],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonSyncEventTypeMsoSyncEventType, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: WindowActivate,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonWn, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: WindowDeactivate,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonWn, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: WindowResize,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ AnonWn, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: BeforeDoubleClick,
    argNames: js.Tuple2[Target, Cancel],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ AnonCancelTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: BeforeRightClick,
    argNames: js.Tuple2[Target, Cancel],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ AnonCancelTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: Change,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ AnonTargetRange, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: FollowHyperlink,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ AnonTargetHyperlink, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ AnonCNames, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ AnonPctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ AnonItinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: PivotTableAfterValueChange,
    argNames: js.Tuple2[TargetPivotTable, TargetRange],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ AnonTargetPivotTableTargetRange, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: PivotTableBeforeAllocateChanges,
    argNames: js.Tuple4[TargetPivotTable, ValueChangeStart, ValueChangeEnd, Cancel],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ AnonCancelTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: PivotTableBeforeCommitChanges,
    argNames: js.Tuple4[TargetPivotTable, ValueChangeStart, ValueChangeEnd, Cancel],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ AnonCancelTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: PivotTableBeforeDiscardChanges,
    argNames: js.Tuple3[TargetPivotTable, ValueChangeStart, ValueChangeEnd],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ AnonTargetPivotTableValueChangeEnd, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: PivotTableChangeSync,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ AnonTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: PivotTableUpdate,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ AnonTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ AnonPpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: SelectionChange,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ AnonTargetRange, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Activate(
    obj: Chart,
    event: Activate,
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Activate(
    obj: Workbook,
    event: Activate,
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Activate(
    obj: Worksheet,
    event: Activate,
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: Application,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: Chart,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: OLEObject,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: QueryTable,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: Workbook,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: Worksheet,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddinInstall(
    obj: Workbook,
    event: AddinInstall,
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddinUninstall(
    obj: Workbook,
    event: AddinUninstall,
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AfterCalculate(
    obj: Application,
    event: AfterCalculate,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Calculate(
    obj: Chart,
    event: Calculate,
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Calculate(
    obj: Worksheet,
    event: Calculate,
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Deactivate(
    obj: Chart,
    event: Deactivate,
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Deactivate(
    obj: Workbook,
    event: Deactivate,
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Deactivate(
    obj: Worksheet,
    event: Deactivate,
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DragOver(
    obj: Chart,
    event: DragOver,
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_DragPlot(
    obj: Chart,
    event: DragPlot,
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: OLEObject,
    event: GotFocus,
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: Application,
    event: Invoke,
    argNames: ApplicationInvokeArgNames,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ ApplicationInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: Chart,
    event: Invoke,
    argNames: ChartInvokeArgNames,
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ ChartInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: OLEObject,
    event: Invoke,
    argNames: OLEObjectInvokeArgNames,
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ OLEObjectInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: QueryTable,
    event: Invoke,
    argNames: QueryTableInvokeArgNames,
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ QueryTableInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: Workbook,
    event: Invoke,
    argNames: WorkbookInvokeArgNames,
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ WorkbookInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: Worksheet,
    event: Invoke,
    argNames: WorksheetInvokeArgNames,
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ WorksheetInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: OLEObject,
    event: LostFocus,
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Open(
    obj: Workbook,
    event: Open,
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: Application,
    event: Release,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: Chart,
    event: Release,
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: OLEObject,
    event: Release,
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: QueryTable,
    event: Release,
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: Workbook,
    event: Release,
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: Worksheet,
    event: Release,
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Resize(
    obj: Chart,
    event: Resize,
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("set")
  def set_Colors(obj: Workbook, propertyName: Colors, parameterTypes: js.Array[Double], newValue: Double): Unit = js.native
  @JSName("set")
  def set_HasAxis(
    obj: Chart,
    propertyName: HasAxis,
    parameterTypes: js.Tuple2[js.UndefOr[XlAxisType], js.UndefOr[XlAxisGroup]],
    newValue: Boolean
  ): Unit = js.native
  @JSName("set")
  def set_List(obj: ControlFormat, propertyName: List, parameterTypes: js.Array[Double], newValue: String): Unit = js.native
  @JSName("set")
  def set_List(
    obj: ControlFormat,
    propertyName: List,
    parameterTypes: js.Array[scala.Nothing],
    newValue: SafeArray[String]
  ): Unit = js.native
  @JSName("set")
  def set_PrintQuality(obj: PageSetup, propertyName: PrintQuality, parameterTypes: js.Array[Double], newValue: Double): Unit = js.native
  @JSName("set")
  def set_Subtotals(
    obj: PivotField,
    propertyName: Subtotals,
    parameterTypes: js.Array[PivotFieldSubtotal],
    newValue: Boolean
  ): Unit = js.native
  @JSName("set")
  def set_Value(obj: Range, propertyName: Value, parameterTypes: js.Array[XlRangeValueDataType], newValue: js.Any): Unit = js.native
}

