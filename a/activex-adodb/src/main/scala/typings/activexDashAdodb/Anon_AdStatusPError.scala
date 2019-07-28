package typings.activexDashAdodb

import typings.activexDashAdodb.ADODBNs.Error
import typings.activexDashAdodb.ADODBNs.EventStatusEnum
import typings.activexDashAdodb.ADODBNs.Field
import typings.activexDashAdodb.ADODBNs.Recordset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AdStatusPError extends js.Object {
  var adStatus: EventStatusEnum = js.native
  val pError: Error = js.native
  @JSName("pRecordset")
  val pRecordset_Original: Recordset = js.native
  def pRecordset(FieldIndex: String): Field = js.native
  def pRecordset(FieldIndex: Double): Field = js.native
}

