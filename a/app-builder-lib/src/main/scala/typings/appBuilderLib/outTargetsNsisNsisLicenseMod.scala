package typings.appBuilderLib

import typings.appBuilderLib.outTargetsNsisNsisOptionsMod.NsisOptions
import typings.appBuilderLib.outTargetsNsisNsisScriptGeneratorMod.NsisScriptGenerator
import typings.appBuilderLib.outWinPackagerMod.WinPackager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outTargetsNsisNsisLicenseMod {
  
  @JSImport("app-builder-lib/out/targets/nsis/nsisLicense", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeLicensePage(
    packager: WinPackager,
    options: NsisOptions,
    scriptGenerator: NsisScriptGenerator,
    languages: js.Array[String]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeLicensePage")(packager.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scriptGenerator.asInstanceOf[js.Any], languages.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
