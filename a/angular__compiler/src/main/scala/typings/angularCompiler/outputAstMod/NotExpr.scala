package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "NotExpr")
@js.native
class NotExpr protected () extends Expression {
  def this(condition: Expression) = this()
  def this(condition: Expression, sourceSpan: ParseSourceSpan) = this()
  
  var condition: Expression = js.native
}
