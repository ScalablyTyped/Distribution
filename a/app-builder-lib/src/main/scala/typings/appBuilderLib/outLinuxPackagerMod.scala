package typings.appBuilderLib

import typings.appBuilderLib.outOptionsLinuxOptionsMod.LinuxConfiguration
import typings.appBuilderLib.outPackagerMod.Packager
import typings.appBuilderLib.outPlatformPackagerMod.PlatformPackager
import typings.builderUtil.outArchMod.Arch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outLinuxPackagerMod {
  
  @JSImport("app-builder-lib/out/linuxPackager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("app-builder-lib/out/linuxPackager", "LinuxPackager")
  @js.native
  open class LinuxPackager protected () extends PlatformPackager[LinuxConfiguration] {
    def this(info: Packager) = this()
    
    val executableName: String = js.native
  }
  
  inline def toAppImageOrSnapArch(arch: Arch): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toAppImageOrSnapArch")(arch.asInstanceOf[js.Any]).asInstanceOf[String]
}
