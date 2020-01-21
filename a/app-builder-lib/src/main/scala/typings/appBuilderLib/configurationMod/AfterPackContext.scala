package typings.appBuilderLib.configurationMod

import typings.appBuilderLib.coreMod.Target
import typings.appBuilderLib.platformPackagerMod.PlatformPackager
import typings.builderUtil.archMod.Arch
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
    val __obj = js.Dynamic.literal(appOutDir = appOutDir.asInstanceOf[js.Any], arch = arch.asInstanceOf[js.Any], electronPlatformName = electronPlatformName.asInstanceOf[js.Any], outDir = outDir.asInstanceOf[js.Any], packager = packager.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AfterPackContext]
  }
}

