package typings.appBuilderLib

import typings.appBuilderLib.coreMod.Target
import typings.appBuilderLib.coreMod.TargetSpecificOptions
import typings.appBuilderLib.platformPackagerMod.PlatformPackager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object archiveTargetMod {
  
  @JSImport("app-builder-lib/out/targets/ArchiveTarget", "ArchiveTarget")
  @js.native
  class ArchiveTarget protected () extends Target {
    def this(name: String, outDir: String, packager: PlatformPackager[_]) = this()
    def this(name: String, outDir: String, packager: PlatformPackager[_], isWriteUpdateInfo: Boolean) = this()
    
    val isWriteUpdateInfo: js.Any = js.native
    
    @JSName("options")
    val options_ArchiveTarget: TargetSpecificOptions = js.native
    
    val packager: js.Any = js.native
  }
}
