package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "BoundTextAst")
@js.native
class BoundTextAst protected ()
  extends typings.angularCompiler.srcCompilerMod.BoundTextAst {
  def this(
    value: typings.angularCompiler.astMod.ASTWithSource,
    ngContentIndex: Double,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}
