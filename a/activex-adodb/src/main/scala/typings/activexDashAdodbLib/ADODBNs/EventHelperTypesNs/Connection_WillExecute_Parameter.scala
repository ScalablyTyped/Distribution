package typings
package activexDashAdodbLib.ADODBNs.EventHelperTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection_WillExecute_Parameter extends js.Object {
  var CursorType: activexDashAdodbLib.ADODBNs.CursorTypeEnum = js.native
  var LockType: activexDashAdodbLib.ADODBNs.LockTypeEnum = js.native
  var Options: scala.Double = js.native
  var Source: java.lang.String = js.native
  var adStatus: activexDashAdodbLib.ADODBNs.EventStatusEnum = js.native
  val pCommand: activexDashAdodbLib.ADODBNs.Command = js.native
  val pConnection: activexDashAdodbLib.ADODBNs.Connection = js.native
  @JSName("pRecordset")
  val pRecordset_Original: activexDashAdodbLib.ADODBNs.Recordset = js.native
  def pRecordset(FieldIndex: java.lang.String): activexDashAdodbLib.ADODBNs.Field = js.native
  def pRecordset(FieldIndex: scala.Double): activexDashAdodbLib.ADODBNs.Field = js.native
}

