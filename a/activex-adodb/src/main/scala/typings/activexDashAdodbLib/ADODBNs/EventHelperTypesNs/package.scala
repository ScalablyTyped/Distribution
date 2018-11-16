package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventHelperTypesNs {
  type Connection_ExecuteComplete_ArgNames = js.Tuple6[
    activexDashAdodbLib.activexDashAdodbLibStrings.RecordsAffected, 
    activexDashAdodbLib.activexDashAdodbLibStrings.pError, 
    activexDashAdodbLib.activexDashAdodbLibStrings.adStatus, 
    activexDashAdodbLib.activexDashAdodbLibStrings.pCommand, 
    activexDashAdodbLib.activexDashAdodbLibStrings.pRecordset, 
    activexDashAdodbLib.activexDashAdodbLibStrings.pConnection
  ]
  type Connection_WillConnect_ArgNames = js.Tuple6[
    activexDashAdodbLib.activexDashAdodbLibStrings.ConnectionString, 
    activexDashAdodbLib.activexDashAdodbLibStrings.UserID, 
    activexDashAdodbLib.activexDashAdodbLibStrings.Password, 
    activexDashAdodbLib.activexDashAdodbLibStrings.Options, 
    activexDashAdodbLib.activexDashAdodbLibStrings.adStatus, 
    activexDashAdodbLib.activexDashAdodbLibStrings.pConnection
  ]
  type Connection_WillExecute_ArgNames = js.Tuple8[
    activexDashAdodbLib.activexDashAdodbLibStrings.Source, 
    activexDashAdodbLib.activexDashAdodbLibStrings.CursorType, 
    activexDashAdodbLib.activexDashAdodbLibStrings.LockType, 
    activexDashAdodbLib.activexDashAdodbLibStrings.Options, 
    activexDashAdodbLib.activexDashAdodbLibStrings.adStatus, 
    activexDashAdodbLib.activexDashAdodbLibStrings.pCommand, 
    activexDashAdodbLib.activexDashAdodbLibStrings.pRecordset, 
    activexDashAdodbLib.activexDashAdodbLibStrings.pConnection
  ]
}
