package typings
package activexDashAdoxLib.ADOXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ADOX.Table")
@js.native
class Table protected () extends js.Object {
  var `ADOX.Table_typekey`: Table = js.native
  @JSName("Columns")
  val Columns_Original: Columns = js.native
  val DateCreated: activexDashInteropLib.VarDate = js.native
  val DateModified: activexDashInteropLib.VarDate = js.native
  @JSName("Indexes")
  val Indexes_Original: Indexes = js.native
  @JSName("Keys")
  val Keys_Original: Keys = js.native
  var Name: java.lang.String = js.native
  var ParentCatalog: Catalog = js.native
  @JSName("Properties")
  val Properties_Original: activexDashAdodbLib.ADODBNs.Properties = js.native
  val Type: java.lang.String = js.native
  def Columns(Item: java.lang.String): Column = js.native
  def Columns(Item: scala.Double): Column = js.native
  def Indexes(Item: java.lang.String): Index = js.native
  def Indexes(Item: scala.Double): Index = js.native
  def Keys(Item: java.lang.String): Key = js.native
  def Keys(Item: scala.Double): Key = js.native
  def Properties(Index: java.lang.String): activexDashAdodbLib.ADODBNs.Property = js.native
  def Properties(Index: scala.Double): activexDashAdodbLib.ADODBNs.Property = js.native
}

