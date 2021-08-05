package typings.angularCompiler

import typings.angularCompiler.outputAstMod.Statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generatedFileMod {
  
  @JSImport("@angular/compiler/src/aot/generated_file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler/src/aot/generated_file", "GeneratedFile")
  @js.native
  class GeneratedFile protected () extends StObject {
    def this(srcFileUrl: String, genFileUrl: String, sourceOrStmts: String) = this()
    def this(srcFileUrl: String, genFileUrl: String, sourceOrStmts: js.Array[Statement]) = this()
    
    var genFileUrl: String = js.native
    
    def isEquivalent(other: GeneratedFile): Boolean = js.native
    
    var source: String | Null = js.native
    
    var srcFileUrl: String = js.native
    
    var stmts: js.Array[Statement] | Null = js.native
  }
  
  inline def toTypeScript(file: GeneratedFile): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toTypeScript")(file.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toTypeScript(file: GeneratedFile, preamble: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toTypeScript")(file.asInstanceOf[js.Any], preamble.asInstanceOf[js.Any])).asInstanceOf[String]
}
