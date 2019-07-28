package typings.activexDashAdodb.ADODBNs.EventHelperTypesNs

import typings.activexDashAdodb.ADODBNs.Command
import typings.activexDashAdodb.ADODBNs.Connection
import typings.activexDashAdodb.ADODBNs.CursorTypeEnum
import typings.activexDashAdodb.ADODBNs.EventStatusEnum
import typings.activexDashAdodb.ADODBNs.Field
import typings.activexDashAdodb.ADODBNs.LockTypeEnum
import typings.activexDashAdodb.ADODBNs.Recordset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection_WillExecute_Parameter extends js.Object {
  var CursorType: CursorTypeEnum = js.native
  var LockType: LockTypeEnum = js.native
  var Options: Double = js.native
  var Source: String = js.native
  var adStatus: EventStatusEnum = js.native
  val pCommand: Command = js.native
  val pConnection: Connection = js.native
  @JSName("pRecordset")
  val pRecordset_Original: Recordset = js.native
  def pRecordset(FieldIndex: String): Field = js.native
  def pRecordset(FieldIndex: Double): Field = js.native
}

