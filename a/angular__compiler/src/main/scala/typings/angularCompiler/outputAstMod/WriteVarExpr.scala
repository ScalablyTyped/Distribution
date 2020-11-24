package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "WriteVarExpr")
@js.native
class WriteVarExpr protected () extends Expression {
  def this(name: String, value: Expression) = this()
  def this(name: String, value: Expression, `type`: Type) = this()
  def this(name: String, value: Expression, `type`: js.UndefOr[scala.Nothing], sourceSpan: ParseSourceSpan) = this()
  def this(name: String, value: Expression, `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(name: String, value: Expression, `type`: Type, sourceSpan: ParseSourceSpan) = this()
  
  var name: String = js.native
  
  def toConstDecl(): DeclareVarStmt = js.native
  
  def toDeclStmt(): DeclareVarStmt = js.native
  def toDeclStmt(`type`: js.UndefOr[scala.Nothing], modifiers: js.Array[StmtModifier]): DeclareVarStmt = js.native
  def toDeclStmt(`type`: Null, modifiers: js.Array[StmtModifier]): DeclareVarStmt = js.native
  def toDeclStmt(`type`: Type): DeclareVarStmt = js.native
  def toDeclStmt(`type`: Type, modifiers: js.Array[StmtModifier]): DeclareVarStmt = js.native
  
  var value: Expression = js.native
}
