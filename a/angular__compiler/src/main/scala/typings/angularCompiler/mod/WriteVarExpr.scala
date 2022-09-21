package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "WriteVarExpr")
@js.native
open class WriteVarExpr protected () extends Expression {
  def this(name: String, value: Expression) = this()
  def this(name: String, value: Expression, `type`: Type) = this()
  def this(name: String, value: Expression, `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(name: String, value: Expression, `type`: Unit, sourceSpan: ParseSourceSpan) = this()
  def this(name: String, value: Expression, `type`: Type, sourceSpan: ParseSourceSpan) = this()
  
  var name: String = js.native
  
  def toConstDecl(): DeclareVarStmt = js.native
  
  def toDeclStmt(): DeclareVarStmt = js.native
  def toDeclStmt(`type`: Null, modifiers: StmtModifier): DeclareVarStmt = js.native
  def toDeclStmt(`type`: Unit, modifiers: StmtModifier): DeclareVarStmt = js.native
  def toDeclStmt(`type`: Type): DeclareVarStmt = js.native
  def toDeclStmt(`type`: Type, modifiers: StmtModifier): DeclareVarStmt = js.native
  
  var value: Expression = js.native
}
