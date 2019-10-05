package typings.activexDashAdodb

import typings.activexDashAdodb.ADODB.Command
import typings.activexDashAdodb.ADODB.Connection
import typings.activexDashAdodb.ADODB.Field
import typings.activexDashAdodb.ADODB.Parameter
import typings.activexDashAdodb.ADODB.Record
import typings.activexDashAdodb.ADODB.Recordset
import typings.activexDashAdodb.ADODB.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObjectNameMap extends js.Object {
  var `ADODB.Command`: Command = js.native
  var `ADODB.Connection`: Connection = js.native
  var `ADODB.Parameter`: Parameter = js.native
  var `ADODB.Record`: Record = js.native
  @JSName("ADODB.Recordset")
  var `ADODB.Recordset_Original`: Recordset = js.native
  var `ADODB.Stream`: Stream = js.native
  def `ADODB.Recordset`(FieldIndex: String): Field = js.native
  def `ADODB.Recordset`(FieldIndex: Double): Field = js.native
}

