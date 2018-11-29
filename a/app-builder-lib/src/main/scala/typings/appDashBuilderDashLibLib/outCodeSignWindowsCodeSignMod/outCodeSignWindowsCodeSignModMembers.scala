package typings
package appDashBuilderDashLibLib.outCodeSignWindowsCodeSignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/codeSign/windowsCodeSign", JSImport.Namespace)
@js.native
object outCodeSignWindowsCodeSignModMembers extends js.Object {
  def getCertInfo(file: java.lang.String, password: java.lang.String): stdLib.Promise[CertificateInfo] = js.native
  def getCertificateFromStoreInfo(
    options: appDashBuilderDashLibLib.outOptionsWinOptionsMod.WindowsConfiguration,
    vm: appDashBuilderDashLibLib.outVmVmMod.VmManager
  ): stdLib.Promise[CertificateFromStoreInfo] = js.native
  def getSignVendorPath(): stdLib.Promise[java.lang.String] = js.native
  def sign(options: WindowsSignOptions, packager: appDashBuilderDashLibLib.outWinPackagerMod.WinPackager): stdLib.Promise[scala.Unit] = js.native
}

