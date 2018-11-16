package typings
package atAngularCompilerLib.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "TmplAstBoundAttribute")
@js.native
class TmplAstBoundAttribute protected ()
  extends atAngularCompilerLib.publicUnderscoreApiMod.TmplAstBoundAttribute {
  def this(name: java.lang.String, `type`: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.BindingType, securityContext: atAngularCompilerLib.srcCoreMod.SecurityContext, value: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, unit: java.lang.String, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, `type`: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.BindingType, securityContext: atAngularCompilerLib.srcCoreMod.SecurityContext, value: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, unit: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
}

@JSImport("@angular/compiler", "TmplAstBoundAttribute")
@js.native
object TmplAstBoundAttribute extends js.Object {
  def fromBoundElementProperty(prop: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.BoundElementProperty): atAngularCompilerLib.srcRender3R3UnderscoreAstMod.BoundAttribute = js.native
}

