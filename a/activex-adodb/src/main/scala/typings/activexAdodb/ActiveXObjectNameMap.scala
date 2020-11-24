package typings.activexAdodb

import typings.activexAdodb.ADODB.Command
import typings.activexAdodb.ADODB.Connection
import typings.activexAdodb.ADODB.Field
import typings.activexAdodb.ADODB.Parameter
import typings.activexAdodb.ADODB.Record
import typings.activexAdodb.ADODB.Recordset
import typings.activexAdodb.ADODB.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def ADODBDotRecordset(FieldIndex: String): Field = js.native
  @JSName("ADODB.Recordset")
  def ADODBDotRecordset(FieldIndex: Double): Field = js.native
  @JSName("ADODB.Recordset")
  var ADODBDotRecordset_Original: Recordset = js.native
  
  @JSName("ADODB.Stream")
  var ADODBDotStream: Stream = js.native
}
