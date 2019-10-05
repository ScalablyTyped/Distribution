package typings.appDashBuilderDashLib.outCodeSignWindowsCodeSignMod

import typings.appDashBuilderDashLib.outOptionsWinOptionsMod.WindowsConfiguration
import typings.appDashBuilderDashLib.outVmVmMod.VmManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/codeSign/windowsCodeSign", "getCertificateFromStoreInfo")
@js.native
object getCertificateFromStoreInfo extends js.Object {
  def apply(options: WindowsConfiguration, vm: VmManager): js.Promise[CertificateFromStoreInfo] = js.native
}

