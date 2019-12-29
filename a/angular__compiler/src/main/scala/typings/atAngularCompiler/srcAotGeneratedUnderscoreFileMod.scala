package typings.atAngularCompiler

import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/generated_file", JSImport.Namespace)
@js.native
object srcAotGeneratedUnderscoreFileMod extends js.Object {
  @js.native
  class GeneratedFile protected () extends js.Object {
    def this(srcFileUrl: String, genFileUrl: String, sourceOrStmts: String) = this()
    def this(srcFileUrl: String, genFileUrl: String, sourceOrStmts: js.Array[Statement]) = this()
    var genFileUrl: String = js.native
    var source: String | Null = js.native
    var srcFileUrl: String = js.native
    var stmts: js.Array[Statement] | Null = js.native
    def isEquivalent(other: GeneratedFile): Boolean = js.native
  }
  
  def toTypeScript(file: GeneratedFile): String = js.native
  def toTypeScript(file: GeneratedFile, preamble: String): String = js.native
}

