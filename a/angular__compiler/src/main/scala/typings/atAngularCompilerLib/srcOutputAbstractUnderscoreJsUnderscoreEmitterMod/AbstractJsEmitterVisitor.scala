package typings
package atAngularCompilerLib.srcOutputAbstractUnderscoreJsUnderscoreEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/abstract_js_emitter", "AbstractJsEmitterVisitor")
@js.native
abstract class AbstractJsEmitterVisitor ()
  extends atAngularCompilerLib.srcOutputAbstractUnderscoreEmitterMod.AbstractEmitterVisitor {
  var _visitClassConstructor: js.Any = js.native
  var _visitClassGetter: js.Any = js.native
  var _visitClassMethod: js.Any = js.native
  var _visitParams: js.Any = js.native
  def visitCastExpr(
    ast: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.CastExpr,
    ctx: atAngularCompilerLib.srcOutputAbstractUnderscoreEmitterMod.EmitterVisitorContext
  ): js.Any = js.native
  def visitDeclareFunctionStmt(
    stmt: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.DeclareFunctionStmt,
    ctx: atAngularCompilerLib.srcOutputAbstractUnderscoreEmitterMod.EmitterVisitorContext
  ): js.Any = js.native
}

