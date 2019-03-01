package typings
package adoneLib.adoneNs.appNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonAddSubsystemInfo extends js.Object {
  var bind: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var configureArgs: js.UndefOr[js.Array[_]] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var group: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var transpile: js.UndefOr[scala.Boolean] = js.undefined
  var useFilename: js.UndefOr[scala.Boolean] = js.undefined
}

object CommonAddSubsystemInfo {
  @scala.inline
  def apply(
    bind: scala.Boolean | java.lang.String = null,
    configureArgs: js.Array[_] = null,
    description: java.lang.String = null,
    group: java.lang.String = null,
    name: java.lang.String = null,
    transpile: js.UndefOr[scala.Boolean] = js.undefined,
    useFilename: js.UndefOr[scala.Boolean] = js.undefined
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

