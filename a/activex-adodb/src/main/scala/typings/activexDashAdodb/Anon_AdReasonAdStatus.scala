package typings.activexDashAdodb

import typings.activexDashAdodb.ADODB.Error
import typings.activexDashAdodb.ADODB.EventReasonEnum
import typings.activexDashAdodb.ADODB.EventStatusEnum
import typings.activexDashAdodb.ADODB.Field
import typings.activexDashAdodb.ADODB.Recordset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AdReasonAdStatus extends js.Object {
  val adReason: EventReasonEnum = js.native
  var adStatus: EventStatusEnum = js.native
  val cRecords: Double = js.native
  val pError: Error = js.native
  @JSName("pRecordset")
  val pRecordset_Original: Recordset = js.native
  def pRecordset(FieldIndex: String): Field = js.native
  def pRecordset(FieldIndex: Double): Field = js.native
}

