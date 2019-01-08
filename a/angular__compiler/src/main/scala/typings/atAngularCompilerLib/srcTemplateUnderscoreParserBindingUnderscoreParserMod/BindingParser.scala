package typings
package atAngularCompilerLib.srcTemplateUnderscoreParserBindingUnderscoreParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/template_parser/binding_parser", "BindingParser")
@js.native
class BindingParser protected () extends js.Object {
  def this(_exprParser: atAngularCompilerLib.srcExpressionUnderscoreParserParserMod.Parser, _interpolationConfig: atAngularCompilerLib.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig, _schemaRegistry: atAngularCompilerLib.srcSchemaElementUnderscoreSchemaUnderscoreRegistryMod.ElementSchemaRegistry, pipes: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompilePipeSummary], errors: js.Array[atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseError]) = this()
  def this(_exprParser: atAngularCompilerLib.srcExpressionUnderscoreParserParserMod.Parser, _interpolationConfig: atAngularCompilerLib.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig, _schemaRegistry: atAngularCompilerLib.srcSchemaElementUnderscoreSchemaUnderscoreRegistryMod.ElementSchemaRegistry, pipes: scala.Null, errors: js.Array[atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseError]) = this()
  var _checkPipes: js.Any = js.native
  var _exprParser: js.Any = js.native
  var _interpolationConfig: js.Any = js.native
  var _parseAction: js.Any = js.native
  var _parseAnimation: js.Any = js.native
  var _parseAnimationEvent: js.Any = js.native
  var _parseBinding: js.Any = js.native
  var _parsePropertyAst: js.Any = js.native
  var _parseRegularEvent: js.Any = js.native
  var _parseTemplateBindings: js.Any = js.native
  var _reportError: js.Any = js.native
  var _reportExpressionParserErrors: js.Any = js.native
  var _schemaRegistry: js.Any = js.native
  var _usedPipes: js.Any = js.native
  /**
    * @param propName the name of the property / attribute
    * @param sourceSpan
    * @param isAttr true when binding to an attribute
    */
  var _validatePropertyOrAttributeName: js.Any = js.native
  var errors: js.Array[atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseError] = js.native
  val interpolationConfig: atAngularCompilerLib.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig = js.native
  var pipesByName: (stdLib.Map[
    java.lang.String, 
    atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompilePipeSummary
  ]) | scala.Null = js.native
  def createBoundElementProperty(
    elementSelector: java.lang.String,
    boundProp: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParsedProperty
  ): atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.BoundElementProperty = js.native
  def createBoundHostProperties(
    dirMeta: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveSummary,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): js.Array[atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParsedProperty] | scala.Null = js.native
  def createDirectiveHostEventAsts(
    dirMeta: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveSummary,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): js.Array[atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParsedEvent] | scala.Null = js.native
  def createDirectiveHostPropertyAsts(
    dirMeta: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileDirectiveSummary,
    elementSelector: java.lang.String,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): js.Array[atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.BoundElementProperty] | scala.Null = js.native
  def getUsedPipes(): js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompilePipeSummary] = js.native
  def parseEvent(
    name: java.lang.String,
    expression: java.lang.String,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan,
    targetMatchableAttrs: js.Array[js.Array[java.lang.String]],
    targetEvents: js.Array[atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParsedEvent]
  ): scala.Unit = js.native
  def parseInlineTemplateBinding(
    tplKey: java.lang.String,
    tplValue: java.lang.String,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan,
    targetMatchableAttrs: js.Array[js.Array[java.lang.String]],
    targetProps: js.Array[atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParsedProperty],
    targetVars: js.Array[atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParsedVariable]
  ): scala.Unit = js.native
  def parseInterpolation(
    value: java.lang.String,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  ): atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ASTWithSource = js.native
  def parseLiteralAttr(
    name: java.lang.String,
    value: java.lang.String,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan,
    targetMatchableAttrs: js.Array[js.Array[java.lang.String]],
    targetProps: js.Array[atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParsedProperty]
  ): scala.Unit = js.native
  def parseLiteralAttr(
    name: java.lang.String,
    value: scala.Null,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan,
    targetMatchableAttrs: js.Array[js.Array[java.lang.String]],
    targetProps: js.Array[atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParsedProperty]
  ): scala.Unit = js.native
  def parsePropertyBinding(
    name: java.lang.String,
    expression: java.lang.String,
    isHost: scala.Boolean,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan,
    targetMatchableAttrs: js.Array[js.Array[java.lang.String]],
    targetProps: js.Array[atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParsedProperty]
  ): scala.Unit = js.native
  def parsePropertyInterpolation(
    name: java.lang.String,
    value: java.lang.String,
    sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan,
    targetMatchableAttrs: js.Array[js.Array[java.lang.String]],
    targetProps: js.Array[atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParsedProperty]
  ): scala.Boolean = js.native
}

