package typings.adone.adoneNs.appNs.INs

import typings.adone.adoneNs.appNs.Subsystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddSubsystemInfo extends CommonAddSubsystemInfo {
  var subsystem: Subsystem | String
}

object AddSubsystemInfo {
  @scala.inline
  def apply(
    subsystem: Subsystem | String,
    bind: Boolean | String = null,
    configureArgs: js.Array[_] = null,
    description: String = null,
    group: String = null,
    name: String = null,
    transpile: js.UndefOr[Boolean] = js.undefined,
    useFilename: js.UndefOr[Boolean] = js.undefined
  ): AddSubsystemInfo = {
    val __obj = js.Dynamic.literal(subsystem = subsystem.asInstanceOf[js.Any])
    if (bind != null) __obj.updateDynamic("bind")(bind.asInstanceOf[js.Any])
    if (configureArgs != null) __obj.updateDynamic("configureArgs")(configureArgs)
    if (description != null) __obj.updateDynamic("description")(description)
    if (group != null) __obj.updateDynamic("group")(group)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(transpile)) __obj.updateDynamic("transpile")(transpile)
    if (!js.isUndefined(useFilename)) __obj.updateDynamic("useFilename")(useFilename)
    __obj.asInstanceOf[AddSubsystemInfo]
  }
}

