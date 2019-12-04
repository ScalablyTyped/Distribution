package typings.appDashBuilderDashLib.outUtilYarnMod

import typings.appDashBuilderDashLib.outConfigurationMod.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/util/yarn", "installOrRebuild")
@js.native
object installOrRebuild extends js.Object {
  def apply(config: Configuration, appDir: String, options: RebuildOptions): js.Promise[Unit] = js.native
  def apply(config: Configuration, appDir: String, options: RebuildOptions, forceInstall: Boolean): js.Promise[Unit] = js.native
}

