package typings
package adoneLib.adoneNs.appNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddSubsystemsFromOptions extends CommonAddSubsystemInfo {
  var filter: js.UndefOr[
    js.Array[java.lang.String] | (js.Function1[/* file */ java.lang.String, scala.Boolean | js.Promise[scala.Boolean]])
  ] = js.undefined
}

object AddSubsystemsFromOptions {
  @scala.inline
  def apply(
    bind: scala.Boolean | java.lang.String = null,
    configureArgs: js.Array[_] = null,
    description: java.lang.String = null,
    filter: js.Array[java.lang.String] | (js.Function1[/* file */ java.lang.String, scala.Boolean | js.Promise[scala.Boolean]]) = null,
    group: java.lang.String = null,
    name: java.lang.String = null,
    transpile: js.UndefOr[scala.Boolean] = js.undefined,
    useFilename: js.UndefOr[scala.Boolean] = js.undefined
  ): AddSubsystemsFromOptions = {
    val __obj = js.Dynamic.literal()
    if (bind != null) __obj.updateDynamic("bind")(bind.asInstanceOf[js.Any])
    if (configureArgs != null) __obj.updateDynamic("configureArgs")(configureArgs)
    if (description != null) __obj.updateDynamic("description")(description)
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(transpile)) __obj.updateDynamic("transpile")(transpile)
    if (!js.isUndefined(useFilename)) __obj.updateDynamic("useFilename")(useFilename)
    __obj.asInstanceOf[AddSubsystemsFromOptions]
  }
}

