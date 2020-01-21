package typings.angularCompiler.publicApiMod

import typings.angularCompiler.coreMod.SecurityContext
import typings.angularCompiler.templateAstMod.PropertyBindingType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "BoundElementPropertyAst")
@js.native
class BoundElementPropertyAst protected ()
  extends typings.angularCompiler.srcCompilerMod.BoundElementPropertyAst {
  def this(
    name: String,
    `type`: PropertyBindingType,
    securityContext: SecurityContext,
    value: typings.angularCompiler.astMod.AST,
    unit: String,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: PropertyBindingType,
    securityContext: SecurityContext,
    value: typings.angularCompiler.astMod.AST,
    unit: Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

/* static members */
@JSImport("@angular/compiler/public_api", "BoundElementPropertyAst")
@js.native
object BoundElementPropertyAst extends js.Object {
  def fromBoundProperty(prop: typings.angularCompiler.astMod.BoundElementProperty): typings.angularCompiler.templateAstMod.BoundElementPropertyAst = js.native
}

