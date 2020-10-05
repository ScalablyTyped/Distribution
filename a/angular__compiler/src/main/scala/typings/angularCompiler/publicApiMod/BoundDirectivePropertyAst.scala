package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "BoundDirectivePropertyAst")
@js.native
class BoundDirectivePropertyAst protected ()
  extends typings.angularCompiler.srcCompilerMod.BoundDirectivePropertyAst {
  def this(
    directiveName: String,
    templateName: String,
    value: typings.angularCompiler.astMod.ASTWithSource,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

