package typings.appBuilderLib

import typings.appBuilderLib.packagerMod.Packager
import typings.appBuilderLib.platformPackagerMod.PlatformPackager
import typings.appBuilderLib.vmMod.VmManager
import typings.appBuilderLib.winOptionsMod.RequestedExecutionLevel
import typings.appBuilderLib.winOptionsMod.WindowsConfiguration
import typings.appBuilderLib.windowsCodeSignMod.CertificateFromStoreInfo
import typings.appBuilderLib.windowsCodeSignMod.CertificateInfo
import typings.appBuilderLib.windowsCodeSignMod.FileCodeSigningInfo
import typings.builderUtil.archMod.Arch
import typings.lazyVal.mod.Lazy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/winPackager", JSImport.Namespace)
@js.native
object winPackagerMod extends js.Object {
  
  @js.native
  class WinPackager protected () extends PlatformPackager[WindowsConfiguration] {
    def this(info: Packager) = this()
    
    var _iconPath: js.Any = js.native
    
    val computedPublisherName: Lazy[js.Array[String] | Null] = js.native
    
    val cscInfo: Lazy[FileCodeSigningInfo | CertificateFromStoreInfo | Null] = js.native
    
    var doSign: js.Any = js.native
    
    def isForceCodeSigningVerification: Boolean = js.native
    
    var isSignDlls: js.Any = js.native
    
    val lazyCertInfo: Lazy[CertificateInfo | Null] = js.native
    
    def sign(file: String): js.Promise[Unit] = js.native
    def sign(file: String, logMessagePrefix: String): js.Promise[Unit] = js.native
    
    def signAndEditResources(file: String, arch: Arch, outDir: String): js.Promise[Unit] = js.native
    def signAndEditResources(
      file: String,
      arch: Arch,
      outDir: String,
      internalName: js.UndefOr[scala.Nothing],
      requestedExecutionLevel: RequestedExecutionLevel
    ): js.Promise[Unit] = js.native
    def signAndEditResources(file: String, arch: Arch, outDir: String, internalName: String): js.Promise[Unit] = js.native
    def signAndEditResources(
      file: String,
      arch: Arch,
      outDir: String,
      internalName: String,
      requestedExecutionLevel: RequestedExecutionLevel
    ): js.Promise[Unit] = js.native
    def signAndEditResources(
      file: String,
      arch: Arch,
      outDir: String,
      internalName: Null,
      requestedExecutionLevel: RequestedExecutionLevel
    ): js.Promise[Unit] = js.native
    
    val vm: Lazy[VmManager] = js.native
  }
}
