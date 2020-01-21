package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "AssertNotNull")
@js.native
class AssertNotNull protected ()
  extends typings.angularCompiler.srcCompilerMod.AssertNotNull {
  def this(condition: typings.angularCompiler.outputAstMod.Expression) = this()
  def this(
    condition: typings.angularCompiler.outputAstMod.Expression,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

