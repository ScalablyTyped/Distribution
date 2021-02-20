package typings.appBuilderLib

import typings.appBuilderLib.nsisOptionsMod.NsisOptions
import typings.appBuilderLib.nsisScriptGeneratorMod.NsisScriptGenerator
import typings.appBuilderLib.winPackagerMod.WinPackager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nsisLicenseMod {
  
  @JSImport("app-builder-lib/out/targets/nsis/nsisLicense", "computeLicensePage")
  @js.native
  def computeLicensePage(
    packager: WinPackager,
    options: NsisOptions,
    scriptGenerator: NsisScriptGenerator,
    languages: js.Array[String]
  ): js.Promise[Unit] = js.native
}
