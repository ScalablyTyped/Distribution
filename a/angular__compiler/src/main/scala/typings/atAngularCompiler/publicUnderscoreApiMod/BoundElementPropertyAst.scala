package typings.atAngularCompiler.publicUnderscoreApiMod

import typings.atAngularCompiler.srcCoreMod.SecurityContext
import typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.PropertyBindingType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "BoundElementPropertyAst")
@js.native
class BoundElementPropertyAst protected ()
  extends typings.atAngularCompiler.srcCompilerMod.BoundElementPropertyAst {
  def this(
    name: String,
    `type`: PropertyBindingType,
    securityContext: SecurityContext,
    value: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    unit: String,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: PropertyBindingType,
    securityContext: SecurityContext,
    value: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    unit: Null,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
}

/* static members */
@JSImport("@angular/compiler/public_api", "BoundElementPropertyAst")
@js.native
object BoundElementPropertyAst extends js.Object {
  def fromBoundProperty(prop: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.BoundElementProperty): typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.BoundElementPropertyAst = js.native
}

