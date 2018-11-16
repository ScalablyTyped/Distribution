package typings
package appDashBuilderDashLibLib.appDashBuilderDashLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib", "PlatformPackager")
@js.native
abstract class PlatformPackager[DC /* <: appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.PlatformSpecificBuildOptions */] protected ()
  extends appDashBuilderDashLibLib.outPlatformPackagerMod.PlatformPackager[DC] {
  protected def this(info: appDashBuilderDashLibLib.outMod.Packager, platform: appDashBuilderDashLibLib.outMod.Platform) = this()
}

@JSImport("app-builder-lib", "PlatformPackager")
@js.native
object PlatformPackager extends js.Object {
  var buildAsyncTargets: js.Any = js.native
  var normalizePlatformSpecificBuildOptions: js.Any = js.native
}

