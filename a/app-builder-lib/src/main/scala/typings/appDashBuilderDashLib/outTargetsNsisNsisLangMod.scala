package typings.appDashBuilderDashLib

import typings.appDashBuilderDashLib.outPlatformPackagerMod.PlatformPackager
import typings.appDashBuilderDashLib.outTargetsNsisNsisOptionsMod.NsisOptions
import typings.appDashBuilderDashLib.outTargetsNsisNsisScriptGeneratorMod.NsisScriptGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/targets/nsis/nsisLang", JSImport.Namespace)
@js.native
object outTargetsNsisNsisLangMod extends js.Object {
  @js.native
  class LangConfigurator protected () extends js.Object {
    def this(options: NsisOptions) = this()
    val isMultiLang: Boolean = js.native
    val langs: js.Array[String] = js.native
  }
  
  def addCustomMessageFileInclude(
    input: String,
    packager: PlatformPackager[_],
    scriptGenerator: NsisScriptGenerator,
    langConfigurator: LangConfigurator
  ): js.Promise[Unit] = js.native
  def createAddLangsMacro(scriptGenerator: NsisScriptGenerator, langConfigurator: LangConfigurator): Unit = js.native
}

