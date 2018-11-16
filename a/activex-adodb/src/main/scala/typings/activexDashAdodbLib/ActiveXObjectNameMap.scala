package typings
package activexDashAdodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObjectNameMap extends js.Object {
  var `ADODB.Command`: activexDashAdodbLib.ADODBNs.Command = js.native
  var `ADODB.Connection`: activexDashAdodbLib.ADODBNs.Connection = js.native
  var `ADODB.Parameter`: activexDashAdodbLib.ADODBNs.Parameter = js.native
  var `ADODB.Record`: activexDashAdodbLib.ADODBNs.Record = js.native
  @JSName("ADODB.Recordset")
  var `ADODB.Recordset_Original`: activexDashAdodbLib.ADODBNs.Recordset = js.native
  var `ADODB.Stream`: activexDashAdodbLib.ADODBNs.Stream = js.native
  def `ADODB.Recordset`(FieldIndex: java.lang.String): activexDashAdodbLib.ADODBNs.Field = js.native
  def `ADODB.Recordset`(FieldIndex: scala.Double): activexDashAdodbLib.ADODBNs.Field = js.native
}

