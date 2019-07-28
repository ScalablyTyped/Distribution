package typings.activexDashAdodb

import typings.activexDashAdodb.ADODBNs.Connection
import typings.activexDashAdodb.ADODBNs.EventHelperTypesNs.Connection_ExecuteComplete_ArgNames
import typings.activexDashAdodb.ADODBNs.EventHelperTypesNs.Connection_ExecuteComplete_Parameter
import typings.activexDashAdodb.ADODBNs.EventHelperTypesNs.Connection_WillConnect_ArgNames
import typings.activexDashAdodb.ADODBNs.EventHelperTypesNs.Connection_WillConnect_Parameter
import typings.activexDashAdodb.ADODBNs.EventHelperTypesNs.Connection_WillExecute_ArgNames
import typings.activexDashAdodb.ADODBNs.EventHelperTypesNs.Connection_WillExecute_Parameter
import typings.activexDashAdodb.ADODBNs.Recordset
import typings.activexDashAdodb.activexDashAdodbStrings.BeginTransComplete
import typings.activexDashAdodb.activexDashAdodbStrings.Collect
import typings.activexDashAdodb.activexDashAdodbStrings.CommitTransComplete
import typings.activexDashAdodb.activexDashAdodbStrings.ConnectComplete
import typings.activexDashAdodb.activexDashAdodbStrings.Disconnect
import typings.activexDashAdodb.activexDashAdodbStrings.EndOfRecordset
import typings.activexDashAdodb.activexDashAdodbStrings.ExecuteComplete
import typings.activexDashAdodb.activexDashAdodbStrings.FetchComplete
import typings.activexDashAdodb.activexDashAdodbStrings.FetchProgress
import typings.activexDashAdodb.activexDashAdodbStrings.FieldChangeComplete
import typings.activexDashAdodb.activexDashAdodbStrings.Fields
import typings.activexDashAdodb.activexDashAdodbStrings.InfoMessage
import typings.activexDashAdodb.activexDashAdodbStrings.MaxProgress
import typings.activexDashAdodb.activexDashAdodbStrings.MoveComplete
import typings.activexDashAdodb.activexDashAdodbStrings.Progress
import typings.activexDashAdodb.activexDashAdodbStrings.RecordChangeComplete
import typings.activexDashAdodb.activexDashAdodbStrings.RecordsetChangeComplete
import typings.activexDashAdodb.activexDashAdodbStrings.RollbackTransComplete
import typings.activexDashAdodb.activexDashAdodbStrings.TransactionLevel
import typings.activexDashAdodb.activexDashAdodbStrings.WillChangeField
import typings.activexDashAdodb.activexDashAdodbStrings.WillChangeRecord
import typings.activexDashAdodb.activexDashAdodbStrings.WillChangeRecordset
import typings.activexDashAdodb.activexDashAdodbStrings.WillConnect
import typings.activexDashAdodb.activexDashAdodbStrings.WillExecute
import typings.activexDashAdodb.activexDashAdodbStrings.WillMove
import typings.activexDashAdodb.activexDashAdodbStrings.adReason
import typings.activexDashAdodb.activexDashAdodbStrings.adStatus
import typings.activexDashAdodb.activexDashAdodbStrings.cFields
import typings.activexDashAdodb.activexDashAdodbStrings.cRecords
import typings.activexDashAdodb.activexDashAdodbStrings.fMoreData
import typings.activexDashAdodb.activexDashAdodbStrings.pConnection
import typings.activexDashAdodb.activexDashAdodbStrings.pError
import typings.activexDashAdodb.activexDashAdodbStrings.pRecordset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: Connection,
    event: BeginTransComplete,
    argNames: js.Tuple4[TransactionLevel, pError, adStatus, pConnection],
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ Anon_AdStatus, Unit]
  ): Unit = js.native
  def on(
    obj: Connection,
    event: CommitTransComplete,
    argNames: js.Tuple3[pError, adStatus, pConnection],
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ Anon_AdStatusPConnection, Unit]
  ): Unit = js.native
  def on(
    obj: Connection,
    event: ConnectComplete,
    argNames: js.Tuple3[pError, adStatus, pConnection],
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ Anon_AdStatusPConnection, Unit]
  ): Unit = js.native
  def on(
    obj: Connection,
    event: Disconnect,
    argNames: js.Tuple2[adStatus, pConnection],
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ Anon_AdStatusPConnectionConnection, Unit]
  ): Unit = js.native
  def on(
    obj: Connection,
    event: InfoMessage,
    argNames: js.Tuple3[pError, adStatus, pConnection],
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ Anon_AdStatusPConnection, Unit]
  ): Unit = js.native
  def on(
    obj: Connection,
    event: RollbackTransComplete,
    argNames: js.Tuple3[pError, adStatus, pConnection],
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ Anon_AdStatusPConnection, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: EndOfRecordset,
    argNames: js.Tuple3[fMoreData, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ Anon_AdStatusFMoreData, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: FetchComplete,
    argNames: js.Tuple3[pError, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ Anon_AdStatusPError, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: FetchProgress,
    argNames: js.Tuple4[Progress, MaxProgress, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ Anon_AdStatusMaxProgress, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: FieldChangeComplete,
    argNames: js.Tuple5[cFields, Fields, pError, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ Anon_AdStatusCFields, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: MoveComplete,
    argNames: js.Tuple4[adReason, pError, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ Anon_AdReason, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: RecordChangeComplete,
    argNames: js.Tuple5[adReason, cRecords, pError, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ Anon_AdReasonAdStatus, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: RecordsetChangeComplete,
    argNames: js.Tuple4[adReason, pError, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ Anon_AdReason, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: WillChangeField,
    argNames: js.Tuple4[cFields, Fields, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ Anon_AdStatusCFieldsFields, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: WillChangeRecord,
    argNames: js.Tuple4[adReason, cRecords, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ Anon_AdReasonAdStatusCRecords, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: WillChangeRecordset,
    argNames: js.Tuple3[adReason, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ Anon_AdReasonAdStatusPRecordset, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: WillMove,
    argNames: js.Tuple3[adReason, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ Anon_AdReasonAdStatusPRecordset, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_ExecuteComplete(
    obj: Connection,
    event: ExecuteComplete,
    argNames: Connection_ExecuteComplete_ArgNames,
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ Connection_ExecuteComplete_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_WillConnect(
    obj: Connection,
    event: WillConnect,
    argNames: Connection_WillConnect_ArgNames,
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ Connection_WillConnect_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_WillExecute(
    obj: Connection,
    event: WillExecute,
    argNames: Connection_WillExecute_ArgNames,
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ Connection_WillExecute_Parameter, Unit]
  ): Unit = js.native
  @JSName("set")
  def set_Collect(obj: Recordset, propertyName: Collect, parameterTypes: js.Array[_], newValue: js.Any): Unit = js.native
}

