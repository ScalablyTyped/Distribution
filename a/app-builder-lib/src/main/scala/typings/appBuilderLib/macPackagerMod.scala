package typings.appBuilderLib

import typings.appBuilderLib.electronOsxSignMod.SignOptions
import typings.appBuilderLib.macCodeSignMod.CodeSigningInfo
import typings.appBuilderLib.macCodeSignMod.Identity
import typings.appBuilderLib.macOptionsMod.MacConfiguration
import typings.appBuilderLib.packagerMod.Packager
import typings.appBuilderLib.platformPackagerMod.PlatformPackager
import typings.lazyVal.mod.Lazy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object macPackagerMod {
  
  @JSImport("app-builder-lib/out/macPackager", JSImport.Default)
  @js.native
  class default protected () extends MacPackager {
    def this(info: Packager) = this()
  }
  
  @js.native
  trait MacPackager extends PlatformPackager[MacConfiguration] {
    
    /* private */ var _iconPath: js.Any = js.native
    
    /* private */ var adjustSignOptions: js.Any = js.native
    
    def applyCommonInfo(appPlist: js.Any, contentsPath: String): js.Promise[Unit] = js.native
    
    val codeSigningInfo: Lazy[CodeSigningInfo] = js.native
    
    /* protected */ def doFlat(appPath: String, outFile: String, identity: Identity): js.Promise[js.Any] = js.native
    /* protected */ def doFlat(appPath: String, outFile: String, identity: Identity, keychain: String): js.Promise[js.Any] = js.native
    
    /* protected */ def doSign(opts: SignOptions): js.Promise[js.Any] = js.native
    
    /* private */ var sign: js.Any = js.native
  }
}
