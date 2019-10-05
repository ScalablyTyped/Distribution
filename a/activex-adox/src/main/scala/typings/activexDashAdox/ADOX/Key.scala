package typings.activexDashAdox.ADOX

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ADOX.Key")
@js.native
class Key protected () extends js.Object {
  var `ADOX.Key_typekey`: Key = js.native
  @JSName("Columns")
  val Columns_Original: Columns = js.native
  var DeleteRule: RuleEnum = js.native
  var Name: String = js.native
  var RelatedTable: String = js.native
  var Type: KeyTypeEnum = js.native
  var UpdateRule: RuleEnum = js.native
  def Columns(Item: String): Column = js.native
  def Columns(Item: Double): Column = js.native
}

