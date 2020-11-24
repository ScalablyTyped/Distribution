package typings.activexAdodb.anon

import typings.activexAdodb.ADODB.Error
import typings.activexAdodb.ADODB.EventReasonEnum
import typings.activexAdodb.ADODB.EventStatusEnum
import typings.activexAdodb.ADODB.Field
import typings.activexAdodb.ADODB.Recordset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdReason extends js.Object {
  
  val adReason: EventReasonEnum = js.native
  
  var adStatus: EventStatusEnum = js.native
  
  val pError: Error = js.native
  
  def pRecordset(FieldIndex: String): Field = js.native
  def pRecordset(FieldIndex: Double): Field = js.native
  @JSName("pRecordset")
  val pRecordset_Original: Recordset = js.native
}
