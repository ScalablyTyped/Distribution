package typings.activexDashExcel

import typings.activexDashExcel.ExcelNs.Application
import typings.activexDashExcel.ExcelNs.Chart
import typings.activexDashExcel.ExcelNs.ControlFormat
import typings.activexDashExcel.ExcelNs.EventHelperTypesNs.Application_Invoke_ArgNames
import typings.activexDashExcel.ExcelNs.EventHelperTypesNs.Application_Invoke_Parameter
import typings.activexDashExcel.ExcelNs.EventHelperTypesNs.Chart_Invoke_ArgNames
import typings.activexDashExcel.ExcelNs.EventHelperTypesNs.Chart_Invoke_Parameter
import typings.activexDashExcel.ExcelNs.EventHelperTypesNs.OLEObject_Invoke_ArgNames
import typings.activexDashExcel.ExcelNs.EventHelperTypesNs.OLEObject_Invoke_Parameter
import typings.activexDashExcel.ExcelNs.EventHelperTypesNs.QueryTable_Invoke_ArgNames
import typings.activexDashExcel.ExcelNs.EventHelperTypesNs.QueryTable_Invoke_Parameter
import typings.activexDashExcel.ExcelNs.EventHelperTypesNs.Workbook_Invoke_ArgNames
import typings.activexDashExcel.ExcelNs.EventHelperTypesNs.Workbook_Invoke_Parameter
import typings.activexDashExcel.ExcelNs.EventHelperTypesNs.Worksheet_Invoke_ArgNames
import typings.activexDashExcel.ExcelNs.EventHelperTypesNs.Worksheet_Invoke_Parameter
import typings.activexDashExcel.ExcelNs.OLEObject
import typings.activexDashExcel.ExcelNs.PageSetup
import typings.activexDashExcel.ExcelNs.PivotField
import typings.activexDashExcel.ExcelNs.PivotFieldSubtotal
import typings.activexDashExcel.ExcelNs.QueryTable
import typings.activexDashExcel.ExcelNs.Range
import typings.activexDashExcel.ExcelNs.Workbook
import typings.activexDashExcel.ExcelNs.Worksheet
import typings.activexDashExcel.ExcelNs.XlAxisGroup
import typings.activexDashExcel.ExcelNs.XlAxisType
import typings.activexDashExcel.ExcelNs.XlRangeValueDataType
import typings.activexDashExcel.activexDashExcelStrings.Activate
import typings.activexDashExcel.activexDashExcelStrings.AddRef
import typings.activexDashExcel.activexDashExcelStrings.AddinInstall
import typings.activexDashExcel.activexDashExcelStrings.AddinUninstall
import typings.activexDashExcel.activexDashExcelStrings.AfterCalculate
import typings.activexDashExcel.activexDashExcelStrings.AfterRefresh
import typings.activexDashExcel.activexDashExcelStrings.AfterSave
import typings.activexDashExcel.activexDashExcelStrings.AfterXmlExport
import typings.activexDashExcel.activexDashExcelStrings.AfterXmlImport
import typings.activexDashExcel.activexDashExcelStrings.Arg1
import typings.activexDashExcel.activexDashExcelStrings.Arg2
import typings.activexDashExcel.activexDashExcelStrings.BeforeClose
import typings.activexDashExcel.activexDashExcelStrings.BeforeDoubleClick
import typings.activexDashExcel.activexDashExcelStrings.BeforePrint
import typings.activexDashExcel.activexDashExcelStrings.BeforeRefresh
import typings.activexDashExcel.activexDashExcelStrings.BeforeRightClick
import typings.activexDashExcel.activexDashExcelStrings.BeforeSave
import typings.activexDashExcel.activexDashExcelStrings.BeforeXmlExport
import typings.activexDashExcel.activexDashExcelStrings.BeforeXmlImport
import typings.activexDashExcel.activexDashExcelStrings.Button
import typings.activexDashExcel.activexDashExcelStrings.Calculate
import typings.activexDashExcel.activexDashExcelStrings.Cancel
import typings.activexDashExcel.activexDashExcelStrings.Ch
import typings.activexDashExcel.activexDashExcelStrings.Change
import typings.activexDashExcel.activexDashExcelStrings.Colors
import typings.activexDashExcel.activexDashExcelStrings.Deactivate
import typings.activexDashExcel.activexDashExcelStrings.Description
import typings.activexDashExcel.activexDashExcelStrings.DragOver
import typings.activexDashExcel.activexDashExcelStrings.DragPlot
import typings.activexDashExcel.activexDashExcelStrings.ElementID
import typings.activexDashExcel.activexDashExcelStrings.FollowHyperlink
import typings.activexDashExcel.activexDashExcelStrings.GetIDsOfNames
import typings.activexDashExcel.activexDashExcelStrings.GetTypeInfo
import typings.activexDashExcel.activexDashExcelStrings.GetTypeInfoCount
import typings.activexDashExcel.activexDashExcelStrings.GotFocus
import typings.activexDashExcel.activexDashExcelStrings.HasAxis
import typings.activexDashExcel.activexDashExcelStrings.Invoke
import typings.activexDashExcel.activexDashExcelStrings.IsRefresh
import typings.activexDashExcel.activexDashExcelStrings.List
import typings.activexDashExcel.activexDashExcelStrings.LostFocus
import typings.activexDashExcel.activexDashExcelStrings.Map
import typings.activexDashExcel.activexDashExcelStrings.MouseDown
import typings.activexDashExcel.activexDashExcelStrings.MouseMove
import typings.activexDashExcel.activexDashExcelStrings.MouseUp
import typings.activexDashExcel.activexDashExcelStrings.NewChart
import typings.activexDashExcel.activexDashExcelStrings.NewSheet
import typings.activexDashExcel.activexDashExcelStrings.NewWorkbook
import typings.activexDashExcel.activexDashExcelStrings.Open
import typings.activexDashExcel.activexDashExcelStrings.PivotTableAfterValueChange
import typings.activexDashExcel.activexDashExcelStrings.PivotTableBeforeAllocateChanges
import typings.activexDashExcel.activexDashExcelStrings.PivotTableBeforeCommitChanges
import typings.activexDashExcel.activexDashExcelStrings.PivotTableBeforeDiscardChanges
import typings.activexDashExcel.activexDashExcelStrings.PivotTableChangeSync
import typings.activexDashExcel.activexDashExcelStrings.PivotTableCloseConnection
import typings.activexDashExcel.activexDashExcelStrings.PivotTableOpenConnection
import typings.activexDashExcel.activexDashExcelStrings.PivotTableUpdate
import typings.activexDashExcel.activexDashExcelStrings.PointIndex
import typings.activexDashExcel.activexDashExcelStrings.PrintQuality
import typings.activexDashExcel.activexDashExcelStrings.ProtectedViewWindowActivate
import typings.activexDashExcel.activexDashExcelStrings.ProtectedViewWindowBeforeClose
import typings.activexDashExcel.activexDashExcelStrings.ProtectedViewWindowBeforeEdit
import typings.activexDashExcel.activexDashExcelStrings.ProtectedViewWindowDeactivate
import typings.activexDashExcel.activexDashExcelStrings.ProtectedViewWindowOpen
import typings.activexDashExcel.activexDashExcelStrings.ProtectedViewWindowResize
import typings.activexDashExcel.activexDashExcelStrings.Pvw
import typings.activexDashExcel.activexDashExcelStrings.QueryInterface
import typings.activexDashExcel.activexDashExcelStrings.Reason
import typings.activexDashExcel.activexDashExcelStrings.Release
import typings.activexDashExcel.activexDashExcelStrings.Resize
import typings.activexDashExcel.activexDashExcelStrings.Result
import typings.activexDashExcel.activexDashExcelStrings.RowsetComplete
import typings.activexDashExcel.activexDashExcelStrings.SaveAsUI
import typings.activexDashExcel.activexDashExcelStrings.Select
import typings.activexDashExcel.activexDashExcelStrings.SelectionChange
import typings.activexDashExcel.activexDashExcelStrings.SeriesChange
import typings.activexDashExcel.activexDashExcelStrings.SeriesIndex
import typings.activexDashExcel.activexDashExcelStrings.Sh
import typings.activexDashExcel.activexDashExcelStrings.Sheet
import typings.activexDashExcel.activexDashExcelStrings.SheetActivate
import typings.activexDashExcel.activexDashExcelStrings.SheetBeforeDoubleClick
import typings.activexDashExcel.activexDashExcelStrings.SheetBeforeRightClick
import typings.activexDashExcel.activexDashExcelStrings.SheetCalculate
import typings.activexDashExcel.activexDashExcelStrings.SheetChange
import typings.activexDashExcel.activexDashExcelStrings.SheetDeactivate
import typings.activexDashExcel.activexDashExcelStrings.SheetFollowHyperlink
import typings.activexDashExcel.activexDashExcelStrings.SheetPivotTableAfterValueChange
import typings.activexDashExcel.activexDashExcelStrings.SheetPivotTableBeforeAllocateChanges
import typings.activexDashExcel.activexDashExcelStrings.SheetPivotTableBeforeCommitChanges
import typings.activexDashExcel.activexDashExcelStrings.SheetPivotTableBeforeDiscardChanges
import typings.activexDashExcel.activexDashExcelStrings.SheetPivotTableChangeSync
import typings.activexDashExcel.activexDashExcelStrings.SheetPivotTableUpdate
import typings.activexDashExcel.activexDashExcelStrings.SheetSelectionChange
import typings.activexDashExcel.activexDashExcelStrings.Shift
import typings.activexDashExcel.activexDashExcelStrings.Subtotals
import typings.activexDashExcel.activexDashExcelStrings.Success
import typings.activexDashExcel.activexDashExcelStrings.Sync
import typings.activexDashExcel.activexDashExcelStrings.SyncEventType
import typings.activexDashExcel.activexDashExcelStrings.Target
import typings.activexDashExcel.activexDashExcelStrings.TargetPivotTable
import typings.activexDashExcel.activexDashExcelStrings.TargetRange
import typings.activexDashExcel.activexDashExcelStrings.Url
import typings.activexDashExcel.activexDashExcelStrings.Value
import typings.activexDashExcel.activexDashExcelStrings.ValueChangeEnd
import typings.activexDashExcel.activexDashExcelStrings.ValueChangeStart
import typings.activexDashExcel.activexDashExcelStrings.Wb
import typings.activexDashExcel.activexDashExcelStrings.WindowActivate
import typings.activexDashExcel.activexDashExcelStrings.WindowDeactivate
import typings.activexDashExcel.activexDashExcelStrings.WindowResize
import typings.activexDashExcel.activexDashExcelStrings.Wn
import typings.activexDashExcel.activexDashExcelStrings.WorkbookActivate
import typings.activexDashExcel.activexDashExcelStrings.WorkbookAddinInstall
import typings.activexDashExcel.activexDashExcelStrings.WorkbookAddinUninstall
import typings.activexDashExcel.activexDashExcelStrings.WorkbookAfterSave
import typings.activexDashExcel.activexDashExcelStrings.WorkbookAfterXmlExport
import typings.activexDashExcel.activexDashExcelStrings.WorkbookAfterXmlImport
import typings.activexDashExcel.activexDashExcelStrings.WorkbookBeforeClose
import typings.activexDashExcel.activexDashExcelStrings.WorkbookBeforePrint
import typings.activexDashExcel.activexDashExcelStrings.WorkbookBeforeSave
import typings.activexDashExcel.activexDashExcelStrings.WorkbookBeforeXmlExport
import typings.activexDashExcel.activexDashExcelStrings.WorkbookBeforeXmlImport
import typings.activexDashExcel.activexDashExcelStrings.WorkbookDeactivate
import typings.activexDashExcel.activexDashExcelStrings.WorkbookNewChart
import typings.activexDashExcel.activexDashExcelStrings.WorkbookNewSheet
import typings.activexDashExcel.activexDashExcelStrings.WorkbookOpen
import typings.activexDashExcel.activexDashExcelStrings.WorkbookPivotTableCloseConnection
import typings.activexDashExcel.activexDashExcelStrings.WorkbookPivotTableOpenConnection
import typings.activexDashExcel.activexDashExcelStrings.WorkbookRowsetComplete
import typings.activexDashExcel.activexDashExcelStrings.WorkbookSync
import typings.activexDashExcel.activexDashExcelStrings.cNames
import typings.activexDashExcel.activexDashExcelStrings.itinfo
import typings.activexDashExcel.activexDashExcelStrings.lcid
import typings.activexDashExcel.activexDashExcelStrings.pctinfo
import typings.activexDashExcel.activexDashExcelStrings.pptinfo
import typings.activexDashExcel.activexDashExcelStrings.ppvObj
import typings.activexDashExcel.activexDashExcelStrings.rgdispid
import typings.activexDashExcel.activexDashExcelStrings.rgszNames
import typings.activexDashExcel.activexDashExcelStrings.riid
import typings.activexDashExcel.activexDashExcelStrings.x
import typings.activexDashExcel.activexDashExcelStrings.y
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
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CNames, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: NewWorkbook,
    argNames: js.Array[Wb],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Wb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowActivate,
    argNames: js.Array[Pvw],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Pvw, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeClose,
    argNames: js.Tuple3[Pvw, Reason, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Cancel, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeEdit,
    argNames: js.Tuple2[Pvw, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelPvw, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowDeactivate,
    argNames: js.Array[Pvw],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Pvw, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowOpen,
    argNames: js.Array[Pvw],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Pvw, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowResize,
    argNames: js.Array[Pvw],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Pvw, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetActivate,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Sh, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetBeforeDoubleClick,
    argNames: js.Tuple3[Sh, Target, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelSh, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetBeforeRightClick,
    argNames: js.Tuple3[Sh, Target, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelSh, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetCalculate,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Sh, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetChange,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_ShTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetDeactivate,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Sh, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetFollowHyperlink,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_ShTargetHyperlink, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetPivotTableAfterValueChange,
    argNames: js.Tuple3[Sh, TargetPivotTable, TargetRange],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_ShTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetPivotTableBeforeAllocateChanges,
    argNames: js.Tuple5[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelShTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetPivotTableBeforeCommitChanges,
    argNames: js.Tuple5[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelShTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetPivotTableBeforeDiscardChanges,
    argNames: js.Tuple4[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_ShTargetPivotTableValueChangeEnd, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetPivotTableUpdate,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_ShTargetPivotTableWorksheet, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: SheetSelectionChange,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_ShTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowActivate,
    argNames: js.Tuple2[Wb, Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_WbWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowDeactivate,
    argNames: js.Tuple2[Wb, Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_WbWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowResize,
    argNames: js.Tuple2[Wb, Wn],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_WbWn, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookActivate,
    argNames: js.Array[Wb],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Wb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookAddinInstall,
    argNames: js.Array[Wb],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Wb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookAddinUninstall,
    argNames: js.Array[Wb],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Wb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookAfterSave,
    argNames: js.Tuple2[Wb, Success],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Success, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookAfterXmlExport,
    argNames: js.Tuple4[Wb, Map, Url, Result],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Map, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookAfterXmlImport,
    argNames: js.Tuple4[Wb, Map, IsRefresh, Result],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_IsRefresh, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookBeforeClose,
    argNames: js.Tuple2[Wb, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelWb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookBeforePrint,
    argNames: js.Tuple2[Wb, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelWb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookBeforeSave,
    argNames: js.Tuple3[Wb, SaveAsUI, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelSaveAsUI, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookBeforeXmlExport,
    argNames: js.Tuple4[Wb, Map, Url, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelMap, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookBeforeXmlImport,
    argNames: js.Tuple5[Wb, Map, Url, IsRefresh, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_CancelIsRefresh, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookDeactivate,
    argNames: js.Array[Wb],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Wb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookNewChart,
    argNames: js.Tuple2[Wb, Ch],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Ch, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookNewSheet,
    argNames: js.Tuple2[Wb, Sh],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_ShWb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookOpen,
    argNames: js.Array[Wb],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Wb, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookPivotTableCloseConnection,
    argNames: js.Tuple2[Wb, Target],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Target, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookPivotTableOpenConnection,
    argNames: js.Tuple2[Wb, Target],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Target, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookRowsetComplete,
    argNames: js.Tuple4[Wb, Description, Sheet, Success],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_Description, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WorkbookSync,
    argNames: js.Tuple2[Wb, SyncEventType],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Anon_SyncEventType, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: BeforeDoubleClick,
    argNames: js.Tuple4[ElementID, Arg1, Arg2, Cancel],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ Anon_Arg1, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: BeforeRightClick,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ Anon_CNames, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ Anon_Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ Anon_Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: MouseDown,
    argNames: js.Tuple4[Button, Shift, x, y],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: MouseMove,
    argNames: js.Tuple4[Button, Shift, x, y],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: MouseUp,
    argNames: js.Tuple4[Button, Shift, x, y],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ Anon_Button, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ Anon_PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: Select,
    argNames: js.Tuple3[ElementID, Arg1, Arg2],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ Anon_Arg1Arg2, Unit]
  ): Unit = js.native
  def on(
    obj: Chart,
    event: SeriesChange,
    argNames: js.Tuple2[SeriesIndex, PointIndex],
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ Anon_PointIndex, Unit]
  ): Unit = js.native
  def on(
    obj: OLEObject,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ Anon_CNames, Unit]
  ): Unit = js.native
  def on(
    obj: OLEObject,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ Anon_Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: OLEObject,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ Anon_Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: OLEObject,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ Anon_PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: AfterRefresh,
    argNames: js.Array[Success],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ Anon_SuccessBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: BeforeRefresh,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ Anon_CNames, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ Anon_Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ Anon_Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: QueryTable,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ Anon_PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: AfterSave,
    argNames: js.Array[Success],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_SuccessBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: AfterXmlExport,
    argNames: js.Tuple3[Map, Url, Result],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_MapResult, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: AfterXmlImport,
    argNames: js.Tuple3[Map, IsRefresh, Result],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_IsRefreshMap, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: BeforeClose,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: BeforePrint,
    argNames: js.Array[Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_CancelBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: BeforeSave,
    argNames: js.Tuple2[SaveAsUI, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_CancelSaveAsUIBoolean, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: BeforeXmlExport,
    argNames: js.Tuple3[Map, Url, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_CancelMapUrl, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: BeforeXmlImport,
    argNames: js.Tuple4[Map, Url, IsRefresh, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_CancelIsRefreshMap, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_CNames, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: NewChart,
    argNames: js.Array[Ch],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_ChChart, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: NewSheet,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_Sh, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: PivotTableCloseConnection,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_TargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: PivotTableOpenConnection,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_TargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: RowsetComplete,
    argNames: js.Tuple3[Description, Sheet, Success],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_DescriptionSheet, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetActivate,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_Sh, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetBeforeDoubleClick,
    argNames: js.Tuple3[Sh, Target, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_CancelSh, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetBeforeRightClick,
    argNames: js.Tuple3[Sh, Target, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_CancelSh, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetCalculate,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_Sh, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetChange,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_ShTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetDeactivate,
    argNames: js.Array[Sh],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_Sh, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetFollowHyperlink,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_ShTargetHyperlink, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetPivotTableAfterValueChange,
    argNames: js.Tuple3[Sh, TargetPivotTable, TargetRange],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_ShTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetPivotTableBeforeAllocateChanges,
    argNames: js.Tuple5[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_CancelShTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetPivotTableBeforeCommitChanges,
    argNames: js.Tuple5[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd, Cancel],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_CancelShTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetPivotTableBeforeDiscardChanges,
    argNames: js.Tuple4[Sh, TargetPivotTable, ValueChangeStart, ValueChangeEnd],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_ShTargetPivotTableValueChangeEnd, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetPivotTableChangeSync,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_ShTargetPivotTableWorksheet, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetPivotTableUpdate,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_ShTargetPivotTableWorksheet, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: SheetSelectionChange,
    argNames: js.Tuple2[Sh, Target],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_ShTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: Sync,
    argNames: js.Array[SyncEventType],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_SyncEventTypeMsoSyncEventType, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: WindowActivate,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_Wn, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: WindowDeactivate,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_Wn, Unit]
  ): Unit = js.native
  def on(
    obj: Workbook,
    event: WindowResize,
    argNames: js.Array[Wn],
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Anon_Wn, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: BeforeDoubleClick,
    argNames: js.Tuple2[Target, Cancel],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Anon_CancelTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: BeforeRightClick,
    argNames: js.Tuple2[Target, Cancel],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Anon_CancelTarget, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: Change,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Anon_TargetRange, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: FollowHyperlink,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Anon_TargetHyperlink, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Anon_CNames, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Anon_Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Anon_Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: PivotTableAfterValueChange,
    argNames: js.Tuple2[TargetPivotTable, TargetRange],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Anon_TargetPivotTableTargetRange, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: PivotTableBeforeAllocateChanges,
    argNames: js.Tuple4[TargetPivotTable, ValueChangeStart, ValueChangeEnd, Cancel],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Anon_CancelTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: PivotTableBeforeCommitChanges,
    argNames: js.Tuple4[TargetPivotTable, ValueChangeStart, ValueChangeEnd, Cancel],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Anon_CancelTargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: PivotTableBeforeDiscardChanges,
    argNames: js.Tuple3[TargetPivotTable, ValueChangeStart, ValueChangeEnd],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Anon_TargetPivotTableValueChangeEnd, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: PivotTableChangeSync,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Anon_TargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: PivotTableUpdate,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Anon_TargetPivotTable, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Anon_PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: Worksheet,
    event: SelectionChange,
    argNames: js.Array[Target],
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Anon_TargetRange, Unit]
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
    argNames: Application_Invoke_ArgNames,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Application_Invoke_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: Chart,
    event: Invoke,
    argNames: Chart_Invoke_ArgNames,
    handler: js.ThisFunction1[/* this */ Chart, /* parameter */ Chart_Invoke_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: OLEObject,
    event: Invoke,
    argNames: OLEObject_Invoke_ArgNames,
    handler: js.ThisFunction1[/* this */ OLEObject, /* parameter */ OLEObject_Invoke_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: QueryTable,
    event: Invoke,
    argNames: QueryTable_Invoke_ArgNames,
    handler: js.ThisFunction1[/* this */ QueryTable, /* parameter */ QueryTable_Invoke_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: Workbook,
    event: Invoke,
    argNames: Workbook_Invoke_ArgNames,
    handler: js.ThisFunction1[/* this */ Workbook, /* parameter */ Workbook_Invoke_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: Worksheet,
    event: Invoke,
    argNames: Worksheet_Invoke_ArgNames,
    handler: js.ThisFunction1[/* this */ Worksheet, /* parameter */ Worksheet_Invoke_Parameter, Unit]
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

