package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parses bindings in templates and in the directive host area.
  */
@js.native
trait BindingParser extends StObject {
  
  /* private */ var _exprParser: Any = js.native
  
  /* private */ var _interpolationConfig: Any = js.native
  
  /* private */ var _parseAction: Any = js.native
  
  /* private */ var _parseAnimation: Any = js.native
  
  /* private */ var _parseAnimationEvent: Any = js.native
  
  /* private */ var _parseBinding: Any = js.native
  
  /* private */ var _parsePropertyAst: Any = js.native
  
  /* private */ var _parseRegularEvent: Any = js.native
  
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
  /* private */ var _parseTemplateBindings: Any = js.native
  
  /* private */ var _reportError: Any = js.native
  
  /* private */ var _reportExpressionParserErrors: Any = js.native
  
  /* private */ var _schemaRegistry: Any = js.native
  
  /**
    * @param propName the name of the property / attribute
    * @param sourceSpan
    * @param isAttr true when binding to an attribute
    */
  /* private */ var _validatePropertyOrAttributeName: Any = js.native
  
  def calcPossibleSecurityContexts(selector: String, propName: String, isAttribute: Boolean): js.Array[SecurityContext] = js.native
  
  def createBoundElementProperty(elementSelector: String, boundProp: ParsedProperty): BoundElementProperty = js.native
  def createBoundElementProperty(elementSelector: String, boundProp: ParsedProperty, skipValidation: Boolean): BoundElementProperty = js.native
  def createBoundElementProperty(
    elementSelector: String,
    boundProp: ParsedProperty,
    skipValidation: Boolean,
    mapPropertyName: Boolean
  ): BoundElementProperty = js.native
  def createBoundElementProperty(elementSelector: String, boundProp: ParsedProperty, skipValidation: Unit, mapPropertyName: Boolean): BoundElementProperty = js.native
  
  def createBoundHostProperties(properties: HostProperties, sourceSpan: ParseSourceSpan): js.Array[ParsedProperty] | Null = js.native
  
  def createDirectiveHostEventAsts(hostListeners: HostListeners, sourceSpan: ParseSourceSpan): js.Array[ParsedEvent] | Null = js.native
  
  var errors: js.Array[ParseError] = js.native
  
  def interpolationConfig: InterpolationConfig = js.native
  
  def parseEvent(
    name: String,
    expression: String,
    isAssignmentEvent: Boolean,
    sourceSpan: ParseSourceSpan,
    handlerSpan: ParseSourceSpan,
    targetMatchableAttrs: js.Array[js.Array[String]],
    targetEvents: js.Array[ParsedEvent],
    keySpan: ParseSourceSpan
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
    targetVars: js.Array[ParsedVariable],
    isIvyAst: Boolean
  ): Unit = js.native
  
  def parseInterpolation(value: String, sourceSpan: ParseSourceSpan): ASTWithSource = js.native
  def parseInterpolation(
    value: String,
    sourceSpan: ParseSourceSpan,
    interpolatedTokens: js.Array[InterpolatedAttributeToken | InterpolatedTextToken]
  ): ASTWithSource = js.native
  
  /**
    * Similar to `parseInterpolation`, but treats the provided string as a single expression
    * element that would normally appear within the interpolation prefix and suffix (`{{` and `}}`).
    * This is used for parsing the switch expression in ICUs.
    */
  def parseInterpolationExpression(expression: String, sourceSpan: ParseSourceSpan): ASTWithSource = js.native
  
  def parseLiteralAttr(
    name: String,
    value: String,
    sourceSpan: ParseSourceSpan,
    absoluteOffset: Double,
    valueSpan: Unit,
    targetMatchableAttrs: js.Array[js.Array[String]],
    targetProps: js.Array[ParsedProperty],
    keySpan: ParseSourceSpan
  ): Unit = js.native
  def parseLiteralAttr(
    name: String,
    value: String,
    sourceSpan: ParseSourceSpan,
    absoluteOffset: Double,
    valueSpan: ParseSourceSpan,
    targetMatchableAttrs: js.Array[js.Array[String]],
    targetProps: js.Array[ParsedProperty],
    keySpan: ParseSourceSpan
  ): Unit = js.native
  def parseLiteralAttr(
    name: String,
    value: Null,
    sourceSpan: ParseSourceSpan,
    absoluteOffset: Double,
    valueSpan: Unit,
    targetMatchableAttrs: js.Array[js.Array[String]],
    targetProps: js.Array[ParsedProperty],
    keySpan: ParseSourceSpan
  ): Unit = js.native
  def parseLiteralAttr(
    name: String,
    value: Null,
    sourceSpan: ParseSourceSpan,
    absoluteOffset: Double,
    valueSpan: ParseSourceSpan,
    targetMatchableAttrs: js.Array[js.Array[String]],
    targetProps: js.Array[ParsedProperty],
    keySpan: ParseSourceSpan
  ): Unit = js.native
  
  def parsePropertyBinding(
    name: String,
    expression: String,
    isHost: Boolean,
    sourceSpan: ParseSourceSpan,
    absoluteOffset: Double,
    valueSpan: Unit,
    targetMatchableAttrs: js.Array[js.Array[String]],
    targetProps: js.Array[ParsedProperty],
    keySpan: ParseSourceSpan
  ): Unit = js.native
  def parsePropertyBinding(
    name: String,
    expression: String,
    isHost: Boolean,
    sourceSpan: ParseSourceSpan,
    absoluteOffset: Double,
    valueSpan: ParseSourceSpan,
    targetMatchableAttrs: js.Array[js.Array[String]],
    targetProps: js.Array[ParsedProperty],
    keySpan: ParseSourceSpan
  ): Unit = js.native
  
  def parsePropertyInterpolation(
    name: String,
    value: String,
    sourceSpan: ParseSourceSpan,
    valueSpan: Unit,
    targetMatchableAttrs: js.Array[js.Array[String]],
    targetProps: js.Array[ParsedProperty],
    keySpan: ParseSourceSpan
  ): Boolean = js.native
  def parsePropertyInterpolation(
    name: String,
    value: String,
    sourceSpan: ParseSourceSpan,
    valueSpan: Unit,
    targetMatchableAttrs: js.Array[js.Array[String]],
    targetProps: js.Array[ParsedProperty],
    keySpan: ParseSourceSpan,
    interpolatedTokens: js.Array[InterpolatedAttributeToken | InterpolatedTextToken]
  ): Boolean = js.native
  def parsePropertyInterpolation(
    name: String,
    value: String,
    sourceSpan: ParseSourceSpan,
    valueSpan: ParseSourceSpan,
    targetMatchableAttrs: js.Array[js.Array[String]],
    targetProps: js.Array[ParsedProperty],
    keySpan: ParseSourceSpan
  ): Boolean = js.native
  def parsePropertyInterpolation(
    name: String,
    value: String,
    sourceSpan: ParseSourceSpan,
    valueSpan: ParseSourceSpan,
    targetMatchableAttrs: js.Array[js.Array[String]],
    targetProps: js.Array[ParsedProperty],
    keySpan: ParseSourceSpan,
    interpolatedTokens: js.Array[InterpolatedAttributeToken | InterpolatedTextToken]
  ): Boolean = js.native
}
