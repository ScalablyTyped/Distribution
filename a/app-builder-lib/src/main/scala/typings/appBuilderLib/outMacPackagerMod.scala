package typings.appBuilderLib

import typings.appBuilderLib.outCodeSignMacCodeSignMod.CodeSigningInfo
import typings.appBuilderLib.outCodeSignMacCodeSignMod.Identity
import typings.appBuilderLib.outOptionsMacOptionsMod.MacConfiguration
import typings.appBuilderLib.outPackagerMod.Packager
import typings.appBuilderLib.outPlatformPackagerMod.PlatformPackager
import typings.electronOsxSign.mod.SignOptions
import typings.lazyVal.mod.Lazy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outMacPackagerMod {
  
  @JSImport("app-builder-lib/out/macPackager", JSImport.Default)
  @js.native
  open class default protected () extends MacPackager {
    def this(info: Packager) = this()
  }
  
  @js.native
  trait MacPackager extends PlatformPackager[MacConfiguration] {
    
    /* private */ var _iconPath: Any = js.native
    
    /* private */ var adjustSignOptions: Any = js.native
    
    def applyCommonInfo(appPlist: Any, contentsPath: String): js.Promise[Unit] = js.native
    
    val codeSigningInfo: Lazy[CodeSigningInfo] = js.native
    
    /* protected */ def doFlat(appPath: String, outFile: String, identity: Identity): js.Promise[Any] = js.native
    /* protected */ def doFlat(appPath: String, outFile: String, identity: Identity, keychain: String): js.Promise[Any] = js.native
    
    /* protected */ def doSign(opts: SignOptions): js.Promise[Any] = js.native
    
    /* private */ var sign: Any = js.native
  }
}
