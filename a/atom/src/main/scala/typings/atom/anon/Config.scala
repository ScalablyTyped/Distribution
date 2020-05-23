package typings.atom.anon

import typings.atom.mod.Project
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var config: js.UndefOr[typings.atom.mod.Config] = js.undefined
  var project: js.UndefOr[Project] = js.undefined
  var refreshOnWindowFocus: js.UndefOr[Boolean] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    config: typings.atom.mod.Config = null,
    project: Project = null,
    refreshOnWindowFocus: js.UndefOr[Boolean] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshOnWindowFocus)) __obj.updateDynamic("refreshOnWindowFocus")(refreshOnWindowFocus.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

