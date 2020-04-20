package typings.aceBuilds

import typings.aceBuilds.mod.Ace.Command
import typings.aceBuilds.mod.Ace.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgs extends js.Object {
  var args: js.Array[_]
  var command: Command
  var editor: Editor
}

object AnonArgs {
  @scala.inline
  def apply(args: js.Array[_], command: Command, editor: Editor): AnonArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArgs]
  }
}

