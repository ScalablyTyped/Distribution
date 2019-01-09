package typings
package activexDashAdodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: activexDashAdodbLib.ADODBNs.Connection,
    event: activexDashAdodbLib.activexDashAdodbLibStrings.BeginTransComplete,
    argNames: js.Tuple4[
      activexDashAdodbLib.activexDashAdodbLibStrings.TransactionLevel, 
      activexDashAdodbLib.activexDashAdodbLibStrings.pError, 
      activexDashAdodbLib.activexDashAdodbLibStrings.adStatus, 
      activexDashAdodbLib.activexDashAdodbLibStrings.pConnection
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAdodbLib.ADODBNs.Connection, 
      /* parameter */ Anon_AdStatus, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAdodbLib.ADODBNs.Connection,
    event: activexDashAdodbLib.activexDashAdodbLibStrings.CommitTransComplete,
    argNames: js.Tuple3[
      activexDashAdodbLib.activexDashAdodbLibStrings.pError, 
      activexDashAdodbLib.activexDashAdodbLibStrings.adStatus, 
      activexDashAdodbLib.activexDashAdodbLibStrings.pConnection
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAdodbLib.ADODBNs.Connection, 
      /* parameter */ Anon_AdStatusPConnection, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAdodbLib.ADODBNs.Connection,
    event: activexDashAdodbLib.activexDashAdodbLibStrings.ConnectComplete,
    argNames: js.Tuple3[
      activexDashAdodbLib.activexDashAdodbLibStrings.pError, 
      activexDashAdodbLib.activexDashAdodbLibStrings.adStatus, 
      activexDashAdodbLib.activexDashAdodbLibStrings.pConnection
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAdodbLib.ADODBNs.Connection, 
      /* parameter */ Anon_AdStatusPConnection, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAdodbLib.ADODBNs.Connection,
    event: activexDashAdodbLib.activexDashAdodbLibStrings.Disconnect,
    argNames: js.Tuple2[
      activexDashAdodbLib.activexDashAdodbLibStrings.adStatus, 
      activexDashAdodbLib.activexDashAdodbLibStrings.pConnection
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAdodbLib.ADODBNs.Connection, 
      /* parameter */ Anon_AdStatusPConnectionConnection, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAdodbLib.ADODBNs.Connection,
    event: activexDashAdodbLib.activexDashAdodbLibStrings.InfoMessage,
    argNames: js.Tuple3[
      activexDashAdodbLib.activexDashAdodbLibStrings.pError, 
      activexDashAdodbLib.activexDashAdodbLibStrings.adStatus, 
      activexDashAdodbLib.activexDashAdodbLibStrings.pConnection
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAdodbLib.ADODBNs.Connection, 
      /* parameter */ Anon_AdStatusPConnection, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAdodbLib.ADODBNs.Connection,
    event: activexDashAdodbLib.activexDashAdodbLibStrings.RollbackTransComplete,
    argNames: js.Tuple3[
      activexDashAdodbLib.activexDashAdodbLibStrings.pError, 
      activexDashAdodbLib.activexDashAdodbLibStrings.adStatus, 
      activexDashAdodbLib.activexDashAdodbLibStrings.pConnection
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAdodbLib.ADODBNs.Connection, 
      /* parameter */ Anon_AdStatusPConnection, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAdodbLib.ADODBNs.Recordset,
    event: activexDashAdodbLib.activexDashAdodbLibStrings.EndOfRecordset,
    argNames: js.Tuple3[
      activexDashAdodbLib.activexDashAdodbLibStrings.fMoreData, 
      activexDashAdodbLib.activexDashAdodbLibStrings.adStatus, 
      activexDashAdodbLib.activexDashAdodbLibStrings.pRecordset
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAdodbLib.ADODBNs.Recordset, 
      /* parameter */ Anon_AdStatusFMoreData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAdodbLib.ADODBNs.Recordset,
    event: activexDashAdodbLib.activexDashAdodbLibStrings.FetchComplete,
    argNames: js.Tuple3[
      activexDashAdodbLib.activexDashAdodbLibStrings.pError, 
      activexDashAdodbLib.activexDashAdodbLibStrings.adStatus, 
      activexDashAdodbLib.activexDashAdodbLibStrings.pRecordset
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAdodbLib.ADODBNs.Recordset, 
      /* parameter */ Anon_AdStatusFieldIndex, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAdodbLib.ADODBNs.Recordset,
    event: activexDashAdodbLib.activexDashAdodbLibStrings.FetchProgress,
    argNames: js.Tuple4[
      activexDashAdodbLib.activexDashAdodbLibStrings.Progress, 
      activexDashAdodbLib.activexDashAdodbLibStrings.MaxProgress, 
      activexDashAdodbLib.activexDashAdodbLibStrings.adStatus, 
      activexDashAdodbLib.activexDashAdodbLibStrings.pRecordset
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAdodbLib.ADODBNs.Recordset, 
      /* parameter */ Anon_AdStatusFieldIndexMaxProgress, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAdodbLib.ADODBNs.Recordset,
    event: activexDashAdodbLib.activexDashAdodbLibStrings.FieldChangeComplete,
    argNames: js.Tuple5[
      activexDashAdodbLib.activexDashAdodbLibStrings.cFields, 
      activexDashAdodbLib.activexDashAdodbLibStrings.Fields, 
      activexDashAdodbLib.activexDashAdodbLibStrings.pError, 
      activexDashAdodbLib.activexDashAdodbLibStrings.adStatus, 
      activexDashAdodbLib.activexDashAdodbLibStrings.pRecordset
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAdodbLib.ADODBNs.Recordset, 
      /* parameter */ Anon_AdStatusCFields, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAdodbLib.ADODBNs.Recordset,
    event: activexDashAdodbLib.activexDashAdodbLibStrings.MoveComplete,
    argNames: js.Tuple4[
      activexDashAdodbLib.activexDashAdodbLibStrings.adReason, 
      activexDashAdodbLib.activexDashAdodbLibStrings.pError, 
      activexDashAdodbLib.activexDashAdodbLibStrings.adStatus, 
      activexDashAdodbLib.activexDashAdodbLibStrings.pRecordset
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAdodbLib.ADODBNs.Recordset, 
      /* parameter */ Anon_AdReason, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAdodbLib.ADODBNs.Recordset,
    event: activexDashAdodbLib.activexDashAdodbLibStrings.RecordChangeComplete,
    argNames: js.Tuple5[
      activexDashAdodbLib.activexDashAdodbLibStrings.adReason, 
      activexDashAdodbLib.activexDashAdodbLibStrings.cRecords, 
      activexDashAdodbLib.activexDashAdodbLibStrings.pError, 
      activexDashAdodbLib.activexDashAdodbLibStrings.adStatus, 
      activexDashAdodbLib.activexDashAdodbLibStrings.pRecordset
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAdodbLib.ADODBNs.Recordset, 
      /* parameter */ Anon_AdReasonAdStatus, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAdodbLib.ADODBNs.Recordset,
    event: activexDashAdodbLib.activexDashAdodbLibStrings.RecordsetChangeComplete,
    argNames: js.Tuple4[
      activexDashAdodbLib.activexDashAdodbLibStrings.adReason, 
      activexDashAdodbLib.activexDashAdodbLibStrings.pError, 
      activexDashAdodbLib.activexDashAdodbLibStrings.adStatus, 
      activexDashAdodbLib.activexDashAdodbLibStrings.pRecordset
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAdodbLib.ADODBNs.Recordset, 
      /* parameter */ Anon_AdReason, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAdodbLib.ADODBNs.Recordset,
    event: activexDashAdodbLib.activexDashAdodbLibStrings.WillChangeField,
    argNames: js.Tuple4[
      activexDashAdodbLib.activexDashAdodbLibStrings.cFields, 
      activexDashAdodbLib.activexDashAdodbLibStrings.Fields, 
      activexDashAdodbLib.activexDashAdodbLibStrings.adStatus, 
      activexDashAdodbLib.activexDashAdodbLibStrings.pRecordset
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAdodbLib.ADODBNs.Recordset, 
      /* parameter */ Anon_AdStatusCFieldsFieldIndex, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAdodbLib.ADODBNs.Recordset,
    event: activexDashAdodbLib.activexDashAdodbLibStrings.WillChangeRecord,
    argNames: js.Tuple4[
      activexDashAdodbLib.activexDashAdodbLibStrings.adReason, 
      activexDashAdodbLib.activexDashAdodbLibStrings.cRecords, 
      activexDashAdodbLib.activexDashAdodbLibStrings.adStatus, 
      activexDashAdodbLib.activexDashAdodbLibStrings.pRecordset
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAdodbLib.ADODBNs.Recordset, 
      /* parameter */ Anon_AdReasonAdStatusCRecords, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAdodbLib.ADODBNs.Recordset,
    event: activexDashAdodbLib.activexDashAdodbLibStrings.WillChangeRecordset,
    argNames: js.Tuple3[
      activexDashAdodbLib.activexDashAdodbLibStrings.adReason, 
      activexDashAdodbLib.activexDashAdodbLibStrings.adStatus, 
      activexDashAdodbLib.activexDashAdodbLibStrings.pRecordset
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAdodbLib.ADODBNs.Recordset, 
      /* parameter */ Anon_AdReasonAdStatusFieldIndex, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashAdodbLib.ADODBNs.Recordset,
    event: activexDashAdodbLib.activexDashAdodbLibStrings.WillMove,
    argNames: js.Tuple3[
      activexDashAdodbLib.activexDashAdodbLibStrings.adReason, 
      activexDashAdodbLib.activexDashAdodbLibStrings.adStatus, 
      activexDashAdodbLib.activexDashAdodbLibStrings.pRecordset
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashAdodbLib.ADODBNs.Recordset, 
      /* parameter */ Anon_AdReasonAdStatusFieldIndex, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_ExecuteComplete(
    obj: activexDashAdodbLib.ADODBNs.Connection,
    event: activexDashAdodbLib.activexDashAdodbLibStrings.ExecuteComplete,
    argNames: activexDashAdodbLib.ADODBNs.EventHelperTypesNs.Connection_ExecuteComplete_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashAdodbLib.ADODBNs.Connection, 
      /* parameter */ activexDashAdodbLib.ADODBNs.EventHelperTypesNs.Connection_ExecuteComplete_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_WillConnect(
    obj: activexDashAdodbLib.ADODBNs.Connection,
    event: activexDashAdodbLib.activexDashAdodbLibStrings.WillConnect,
    argNames: activexDashAdodbLib.ADODBNs.EventHelperTypesNs.Connection_WillConnect_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashAdodbLib.ADODBNs.Connection, 
      /* parameter */ activexDashAdodbLib.ADODBNs.EventHelperTypesNs.Connection_WillConnect_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_WillExecute(
    obj: activexDashAdodbLib.ADODBNs.Connection,
    event: activexDashAdodbLib.activexDashAdodbLibStrings.WillExecute,
    argNames: activexDashAdodbLib.ADODBNs.EventHelperTypesNs.Connection_WillExecute_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashAdodbLib.ADODBNs.Connection, 
      /* parameter */ activexDashAdodbLib.ADODBNs.EventHelperTypesNs.Connection_WillExecute_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("set")
  def set_Collect(
    obj: activexDashAdodbLib.ADODBNs.Recordset,
    propertyName: activexDashAdodbLib.activexDashAdodbLibStrings.Collect,
    parameterTypes: js.Array[_],
    newValue: js.Any
  ): scala.Unit = js.native
}

