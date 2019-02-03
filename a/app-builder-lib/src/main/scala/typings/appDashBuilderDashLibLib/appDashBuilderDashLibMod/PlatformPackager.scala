package typings
package appDashBuilderDashLibLib.appDashBuilderDashLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib", "PlatformPackager")
@js.native
abstract class PlatformPackager[DC /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PlatformSpecificBuildOptions */ js.Any */] protected ()
  extends appDashBuilderDashLibLib.outPlatformPackagerMod.PlatformPackager[DC] {
  protected def this(info: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Packager */ js.Any, platform: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Platform */ js.Any) = this()
}

/* static members */
@JSImport("app-builder-lib", "PlatformPackager")
@js.native
object PlatformPackager extends js.Object {
  var buildAsyncTargets: js.Any = js.native
  var normalizePlatformSpecificBuildOptions: js.Any = js.native
}

