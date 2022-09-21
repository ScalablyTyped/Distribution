package typings.appBuilderLib

import typings.appBuilderLib.nsisTargetMod.NsisTarget
import typings.appBuilderLib.nsisUtilMod.AppPackageHelper
import typings.appBuilderLib.winPackagerMod.WinPackager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webInstallerTargetMod {
  
  @JSImport("app-builder-lib/out/targets/nsis/WebInstallerTarget", "WebInstallerTarget")
  @js.native
  open class WebInstallerTarget protected () extends NsisTarget {
    def this(packager: WinPackager, outDir: String, targetName: String, packageHelper: AppPackageHelper) = this()
    
    /* protected */ def configureDefines(oneClick: Boolean, defines: Any): js.Promise[Any] = js.native
  }
}
