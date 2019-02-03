package typings
package atAngularCompilerLib.srcRender3R3UnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/r3_ast", "BoundAttribute")
@js.native
class BoundAttribute protected () extends Node {
  def this(name: java.lang.String, `type`: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.BindingType, securityContext: atAngularCompilerLib.srcCoreMod.SecurityContext, value: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, unit: java.lang.String, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, `type`: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.BindingType, securityContext: atAngularCompilerLib.srcCoreMod.SecurityContext, value: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, unit: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, `type`: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.BindingType, securityContext: atAngularCompilerLib.srcCoreMod.SecurityContext, value: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, unit: java.lang.String, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, i18n: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Message) = this()
  def this(name: java.lang.String, `type`: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.BindingType, securityContext: atAngularCompilerLib.srcCoreMod.SecurityContext, value: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, unit: java.lang.String, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, i18n: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Node) = this()
  def this(name: java.lang.String, `type`: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.BindingType, securityContext: atAngularCompilerLib.srcCoreMod.SecurityContext, value: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, unit: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, i18n: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Message) = this()
  def this(name: java.lang.String, `type`: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.BindingType, securityContext: atAngularCompilerLib.srcCoreMod.SecurityContext, value: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, unit: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan, i18n: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Node) = this()
  var i18n: js.UndefOr[
    atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Message | atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.Node
  ] = js.native
  var name: java.lang.String = js.native
  var securityContext: atAngularCompilerLib.srcCoreMod.SecurityContext = js.native
  /* CompleteClass */
  override var sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan = js.native
  var `type`: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.BindingType = js.native
  var unit: java.lang.String | scala.Null = js.native
  var value: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST = js.native
  /* CompleteClass */
  override def visit[Result](visitor: Visitor[Result]): Result = js.native
}

/* static members */
@JSImport("@angular/compiler/src/render3/r3_ast", "BoundAttribute")
@js.native
object BoundAttribute extends js.Object {
  def fromBoundElementProperty(prop: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.BoundElementProperty): atAngularCompilerLib.srcRender3R3UnderscoreAstMod.BoundAttribute = js.native
  def fromBoundElementProperty(
    prop: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.BoundElementProperty,
    i18n: atAngularCompilerLib.srcI18nI18nUnderscoreAstMod.AST
  ): atAngularCompilerLib.srcRender3R3UnderscoreAstMod.BoundAttribute = js.native
}

