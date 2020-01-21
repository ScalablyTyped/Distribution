package typings.appBuilderLib

import typings.appBuilderLib.linuxOptionsMod.LinuxConfiguration
import typings.appBuilderLib.packagerMod.Packager
import typings.appBuilderLib.platformPackagerMod.PlatformPackager
import typings.builderUtil.archMod.Arch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/linuxPackager", JSImport.Namespace)
@js.native
object linuxPackagerMod extends js.Object {
  @js.native
  class LinuxPackager protected () extends PlatformPackager[LinuxConfiguration] {
    def this(info: Packager) = this()
    val executableName: String = js.native
  }
  
  def toAppImageOrSnapArch(arch: Arch): String = js.native
}

