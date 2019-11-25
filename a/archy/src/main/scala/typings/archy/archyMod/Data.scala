package typings.archy.archyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var label: String
  var nodes: js.UndefOr[js.Array[Data | String]] = js.undefined
}

object Data {
  @scala.inline
  def apply(label: String, nodes: js.Array[Data | String] = null): Data = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

