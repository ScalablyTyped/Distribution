package typings
package adoneLib.adoneNs.appNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadSubsystemOptions extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var group: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var transpile: js.UndefOr[scala.Boolean] = js.undefined
}

object LoadSubsystemOptions {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    group: java.lang.String = null,
    name: java.lang.String = null,
    transpile: js.UndefOr[scala.Boolean] = js.undefined
  ): LoadSubsystemOptions = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (group != null) __obj.updateDynamic("group")(group)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(transpile)) __obj.updateDynamic("transpile")(transpile)
    __obj.asInstanceOf[LoadSubsystemOptions]
  }
}

