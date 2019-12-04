package typings.appDashBuilderDashLib

import typings.appDashBuilderDashLib.outTargetsNsisNsisTargetMod.NsisTarget
import typings.appDashBuilderDashLib.outTargetsNsisNsisUtilMod.AppPackageHelper
import typings.appDashBuilderDashLib.outWinPackagerMod.WinPackager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/targets/nsis/WebInstallerTarget", JSImport.Namespace)
@js.native
object outTargetsNsisWebInstallerTargetMod extends js.Object {
  @js.native
  class WebInstallerTarget protected () extends NsisTarget {
    def this(packager: WinPackager, outDir: String, targetName: String, packageHelper: AppPackageHelper) = this()
  }
  
}

