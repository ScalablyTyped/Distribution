package typings.angularCompiler.parserMod

import org.scalablytyped.runtime.Instantiable0
import typings.angularCompiler.astMod.ASTWithSource
import typings.angularCompiler.interpolationConfigMod.InterpolationConfig
import typings.angularCompiler.lexerMod.Lexer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/parser", "Parser")
@js.native
class Parser protected () extends js.Object {
  def this(_lexer: Lexer) = this()
  var _checkNoInterpolation: js.Any = js.native
  var _commentStart: js.Any = js.native
  var _findInterpolationErrorColumn: js.Any = js.native
  var _lexer: js.Any = js.native
  var _parseBindingAst: js.Any = js.native
  var _parseQuote: js.Any = js.native
  var _reportError: js.Any = js.native
  var _stripComments: js.Any = js.native
  var checkSimpleExpression: js.Any = js.native
  var errors: js.Any = js.native
  var simpleExpressionChecker: Instantiable0[SimpleExpressionChecker] = js.native
  def parseAction(input: String, location: js.Any, absoluteOffset: Double): ASTWithSource = js.native
  def parseAction(input: String, location: js.Any, absoluteOffset: Double, interpolationConfig: InterpolationConfig): ASTWithSource = js.native
  def parseBinding(input: String, location: js.Any, absoluteOffset: Double): ASTWithSource = js.native
  def parseBinding(input: String, location: js.Any, absoluteOffset: Double, interpolationConfig: InterpolationConfig): ASTWithSource = js.native
  def parseInterpolation(input: String, location: js.Any, absoluteOffset: Double): ASTWithSource | Null = js.native
  def parseInterpolation(input: String, location: js.Any, absoluteOffset: Double, interpolationConfig: InterpolationConfig): ASTWithSource | Null = js.native
  def parseSimpleBinding(input: String, location: String, absoluteOffset: Double): ASTWithSource = js.native
  def parseSimpleBinding(input: String, location: String, absoluteOffset: Double, interpolationConfig: InterpolationConfig): ASTWithSource = js.native
  /**
    * Parse microsyntax template expression and return a list of bindings or
    * parsing errors in case the given expression is invalid.
    *
    * For example,
    * ```
    *   <div *ngFor="let item of items">
    *         ^      ^ absoluteValueOffset for `templateValue`
    *         absoluteKeyOffset for `templateKey`
    * ```
    * contains three bindings:
    * 1. ngFor -> null
    * 2. item -> NgForOfContext.$implicit
    * 3. ngForOf -> items
    *
    * This is apparent from the de-sugared template:
    * ```
    *   <ng-template ngFor let-item [ngForOf]="items">
    * ```
    *
    * @param templateKey name of directive, without the * prefix. For example: ngIf, ngFor
    * @param templateValue RHS of the microsyntax attribute
    * @param templateUrl template filename if it's external, component filename if it's inline
    * @param absoluteKeyOffset start of the `templateKey`
    * @param absoluteValueOffset start of the `templateValue`
    */
  def parseTemplateBindings(
    templateKey: String,
    templateValue: String,
    templateUrl: String,
    absoluteKeyOffset: Double,
    absoluteValueOffset: Double
  ): TemplateBindingParseResult = js.native
  def splitInterpolation(input: String, location: String): SplitInterpolation | Null = js.native
  def splitInterpolation(input: String, location: String, interpolationConfig: InterpolationConfig): SplitInterpolation | Null = js.native
  def wrapLiteralPrimitive(input: String, location: js.Any, absoluteOffset: Double): ASTWithSource = js.native
  def wrapLiteralPrimitive(input: Null, location: js.Any, absoluteOffset: Double): ASTWithSource = js.native
}

