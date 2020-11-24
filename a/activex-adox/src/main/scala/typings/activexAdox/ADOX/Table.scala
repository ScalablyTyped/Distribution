package typings.activexAdox.ADOX

import typings.activexAdodb.ADODB.Properties
import typings.activexAdodb.ADODB.Property
import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Table extends js.Object {
  
  @JSName("ADOX.Table_typekey")
  var ADOXDotTable_typekey: Table = js.native
  
  def Columns(Item: String): Column = js.native
  def Columns(Item: Double): Column = js.native
  @JSName("Columns")
  val Columns_Original: Columns = js.native
  
  val DateCreated: VarDate = js.native
  
  val DateModified: VarDate = js.native
  
  def Indexes(Item: String): Index = js.native
  def Indexes(Item: Double): Index = js.native
  @JSName("Indexes")
  val Indexes_Original: Indexes = js.native
  
  def Keys(Item: String): Key = js.native
  def Keys(Item: Double): Key = js.native
  @JSName("Keys")
  val Keys_Original: Keys = js.native
  
  var Name: String = js.native
  
  var ParentCatalog: Catalog = js.native
  
  def Properties(Index: String): Property = js.native
  def Properties(Index: Double): Property = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  
  val Type: String = js.native
}
