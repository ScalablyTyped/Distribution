package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "TypeofExpr")
@js.native
class TypeofExpr_ protected () extends Expression {
  def this(expr: Expression) = this()
  def this(expr: Expression, `type`: Type) = this()
  def this(expr: Expression, `type`: js.UndefOr[scala.Nothing], sourceSpan: ParseSourceSpan) = this()
  def this(expr: Expression, `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(expr: Expression, `type`: Type, sourceSpan: ParseSourceSpan) = this()
  
  var expr: Expression = js.native
}
