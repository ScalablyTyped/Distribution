package typings.activexAdox.ADOX

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ADOX.Procedure")
@js.native
class Procedure protected () extends js.Object {
  @JSName("ADOX.Procedure_typekey")
  var ADOXDotProcedure_typekey: Procedure = js.native
  var Command: typings.activexAdodb.ADODB.Command = js.native
  val DateCreated: VarDate | Null = js.native
  val DateModified: VarDate | Null = js.native
  val Name: String = js.native
}

