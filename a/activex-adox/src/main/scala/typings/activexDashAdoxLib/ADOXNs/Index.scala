package typings
package activexDashAdoxLib.ADOXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ADOX.Index")
@js.native
class Index protected () extends js.Object {
  var `ADOX.Index_typekey`: Index = js.native
  var Clustered: scala.Boolean = js.native
  @JSName("Columns")
  val Columns_Original: Columns = js.native
  var IndexNulls: AllowNullsEnum = js.native
  var Name: java.lang.String = js.native
  var PrimaryKey: scala.Boolean = js.native
  @JSName("Properties")
  val Properties_Original: activexDashAdodbLib.ADODBNs.Properties = js.native
  var Unique: scala.Boolean = js.native
  def Columns(Item: java.lang.String): Column = js.native
  def Columns(Item: scala.Double): Column = js.native
  def Properties(Index: java.lang.String): activexDashAdodbLib.ADODBNs.Property = js.native
  def Properties(Index: scala.Double): activexDashAdodbLib.ADODBNs.Property = js.native
}

