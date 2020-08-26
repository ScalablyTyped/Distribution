package typings.activexAdox.ADOX

import typings.activexAdodb.ADODB.Command
import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Procedure extends js.Object {
  @JSName("ADOX.Procedure_typekey")
  var ADOXDotProcedure_typekey: Procedure = js.native
  var Command: typings.activexAdodb.ADODB.Command = js.native
  val DateCreated: VarDate | Null = js.native
  val DateModified: VarDate | Null = js.native
  val Name: String = js.native
}

object Procedure {
  @scala.inline
  def apply(ADOXDotProcedure_typekey: Procedure, Command: Command, Name: String): Procedure = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.updateDynamic("ADOX.Procedure_typekey")(ADOXDotProcedure_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Procedure]
  }
  @scala.inline
  implicit class ProcedureOps[Self <: Procedure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setADOXDotProcedure_typekey(value: Procedure): Self = this.set("ADOX.Procedure_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommand(value: Command): Self = this.set("Command", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateCreated(value: VarDate): Self = this.set("DateCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateCreatedNull: Self = this.set("DateCreated", null)
    @scala.inline
    def setDateModified(value: VarDate): Self = this.set("DateModified", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateModifiedNull: Self = this.set("DateModified", null)
  }
  
}

