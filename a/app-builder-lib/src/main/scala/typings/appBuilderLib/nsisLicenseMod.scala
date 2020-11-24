package typings.appBuilderLib

import typings.appBuilderLib.nsisOptionsMod.NsisOptions
import typings.appBuilderLib.nsisScriptGeneratorMod.NsisScriptGenerator
import typings.appBuilderLib.winPackagerMod.WinPackager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/targets/nsis/nsisLicense", JSImport.Namespace)
@js.native
object nsisLicenseMod extends js.Object {
  
  def computeLicensePage(
    packager: WinPackager,
    options: NsisOptions,
    scriptGenerator: NsisScriptGenerator,
    languages: js.Array[String]
  ): js.Promise[Unit] = js.native
}
