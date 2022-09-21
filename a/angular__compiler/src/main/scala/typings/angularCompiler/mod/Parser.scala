package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "Parser")
@js.native
open class Parser protected () extends StObject {
  def this(_lexer: Lexer) = this()
  
  /* private */ var _checkNoInterpolation: Any = js.native
  
  /* private */ var _commentStart: Any = js.native
  
  /**
    * Generator used to iterate over the character indexes of a string that are outside of quotes.
    * @param input String to loop through.
    * @param start Index within the string at which to start.
    */
  /* private */ var _forEachUnquotedChar: Any = js.native
  
  /**
    * Finds the index of the end of an interpolation expression
    * while ignoring comments and quoted content.
    */
  /* private */ var _getInterpolationEndIndex: Any = js.native
  
  /* private */ var _lexer: Any = js.native
  
  /* private */ var _parseBindingAst: Any = js.native
  
  /* private */ var _reportError: Any = js.native
  
  /* private */ var _stripComments: Any = js.native
  
  /* private */ var checkSimpleExpression: Any = js.native
  
  /* private */ var createInterpolationAst: Any = js.native
  
  /* private */ var errors: Any = js.native
  
  def parseAction(input: String, isAssignmentEvent: Boolean, location: String, absoluteOffset: Double): ASTWithSource = js.native
  def parseAction(
    input: String,
    isAssignmentEvent: Boolean,
    location: String,
    absoluteOffset: Double,
    interpolationConfig: InterpolationConfig
  ): ASTWithSource = js.native
  
  def parseBinding(input: String, location: String, absoluteOffset: Double): ASTWithSource = js.native
  def parseBinding(input: String, location: String, absoluteOffset: Double, interpolationConfig: InterpolationConfig): ASTWithSource = js.native
  
  def parseInterpolation(input: String, location: String, absoluteOffset: Double): ASTWithSource | Null = js.native
  def parseInterpolation(
    input: String,
    location: String,
    absoluteOffset: Double,
    interpolatedTokens: js.Array[InterpolatedAttributeToken | InterpolatedTextToken]
  ): ASTWithSource | Null = js.native
  def parseInterpolation(
    input: String,
    location: String,
    absoluteOffset: Double,
    interpolatedTokens: js.Array[InterpolatedAttributeToken | InterpolatedTextToken],
    interpolationConfig: InterpolationConfig
  ): ASTWithSource | Null = js.native
  def parseInterpolation(
    input: String,
    location: String,
    absoluteOffset: Double,
    interpolatedTokens: Null,
    interpolationConfig: InterpolationConfig
  ): ASTWithSource | Null = js.native
  
  /**
    * Similar to `parseInterpolation`, but treats the provided string as a single expression
    * element that would normally appear within the interpolation prefix and suffix (`{{` and `}}`).
    * This is used for parsing the switch expression in ICUs.
    */
  def parseInterpolationExpression(expression: String, location: String, absoluteOffset: Double): ASTWithSource = js.native
  
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
  
  /**
    * Splits a string of text into "raw" text segments and expressions present in interpolations in
    * the string.
    * Returns `null` if there are no interpolations, otherwise a
    * `SplitInterpolation` with splits that look like
    *   <raw text> <expression> <raw text> ... <raw text> <expression> <raw text>
    */
  def splitInterpolation(input: String, location: String): SplitInterpolation = js.native
  def splitInterpolation(
    input: String,
    location: String,
    interpolatedTokens: js.Array[InterpolatedAttributeToken | InterpolatedTextToken]
  ): SplitInterpolation = js.native
  def splitInterpolation(
    input: String,
    location: String,
    interpolatedTokens: js.Array[InterpolatedAttributeToken | InterpolatedTextToken],
    interpolationConfig: InterpolationConfig
  ): SplitInterpolation = js.native
  def splitInterpolation(
    input: String,
    location: String,
    interpolatedTokens: Null,
    interpolationConfig: InterpolationConfig
  ): SplitInterpolation = js.native
  
  def wrapLiteralPrimitive(input: String, location: String, absoluteOffset: Double): ASTWithSource = js.native
  def wrapLiteralPrimitive(input: Null, location: String, absoluteOffset: Double): ASTWithSource = js.native
}
