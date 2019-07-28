package typings.atAngularCompiler.srcCompilerUnderscoreUtilExpressionUnderscoreConverterMod

import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.ReadVarExpr
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler_util/expression_converter", "ConvertActionBindingResult")
@js.native
class ConvertActionBindingResult protected () extends js.Object {
  def this(
    /**
    * Render2 compatible statements,
    */
  stmts: js.Array[Statement],
    /**
    * Variable name used with render2 compatible statements.
    */
  allowDefault: ReadVarExpr
  ) = this()
  /**
    * Variable name used with render2 compatible statements.
    */
  var allowDefault: ReadVarExpr = js.native
  /**
    * Store statements which are render3 compatible.
    */
  var render3Stmts: js.Array[Statement] = js.native
  /**
    * Render2 compatible statements,
    */
  var stmts: js.Array[Statement] = js.native
}

