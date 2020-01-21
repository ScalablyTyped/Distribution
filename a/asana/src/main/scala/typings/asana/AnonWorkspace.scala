package typings.asana

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWorkspace extends js.Object {
  var workspace: Double
}

object AnonWorkspace {
  @scala.inline
  def apply(workspace: Double): AnonWorkspace = {
    val __obj = js.Dynamic.literal(workspace = workspace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonWorkspace]
  }
}

