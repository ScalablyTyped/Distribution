package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "CommaExpr")
@js.native
class CommaExpr protected ()
  extends typings.angularCompiler.srcCompilerMod.CommaExpr {
  def this(parts: js.Array[typings.angularCompiler.outputAstMod.Expression]) = this()
  def this(
    parts: js.Array[typings.angularCompiler.outputAstMod.Expression],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}
