package typings.activexAdodb.ADODB.EventHelperTypes

import typings.activexAdodb.ADODB.Command
import typings.activexAdodb.ADODB.Connection
import typings.activexAdodb.ADODB.CursorTypeEnum
import typings.activexAdodb.ADODB.EventStatusEnum
import typings.activexAdodb.ADODB.Field
import typings.activexAdodb.ADODB.LockTypeEnum
import typings.activexAdodb.ADODB.Recordset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionWillExecuteParameter extends js.Object {
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

