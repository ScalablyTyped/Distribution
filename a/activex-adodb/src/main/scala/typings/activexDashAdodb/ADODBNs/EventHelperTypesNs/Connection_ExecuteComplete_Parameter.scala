package typings.activexDashAdodb.ADODBNs.EventHelperTypesNs

import typings.activexDashAdodb.ADODBNs.Command
import typings.activexDashAdodb.ADODBNs.Connection
import typings.activexDashAdodb.ADODBNs.Error
import typings.activexDashAdodb.ADODBNs.EventStatusEnum
import typings.activexDashAdodb.ADODBNs.Field
import typings.activexDashAdodb.ADODBNs.Recordset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection_ExecuteComplete_Parameter extends js.Object {
  val RecordsAffected: Double = js.native
  var adStatus: EventStatusEnum = js.native
  val pCommand: Command = js.native
  val pConnection: Connection = js.native
  val pError: Error = js.native
  @JSName("pRecordset")
  val pRecordset_Original: Recordset = js.native
  def pRecordset(FieldIndex: String): Field = js.native
  def pRecordset(FieldIndex: Double): Field = js.native
}

