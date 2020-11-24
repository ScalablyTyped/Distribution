package typings.appBuilderLib

import typings.appBuilderLib.nsisOptionsMod.NsisOptions
import typings.appBuilderLib.nsisScriptGeneratorMod.NsisScriptGenerator
import typings.appBuilderLib.platformPackagerMod.PlatformPackager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/targets/nsis/nsisLang", JSImport.Namespace)
@js.native
object nsisLangMod extends js.Object {
  
  def addCustomMessageFileInclude(
    input: String,
    packager: PlatformPackager[_],
    scriptGenerator: NsisScriptGenerator,
    langConfigurator: LangConfigurator
  ): js.Promise[Unit] = js.native
  
  def createAddLangsMacro(scriptGenerator: NsisScriptGenerator, langConfigurator: LangConfigurator): Unit = js.native
  
  @js.native
  class LangConfigurator protected () extends js.Object {
    def this(options: NsisOptions) = this()
    
    val isMultiLang: Boolean = js.native
    
    val langs: js.Array[String] = js.native
  }
}
