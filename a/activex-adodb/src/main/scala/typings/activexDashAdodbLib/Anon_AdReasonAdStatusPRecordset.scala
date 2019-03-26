package typings
package activexDashAdodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AdReasonAdStatusPRecordset extends js.Object {
  val adReason: activexDashAdodbLib.ADODBNs.EventReasonEnum = js.native
  var adStatus: activexDashAdodbLib.ADODBNs.EventStatusEnum = js.native
  @JSName("pRecordset")
  val pRecordset_Original: activexDashAdodbLib.ADODBNs.Recordset = js.native
  def pRecordset(FieldIndex: java.lang.String): activexDashAdodbLib.ADODBNs.Field = js.native
  def pRecordset(FieldIndex: scala.Double): activexDashAdodbLib.ADODBNs.Field = js.native
}

