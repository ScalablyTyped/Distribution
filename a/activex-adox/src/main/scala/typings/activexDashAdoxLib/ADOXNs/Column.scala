package typings
package activexDashAdoxLib.ADOXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ADOX.Column")
@js.native
class Column protected () extends js.Object {
  var `ADOX.Column_typekey`: Column = js.native
  var Attributes: ColumnAttributesEnum = js.native
  var DefinedSize: scala.Double = js.native
  var Name: java.lang.String = js.native
  var NumericScale: scala.Double = js.native
  var ParentCatalog: Catalog = js.native
  var Precision: scala.Double = js.native
  @JSName("Properties")
  val Properties_Original: activexDashAdodbLib.ADODBNs.Properties = js.native
  var RelatedColumn: java.lang.String = js.native
  var SortOrder: SortOrderEnum = js.native
  var Type: activexDashAdodbLib.ADODBNs.DataTypeEnum = js.native
  def Properties(Index: java.lang.String): activexDashAdodbLib.ADODBNs.Property = js.native
  def Properties(Index: scala.Double): activexDashAdodbLib.ADODBNs.Property = js.native
}

