package typings.adone.adoneNs.appNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonAddSubsystemInfo extends js.Object {
  var bind: js.UndefOr[Boolean | String] = js.undefined
  var configureArgs: js.UndefOr[js.Array[_]] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var group: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var transpile: js.UndefOr[Boolean] = js.undefined
  var useFilename: js.UndefOr[Boolean] = js.undefined
}

object CommonAddSubsystemInfo {
  @scala.inline
  def apply(
    bind: Boolean | String = null,
    configureArgs: js.Array[_] = null,
    description: String = null,
    group: String = null,
    name: String = null,
    transpile: js.UndefOr[Boolean] = js.undefined,
    useFilename: js.UndefOr[Boolean] = js.undefined
  ): CommonAddSubsystemInfo = {
    val __obj = js.Dynamic.literal()
    if (bind != null) __obj.updateDynamic("bind")(bind.asInstanceOf[js.Any])
    if (configureArgs != null) __obj.updateDynamic("configureArgs")(configureArgs)
    if (description != null) __obj.updateDynamic("description")(description)
    if (group != null) __obj.updateDynamic("group")(group)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(transpile)) __obj.updateDynamic("transpile")(transpile)
    if (!js.isUndefined(useFilename)) __obj.updateDynamic("useFilename")(useFilename)
    __obj.asInstanceOf[CommonAddSubsystemInfo]
  }
}

