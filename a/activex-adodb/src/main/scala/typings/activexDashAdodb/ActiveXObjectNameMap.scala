package typings.activexDashAdodb

import typings.activexDashAdodb.ADODBNs.Command
import typings.activexDashAdodb.ADODBNs.Connection
import typings.activexDashAdodb.ADODBNs.Field
import typings.activexDashAdodb.ADODBNs.Parameter
import typings.activexDashAdodb.ADODBNs.Record
import typings.activexDashAdodb.ADODBNs.Recordset
import typings.activexDashAdodb.ADODBNs.Stream
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

