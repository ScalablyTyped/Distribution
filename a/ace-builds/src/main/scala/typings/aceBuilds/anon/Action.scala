package typings.aceBuilds.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  var action: String
  var data: typings.aceBuilds.mod.Ace.Fold
}

object Action {
  @scala.inline
  def apply(action: String, data: typings.aceBuilds.mod.Ace.Fold): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

