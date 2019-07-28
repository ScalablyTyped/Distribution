package typings.adone.adoneNs.appNs.INs

import typings.adone.adoneNs.appNs.Subsystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefineCommandFromSubsystemOptions extends js.Object {
  var configureArgs: js.UndefOr[js.Array[_]] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var group: js.UndefOr[String] = js.undefined
  var lazily: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var subsystem: String | Subsystem
  var transpile: js.UndefOr[Boolean] = js.undefined
}

object DefineCommandFromSubsystemOptions {
  @scala.inline
  def apply(
    subsystem: String | Subsystem,
    configureArgs: js.Array[_] = null,
    description: String = null,
    group: String = null,
    lazily: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    transpile: js.UndefOr[Boolean] = js.undefined
  ): DefineCommandFromSubsystemOptions = {
    val __obj = js.Dynamic.literal(subsystem = subsystem.asInstanceOf[js.Any])
    if (configureArgs != null) __obj.updateDynamic("configureArgs")(configureArgs)
    if (description != null) __obj.updateDynamic("description")(description)
    if (group != null) __obj.updateDynamic("group")(group)
    if (!js.isUndefined(lazily)) __obj.updateDynamic("lazily")(lazily)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(transpile)) __obj.updateDynamic("transpile")(transpile)
    __obj.asInstanceOf[DefineCommandFromSubsystemOptions]
  }
}

