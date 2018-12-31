package typings
package atAngularCompilerLib.srcCompilerUnderscoreUtilExpressionUnderscoreConverterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler_util/expression_converter", "ConvertActionBindingResult")
@js.native
class ConvertActionBindingResult protected () extends js.Object {
  def this(/**
    * Render2 compatible statements,
    */
  stmts: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement], /**
    * Variable name used with render2 compatible statements.
    */
  allowDefault: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadVarExpr) = this()
  /**
    * Variable name used with render2 compatible statements.
    */
  var allowDefault: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadVarExpr = js.native
  /**
    * Store statements which are render3 compatible.
    */
  var render3Stmts: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement] = js.native
  /**
    * Render2 compatible statements,
    */
  var stmts: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement] = js.native
}

