package typings.appBuilderLib.yarnMod

import typings.node.processMod.global.NodeJS.Platform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/util/yarn", "getGypEnv")
@js.native
object getGypEnv extends js.Object {
  def apply(frameworkInfo: DesktopFrameworkInfo, platform: Platform, arch: String, buildFromSource: Boolean): js.Any = js.native
}

