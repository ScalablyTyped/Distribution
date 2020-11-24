package typings.angularCompiler.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "AssertNotNull")
@js.native
class AssertNotNull protected ()
  extends typings.angularCompiler.publicApiMod.AssertNotNull {
  def this(condition: typings.angularCompiler.outputAstMod.Expression) = this()
  def this(
    condition: typings.angularCompiler.outputAstMod.Expression,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}
