package typings.atAngularCompiler.srcOutputAbstractUnderscoreJsUnderscoreEmitterMod

import typings.atAngularCompiler.srcOutputAbstractUnderscoreEmitterMod.AbstractEmitterVisitor
import typings.atAngularCompiler.srcOutputAbstractUnderscoreEmitterMod.EmitterVisitorContext
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.CastExpr
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.DeclareFunctionStmt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/abstract_js_emitter", "AbstractJsEmitterVisitor")
@js.native
abstract class AbstractJsEmitterVisitor () extends AbstractEmitterVisitor {
  var _visitClassConstructor: js.Any = js.native
  var _visitClassGetter: js.Any = js.native
  var _visitClassMethod: js.Any = js.native
  var _visitParams: js.Any = js.native
  def visitCastExpr(ast: CastExpr, ctx: EmitterVisitorContext): js.Any = js.native
  def visitDeclareFunctionStmt(stmt: DeclareFunctionStmt, ctx: EmitterVisitorContext): js.Any = js.native
}

