package typings.atAngularCompiler.atAngularCompilerMod

import typings.atAngularCompiler.srcCoreMod.SecurityContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "BoundElementPropertyAst")
@js.native
class BoundElementPropertyAst protected ()
  extends typings.atAngularCompiler.publicUnderscoreApiMod.BoundElementPropertyAst {
  def this(
    name: String,
    `type`: typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.PropertyBindingType,
    securityContext: SecurityContext,
    value: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    unit: String,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    name: String,
    `type`: typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.PropertyBindingType,
    securityContext: SecurityContext,
    value: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST,
    unit: Null,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
}

/* static members */
@JSImport("@angular/compiler", "BoundElementPropertyAst")
@js.native
object BoundElementPropertyAst extends js.Object {
  def fromBoundProperty(prop: typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.BoundElementProperty): typings.atAngularCompiler.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.BoundElementPropertyAst = js.native
}

