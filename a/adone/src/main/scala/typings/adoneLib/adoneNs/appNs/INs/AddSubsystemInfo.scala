package typings
package adoneLib.adoneNs.appNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddSubsystemInfo extends CommonAddSubsystemInfo {
  var subsystem: adoneLib.adoneNs.appNs.Subsystem | java.lang.String
}

object AddSubsystemInfo {
  @scala.inline
  def apply(
    subsystem: adoneLib.adoneNs.appNs.Subsystem | java.lang.String,
    bind: scala.Boolean | java.lang.String = null,
    configureArgs: js.Array[_] = null,
    description: java.lang.String = null,
    group: java.lang.String = null,
    name: java.lang.String = null,
    transpile: js.UndefOr[scala.Boolean] = js.undefined,
    useFilename: js.UndefOr[scala.Boolean] = js.undefined
  ): AddSubsystemInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("subsystem")(subsystem.asInstanceOf[js.Any])
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

