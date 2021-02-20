package typings.angularCompiler

import typings.angularCompiler.outputAstMod.Statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generatedFileMod {
  
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
  
  @JSImport("@angular/compiler/src/aot/generated_file", "toTypeScript")
  @js.native
  def toTypeScript(file: GeneratedFile): String = js.native
  @JSImport("@angular/compiler/src/aot/generated_file", "toTypeScript")
  @js.native
  def toTypeScript(file: GeneratedFile, preamble: String): String = js.native
}
