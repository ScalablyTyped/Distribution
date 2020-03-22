package typings.aceBuilds

import typings.aceBuilds.mod.Ace.Fold
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAction extends js.Object {
  var action: String
  var data: Fold
}

object AnonAction {
  @scala.inline
  def apply(action: String, data: Fold): AnonAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAction]
  }
}

