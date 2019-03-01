package typings
package adoneLib.adoneNs.appNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefineCommandFromSubsystemOptions extends js.Object {
  var configureArgs: js.UndefOr[js.Array[_]] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var group: js.UndefOr[java.lang.String] = js.undefined
  var lazily: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var subsystem: java.lang.String | adoneLib.adoneNs.appNs.Subsystem
  var transpile: js.UndefOr[scala.Boolean] = js.undefined
}

object DefineCommandFromSubsystemOptions {
  @scala.inline
  def apply(
    subsystem: java.lang.String | adoneLib.adoneNs.appNs.Subsystem,
    configureArgs: js.Array[_] = null,
    description: java.lang.String = null,
    group: java.lang.String = null,
    lazily: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    transpile: js.UndefOr[scala.Boolean] = js.undefined
  ): DefineCommandFromSubsystemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("subsystem")(subsystem.asInstanceOf[js.Any])
    if (configureArgs != null) __obj.updateDynamic("configureArgs")(configureArgs)
    if (description != null) __obj.updateDynamic("description")(description)
    if (group != null) __obj.updateDynamic("group")(group)
    if (!js.isUndefined(lazily)) __obj.updateDynamic("lazily")(lazily)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(transpile)) __obj.updateDynamic("transpile")(transpile)
    __obj.asInstanceOf[DefineCommandFromSubsystemOptions]
  }
}

