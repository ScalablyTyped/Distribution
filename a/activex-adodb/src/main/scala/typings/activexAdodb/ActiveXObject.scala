package typings.activexAdodb

import typings.activexAdodb.ADODB.Connection
import typings.activexAdodb.ADODB.EventHelperTypes.ConnectionExecuteCompleteArgNames
import typings.activexAdodb.ADODB.EventHelperTypes.ConnectionExecuteCompleteParameter
import typings.activexAdodb.ADODB.EventHelperTypes.ConnectionWillConnectArgNames
import typings.activexAdodb.ADODB.EventHelperTypes.ConnectionWillConnectParameter
import typings.activexAdodb.ADODB.EventHelperTypes.ConnectionWillExecuteArgNames
import typings.activexAdodb.ADODB.EventHelperTypes.ConnectionWillExecuteParameter
import typings.activexAdodb.ADODB.Recordset
import typings.activexAdodb.activexAdodbStrings.BeginTransComplete
import typings.activexAdodb.activexAdodbStrings.Collect
import typings.activexAdodb.activexAdodbStrings.CommitTransComplete
import typings.activexAdodb.activexAdodbStrings.ConnectComplete
import typings.activexAdodb.activexAdodbStrings.Disconnect
import typings.activexAdodb.activexAdodbStrings.EndOfRecordset
import typings.activexAdodb.activexAdodbStrings.ExecuteComplete
import typings.activexAdodb.activexAdodbStrings.FetchComplete
import typings.activexAdodb.activexAdodbStrings.FetchProgress
import typings.activexAdodb.activexAdodbStrings.FieldChangeComplete
import typings.activexAdodb.activexAdodbStrings.Fields
import typings.activexAdodb.activexAdodbStrings.InfoMessage
import typings.activexAdodb.activexAdodbStrings.MaxProgress
import typings.activexAdodb.activexAdodbStrings.MoveComplete
import typings.activexAdodb.activexAdodbStrings.Progress
import typings.activexAdodb.activexAdodbStrings.RecordChangeComplete
import typings.activexAdodb.activexAdodbStrings.RecordsetChangeComplete
import typings.activexAdodb.activexAdodbStrings.RollbackTransComplete
import typings.activexAdodb.activexAdodbStrings.TransactionLevel
import typings.activexAdodb.activexAdodbStrings.WillChangeField
import typings.activexAdodb.activexAdodbStrings.WillChangeRecord
import typings.activexAdodb.activexAdodbStrings.WillChangeRecordset
import typings.activexAdodb.activexAdodbStrings.WillConnect
import typings.activexAdodb.activexAdodbStrings.WillExecute
import typings.activexAdodb.activexAdodbStrings.WillMove
import typings.activexAdodb.activexAdodbStrings.adReason
import typings.activexAdodb.activexAdodbStrings.adStatus
import typings.activexAdodb.activexAdodbStrings.cFields
import typings.activexAdodb.activexAdodbStrings.cRecords
import typings.activexAdodb.activexAdodbStrings.fMoreData
import typings.activexAdodb.activexAdodbStrings.pConnection
import typings.activexAdodb.activexAdodbStrings.pError
import typings.activexAdodb.activexAdodbStrings.pRecordset
import typings.activexAdodb.anon.AdReason
import typings.activexAdodb.anon.AdReasonAdStatus
import typings.activexAdodb.anon.AdStatus
import typings.activexAdodb.anon.AdStatusPConnection
import typings.activexAdodb.anon.CFields
import typings.activexAdodb.anon.CRecords
import typings.activexAdodb.anon.FMoreData
import typings.activexAdodb.anon.PConnection
import typings.activexAdodb.anon.PError
import typings.activexAdodb.anon.PRecordset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObject extends StObject {
  
  def on(
    obj: Connection,
    event: BeginTransComplete,
    argNames: js.Tuple4[TransactionLevel, pError, adStatus, pConnection],
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ AdStatus, Unit]
  ): Unit = js.native
  def on(
    obj: Connection,
    event: CommitTransComplete,
    argNames: js.Tuple3[pError, adStatus, pConnection],
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ PConnection, Unit]
  ): Unit = js.native
  def on(
    obj: Connection,
    event: ConnectComplete,
    argNames: js.Tuple3[pError, adStatus, pConnection],
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ PConnection, Unit]
  ): Unit = js.native
  def on(
    obj: Connection,
    event: Disconnect,
    argNames: js.Tuple2[adStatus, pConnection],
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ AdStatusPConnection, Unit]
  ): Unit = js.native
  def on(
    obj: Connection,
    event: InfoMessage,
    argNames: js.Tuple3[pError, adStatus, pConnection],
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ PConnection, Unit]
  ): Unit = js.native
  def on(
    obj: Connection,
    event: RollbackTransComplete,
    argNames: js.Tuple3[pError, adStatus, pConnection],
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ PConnection, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: EndOfRecordset,
    argNames: js.Tuple3[fMoreData, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ FMoreData, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: FetchComplete,
    argNames: js.Tuple3[pError, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ PError, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: FetchProgress,
    argNames: js.Tuple4[Progress, MaxProgress, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ typings.activexAdodb.anon.MaxProgress, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: FieldChangeComplete,
    argNames: js.Tuple5[cFields, Fields, pError, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ CFields, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: MoveComplete,
    argNames: js.Tuple4[adReason, pError, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ AdReason, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: RecordChangeComplete,
    argNames: js.Tuple5[adReason, cRecords, pError, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ CRecords, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: RecordsetChangeComplete,
    argNames: js.Tuple4[adReason, pError, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ AdReason, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: WillChangeField,
    argNames: js.Tuple4[cFields, Fields, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ typings.activexAdodb.anon.Fields, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: WillChangeRecord,
    argNames: js.Tuple4[adReason, cRecords, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ PRecordset, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: WillChangeRecordset,
    argNames: js.Tuple3[adReason, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ AdReasonAdStatus, Unit]
  ): Unit = js.native
  def on(
    obj: Recordset,
    event: WillMove,
    argNames: js.Tuple3[adReason, adStatus, pRecordset],
    handler: js.ThisFunction1[/* this */ Recordset, /* parameter */ AdReasonAdStatus, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_ExecuteComplete(
    obj: Connection,
    event: ExecuteComplete,
    argNames: ConnectionExecuteCompleteArgNames,
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ ConnectionExecuteCompleteParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_WillConnect(
    obj: Connection,
    event: WillConnect,
    argNames: ConnectionWillConnectArgNames,
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ ConnectionWillConnectParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_WillExecute(
    obj: Connection,
    event: WillExecute,
    argNames: ConnectionWillExecuteArgNames,
    handler: js.ThisFunction1[/* this */ Connection, /* parameter */ ConnectionWillExecuteParameter, Unit]
  ): Unit = js.native
  
  @JSName("set")
  def set_Collect(obj: Recordset, propertyName: Collect, parameterTypes: js.Array[_], newValue: js.Any): Unit = js.native
}
