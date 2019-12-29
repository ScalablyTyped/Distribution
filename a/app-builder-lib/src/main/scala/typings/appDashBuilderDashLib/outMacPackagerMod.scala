package typings.appDashBuilderDashLib

import typings.appDashBuilderDashLib.electronDashOsxDashSignMod.SignOptions
import typings.appDashBuilderDashLib.outCodeSignMacCodeSignMod.CodeSigningInfo
import typings.appDashBuilderDashLib.outCodeSignMacCodeSignMod.Identity
import typings.appDashBuilderDashLib.outOptionsMacOptionsMod.MacConfiguration
import typings.appDashBuilderDashLib.outPackagerMod.Packager
import typings.appDashBuilderDashLib.outPlatformPackagerMod.PlatformPackager
import typings.lazyDashVal.lazyDashValMod.Lazy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/macPackager", JSImport.Namespace)
@js.native
object outMacPackagerMod extends js.Object {
  @js.native
  trait MacPackager extends PlatformPackager[MacConfiguration] {
    var _iconPath: js.Any = js.native
    var adjustSignOptions: js.Any = js.native
    val codeSigningInfo: Lazy[CodeSigningInfo] = js.native
    var sign: js.Any = js.native
    def applyCommonInfo(appPlist: js.Any, contentsPath: String): js.Promise[Unit] = js.native
    /* protected */ def doFlat(appPath: String, outFile: String, identity: Identity): js.Promise[_] = js.native
    /* protected */ def doFlat(appPath: String, outFile: String, identity: Identity, keychain: String): js.Promise[_] = js.native
    /* protected */ def doSign(opts: SignOptions): js.Promise[_] = js.native
  }
  
  @js.native
  class default protected () extends MacPackager {
    def this(info: Packager) = this()
  }
  
}

