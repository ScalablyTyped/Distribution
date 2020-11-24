package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "assertNotNull")
@js.native
object assertNotNull extends js.Object {
  
  def apply(expr: Expression): AssertNotNull_ = js.native
  def apply(expr: Expression, sourceSpan: ParseSourceSpan): AssertNotNull_ = js.native
}
