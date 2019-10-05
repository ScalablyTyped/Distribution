package typings.activexDashAdodb.ADODB.EventHelperTypes

import typings.activexDashAdodb.ADODB.Command
import typings.activexDashAdodb.ADODB.Connection
import typings.activexDashAdodb.ADODB.CursorTypeEnum
import typings.activexDashAdodb.ADODB.EventStatusEnum
import typings.activexDashAdodb.ADODB.Field
import typings.activexDashAdodb.ADODB.LockTypeEnum
import typings.activexDashAdodb.ADODB.Recordset
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

