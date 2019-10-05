package typings.activexDashAdox.ADOX

import typings.activexDashAdodb.ADODB.Properties
import typings.activexDashAdodb.ADODB.Property
import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ADOX.Table")
@js.native
class Table protected () extends js.Object {
  var `ADOX.Table_typekey`: Table = js.native
  @JSName("Columns")
  val Columns_Original: Columns = js.native
  val DateCreated: VarDate = js.native
  val DateModified: VarDate = js.native
  @JSName("Indexes")
  val Indexes_Original: Indexes = js.native
  @JSName("Keys")
  val Keys_Original: Keys = js.native
  var Name: String = js.native
  var ParentCatalog: Catalog = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  val Type: String = js.native
  def Columns(Item: String): Column = js.native
  def Columns(Item: Double): Column = js.native
  def Indexes(Item: String): Index = js.native
  def Indexes(Item: Double): Index = js.native
  def Keys(Item: String): Key = js.native
  def Keys(Item: Double): Key = js.native
  def Properties(Index: String): Property = js.native
  def Properties(Index: Double): Property = js.native
}

