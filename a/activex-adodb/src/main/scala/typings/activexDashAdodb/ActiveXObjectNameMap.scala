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
  @JSName("ADODB.Command")
  var ADODBDotCommand: Command = js.native
  @JSName("ADODB.Connection")
  var ADODBDotConnection: Connection = js.native
  @JSName("ADODB.Parameter")
  var ADODBDotParameter: Parameter = js.native
  @JSName("ADODB.Record")
  var ADODBDotRecord: Record = js.native
  @JSName("ADODB.Recordset")
  var ADODBDotRecordset_Original: Recordset = js.native
  @JSName("ADODB.Stream")
  var ADODBDotStream: Stream = js.native
  @JSName("ADODB.Recordset")
  def ADODBDotRecordset(FieldIndex: String): Field = js.native
  @JSName("ADODB.Recordset")
  def ADODBDotRecordset(FieldIndex: Double): Field = js.native
}

