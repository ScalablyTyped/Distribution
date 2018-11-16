package typings
package activexDashAdodbLib.ADODBNs.EventHelperTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection_ExecuteComplete_Parameter extends js.Object {
  val RecordsAffected: scala.Double = js.native
  var adStatus: activexDashAdodbLib.ADODBNs.EventStatusEnum = js.native
  val pCommand: activexDashAdodbLib.ADODBNs.Command = js.native
  val pConnection: activexDashAdodbLib.ADODBNs.Connection = js.native
  val pError: activexDashAdodbLib.ADODBNs.Error = js.native
  @JSName("pRecordset")
  val pRecordset_Original: activexDashAdodbLib.ADODBNs.Recordset = js.native
  def pRecordset(FieldIndex: java.lang.String): activexDashAdodbLib.ADODBNs.Field = js.native
  def pRecordset(FieldIndex: scala.Double): activexDashAdodbLib.ADODBNs.Field = js.native
}

