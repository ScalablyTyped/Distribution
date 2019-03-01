package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Config extends js.Object {
  var config: js.UndefOr[atomLib.atomMod.Config] = js.undefined
  var project: js.UndefOr[atomLib.atomMod.Project] = js.undefined
  var refreshOnWindowFocus: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Config {
  @scala.inline
  def apply(
    config: atomLib.atomMod.Config = null,
    project: atomLib.atomMod.Project = null,
    refreshOnWindowFocus: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Config = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config)
    if (project != null) __obj.updateDynamic("project")(project)
    if (!js.isUndefined(refreshOnWindowFocus)) __obj.updateDynamic("refreshOnWindowFocus")(refreshOnWindowFocus)
    __obj.asInstanceOf[Anon_Config]
  }
}

