package typings.appDashBuilderDashLib.outMod

import typings.appDashBuilderDashLib.outOptionsPlatformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out", "PlatformPackager")
@js.native
abstract class PlatformPackager[DC /* <: PlatformSpecificBuildOptions */] protected ()
  extends typings.appDashBuilderDashLib.outPlatformPackagerMod.PlatformPackager[DC] {
  protected def this(info: Packager, platform: Platform) = this()
}

/* static members */
@JSImport("app-builder-lib/out", "PlatformPackager")
@js.native
object PlatformPackager extends js.Object {
  var buildAsyncTargets: js.Any = js.native
  var normalizePlatformSpecificBuildOptions: js.Any = js.native
}

