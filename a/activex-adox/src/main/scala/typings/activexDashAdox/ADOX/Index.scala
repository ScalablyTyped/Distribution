package typings.activexDashAdox.ADOX

import typings.activexDashAdodb.ADODB.Properties
import typings.activexDashAdodb.ADODB.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ADOX.Index")
@js.native
class Index protected () extends js.Object {
  @JSName("ADOX.Index_typekey")
  var ADOXDotIndex_typekey: Index = js.native
  var Clustered: Boolean = js.native
  @JSName("Columns")
  val Columns_Original: Columns = js.native
  var IndexNulls: AllowNullsEnum = js.native
  var Name: String = js.native
  var PrimaryKey: Boolean = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  var Unique: Boolean = js.native
  def Columns(Item: String): Column = js.native
  def Columns(Item: Double): Column = js.native
  def Properties(Index: String): Property = js.native
  def Properties(Index: Double): Property = js.native
}

