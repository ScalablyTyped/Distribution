package typings.adone.adoneNs.appNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadSubsystemOptions extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var group: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var transpile: js.UndefOr[Boolean] = js.undefined
}

object LoadSubsystemOptions {
  @scala.inline
  def apply(
    description: String = null,
    group: String = null,
    name: String = null,
    transpile: js.UndefOr[Boolean] = js.undefined
  ): LoadSubsystemOptions = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (group != null) __obj.updateDynamic("group")(group)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(transpile)) __obj.updateDynamic("transpile")(transpile)
    __obj.asInstanceOf[LoadSubsystemOptions]
  }
}

