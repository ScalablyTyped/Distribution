package typings.appBuilderLib.yarnMod

import typings.appBuilderLib.configurationMod.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/util/yarn", "installOrRebuild")
@js.native
object installOrRebuild extends js.Object {
  
  def apply(config: Configuration, appDir: String, options: RebuildOptions): js.Promise[Unit] = js.native
  def apply(config: Configuration, appDir: String, options: RebuildOptions, forceInstall: Boolean): js.Promise[Unit] = js.native
}
