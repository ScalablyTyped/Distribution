package typings
package atAngularCompilerLib.srcAotGeneratedUnderscoreFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/generated_file", "GeneratedFile")
@js.native
class GeneratedFile protected () extends js.Object {
  def this(srcFileUrl: java.lang.String, genFileUrl: java.lang.String, sourceOrStmts: java.lang.String) = this()
  def this(srcFileUrl: java.lang.String, genFileUrl: java.lang.String, sourceOrStmts: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement]) = this()
  var genFileUrl: java.lang.String = js.native
  var source: java.lang.String | scala.Null = js.native
  var srcFileUrl: java.lang.String = js.native
  var stmts: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement] | scala.Null = js.native
  def isEquivalent(other: GeneratedFile): scala.Boolean = js.native
}

