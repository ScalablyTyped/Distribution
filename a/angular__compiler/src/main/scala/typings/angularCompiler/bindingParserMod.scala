package typings.angularCompiler

import typings.angularCompiler.astMod.ASTWithSource
import typings.angularCompiler.astMod.BindingPipe
import typings.angularCompiler.astMod.BoundElementProperty
import typings.angularCompiler.astMod.ParsedEvent
import typings.angularCompiler.astMod.ParsedProperty
import typings.angularCompiler.astMod.ParsedVariable
import typings.angularCompiler.astMod.RecursiveAstVisitor
import typings.angularCompiler.compileMetadataMod.CompileDirectiveSummary
import typings.angularCompiler.compileMetadataMod.CompilePipeSummary
import typings.angularCompiler.coreMod.SecurityContext
import typings.angularCompiler.elementSchemaRegistryMod.ElementSchemaRegistry
import typings.angularCompiler.interpolationConfigMod.InterpolationConfig
import typings.angularCompiler.parserMod.Parser
import typings.angularCompiler.srcParseUtilMod.ParseError
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/template_parser/binding_parser", JSImport.Namespace)
@js.native
object bindingParserMod extends js.Object {
  @js.native
  class BindingParser protected () extends js.Object {
    def this(
      _exprParser: Parser,
      _interpolationConfig: InterpolationConfig,
      _schemaRegistry: ElementSchemaRegistry,
      pipes: js.Array[CompilePipeSummary],
      errors: js.Array[ParseError]
    ) = this()
    def this(
      _exprParser: Parser,
      _interpolationConfig: InterpolationConfig,
      _schemaRegistry: ElementSchemaRegistry,
      pipes: Null,
      errors: js.Array[ParseError]
    ) = this()
    var _checkPipes: js.Any = js.native
    var _exprParser: js.Any = js.native
    var _interpolationConfig: js.Any = js.native
    var _parseAction: js.Any = js.native
    var _parseAnimation: js.Any = js.native
    var _parseAnimationEvent: js.Any = js.native
    var _parseBinding: js.Any = js.native
    var _parsePropertyAst: js.Any = js.native
    var _parseRegularEvent: js.Any = js.native
    /**
      * Parses the bindings in a microsyntax expression, e.g.
      * ```
      *    <tag *tplKey="let value1 = prop; let value2 = localVar">
      * ```
      *
      * @param tplKey template binding name
      * @param tplValue template binding value
      * @param sourceSpan span of template binding relative to entire the template
      * @param absoluteKeyOffset start of the `tplKey`
      * @param absoluteValueOffset start of the `tplValue`
      */
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
    var errors: js.Array[ParseError] = js.native
    var pipesByName: (Map[String, CompilePipeSummary]) | Null = js.native
    def calcPossibleSecurityContexts(selector: String, propName: String, isAttribute: Boolean): js.Array[SecurityContext] = js.native
    def createBoundElementProperty(elementSelector: String, boundProp: ParsedProperty): BoundElementProperty = js.native
    def createBoundElementProperty(elementSelector: String, boundProp: ParsedProperty, skipValidation: Boolean): BoundElementProperty = js.native
    def createBoundElementProperty(
      elementSelector: String,
      boundProp: ParsedProperty,
      skipValidation: Boolean,
      mapPropertyName: Boolean
    ): BoundElementProperty = js.native
    def createBoundHostProperties(dirMeta: CompileDirectiveSummary, sourceSpan: ParseSourceSpan): js.Array[ParsedProperty] | Null = js.native
    def createDirectiveHostEventAsts(dirMeta: CompileDirectiveSummary, sourceSpan: ParseSourceSpan): js.Array[ParsedEvent] | Null = js.native
    def createDirectiveHostPropertyAsts(dirMeta: CompileDirectiveSummary, elementSelector: String, sourceSpan: ParseSourceSpan): js.Array[BoundElementProperty] | Null = js.native
    def getUsedPipes(): js.Array[CompilePipeSummary] = js.native
    def interpolationConfig(): InterpolationConfig = js.native
    def parseEvent(
      name: String,
      expression: String,
      sourceSpan: ParseSourceSpan,
      handlerSpan: ParseSourceSpan,
      targetMatchableAttrs: js.Array[js.Array[String]],
      targetEvents: js.Array[ParsedEvent]
    ): Unit = js.native
    /**
      * Parses the bindings in a microsyntax expression, and converts them to
      * `ParsedProperty` or `ParsedVariable`.
      *
      * @param tplKey template binding name
      * @param tplValue template binding value
      * @param sourceSpan span of template binding relative to entire the template
      * @param absoluteValueOffset start of the tplValue relative to the entire template
      * @param targetMatchableAttrs potential attributes to match in the template
      * @param targetProps target property bindings in the template
      * @param targetVars target variables in the template
      */
    def parseInlineTemplateBinding(
      tplKey: String,
      tplValue: String,
      sourceSpan: ParseSourceSpan,
      absoluteValueOffset: Double,
      targetMatchableAttrs: js.Array[js.Array[String]],
      targetProps: js.Array[ParsedProperty],
      targetVars: js.Array[ParsedVariable]
    ): Unit = js.native
    def parseInterpolation(value: String, sourceSpan: ParseSourceSpan): ASTWithSource = js.native
    def parseLiteralAttr(
      name: String,
      value: String,
      sourceSpan: ParseSourceSpan,
      absoluteOffset: Double,
      valueSpan: js.UndefOr[scala.Nothing],
      targetMatchableAttrs: js.Array[js.Array[String]],
      targetProps: js.Array[ParsedProperty]
    ): Unit = js.native
    def parseLiteralAttr(
      name: String,
      value: String,
      sourceSpan: ParseSourceSpan,
      absoluteOffset: Double,
      valueSpan: ParseSourceSpan,
      targetMatchableAttrs: js.Array[js.Array[String]],
      targetProps: js.Array[ParsedProperty]
    ): Unit = js.native
    def parseLiteralAttr(
      name: String,
      value: Null,
      sourceSpan: ParseSourceSpan,
      absoluteOffset: Double,
      valueSpan: js.UndefOr[scala.Nothing],
      targetMatchableAttrs: js.Array[js.Array[String]],
      targetProps: js.Array[ParsedProperty]
    ): Unit = js.native
    def parseLiteralAttr(
      name: String,
      value: Null,
      sourceSpan: ParseSourceSpan,
      absoluteOffset: Double,
      valueSpan: ParseSourceSpan,
      targetMatchableAttrs: js.Array[js.Array[String]],
      targetProps: js.Array[ParsedProperty]
    ): Unit = js.native
    def parsePropertyBinding(
      name: String,
      expression: String,
      isHost: Boolean,
      sourceSpan: ParseSourceSpan,
      absoluteOffset: Double,
      valueSpan: js.UndefOr[scala.Nothing],
      targetMatchableAttrs: js.Array[js.Array[String]],
      targetProps: js.Array[ParsedProperty]
    ): Unit = js.native
    def parsePropertyBinding(
      name: String,
      expression: String,
      isHost: Boolean,
      sourceSpan: ParseSourceSpan,
      absoluteOffset: Double,
      valueSpan: ParseSourceSpan,
      targetMatchableAttrs: js.Array[js.Array[String]],
      targetProps: js.Array[ParsedProperty]
    ): Unit = js.native
    def parsePropertyInterpolation(
      name: String,
      value: String,
      sourceSpan: ParseSourceSpan,
      valueSpan: js.UndefOr[scala.Nothing],
      targetMatchableAttrs: js.Array[js.Array[String]],
      targetProps: js.Array[ParsedProperty]
    ): Boolean = js.native
    def parsePropertyInterpolation(
      name: String,
      value: String,
      sourceSpan: ParseSourceSpan,
      valueSpan: ParseSourceSpan,
      targetMatchableAttrs: js.Array[js.Array[String]],
      targetProps: js.Array[ParsedProperty]
    ): Boolean = js.native
  }
  
  @js.native
  class PipeCollector () extends RecursiveAstVisitor {
    var pipes: Map[String, BindingPipe] = js.native
  }
  
  def calcPossibleSecurityContexts(registry: ElementSchemaRegistry, selector: String, propName: String, isAttribute: Boolean): js.Array[SecurityContext] = js.native
}

