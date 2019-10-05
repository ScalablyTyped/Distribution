package typings.activexDashAdodb

import typings.activexDashAdodb.ADODB.EventStatusEnum
import typings.activexDashAdodb.ADODB.Field
import typings.activexDashAdodb.ADODB.Recordset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AdStatusMaxProgress extends js.Object {
  val MaxProgress: Double = js.native
  val Progress: Double = js.native
  var adStatus: EventStatusEnum = js.native
  @JSName("pRecordset")
  val pRecordset_Original: Recordset = js.native
  def pRecordset(FieldIndex: String): Field = js.native
  def pRecordset(FieldIndex: Double): Field = js.native
}

