package typings.appBuilderLib.frameworkMod

import typings.appBuilderLib.electronFrameworkMod.ElectronPlatformName
import typings.appBuilderLib.mod.PlatformPackager
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
    val __obj = js.Dynamic.literal(appOutDir = appOutDir.asInstanceOf[js.Any], arch = arch.asInstanceOf[js.Any], packager = packager.asInstanceOf[js.Any], platformName = platformName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrepareApplicationStageDirectoryOptions]
  }
}

