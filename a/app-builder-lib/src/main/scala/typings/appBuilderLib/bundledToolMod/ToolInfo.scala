package typings.appBuilderLib.bundledToolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolInfo extends js.Object {
  var env: js.UndefOr[js.Any] = js.undefined
  var path: String
}

object ToolInfo {
  @scala.inline
  def apply(path: String, env: js.Any = null): ToolInfo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolInfo]
  }
}

