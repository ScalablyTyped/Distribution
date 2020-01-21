package typings.atom

import typings.atom.mod.Config
import typings.atom.mod.Project
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfig extends js.Object {
  var config: js.UndefOr[Config] = js.undefined
  var project: js.UndefOr[Project] = js.undefined
  var refreshOnWindowFocus: js.UndefOr[Boolean] = js.undefined
}

object AnonConfig {
  @scala.inline
  def apply(
    config: Config = null,
    project: Project = null,
    refreshOnWindowFocus: js.UndefOr[Boolean] = js.undefined
  ): AnonConfig = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshOnWindowFocus)) __obj.updateDynamic("refreshOnWindowFocus")(refreshOnWindowFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfig]
  }
}

