package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "WriteVarExpr")
@js.native
class WriteVarExpr protected () extends Expression {
  def this(name: java.lang.String, value: Expression) = this()
  def this(name: java.lang.String, value: Expression, `type`: Type) = this()
  def this(name: java.lang.String, value: Expression, `type`: Type, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, value: Expression, `type`: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  var name: java.lang.String = js.native
  var value: Expression = js.native
  def toConstDecl(): DeclareVarStmt = js.native
  def toDeclStmt(): DeclareVarStmt = js.native
  def toDeclStmt(`type`: Type): DeclareVarStmt = js.native
  def toDeclStmt(`type`: Type, modifiers: js.Array[StmtModifier]): DeclareVarStmt = js.native
  def toDeclStmt(`type`: scala.Null, modifiers: js.Array[StmtModifier]): DeclareVarStmt = js.native
}

