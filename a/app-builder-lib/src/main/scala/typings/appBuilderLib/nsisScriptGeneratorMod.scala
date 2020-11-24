package typings.appBuilderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/targets/nsis/nsisScriptGenerator", JSImport.Namespace)
@js.native
object nsisScriptGeneratorMod extends js.Object {
  
  @js.native
  class NsisScriptGenerator () extends js.Object {
    
    def addIncludeDir(file: String): Unit = js.native
    
    def addPluginDir(pluginArch: String, dir: String): Unit = js.native
    
    def build(): String = js.native
    
    def file(outputName: String, file: String): Unit = js.native
    def file(outputName: Null, file: String): Unit = js.native
    
    def flags(flags: js.Array[String]): Unit = js.native
    
    def include(file: String): Unit = js.native
    
    def insertMacro(name: String, parameters: String): Unit = js.native
    
    val lines: js.Any = js.native
    
    def `macro`(name: String, lines: js.Array[String]): Unit = js.native
    def `macro`(name: String, lines: NsisScriptGenerator): Unit = js.native
  }
}
