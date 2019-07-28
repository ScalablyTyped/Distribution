package typings.appDashBuilderDashLib.outFrameworkMod

import typings.appDashBuilderDashLib.outElectronElectronFrameworkMod.ElectronPlatformName
import typings.appDashBuilderDashLib.outMod.PlatformPackager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrepareApplicationStageDirectoryOptions extends js.Object {
  /**
    * Platform doesn't process application output directory in any way. Unpack implementation must create or empty dir if need.
    */
  val appOutDir: String
  val arch: String
  val packager: PlatformPackager[_]
  val platformName: ElectronPlatformName
  val version: String
}

object PrepareApplicationStageDirectoryOptions {
  @scala.inline
  def apply(
    appOutDir: String,
    arch: String,
    packager: PlatformPackager[_],
    platformName: ElectronPlatformName,
    version: String
  ): PrepareApplicationStageDirectoryOptions = {
    val __obj = js.Dynamic.literal(appOutDir = appOutDir, arch = arch, packager = packager, platformName = platformName, version = version)
  
    __obj.asInstanceOf[PrepareApplicationStageDirectoryOptions]
  }
}

