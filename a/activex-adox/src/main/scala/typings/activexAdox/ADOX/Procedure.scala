package typings.activexAdox.ADOX

import typings.activexAdodb.ADODB.Command
import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Procedure extends js.Object {
  @JSName("ADOX.Procedure_typekey")
  var ADOXDotProcedure_typekey: Procedure
  var Command: typings.activexAdodb.ADODB.Command
  val DateCreated: VarDate | Null
  val DateModified: VarDate | Null
  val Name: String
}

object Procedure {
  @scala.inline
  def apply(
    ADOXDotProcedure_typekey: Procedure,
    Command: Command,
    Name: String,
    DateCreated: VarDate = null,
    DateModified: VarDate = null
  ): Procedure = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], DateCreated = DateCreated.asInstanceOf[js.Any], DateModified = DateModified.asInstanceOf[js.Any])
    __obj.updateDynamic("ADOX.Procedure_typekey")(ADOXDotProcedure_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Procedure]
  }
}

