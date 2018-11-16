package typings
package appDashBuilderDashLibLib.outWindowsCodeSignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/windowsCodeSign", JSImport.Namespace)
@js.native
object outWindowsCodeSignModMembers extends js.Object {
  def getCertificateFromStoreInfo(
    options: appDashBuilderDashLibLib.outOptionsWinOptionsMod.WindowsConfiguration,
    vm: appDashBuilderDashLibLib.outVmVmMod.VmManager
  ): stdLib.Promise[CertificateFromStoreInfo] = js.native
  def getSignVendorPath(): stdLib.Promise[java.lang.String] = js.native
  def sign(options: WindowsSignOptions, packager: appDashBuilderDashLibLib.outWinPackagerMod.WinPackager): stdLib.Promise[scala.Unit] = js.native
}

