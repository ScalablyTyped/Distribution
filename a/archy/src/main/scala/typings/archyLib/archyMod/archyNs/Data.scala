package typings
package archyLib.archyMod.archyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var label: java.lang.String
  var nodes: js.UndefOr[js.Array[Data | java.lang.String]] = js.undefined
}

object Data {
  @scala.inline
  def apply(label: java.lang.String, nodes: js.Array[Data | java.lang.String] = null): Data = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("label")(label)
    if (nodes != null) __obj.updateDynamic("nodes")(nodes)
    __obj.asInstanceOf[Data]
  }
}

