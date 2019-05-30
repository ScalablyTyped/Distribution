package typings
package atAngularCompilerLib.srcRender3ViewTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/template", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def makeBindingParser(): atAngularCompilerLib.srcTemplateUnderscoreParserBindingUnderscoreParserMod.BindingParser = js.native
  def makeBindingParser(
    interpolationConfig: atAngularCompilerLib.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig
  ): atAngularCompilerLib.srcTemplateUnderscoreParserBindingUnderscoreParserMod.BindingParser = js.native
  def parseTemplate(template: java.lang.String, templateUrl: java.lang.String): atAngularCompilerLib.Anon_Errors = js.native
  def parseTemplate(template: java.lang.String, templateUrl: java.lang.String, options: ParseTemplateOptions): atAngularCompilerLib.Anon_Errors = js.native
  def prepareEventListenerParameters(
    eventAst: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.BoundEvent,
    bindingContext: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression
  ): js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression] = js.native
  def prepareEventListenerParameters(
    eventAst: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.BoundEvent,
    bindingContext: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    handlerName: java.lang.String
  ): js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression] = js.native
  def prepareEventListenerParameters(
    eventAst: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.BoundEvent,
    bindingContext: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    handlerName: java.lang.String,
    scope: BindingScope
  ): js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression] = js.native
  def prepareEventListenerParameters(
    eventAst: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.BoundEvent,
    bindingContext: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    handlerName: scala.Null,
    scope: BindingScope
  ): js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression] = js.native
  def renderFlagCheckIfStmt(
    flags: atAngularCompilerLib.srcCoreMod.RenderFlags,
    statements: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement]
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.IfStmt = js.native
  def resolveSanitizationFn(context: atAngularCompilerLib.srcCoreMod.SecurityContext): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExternalExpr | scala.Null = js.native
  def resolveSanitizationFn(context: atAngularCompilerLib.srcCoreMod.SecurityContext, isAttribute: scala.Boolean): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ExternalExpr | scala.Null = js.native
}

