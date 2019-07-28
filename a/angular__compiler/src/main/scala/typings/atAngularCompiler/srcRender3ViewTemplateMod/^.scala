package typings.atAngularCompiler.srcRender3ViewTemplateMod

import typings.atAngularCompiler.Anon_Errors
import typings.atAngularCompiler.srcCoreMod.RenderFlags
import typings.atAngularCompiler.srcCoreMod.SecurityContext
import typings.atAngularCompiler.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.ExternalExpr
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.IfStmt
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Statement
import typings.atAngularCompiler.srcRender3R3UnderscoreAstMod.BoundEvent
import typings.atAngularCompiler.srcTemplateUnderscoreParserBindingUnderscoreParserMod.BindingParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/template", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def makeBindingParser(): BindingParser = js.native
  def makeBindingParser(interpolationConfig: InterpolationConfig): BindingParser = js.native
  def parseTemplate(template: String, templateUrl: String): Anon_Errors = js.native
  def parseTemplate(template: String, templateUrl: String, options: ParseTemplateOptions): Anon_Errors = js.native
  def prepareEventListenerParameters(eventAst: BoundEvent): js.Array[Expression] = js.native
  def prepareEventListenerParameters(eventAst: BoundEvent, handlerName: String): js.Array[Expression] = js.native
  def prepareEventListenerParameters(eventAst: BoundEvent, handlerName: String, scope: BindingScope): js.Array[Expression] = js.native
  def prepareEventListenerParameters(eventAst: BoundEvent, handlerName: Null, scope: BindingScope): js.Array[Expression] = js.native
  def renderFlagCheckIfStmt(flags: RenderFlags, statements: js.Array[Statement]): IfStmt = js.native
  def resolveSanitizationFn(context: SecurityContext): ExternalExpr | Null = js.native
  def resolveSanitizationFn(context: SecurityContext, isAttribute: Boolean): ExternalExpr | Null = js.native
}

