package typings.activexAdodb.ADODB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventHelperTypes {
  type ConnectionExecuteCompleteArgNames = js.Tuple6[
    typings.activexAdodb.activexAdodbStrings.RecordsAffected, 
    typings.activexAdodb.activexAdodbStrings.pError, 
    typings.activexAdodb.activexAdodbStrings.adStatus, 
    typings.activexAdodb.activexAdodbStrings.pCommand, 
    typings.activexAdodb.activexAdodbStrings.pRecordset, 
    typings.activexAdodb.activexAdodbStrings.pConnection
  ]
  type ConnectionWillConnectArgNames = js.Tuple6[
    typings.activexAdodb.activexAdodbStrings.ConnectionString, 
    typings.activexAdodb.activexAdodbStrings.UserID, 
    typings.activexAdodb.activexAdodbStrings.Password, 
    typings.activexAdodb.activexAdodbStrings.Options, 
    typings.activexAdodb.activexAdodbStrings.adStatus, 
    typings.activexAdodb.activexAdodbStrings.pConnection
  ]
  type ConnectionWillExecuteArgNames = js.Tuple8[
    typings.activexAdodb.activexAdodbStrings.Source, 
    typings.activexAdodb.activexAdodbStrings.CursorType, 
    typings.activexAdodb.activexAdodbStrings.LockType, 
    typings.activexAdodb.activexAdodbStrings.Options, 
    typings.activexAdodb.activexAdodbStrings.adStatus, 
    typings.activexAdodb.activexAdodbStrings.pCommand, 
    typings.activexAdodb.activexAdodbStrings.pRecordset, 
    typings.activexAdodb.activexAdodbStrings.pConnection
  ]
}
