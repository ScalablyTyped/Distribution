package typings
package atAngularCompilerLib.atAngularCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "BoundElementPropertyAst")
@js.native
class BoundElementPropertyAst protected ()
  extends atAngularCompilerLib.publicUnderscoreApiMod.BoundElementPropertyAst {
  def this(name: java.lang.String, `type`: atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.PropertyBindingType, securityContext: atAngularCompilerLib.srcCoreMod.SecurityContext, value: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, unit: java.lang.String, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, `type`: atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.PropertyBindingType, securityContext: atAngularCompilerLib.srcCoreMod.SecurityContext, value: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, unit: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
}

/* static members */
@JSImport("@angular/compiler", "BoundElementPropertyAst")
@js.native
object BoundElementPropertyAst extends js.Object {
  def fromBoundProperty(prop: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.BoundElementProperty): atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.BoundElementPropertyAst = js.native
}

