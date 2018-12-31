package typings
package appDashBuilderDashLibLib.outFrameworkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrepareApplicationStageDirectoryOptions extends js.Object {
  /**
    * Platform doesn't process application output directory in any way. Unpack implementation must create or empty dir if need.
    */
  val appOutDir: java.lang.String
  val arch: java.lang.String
  val packager: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify PlatformPackager<any> */ js.Any
  val platformName: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify ElectronPlatformName */ js.Any
  val version: java.lang.String
}

