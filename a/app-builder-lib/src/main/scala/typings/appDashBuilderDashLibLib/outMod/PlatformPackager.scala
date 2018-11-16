package typings
package appDashBuilderDashLibLib.outMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out", "PlatformPackager")
@js.native
abstract class PlatformPackager[DC /* <: appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.PlatformSpecificBuildOptions */] protected ()
  extends appDashBuilderDashLibLib.outPlatformPackagerMod.PlatformPackager[DC] {
  protected def this(info: Packager, platform: Platform) = this()
}

@JSImport("app-builder-lib/out", "PlatformPackager")
@js.native
object PlatformPackager extends js.Object {
  var buildAsyncTargets: js.Any = js.native
  var normalizePlatformSpecificBuildOptions: js.Any = js.native
}

