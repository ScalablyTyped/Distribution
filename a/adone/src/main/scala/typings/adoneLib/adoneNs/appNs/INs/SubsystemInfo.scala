package typings
package adoneLib.adoneNs.appNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubsystemInfo extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var group: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var subsystem: java.lang.String
  var transpile: js.UndefOr[scala.Boolean] = js.undefined
}

object SubsystemInfo {
  @scala.inline
  def apply(
    name: java.lang.String,
    subsystem: java.lang.String,
    description: java.lang.String = null,
    group: java.lang.String = null,
    transpile: js.UndefOr[scala.Boolean] = js.undefined
  ): SubsystemInfo = {
    val __obj = js.Dynamic.literal(name = name, subsystem = subsystem)
    if (description != null) __obj.updateDynamic("description")(description)
    if (group != null) __obj.updateDynamic("group")(group)
    if (!js.isUndefined(transpile)) __obj.updateDynamic("transpile")(transpile)
    __obj.asInstanceOf[SubsystemInfo]
  }
}

