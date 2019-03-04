package typings
package appDashBuilderDashLibLib.outConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AfterPackContext extends js.Object {
  val appOutDir: java.lang.String
  val arch: builderDashUtilLib.outArchMod.Arch
  val electronPlatformName: java.lang.String
  val outDir: java.lang.String
  val packager: appDashBuilderDashLibLib.outPlatformPackagerMod.PlatformPackager[_]
  val targets: js.Array[appDashBuilderDashLibLib.outCoreMod.Target]
}

object AfterPackContext {
  @scala.inline
  def apply(
    appOutDir: java.lang.String,
    arch: builderDashUtilLib.outArchMod.Arch,
    electronPlatformName: java.lang.String,
    outDir: java.lang.String,
    packager: appDashBuilderDashLibLib.outPlatformPackagerMod.PlatformPackager[_],
    targets: js.Array[appDashBuilderDashLibLib.outCoreMod.Target]
  ): AfterPackContext = {
    val __obj = js.Dynamic.literal(appOutDir = appOutDir, arch = arch, electronPlatformName = electronPlatformName, outDir = outDir, packager = packager, targets = targets)
  
    __obj.asInstanceOf[AfterPackContext]
  }
}

