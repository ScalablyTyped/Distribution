package typings.activexAdox.ADOX

import typings.activexAdodb.ADODB.Command
import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait View extends js.Object {
  @JSName("ADOX.View_typekey")
  var ADOXDotView_typekey: View = js.native
  var Command: typings.activexAdodb.ADODB.Command = js.native
  val DateCreated: VarDate = js.native
  val DateModified: VarDate = js.native
  val Name: String = js.native
}

object View {
  @scala.inline
  def apply(
    ADOXDotView_typekey: View,
    Command: Command,
    DateCreated: VarDate,
    DateModified: VarDate,
    Name: String
  ): View = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], DateCreated = DateCreated.asInstanceOf[js.Any], DateModified = DateModified.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.updateDynamic("ADOX.View_typekey")(ADOXDotView_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[View]
  }
  @scala.inline
  implicit class ViewOps[Self <: View] (val x: Self) extends AnyVal {
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
    def setADOXDotView_typekey(value: View): Self = this.set("ADOX.View_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommand(value: Command): Self = this.set("Command", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateCreated(value: VarDate): Self = this.set("DateCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateModified(value: VarDate): Self = this.set("DateModified", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
  
}

