package typings.appBuilderLib

import typings.appBuilderLib.nsisOptionsMod.NsisOptions
import typings.appBuilderLib.nsisScriptGeneratorMod.NsisScriptGenerator
import typings.appBuilderLib.platformPackagerMod.PlatformPackager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nsisLangMod {
  
  @JSImport("app-builder-lib/out/targets/nsis/nsisLang", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("app-builder-lib/out/targets/nsis/nsisLang", "LangConfigurator")
  @js.native
  open class LangConfigurator protected () extends StObject {
    def this(options: NsisOptions) = this()
    
    val isMultiLang: Boolean = js.native
    
    val langs: js.Array[String] = js.native
  }
  
  inline def addCustomMessageFileInclude(
    input: String,
    packager: PlatformPackager[Any],
    scriptGenerator: NsisScriptGenerator,
    langConfigurator: LangConfigurator
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("addCustomMessageFileInclude")(input.asInstanceOf[js.Any], packager.asInstanceOf[js.Any], scriptGenerator.asInstanceOf[js.Any], langConfigurator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def createAddLangsMacro(scriptGenerator: NsisScriptGenerator, langConfigurator: LangConfigurator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAddLangsMacro")(scriptGenerator.asInstanceOf[js.Any], langConfigurator.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
