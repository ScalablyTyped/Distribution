package typings.asana

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWorkspaceString extends js.Object {
  var workspace: String
}

object AnonWorkspaceString {
  @scala.inline
  def apply(workspace: String): AnonWorkspaceString = {
    val __obj = js.Dynamic.literal(workspace = workspace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonWorkspaceString]
  }
}

