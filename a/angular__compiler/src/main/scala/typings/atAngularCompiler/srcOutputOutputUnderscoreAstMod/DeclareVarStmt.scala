package typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod

import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "DeclareVarStmt")
@js.native
class DeclareVarStmt protected () extends Statement {
  def this(name: String) = this()
  def this(name: String, value: Expression) = this()
  def this(name: String, value: js.UndefOr[scala.Nothing], `type`: Type) = this()
  def this(name: String, value: Expression, `type`: Type) = this()
  def this(name: String, value: js.UndefOr[scala.Nothing], `type`: Null, modifiers: js.Array[StmtModifier]) = this()
  def this(name: String, value: js.UndefOr[scala.Nothing], `type`: Type, modifiers: js.Array[StmtModifier]) = this()
  def this(name: String, value: Expression, `type`: Null, modifiers: js.Array[StmtModifier]) = this()
  def this(name: String, value: Expression, `type`: Type, modifiers: js.Array[StmtModifier]) = this()
  def this(
    name: String,
    value: js.UndefOr[scala.Nothing],
    `type`: Null,
    modifiers: js.Array[StmtModifier],
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    value: js.UndefOr[scala.Nothing],
    `type`: Null,
    modifiers: Null,
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    value: js.UndefOr[scala.Nothing],
    `type`: Type,
    modifiers: js.Array[StmtModifier],
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    value: js.UndefOr[scala.Nothing],
    `type`: Type,
    modifiers: Null,
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    value: Expression,
    `type`: Null,
    modifiers: js.Array[StmtModifier],
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(name: String, value: Expression, `type`: Null, modifiers: Null, sourceSpan: ParseSourceSpan) = this()
  def this(
    name: String,
    value: Expression,
    `type`: Type,
    modifiers: js.Array[StmtModifier],
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(name: String, value: Expression, `type`: Type, modifiers: Null, sourceSpan: ParseSourceSpan) = this()
  var name: String = js.native
  var `type`: Type | Null = js.native
  var value: js.UndefOr[Expression] = js.native
}

