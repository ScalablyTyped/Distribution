package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "Statement")
@js.native
abstract class Statement () extends js.Object {
  def this(modifiers: js.Array[StmtModifier]) = this()
  def this(modifiers: js.Array[StmtModifier], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(modifiers: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  var modifiers: js.Array[StmtModifier] = js.native
  var sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan | scala.Null = js.native
  def hasModifier(modifier: StmtModifier): scala.Boolean = js.native
  /**
    * Calculates whether this statement produces the same value as the given statement.
    * Note: We don't check Types nor ParseSourceSpans nor function arguments.
    */
  def isEquivalent(stmt: Statement): scala.Boolean = js.native
  def visitStatement(visitor: StatementVisitor, context: js.Any): js.Any = js.native
}

