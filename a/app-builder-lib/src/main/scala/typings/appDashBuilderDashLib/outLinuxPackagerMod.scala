package typings.appDashBuilderDashLib

import typings.appDashBuilderDashLib.outOptionsLinuxOptionsMod.LinuxConfiguration
import typings.appDashBuilderDashLib.outPackagerMod.Packager
import typings.appDashBuilderDashLib.outPlatformPackagerMod.PlatformPackager
import typings.builderDashUtil.outArchMod.Arch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/linuxPackager", JSImport.Namespace)
@js.native
object outLinuxPackagerMod extends js.Object {
  @js.native
  class LinuxPackager protected () extends PlatformPackager[LinuxConfiguration] {
    def this(info: Packager) = this()
    val executableName: String = js.native
  }
  
  def toAppImageOrSnapArch(arch: Arch): String = js.native
}

