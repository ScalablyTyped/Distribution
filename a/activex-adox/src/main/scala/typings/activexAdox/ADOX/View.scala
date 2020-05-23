package typings.activexAdox.ADOX

import typings.activexAdodb.ADODB.Command
import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait View extends js.Object {
  @JSName("ADOX.View_typekey")
  var ADOXDotView_typekey: View
  var Command: typings.activexAdodb.ADODB.Command
  val DateCreated: VarDate
  val DateModified: VarDate
  val Name: String
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
}

