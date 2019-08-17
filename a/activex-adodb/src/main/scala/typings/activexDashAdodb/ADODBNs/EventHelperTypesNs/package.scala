package typings.activexDashAdodb.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventHelperTypesNs {
  import typings.activexDashAdodb.activexDashAdodbStrings.ConnectionString
  import typings.activexDashAdodb.activexDashAdodbStrings.CursorType
  import typings.activexDashAdodb.activexDashAdodbStrings.LockType
  import typings.activexDashAdodb.activexDashAdodbStrings.Options
  import typings.activexDashAdodb.activexDashAdodbStrings.Password
  import typings.activexDashAdodb.activexDashAdodbStrings.RecordsAffected
  import typings.activexDashAdodb.activexDashAdodbStrings.Source
  import typings.activexDashAdodb.activexDashAdodbStrings.UserID
  import typings.activexDashAdodb.activexDashAdodbStrings.adStatus
  import typings.activexDashAdodb.activexDashAdodbStrings.pCommand
  import typings.activexDashAdodb.activexDashAdodbStrings.pConnection
  import typings.activexDashAdodb.activexDashAdodbStrings.pError
  import typings.activexDashAdodb.activexDashAdodbStrings.pRecordset

  type Connection_ExecuteComplete_ArgNames = js.Tuple6[RecordsAffected, pError, adStatus, pCommand, pRecordset, pConnection]
  type Connection_WillConnect_ArgNames = js.Tuple6[ConnectionString, UserID, Password, Options, adStatus, pConnection]
  type Connection_WillExecute_ArgNames = js.Tuple8[Source, CursorType, LockType, Options, adStatus, pCommand, pRecordset, pConnection]
}
