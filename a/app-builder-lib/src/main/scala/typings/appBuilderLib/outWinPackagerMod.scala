package typings.appBuilderLib

import typings.appBuilderLib.outCodeSignWindowsCodeSignMod.CertificateFromStoreInfo
import typings.appBuilderLib.outCodeSignWindowsCodeSignMod.CertificateInfo
import typings.appBuilderLib.outCodeSignWindowsCodeSignMod.FileCodeSigningInfo
import typings.appBuilderLib.outOptionsWinOptionsMod.RequestedExecutionLevel
import typings.appBuilderLib.outOptionsWinOptionsMod.WindowsConfiguration
import typings.appBuilderLib.outPackagerMod.Packager
import typings.appBuilderLib.outPlatformPackagerMod.PlatformPackager
import typings.appBuilderLib.outVmVmMod.VmManager
import typings.builderUtil.outArchMod.Arch
import typings.lazyVal.mod.Lazy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outWinPackagerMod {
  
  @JSImport("app-builder-lib/out/winPackager", "WinPackager")
  @js.native
  open class WinPackager protected () extends PlatformPackager[WindowsConfiguration] {
    def this(info: Packager) = this()
    
    /* private */ var _iconPath: Any = js.native
    
    val computedPublisherName: Lazy[js.Array[String] | Null] = js.native
    
    val cscInfo: Lazy[FileCodeSigningInfo | CertificateFromStoreInfo | Null] = js.native
    
    /* private */ var doSign: Any = js.native
    
    def isForceCodeSigningVerification: Boolean = js.native
    
    /* private */ var isSignDlls: Any = js.native
    
    val lazyCertInfo: Lazy[CertificateInfo | Null] = js.native
    
    def sign(file: String): js.Promise[Unit] = js.native
    def sign(file: String, logMessagePrefix: String): js.Promise[Unit] = js.native
    
    def signAndEditResources(file: String, arch: Arch, outDir: String): js.Promise[Unit] = js.native
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
    def signAndEditResources(
      file: String,
      arch: Arch,
      outDir: String,
      internalName: Unit,
      requestedExecutionLevel: RequestedExecutionLevel
    ): js.Promise[Unit] = js.native
    
    val vm: Lazy[VmManager] = js.native
  }
}
