package typings.appDashBuilderDashLib

import typings.appDashBuilderDashLib.outTargetsNsisNsisOptionsMod.NsisOptions
import typings.appDashBuilderDashLib.outTargetsNsisNsisScriptGeneratorMod.NsisScriptGenerator
import typings.appDashBuilderDashLib.outWinPackagerMod.WinPackager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/targets/nsis/nsisLicense", JSImport.Namespace)
@js.native
object outTargetsNsisNsisLicenseMod extends js.Object {
  def computeLicensePage(
    packager: WinPackager,
    options: NsisOptions,
    scriptGenerator: NsisScriptGenerator,
    languages: js.Array[String]
  ): js.Promise[Unit] = js.native
}

