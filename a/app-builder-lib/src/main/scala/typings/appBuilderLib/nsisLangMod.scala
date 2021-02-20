package typings.appBuilderLib

import typings.appBuilderLib.nsisOptionsMod.NsisOptions
import typings.appBuilderLib.nsisScriptGeneratorMod.NsisScriptGenerator
import typings.appBuilderLib.platformPackagerMod.PlatformPackager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nsisLangMod {
  
  @JSImport("app-builder-lib/out/targets/nsis/nsisLang", "LangConfigurator")
  @js.native
  class LangConfigurator protected () extends StObject {
    def this(options: NsisOptions) = this()
    
    val isMultiLang: Boolean = js.native
    
    val langs: js.Array[String] = js.native
  }
  
  @JSImport("app-builder-lib/out/targets/nsis/nsisLang", "addCustomMessageFileInclude")
  @js.native
  def addCustomMessageFileInclude(
    input: String,
    packager: PlatformPackager[_],
    scriptGenerator: NsisScriptGenerator,
    langConfigurator: LangConfigurator
  ): js.Promise[Unit] = js.native
  
  @JSImport("app-builder-lib/out/targets/nsis/nsisLang", "createAddLangsMacro")
  @js.native
  def createAddLangsMacro(scriptGenerator: NsisScriptGenerator, langConfigurator: LangConfigurator): Unit = js.native
}
