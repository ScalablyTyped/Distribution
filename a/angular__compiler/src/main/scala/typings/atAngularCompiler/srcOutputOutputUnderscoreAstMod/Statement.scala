package typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod

import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "Statement")
@js.native
abstract class Statement () extends js.Object {
  def this(modifiers: js.Array[StmtModifier]) = this()
  def this(modifiers: js.Array[StmtModifier], sourceSpan: ParseSourceSpan) = this()
  def this(modifiers: Null, sourceSpan: ParseSourceSpan) = this()
  var modifiers: js.Array[StmtModifier] = js.native
  var sourceSpan: ParseSourceSpan | Null = js.native
  def hasModifier(modifier: StmtModifier): Boolean = js.native
  /**
    * Calculates whether this statement produces the same value as the given statement.
    * Note: We don't check Types nor ParseSourceSpans nor function arguments.
    */
  def isEquivalent(stmt: Statement): Boolean = js.native
  def visitStatement(visitor: StatementVisitor, context: js.Any): js.Any = js.native
}

