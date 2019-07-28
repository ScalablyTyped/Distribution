package typings.appDashBuilderDashLib.outConfigurationMod

import typings.appDashBuilderDashLib.outCoreMod.Target
import typings.appDashBuilderDashLib.outPlatformPackagerMod.PlatformPackager
import typings.builderDashUtil.outArchMod.Arch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AfterPackContext extends js.Object {
  val appOutDir: String
  val arch: Arch
  val electronPlatformName: String
  val outDir: String
  val packager: PlatformPackager[_]
  val targets: js.Array[Target]
}

object AfterPackContext {
  @scala.inline
  def apply(
    appOutDir: String,
    arch: Arch,
    electronPlatformName: String,
    outDir: String,
    packager: PlatformPackager[_],
    targets: js.Array[Target]
  ): AfterPackContext = {
    val __obj = js.Dynamic.literal(appOutDir = appOutDir, arch = arch, electronPlatformName = electronPlatformName, outDir = outDir, packager = packager, targets = targets)
  
    __obj.asInstanceOf[AfterPackContext]
  }
}

