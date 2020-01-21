package typings.activexAdodb

import typings.activexAdodb.ADODB.Error
import typings.activexAdodb.ADODB.EventReasonEnum
import typings.activexAdodb.ADODB.EventStatusEnum
import typings.activexAdodb.ADODB.Field
import typings.activexAdodb.ADODB.Recordset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdReasonAdStatus extends js.Object {
  val adReason: EventReasonEnum = js.native
  var adStatus: EventStatusEnum = js.native
  val cRecords: Double = js.native
  val pError: Error = js.native
  @JSName("pRecordset")
  val pRecordset_Original: Recordset = js.native
  def pRecordset(FieldIndex: String): Field = js.native
  def pRecordset(FieldIndex: Double): Field = js.native
}

