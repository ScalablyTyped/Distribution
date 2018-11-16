package typings
package activexDashExcelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.GetIDsOfNames,
    argNames: js.Tuple5[
      activexDashExcelLib.activexDashExcelLibStrings.riid, 
      activexDashExcelLib.activexDashExcelLibStrings.rgszNames, 
      activexDashExcelLib.activexDashExcelLibStrings.cNames, 
      activexDashExcelLib.activexDashExcelLibStrings.lcid, 
      activexDashExcelLib.activexDashExcelLibStrings.rgdispid
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_Rgdispid, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.GetTypeInfoCount,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.pctinfo],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_Pctinfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.GetTypeInfo,
    argNames: js.Tuple3[
      activexDashExcelLib.activexDashExcelLibStrings.itinfo, 
      activexDashExcelLib.activexDashExcelLibStrings.lcid, 
      activexDashExcelLib.activexDashExcelLibStrings.pptinfo
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_Lcid, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.NewWorkbook,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Wb],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_Wb, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.ProtectedViewWindowActivate,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Pvw],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_Pvw, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.ProtectedViewWindowBeforeClose,
    argNames: js.Tuple3[
      activexDashExcelLib.activexDashExcelLibStrings.Pvw, 
      activexDashExcelLib.activexDashExcelLibStrings.Reason, 
      activexDashExcelLib.activexDashExcelLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.ProtectedViewWindowBeforeEdit,
    argNames: js.Tuple2[
      activexDashExcelLib.activexDashExcelLibStrings.Pvw, 
      activexDashExcelLib.activexDashExcelLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_CancelPvw, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.ProtectedViewWindowDeactivate,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Pvw],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_Pvw, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.ProtectedViewWindowOpen,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Pvw],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_Pvw, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.ProtectedViewWindowResize,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Pvw],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_Pvw, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.QueryInterface,
    argNames: js.Tuple2[
      activexDashExcelLib.activexDashExcelLibStrings.riid, 
      activexDashExcelLib.activexDashExcelLibStrings.ppvObj
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_PpvObj, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.SheetActivate,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Sh],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_Sh, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.SheetBeforeDoubleClick,
    argNames: js.Tuple3[
      activexDashExcelLib.activexDashExcelLibStrings.Sh, 
      activexDashExcelLib.activexDashExcelLibStrings.Target, 
      activexDashExcelLib.activexDashExcelLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_CancelTarget, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.SheetBeforeRightClick,
    argNames: js.Tuple3[
      activexDashExcelLib.activexDashExcelLibStrings.Sh, 
      activexDashExcelLib.activexDashExcelLibStrings.Target, 
      activexDashExcelLib.activexDashExcelLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_CancelTarget, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.SheetCalculate,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Sh],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_Sh, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.SheetChange,
    argNames: js.Tuple2[
      activexDashExcelLib.activexDashExcelLibStrings.Sh, 
      activexDashExcelLib.activexDashExcelLibStrings.Target
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_Target, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.SheetDeactivate,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Sh],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_Sh, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.SheetFollowHyperlink,
    argNames: js.Tuple2[
      activexDashExcelLib.activexDashExcelLibStrings.Sh, 
      activexDashExcelLib.activexDashExcelLibStrings.Target
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_TargetSh, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.SheetPivotTableAfterValueChange,
    argNames: js.Tuple3[
      activexDashExcelLib.activexDashExcelLibStrings.Sh, 
      activexDashExcelLib.activexDashExcelLibStrings.TargetPivotTable, 
      activexDashExcelLib.activexDashExcelLibStrings.TargetRange
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_TargetRange, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.SheetPivotTableBeforeAllocateChanges,
    argNames: js.Tuple5[
      activexDashExcelLib.activexDashExcelLibStrings.Sh, 
      activexDashExcelLib.activexDashExcelLibStrings.TargetPivotTable, 
      activexDashExcelLib.activexDashExcelLibStrings.ValueChangeStart, 
      activexDashExcelLib.activexDashExcelLibStrings.ValueChangeEnd, 
      activexDashExcelLib.activexDashExcelLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_ValueChangeEnd, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.SheetPivotTableBeforeCommitChanges,
    argNames: js.Tuple5[
      activexDashExcelLib.activexDashExcelLibStrings.Sh, 
      activexDashExcelLib.activexDashExcelLibStrings.TargetPivotTable, 
      activexDashExcelLib.activexDashExcelLibStrings.ValueChangeStart, 
      activexDashExcelLib.activexDashExcelLibStrings.ValueChangeEnd, 
      activexDashExcelLib.activexDashExcelLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_ValueChangeEnd, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.SheetPivotTableBeforeDiscardChanges,
    argNames: js.Tuple4[
      activexDashExcelLib.activexDashExcelLibStrings.Sh, 
      activexDashExcelLib.activexDashExcelLibStrings.TargetPivotTable, 
      activexDashExcelLib.activexDashExcelLibStrings.ValueChangeStart, 
      activexDashExcelLib.activexDashExcelLibStrings.ValueChangeEnd
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_ShValueChangeStart, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.SheetPivotTableUpdate,
    argNames: js.Tuple2[
      activexDashExcelLib.activexDashExcelLibStrings.Sh, 
      activexDashExcelLib.activexDashExcelLibStrings.Target
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_TargetShPivotTable, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.SheetSelectionChange,
    argNames: js.Tuple2[
      activexDashExcelLib.activexDashExcelLibStrings.Sh, 
      activexDashExcelLib.activexDashExcelLibStrings.Target
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_Target, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.WindowActivate,
    argNames: js.Tuple2[
      activexDashExcelLib.activexDashExcelLibStrings.Wb, 
      activexDashExcelLib.activexDashExcelLibStrings.Wn
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_WbWn, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.WindowDeactivate,
    argNames: js.Tuple2[
      activexDashExcelLib.activexDashExcelLibStrings.Wb, 
      activexDashExcelLib.activexDashExcelLibStrings.Wn
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_WbWn, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.WindowResize,
    argNames: js.Tuple2[
      activexDashExcelLib.activexDashExcelLibStrings.Wb, 
      activexDashExcelLib.activexDashExcelLibStrings.Wn
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_WbWn, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.WorkbookActivate,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Wb],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_Wb, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.WorkbookAddinInstall,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Wb],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_Wb, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.WorkbookAddinUninstall,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Wb],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_Wb, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.WorkbookAfterSave,
    argNames: js.Tuple2[
      activexDashExcelLib.activexDashExcelLibStrings.Wb, 
      activexDashExcelLib.activexDashExcelLibStrings.Success
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_WbSuccess, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.WorkbookAfterXmlExport,
    argNames: js.Tuple4[
      activexDashExcelLib.activexDashExcelLibStrings.Wb, 
      activexDashExcelLib.activexDashExcelLibStrings.Map, 
      activexDashExcelLib.activexDashExcelLibStrings.Url, 
      activexDashExcelLib.activexDashExcelLibStrings.Result
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_WbUrl, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.WorkbookAfterXmlImport,
    argNames: js.Tuple4[
      activexDashExcelLib.activexDashExcelLibStrings.Wb, 
      activexDashExcelLib.activexDashExcelLibStrings.Map, 
      activexDashExcelLib.activexDashExcelLibStrings.IsRefresh, 
      activexDashExcelLib.activexDashExcelLibStrings.Result
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_WbResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.WorkbookBeforeClose,
    argNames: js.Tuple2[
      activexDashExcelLib.activexDashExcelLibStrings.Wb, 
      activexDashExcelLib.activexDashExcelLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_WbCancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.WorkbookBeforePrint,
    argNames: js.Tuple2[
      activexDashExcelLib.activexDashExcelLibStrings.Wb, 
      activexDashExcelLib.activexDashExcelLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_WbCancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.WorkbookBeforeSave,
    argNames: js.Tuple3[
      activexDashExcelLib.activexDashExcelLibStrings.Wb, 
      activexDashExcelLib.activexDashExcelLibStrings.SaveAsUI, 
      activexDashExcelLib.activexDashExcelLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_SaveAsUI, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.WorkbookBeforeXmlExport,
    argNames: js.Tuple4[
      activexDashExcelLib.activexDashExcelLibStrings.Wb, 
      activexDashExcelLib.activexDashExcelLibStrings.Map, 
      activexDashExcelLib.activexDashExcelLibStrings.Url, 
      activexDashExcelLib.activexDashExcelLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_WbUrlCancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.WorkbookBeforeXmlImport,
    argNames: js.Tuple5[
      activexDashExcelLib.activexDashExcelLibStrings.Wb, 
      activexDashExcelLib.activexDashExcelLibStrings.Map, 
      activexDashExcelLib.activexDashExcelLibStrings.Url, 
      activexDashExcelLib.activexDashExcelLibStrings.IsRefresh, 
      activexDashExcelLib.activexDashExcelLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_Map, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.WorkbookDeactivate,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Wb],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_Wb, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.WorkbookNewChart,
    argNames: js.Tuple2[
      activexDashExcelLib.activexDashExcelLibStrings.Wb, 
      activexDashExcelLib.activexDashExcelLibStrings.Ch
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_WbCh, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.WorkbookNewSheet,
    argNames: js.Tuple2[
      activexDashExcelLib.activexDashExcelLibStrings.Wb, 
      activexDashExcelLib.activexDashExcelLibStrings.Sh
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_WbSh, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.WorkbookOpen,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Wb],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_Wb, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.WorkbookPivotTableCloseConnection,
    argNames: js.Tuple2[
      activexDashExcelLib.activexDashExcelLibStrings.Wb, 
      activexDashExcelLib.activexDashExcelLibStrings.Target
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_WbTarget, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.WorkbookPivotTableOpenConnection,
    argNames: js.Tuple2[
      activexDashExcelLib.activexDashExcelLibStrings.Wb, 
      activexDashExcelLib.activexDashExcelLibStrings.Target
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_WbTarget, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.WorkbookRowsetComplete,
    argNames: js.Tuple4[
      activexDashExcelLib.activexDashExcelLibStrings.Wb, 
      activexDashExcelLib.activexDashExcelLibStrings.Description, 
      activexDashExcelLib.activexDashExcelLibStrings.Sheet, 
      activexDashExcelLib.activexDashExcelLibStrings.Success
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_Sheet, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.WorkbookSync,
    argNames: js.Tuple2[
      activexDashExcelLib.activexDashExcelLibStrings.Wb, 
      activexDashExcelLib.activexDashExcelLibStrings.SyncEventType
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ Anon_WbSyncEventType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Chart,
    event: activexDashExcelLib.activexDashExcelLibStrings.BeforeDoubleClick,
    argNames: js.Tuple4[
      activexDashExcelLib.activexDashExcelLibStrings.ElementID, 
      activexDashExcelLib.activexDashExcelLibStrings.Arg1, 
      activexDashExcelLib.activexDashExcelLibStrings.Arg2, 
      activexDashExcelLib.activexDashExcelLibStrings.Cancel
    ],
    handler: js.ThisFunction1[/* this */ activexDashExcelLib.ExcelNs.Chart, /* parameter */ Anon_Arg1, scala.Unit]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Chart,
    event: activexDashExcelLib.activexDashExcelLibStrings.BeforeRightClick,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Chart, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Chart,
    event: activexDashExcelLib.activexDashExcelLibStrings.GetIDsOfNames,
    argNames: js.Tuple5[
      activexDashExcelLib.activexDashExcelLibStrings.riid, 
      activexDashExcelLib.activexDashExcelLibStrings.rgszNames, 
      activexDashExcelLib.activexDashExcelLibStrings.cNames, 
      activexDashExcelLib.activexDashExcelLibStrings.lcid, 
      activexDashExcelLib.activexDashExcelLibStrings.rgdispid
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Chart, 
      /* parameter */ Anon_Rgdispid, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Chart,
    event: activexDashExcelLib.activexDashExcelLibStrings.GetTypeInfoCount,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.pctinfo],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Chart, 
      /* parameter */ Anon_Pctinfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Chart,
    event: activexDashExcelLib.activexDashExcelLibStrings.GetTypeInfo,
    argNames: js.Tuple3[
      activexDashExcelLib.activexDashExcelLibStrings.itinfo, 
      activexDashExcelLib.activexDashExcelLibStrings.lcid, 
      activexDashExcelLib.activexDashExcelLibStrings.pptinfo
    ],
    handler: js.ThisFunction1[/* this */ activexDashExcelLib.ExcelNs.Chart, /* parameter */ Anon_Lcid, scala.Unit]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Chart,
    event: activexDashExcelLib.activexDashExcelLibStrings.MouseDown,
    argNames: js.Tuple4[
      activexDashExcelLib.activexDashExcelLibStrings.Button, 
      activexDashExcelLib.activexDashExcelLibStrings.Shift, 
      activexDashExcelLib.activexDashExcelLibStrings.x, 
      activexDashExcelLib.activexDashExcelLibStrings.y
    ],
    handler: js.ThisFunction1[/* this */ activexDashExcelLib.ExcelNs.Chart, /* parameter */ Anon_Shift, scala.Unit]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Chart,
    event: activexDashExcelLib.activexDashExcelLibStrings.MouseMove,
    argNames: js.Tuple4[
      activexDashExcelLib.activexDashExcelLibStrings.Button, 
      activexDashExcelLib.activexDashExcelLibStrings.Shift, 
      activexDashExcelLib.activexDashExcelLibStrings.x, 
      activexDashExcelLib.activexDashExcelLibStrings.y
    ],
    handler: js.ThisFunction1[/* this */ activexDashExcelLib.ExcelNs.Chart, /* parameter */ Anon_Shift, scala.Unit]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Chart,
    event: activexDashExcelLib.activexDashExcelLibStrings.MouseUp,
    argNames: js.Tuple4[
      activexDashExcelLib.activexDashExcelLibStrings.Button, 
      activexDashExcelLib.activexDashExcelLibStrings.Shift, 
      activexDashExcelLib.activexDashExcelLibStrings.x, 
      activexDashExcelLib.activexDashExcelLibStrings.y
    ],
    handler: js.ThisFunction1[/* this */ activexDashExcelLib.ExcelNs.Chart, /* parameter */ Anon_Shift, scala.Unit]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Chart,
    event: activexDashExcelLib.activexDashExcelLibStrings.QueryInterface,
    argNames: js.Tuple2[
      activexDashExcelLib.activexDashExcelLibStrings.riid, 
      activexDashExcelLib.activexDashExcelLibStrings.ppvObj
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Chart, 
      /* parameter */ Anon_PpvObj, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Chart,
    event: activexDashExcelLib.activexDashExcelLibStrings.Select,
    argNames: js.Tuple3[
      activexDashExcelLib.activexDashExcelLibStrings.ElementID, 
      activexDashExcelLib.activexDashExcelLibStrings.Arg1, 
      activexDashExcelLib.activexDashExcelLibStrings.Arg2
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Chart, 
      /* parameter */ Anon_Arg1ElementID, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Chart,
    event: activexDashExcelLib.activexDashExcelLibStrings.SeriesChange,
    argNames: js.Tuple2[
      activexDashExcelLib.activexDashExcelLibStrings.SeriesIndex, 
      activexDashExcelLib.activexDashExcelLibStrings.PointIndex
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Chart, 
      /* parameter */ Anon_PointIndex, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.OLEObject,
    event: activexDashExcelLib.activexDashExcelLibStrings.GetIDsOfNames,
    argNames: js.Tuple5[
      activexDashExcelLib.activexDashExcelLibStrings.riid, 
      activexDashExcelLib.activexDashExcelLibStrings.rgszNames, 
      activexDashExcelLib.activexDashExcelLibStrings.cNames, 
      activexDashExcelLib.activexDashExcelLibStrings.lcid, 
      activexDashExcelLib.activexDashExcelLibStrings.rgdispid
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.OLEObject, 
      /* parameter */ Anon_Rgdispid, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.OLEObject,
    event: activexDashExcelLib.activexDashExcelLibStrings.GetTypeInfoCount,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.pctinfo],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.OLEObject, 
      /* parameter */ Anon_Pctinfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.OLEObject,
    event: activexDashExcelLib.activexDashExcelLibStrings.GetTypeInfo,
    argNames: js.Tuple3[
      activexDashExcelLib.activexDashExcelLibStrings.itinfo, 
      activexDashExcelLib.activexDashExcelLibStrings.lcid, 
      activexDashExcelLib.activexDashExcelLibStrings.pptinfo
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.OLEObject, 
      /* parameter */ Anon_Lcid, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.OLEObject,
    event: activexDashExcelLib.activexDashExcelLibStrings.QueryInterface,
    argNames: js.Tuple2[
      activexDashExcelLib.activexDashExcelLibStrings.riid, 
      activexDashExcelLib.activexDashExcelLibStrings.ppvObj
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.OLEObject, 
      /* parameter */ Anon_PpvObj, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.QueryTable,
    event: activexDashExcelLib.activexDashExcelLibStrings.AfterRefresh,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Success],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.QueryTable, 
      /* parameter */ Anon_Success, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.QueryTable,
    event: activexDashExcelLib.activexDashExcelLibStrings.BeforeRefresh,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.QueryTable, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.QueryTable,
    event: activexDashExcelLib.activexDashExcelLibStrings.GetIDsOfNames,
    argNames: js.Tuple5[
      activexDashExcelLib.activexDashExcelLibStrings.riid, 
      activexDashExcelLib.activexDashExcelLibStrings.rgszNames, 
      activexDashExcelLib.activexDashExcelLibStrings.cNames, 
      activexDashExcelLib.activexDashExcelLibStrings.lcid, 
      activexDashExcelLib.activexDashExcelLibStrings.rgdispid
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.QueryTable, 
      /* parameter */ Anon_Rgdispid, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.QueryTable,
    event: activexDashExcelLib.activexDashExcelLibStrings.GetTypeInfoCount,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.pctinfo],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.QueryTable, 
      /* parameter */ Anon_Pctinfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.QueryTable,
    event: activexDashExcelLib.activexDashExcelLibStrings.GetTypeInfo,
    argNames: js.Tuple3[
      activexDashExcelLib.activexDashExcelLibStrings.itinfo, 
      activexDashExcelLib.activexDashExcelLibStrings.lcid, 
      activexDashExcelLib.activexDashExcelLibStrings.pptinfo
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.QueryTable, 
      /* parameter */ Anon_Lcid, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.QueryTable,
    event: activexDashExcelLib.activexDashExcelLibStrings.QueryInterface,
    argNames: js.Tuple2[
      activexDashExcelLib.activexDashExcelLibStrings.riid, 
      activexDashExcelLib.activexDashExcelLibStrings.ppvObj
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.QueryTable, 
      /* parameter */ Anon_PpvObj, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.AfterSave,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Success],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ Anon_Success, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.AfterXmlExport,
    argNames: js.Tuple3[
      activexDashExcelLib.activexDashExcelLibStrings.Map, 
      activexDashExcelLib.activexDashExcelLibStrings.Url, 
      activexDashExcelLib.activexDashExcelLibStrings.Result
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ Anon_Url, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.AfterXmlImport,
    argNames: js.Tuple3[
      activexDashExcelLib.activexDashExcelLibStrings.Map, 
      activexDashExcelLib.activexDashExcelLibStrings.IsRefresh, 
      activexDashExcelLib.activexDashExcelLibStrings.Result
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ Anon_Result, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.BeforeClose,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.BeforePrint,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Cancel],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ Anon_CancelBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.BeforeSave,
    argNames: js.Tuple2[
      activexDashExcelLib.activexDashExcelLibStrings.SaveAsUI, 
      activexDashExcelLib.activexDashExcelLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ Anon_SaveAsUICancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.BeforeXmlExport,
    argNames: js.Tuple3[
      activexDashExcelLib.activexDashExcelLibStrings.Map, 
      activexDashExcelLib.activexDashExcelLibStrings.Url, 
      activexDashExcelLib.activexDashExcelLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ Anon_UrlCancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.BeforeXmlImport,
    argNames: js.Tuple4[
      activexDashExcelLib.activexDashExcelLibStrings.Map, 
      activexDashExcelLib.activexDashExcelLibStrings.Url, 
      activexDashExcelLib.activexDashExcelLibStrings.IsRefresh, 
      activexDashExcelLib.activexDashExcelLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ Anon_UrlCancelIsRefresh, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.GetIDsOfNames,
    argNames: js.Tuple5[
      activexDashExcelLib.activexDashExcelLibStrings.riid, 
      activexDashExcelLib.activexDashExcelLibStrings.rgszNames, 
      activexDashExcelLib.activexDashExcelLibStrings.cNames, 
      activexDashExcelLib.activexDashExcelLibStrings.lcid, 
      activexDashExcelLib.activexDashExcelLibStrings.rgdispid
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ Anon_Rgdispid, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.GetTypeInfoCount,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.pctinfo],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ Anon_Pctinfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.GetTypeInfo,
    argNames: js.Tuple3[
      activexDashExcelLib.activexDashExcelLibStrings.itinfo, 
      activexDashExcelLib.activexDashExcelLibStrings.lcid, 
      activexDashExcelLib.activexDashExcelLibStrings.pptinfo
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ Anon_Lcid, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.NewChart,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Ch],
    handler: js.ThisFunction1[/* this */ activexDashExcelLib.ExcelNs.Workbook, /* parameter */ Anon_Ch, scala.Unit]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.NewSheet,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Sh],
    handler: js.ThisFunction1[/* this */ activexDashExcelLib.ExcelNs.Workbook, /* parameter */ Anon_Sh, scala.Unit]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.PivotTableCloseConnection,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Target],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ Anon_TargetPivotTable, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.PivotTableOpenConnection,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Target],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ Anon_TargetPivotTable, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.QueryInterface,
    argNames: js.Tuple2[
      activexDashExcelLib.activexDashExcelLibStrings.riid, 
      activexDashExcelLib.activexDashExcelLibStrings.ppvObj
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ Anon_PpvObj, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.RowsetComplete,
    argNames: js.Tuple3[
      activexDashExcelLib.activexDashExcelLibStrings.Description, 
      activexDashExcelLib.activexDashExcelLibStrings.Sheet, 
      activexDashExcelLib.activexDashExcelLibStrings.Success
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ Anon_SheetDescription, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.SheetActivate,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Sh],
    handler: js.ThisFunction1[/* this */ activexDashExcelLib.ExcelNs.Workbook, /* parameter */ Anon_Sh, scala.Unit]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.SheetBeforeDoubleClick,
    argNames: js.Tuple3[
      activexDashExcelLib.activexDashExcelLibStrings.Sh, 
      activexDashExcelLib.activexDashExcelLibStrings.Target, 
      activexDashExcelLib.activexDashExcelLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ Anon_CancelTarget, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.SheetBeforeRightClick,
    argNames: js.Tuple3[
      activexDashExcelLib.activexDashExcelLibStrings.Sh, 
      activexDashExcelLib.activexDashExcelLibStrings.Target, 
      activexDashExcelLib.activexDashExcelLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ Anon_CancelTarget, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.SheetCalculate,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Sh],
    handler: js.ThisFunction1[/* this */ activexDashExcelLib.ExcelNs.Workbook, /* parameter */ Anon_Sh, scala.Unit]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.SheetChange,
    argNames: js.Tuple2[
      activexDashExcelLib.activexDashExcelLibStrings.Sh, 
      activexDashExcelLib.activexDashExcelLibStrings.Target
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ Anon_Target, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.SheetDeactivate,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Sh],
    handler: js.ThisFunction1[/* this */ activexDashExcelLib.ExcelNs.Workbook, /* parameter */ Anon_Sh, scala.Unit]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.SheetFollowHyperlink,
    argNames: js.Tuple2[
      activexDashExcelLib.activexDashExcelLibStrings.Sh, 
      activexDashExcelLib.activexDashExcelLibStrings.Target
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ Anon_TargetSh, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.SheetPivotTableAfterValueChange,
    argNames: js.Tuple3[
      activexDashExcelLib.activexDashExcelLibStrings.Sh, 
      activexDashExcelLib.activexDashExcelLibStrings.TargetPivotTable, 
      activexDashExcelLib.activexDashExcelLibStrings.TargetRange
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ Anon_TargetRange, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.SheetPivotTableBeforeAllocateChanges,
    argNames: js.Tuple5[
      activexDashExcelLib.activexDashExcelLibStrings.Sh, 
      activexDashExcelLib.activexDashExcelLibStrings.TargetPivotTable, 
      activexDashExcelLib.activexDashExcelLibStrings.ValueChangeStart, 
      activexDashExcelLib.activexDashExcelLibStrings.ValueChangeEnd, 
      activexDashExcelLib.activexDashExcelLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ Anon_ValueChangeEnd, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.SheetPivotTableBeforeCommitChanges,
    argNames: js.Tuple5[
      activexDashExcelLib.activexDashExcelLibStrings.Sh, 
      activexDashExcelLib.activexDashExcelLibStrings.TargetPivotTable, 
      activexDashExcelLib.activexDashExcelLibStrings.ValueChangeStart, 
      activexDashExcelLib.activexDashExcelLibStrings.ValueChangeEnd, 
      activexDashExcelLib.activexDashExcelLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ Anon_ValueChangeEnd, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.SheetPivotTableBeforeDiscardChanges,
    argNames: js.Tuple4[
      activexDashExcelLib.activexDashExcelLibStrings.Sh, 
      activexDashExcelLib.activexDashExcelLibStrings.TargetPivotTable, 
      activexDashExcelLib.activexDashExcelLibStrings.ValueChangeStart, 
      activexDashExcelLib.activexDashExcelLibStrings.ValueChangeEnd
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ Anon_ShValueChangeStart, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.SheetPivotTableChangeSync,
    argNames: js.Tuple2[
      activexDashExcelLib.activexDashExcelLibStrings.Sh, 
      activexDashExcelLib.activexDashExcelLibStrings.Target
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ Anon_TargetShPivotTable, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.SheetPivotTableUpdate,
    argNames: js.Tuple2[
      activexDashExcelLib.activexDashExcelLibStrings.Sh, 
      activexDashExcelLib.activexDashExcelLibStrings.Target
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ Anon_TargetShPivotTable, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.SheetSelectionChange,
    argNames: js.Tuple2[
      activexDashExcelLib.activexDashExcelLibStrings.Sh, 
      activexDashExcelLib.activexDashExcelLibStrings.Target
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ Anon_Target, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.Sync,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.SyncEventType],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ Anon_SyncEventType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.WindowActivate,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Wn],
    handler: js.ThisFunction1[/* this */ activexDashExcelLib.ExcelNs.Workbook, /* parameter */ Anon_Wn, scala.Unit]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.WindowDeactivate,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Wn],
    handler: js.ThisFunction1[/* this */ activexDashExcelLib.ExcelNs.Workbook, /* parameter */ Anon_Wn, scala.Unit]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.WindowResize,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Wn],
    handler: js.ThisFunction1[/* this */ activexDashExcelLib.ExcelNs.Workbook, /* parameter */ Anon_Wn, scala.Unit]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Worksheet,
    event: activexDashExcelLib.activexDashExcelLibStrings.BeforeDoubleClick,
    argNames: js.Tuple2[
      activexDashExcelLib.activexDashExcelLibStrings.Target, 
      activexDashExcelLib.activexDashExcelLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Worksheet, 
      /* parameter */ Anon_CancelTargetBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Worksheet,
    event: activexDashExcelLib.activexDashExcelLibStrings.BeforeRightClick,
    argNames: js.Tuple2[
      activexDashExcelLib.activexDashExcelLibStrings.Target, 
      activexDashExcelLib.activexDashExcelLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Worksheet, 
      /* parameter */ Anon_CancelTargetBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Worksheet,
    event: activexDashExcelLib.activexDashExcelLibStrings.Change,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Target],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Worksheet, 
      /* parameter */ Anon_TargetRange_490879595, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Worksheet,
    event: activexDashExcelLib.activexDashExcelLibStrings.FollowHyperlink,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Target],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Worksheet, 
      /* parameter */ Anon_TargetHyperlink, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Worksheet,
    event: activexDashExcelLib.activexDashExcelLibStrings.GetIDsOfNames,
    argNames: js.Tuple5[
      activexDashExcelLib.activexDashExcelLibStrings.riid, 
      activexDashExcelLib.activexDashExcelLibStrings.rgszNames, 
      activexDashExcelLib.activexDashExcelLibStrings.cNames, 
      activexDashExcelLib.activexDashExcelLibStrings.lcid, 
      activexDashExcelLib.activexDashExcelLibStrings.rgdispid
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Worksheet, 
      /* parameter */ Anon_Rgdispid, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Worksheet,
    event: activexDashExcelLib.activexDashExcelLibStrings.GetTypeInfoCount,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.pctinfo],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Worksheet, 
      /* parameter */ Anon_Pctinfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Worksheet,
    event: activexDashExcelLib.activexDashExcelLibStrings.GetTypeInfo,
    argNames: js.Tuple3[
      activexDashExcelLib.activexDashExcelLibStrings.itinfo, 
      activexDashExcelLib.activexDashExcelLibStrings.lcid, 
      activexDashExcelLib.activexDashExcelLibStrings.pptinfo
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Worksheet, 
      /* parameter */ Anon_Lcid, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Worksheet,
    event: activexDashExcelLib.activexDashExcelLibStrings.PivotTableAfterValueChange,
    argNames: js.Tuple2[
      activexDashExcelLib.activexDashExcelLibStrings.TargetPivotTable, 
      activexDashExcelLib.activexDashExcelLibStrings.TargetRange
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Worksheet, 
      /* parameter */ Anon_TargetRangeTargetPivotTable, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Worksheet,
    event: activexDashExcelLib.activexDashExcelLibStrings.PivotTableBeforeAllocateChanges,
    argNames: js.Tuple4[
      activexDashExcelLib.activexDashExcelLibStrings.TargetPivotTable, 
      activexDashExcelLib.activexDashExcelLibStrings.ValueChangeStart, 
      activexDashExcelLib.activexDashExcelLibStrings.ValueChangeEnd, 
      activexDashExcelLib.activexDashExcelLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Worksheet, 
      /* parameter */ Anon_CancelValueChangeStart, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Worksheet,
    event: activexDashExcelLib.activexDashExcelLibStrings.PivotTableBeforeCommitChanges,
    argNames: js.Tuple4[
      activexDashExcelLib.activexDashExcelLibStrings.TargetPivotTable, 
      activexDashExcelLib.activexDashExcelLibStrings.ValueChangeStart, 
      activexDashExcelLib.activexDashExcelLibStrings.ValueChangeEnd, 
      activexDashExcelLib.activexDashExcelLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Worksheet, 
      /* parameter */ Anon_CancelValueChangeStart, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Worksheet,
    event: activexDashExcelLib.activexDashExcelLibStrings.PivotTableBeforeDiscardChanges,
    argNames: js.Tuple3[
      activexDashExcelLib.activexDashExcelLibStrings.TargetPivotTable, 
      activexDashExcelLib.activexDashExcelLibStrings.ValueChangeStart, 
      activexDashExcelLib.activexDashExcelLibStrings.ValueChangeEnd
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Worksheet, 
      /* parameter */ Anon_ValueChangeStart, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Worksheet,
    event: activexDashExcelLib.activexDashExcelLibStrings.PivotTableChangeSync,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Target],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Worksheet, 
      /* parameter */ Anon_TargetPivotTable, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Worksheet,
    event: activexDashExcelLib.activexDashExcelLibStrings.PivotTableUpdate,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Target],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Worksheet, 
      /* parameter */ Anon_TargetPivotTable, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Worksheet,
    event: activexDashExcelLib.activexDashExcelLibStrings.QueryInterface,
    argNames: js.Tuple2[
      activexDashExcelLib.activexDashExcelLibStrings.riid, 
      activexDashExcelLib.activexDashExcelLibStrings.ppvObj
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Worksheet, 
      /* parameter */ Anon_PpvObj, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashExcelLib.ExcelNs.Worksheet,
    event: activexDashExcelLib.activexDashExcelLibStrings.SelectionChange,
    argNames: js.Array[activexDashExcelLib.activexDashExcelLibStrings.Target],
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Worksheet, 
      /* parameter */ Anon_TargetRange_490879595, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Activate(
    obj: activexDashExcelLib.ExcelNs.Chart,
    event: activexDashExcelLib.activexDashExcelLibStrings.Activate,
    handler: js.ThisFunction1[/* this */ activexDashExcelLib.ExcelNs.Chart, /* parameter */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Activate(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.Activate,
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Activate(
    obj: activexDashExcelLib.ExcelNs.Worksheet,
    event: activexDashExcelLib.activexDashExcelLibStrings.Activate,
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Worksheet, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.AddRef,
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: activexDashExcelLib.ExcelNs.Chart,
    event: activexDashExcelLib.activexDashExcelLibStrings.AddRef,
    handler: js.ThisFunction1[/* this */ activexDashExcelLib.ExcelNs.Chart, /* parameter */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: activexDashExcelLib.ExcelNs.OLEObject,
    event: activexDashExcelLib.activexDashExcelLibStrings.AddRef,
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.OLEObject, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: activexDashExcelLib.ExcelNs.QueryTable,
    event: activexDashExcelLib.activexDashExcelLibStrings.AddRef,
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.QueryTable, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.AddRef,
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: activexDashExcelLib.ExcelNs.Worksheet,
    event: activexDashExcelLib.activexDashExcelLibStrings.AddRef,
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Worksheet, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AddinInstall(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.AddinInstall,
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AddinUninstall(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.AddinUninstall,
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AfterCalculate(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.AfterCalculate,
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Calculate(
    obj: activexDashExcelLib.ExcelNs.Chart,
    event: activexDashExcelLib.activexDashExcelLibStrings.Calculate,
    handler: js.ThisFunction1[/* this */ activexDashExcelLib.ExcelNs.Chart, /* parameter */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Calculate(
    obj: activexDashExcelLib.ExcelNs.Worksheet,
    event: activexDashExcelLib.activexDashExcelLibStrings.Calculate,
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Worksheet, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Deactivate(
    obj: activexDashExcelLib.ExcelNs.Chart,
    event: activexDashExcelLib.activexDashExcelLibStrings.Deactivate,
    handler: js.ThisFunction1[/* this */ activexDashExcelLib.ExcelNs.Chart, /* parameter */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Deactivate(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.Deactivate,
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Deactivate(
    obj: activexDashExcelLib.ExcelNs.Worksheet,
    event: activexDashExcelLib.activexDashExcelLibStrings.Deactivate,
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Worksheet, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DragOver(
    obj: activexDashExcelLib.ExcelNs.Chart,
    event: activexDashExcelLib.activexDashExcelLibStrings.DragOver,
    handler: js.ThisFunction1[/* this */ activexDashExcelLib.ExcelNs.Chart, /* parameter */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DragPlot(
    obj: activexDashExcelLib.ExcelNs.Chart,
    event: activexDashExcelLib.activexDashExcelLibStrings.DragPlot,
    handler: js.ThisFunction1[/* this */ activexDashExcelLib.ExcelNs.Chart, /* parameter */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: activexDashExcelLib.ExcelNs.OLEObject,
    event: activexDashExcelLib.activexDashExcelLibStrings.GotFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.OLEObject, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.Invoke,
    argNames: activexDashExcelLib.ExcelNs.EventHelperTypesNs.Application_Invoke_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ activexDashExcelLib.ExcelNs.EventHelperTypesNs.Application_Invoke_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: activexDashExcelLib.ExcelNs.Chart,
    event: activexDashExcelLib.activexDashExcelLibStrings.Invoke,
    argNames: activexDashExcelLib.ExcelNs.EventHelperTypesNs.Chart_Invoke_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Chart, 
      /* parameter */ activexDashExcelLib.ExcelNs.EventHelperTypesNs.Chart_Invoke_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: activexDashExcelLib.ExcelNs.OLEObject,
    event: activexDashExcelLib.activexDashExcelLibStrings.Invoke,
    argNames: activexDashExcelLib.ExcelNs.EventHelperTypesNs.OLEObject_Invoke_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.OLEObject, 
      /* parameter */ activexDashExcelLib.ExcelNs.EventHelperTypesNs.OLEObject_Invoke_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: activexDashExcelLib.ExcelNs.QueryTable,
    event: activexDashExcelLib.activexDashExcelLibStrings.Invoke,
    argNames: activexDashExcelLib.ExcelNs.EventHelperTypesNs.QueryTable_Invoke_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.QueryTable, 
      /* parameter */ activexDashExcelLib.ExcelNs.EventHelperTypesNs.QueryTable_Invoke_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.Invoke,
    argNames: activexDashExcelLib.ExcelNs.EventHelperTypesNs.Workbook_Invoke_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ activexDashExcelLib.ExcelNs.EventHelperTypesNs.Workbook_Invoke_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: activexDashExcelLib.ExcelNs.Worksheet,
    event: activexDashExcelLib.activexDashExcelLibStrings.Invoke,
    argNames: activexDashExcelLib.ExcelNs.EventHelperTypesNs.Worksheet_Invoke_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Worksheet, 
      /* parameter */ activexDashExcelLib.ExcelNs.EventHelperTypesNs.Worksheet_Invoke_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: activexDashExcelLib.ExcelNs.OLEObject,
    event: activexDashExcelLib.activexDashExcelLibStrings.LostFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.OLEObject, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Open(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.Open,
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Release(
    obj: activexDashExcelLib.ExcelNs.Application,
    event: activexDashExcelLib.activexDashExcelLibStrings.Release,
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Application, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Release(
    obj: activexDashExcelLib.ExcelNs.Chart,
    event: activexDashExcelLib.activexDashExcelLibStrings.Release,
    handler: js.ThisFunction1[/* this */ activexDashExcelLib.ExcelNs.Chart, /* parameter */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Release(
    obj: activexDashExcelLib.ExcelNs.OLEObject,
    event: activexDashExcelLib.activexDashExcelLibStrings.Release,
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.OLEObject, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Release(
    obj: activexDashExcelLib.ExcelNs.QueryTable,
    event: activexDashExcelLib.activexDashExcelLibStrings.Release,
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.QueryTable, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Release(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    event: activexDashExcelLib.activexDashExcelLibStrings.Release,
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Workbook, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Release(
    obj: activexDashExcelLib.ExcelNs.Worksheet,
    event: activexDashExcelLib.activexDashExcelLibStrings.Release,
    handler: js.ThisFunction1[
      /* this */ activexDashExcelLib.ExcelNs.Worksheet, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Resize(
    obj: activexDashExcelLib.ExcelNs.Chart,
    event: activexDashExcelLib.activexDashExcelLibStrings.Resize,
    handler: js.ThisFunction1[/* this */ activexDashExcelLib.ExcelNs.Chart, /* parameter */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  @JSName("set")
  def set_Colors(
    obj: activexDashExcelLib.ExcelNs.Workbook,
    propertyName: activexDashExcelLib.activexDashExcelLibStrings.Colors,
    parameterTypes: js.Array[scala.Double],
    newValue: scala.Double
  ): scala.Unit = js.native
  @JSName("set")
  def set_HasAxis(
    obj: activexDashExcelLib.ExcelNs.Chart,
    propertyName: activexDashExcelLib.activexDashExcelLibStrings.HasAxis,
    parameterTypes: js.Tuple2[
      js.UndefOr[activexDashExcelLib.ExcelNs.XlAxisType], 
      js.UndefOr[activexDashExcelLib.ExcelNs.XlAxisGroup]
    ],
    newValue: scala.Boolean
  ): scala.Unit = js.native
  @JSName("set")
  def set_List(
    obj: activexDashExcelLib.ExcelNs.ControlFormat,
    propertyName: activexDashExcelLib.activexDashExcelLibStrings.List,
    parameterTypes: js.Array[scala.Nothing],
    newValue: activexDashInteropLib.SafeArray[java.lang.String]
  ): scala.Unit = js.native
  @JSName("set")
  def set_List(
    obj: activexDashExcelLib.ExcelNs.ControlFormat,
    propertyName: activexDashExcelLib.activexDashExcelLibStrings.List,
    parameterTypes: js.Array[scala.Double],
    newValue: java.lang.String
  ): scala.Unit = js.native
  @JSName("set")
  def set_PrintQuality(
    obj: activexDashExcelLib.ExcelNs.PageSetup,
    propertyName: activexDashExcelLib.activexDashExcelLibStrings.PrintQuality,
    parameterTypes: js.Array[scala.Double],
    newValue: scala.Double
  ): scala.Unit = js.native
  @JSName("set")
  def set_Subtotals(
    obj: activexDashExcelLib.ExcelNs.PivotField,
    propertyName: activexDashExcelLib.activexDashExcelLibStrings.Subtotals,
    parameterTypes: js.Array[activexDashExcelLib.ExcelNs.PivotFieldSubtotal],
    newValue: scala.Boolean
  ): scala.Unit = js.native
  @JSName("set")
  def set_Value(
    obj: activexDashExcelLib.ExcelNs.Range,
    propertyName: activexDashExcelLib.activexDashExcelLibStrings.Value,
    parameterTypes: js.Array[activexDashExcelLib.ExcelNs.XlRangeValueDataType],
    newValue: js.Any
  ): scala.Unit = js.native
}

