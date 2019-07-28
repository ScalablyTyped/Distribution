package typings.appDashBuilderDashLib.outCodeSignWindowsCodeSignMod

import typings.appDashBuilderDashLib.outOptionsWinOptionsMod.WindowsConfiguration
import typings.appDashBuilderDashLib.outVmVmMod.VmManager
import typings.appDashBuilderDashLib.outWinPackagerMod.WinPackager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/codeSign/windowsCodeSign", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getCertInfo(file: String, password: String): js.Promise[CertificateInfo] = js.native
  def getCertificateFromStoreInfo(options: WindowsConfiguration, vm: VmManager): js.Promise[CertificateFromStoreInfo] = js.native
  def getSignVendorPath(): js.Promise[String] = js.native
  def sign(options: WindowsSignOptions, packager: WinPackager): js.Promise[Unit] = js.native
}

