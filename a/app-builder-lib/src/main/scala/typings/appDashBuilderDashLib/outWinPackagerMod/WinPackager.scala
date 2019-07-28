package typings.appDashBuilderDashLib.outWinPackagerMod

import typings.appDashBuilderDashLib.outCodeSignWindowsCodeSignMod.CertificateFromStoreInfo
import typings.appDashBuilderDashLib.outCodeSignWindowsCodeSignMod.CertificateInfo
import typings.appDashBuilderDashLib.outCodeSignWindowsCodeSignMod.FileCodeSigningInfo
import typings.appDashBuilderDashLib.outOptionsWinOptionsMod.RequestedExecutionLevel
import typings.appDashBuilderDashLib.outOptionsWinOptionsMod.WindowsConfiguration
import typings.appDashBuilderDashLib.outPackagerMod.Packager
import typings.appDashBuilderDashLib.outPlatformPackagerMod.PlatformPackager
import typings.appDashBuilderDashLib.outVmVmMod.VmManager
import typings.builderDashUtil.outArchMod.Arch
import typings.lazyDashVal.lazyDashValMod.Lazy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/winPackager", "WinPackager")
@js.native
class WinPackager protected () extends PlatformPackager[WindowsConfiguration] {
  def this(info: Packager) = this()
  var _iconPath: js.Any = js.native
  val computedPublisherName: Lazy[js.Array[String] | Null] = js.native
  val cscInfo: Lazy[FileCodeSigningInfo | CertificateFromStoreInfo | Null] = js.native
  var doSign: js.Any = js.native
  val isForceCodeSigningVerification: Boolean = js.native
  var isSignDlls: js.Any = js.native
  val lazyCertInfo: Lazy[CertificateInfo | Null] = js.native
  val vm: Lazy[VmManager] = js.native
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
}

