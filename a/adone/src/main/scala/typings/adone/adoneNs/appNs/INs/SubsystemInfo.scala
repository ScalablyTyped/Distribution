package typings.adone.adoneNs.appNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubsystemInfo extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var group: js.UndefOr[String] = js.undefined
  var name: String
  var subsystem: String
  var transpile: js.UndefOr[Boolean] = js.undefined
}

object SubsystemInfo {
  @scala.inline
  def apply(
    name: String,
    subsystem: String,
    description: String = null,
    group: String = null,
    transpile: js.UndefOr[Boolean] = js.undefined
  ): SubsystemInfo = {
    val __obj = js.Dynamic.literal(name = name, subsystem = subsystem)
    if (description != null) __obj.updateDynamic("description")(description)
    if (group != null) __obj.updateDynamic("group")(group)
    if (!js.isUndefined(transpile)) __obj.updateDynamic("transpile")(transpile)
    __obj.asInstanceOf[SubsystemInfo]
  }
}

