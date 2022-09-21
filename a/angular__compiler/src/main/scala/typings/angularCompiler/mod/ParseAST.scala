package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "_ParseAST")
@js.native
open class ParseAST protected () extends StObject {
  def this(
    input: String,
    location: String,
    absoluteOffset: Double,
    tokens: js.Array[Token],
    parseFlags: ParseFlags,
    errors: js.Array[ParserError],
    offset: Double
  ) = this()
  
  /**
    * Records an error for an unexpected private identifier being discovered.
    * @param token Token representing a private identifier.
    * @param extraMessage Optional additional message being appended to the error.
    */
  /* private */ var _reportErrorForPrivateIdentifier: Any = js.native
  
  var absoluteOffset: Double = js.native
  
  def advance(): Unit = js.native
  
  /** Whether all the parser input has been processed. */
  def atEOF: Boolean = js.native
  
  /* private */ var consumeOptionalAssignment: Any = js.native
  
  def consumeOptionalCharacter(code: Double): Boolean = js.native
  
  def consumeOptionalOperator(op: String): Boolean = js.native
  
  /**
    * Consume the optional statement terminator: semicolon or comma.
    */
  /* private */ var consumeStatementTerminator: Any = js.native
  
  /* private */ var context: Any = js.native
  
  /**
    * Returns the absolute offset of the start of the current token.
    */
  def currentAbsoluteOffset: Double = js.native
  
  /**
    * End index of the last processed token, or the start of the first token if none have been
    * processed.
    */
  def currentEndIndex: Double = js.native
  
  /**
    * Records an error and skips over the token stream until reaching a recoverable point. See
    * `this.skip` for more details on token skipping.
    */
  def error(message: String): Unit = js.native
  def error(message: String, index: Double): Unit = js.native
  
  /* private */ var errors: Any = js.native
  
  /**
    * Consumes an expected character, otherwise emits an error about the missing expected character
    * and skips over the token stream until reaching a recoverable point.
    *
    * See `this.error` and `this.skip` for more details.
    */
  def expectCharacter(code: Double): Unit = js.native
  
  def expectIdentifierOrKeyword(): String | Null = js.native
  
  def expectIdentifierOrKeywordOrString(): String = js.native
  
  def expectOperator(operator: String): Unit = js.native
  
  /**
    * Parses an identifier, a keyword, a string with an optional `-` in between,
    * and returns the string along with its absolute source span.
    */
  def expectTemplateBindingKey(): TemplateBindingIdentifier = js.native
  
  /**
    * Return the expression AST for the bound target of a directive keyword
    * binding. For example,
    * ```
    *   *ngIf="condition | pipe"
    *          ^^^^^^^^^^^^^^^^ bound target for "ngIf"
    *   *ngFor="let item of items"
    *                       ^^^^^ bound target for "ngForOf"
    * ```
    */
  /* private */ var getDirectiveBoundTarget: Any = js.native
  
  var index: Double = js.native
  
  var input: String = js.native
  
  /**
    * Index of the next token to be processed, or the end of the last token if all have been
    * processed.
    */
  def inputIndex: Double = js.native
  
  var location: String = js.native
  
  /* private */ var locationText: Any = js.native
  
  def next: Token = js.native
  
  /* private */ var offset: Any = js.native
  
  def parseAccessMember(readReceiver: AST, start: Double, isSafe: Boolean): AST = js.native
  
  def parseAdditive(): AST = js.native
  
  /**
    * Return the binding for a variable declared using `as`. Note that the order
    * of the key-value pair in this declaration is reversed. For example,
    * ```
    *   *ngFor="let item of items; index as i"
    *                              ^^^^^    ^
    *                              value    key
    * ```
    *
    * @param value name of the value in the declaration, "ngIf" in the example
    * above, along with its absolute span.
    */
  /* private */ var parseAsBinding: Any = js.native
  
  def parseCall(receiver: AST, start: Double, isSafe: Boolean): AST = js.native
  
  def parseCallArguments(): js.Array[BindingPipe] = js.native
  
  def parseCallChain(): AST = js.native
  
  def parseChain(): AST = js.native
  
  def parseConditional(): AST = js.native
  
  /**
    * Parse a directive keyword, followed by a mandatory expression.
    * For example, "of items", "trackBy: func".
    * The bindings are: ngForOf -> items, ngForTrackBy -> func
    * There could be an optional "as" binding that follows the expression.
    * For example,
    * ```
    *   *ngFor="let item of items | slice:0:1 as collection".
    *                    ^^ ^^^^^^^^^^^^^^^^^ ^^^^^^^^^^^^^
    *               keyword    bound target   optional 'as' binding
    * ```
    *
    * @param key binding key, for example, ngFor, ngIf, ngForOf, along with its
    * absolute span.
    */
  /* private */ var parseDirectiveKeywordBindings: Any = js.native
  
  def parseEquality(): AST = js.native
  
  def parseExpression(): AST = js.native
  
  def parseExpressionList(terminator: Double): js.Array[AST] = js.native
  
  var parseFlags: ParseFlags = js.native
  
  def parseKeyedReadOrWrite(receiver: AST, start: Double, isSafe: Boolean): AST = js.native
  
  /**
    * Return the binding for a variable declared using `let`. For example,
    * ```
    *   *ngFor="let item of items; let i=index;"
    *           ^^^^^^^^           ^^^^^^^^^^^
    * ```
    * In the first binding, `item` is bound to `NgForOfContext.$implicit`.
    * In the second binding, `i` is bound to `NgForOfContext.index`.
    */
  /* private */ var parseLetBinding: Any = js.native
  
  def parseLiteralMap(): LiteralMap_ = js.native
  
  def parseLogicalAnd(): AST = js.native
  
  def parseLogicalOr(): AST = js.native
  
  def parseMultiplicative(): AST = js.native
  
  def parseNullishCoalescing(): AST = js.native
  
  def parsePipe(): AST = js.native
  
  def parsePrefix(): AST = js.native
  
  def parsePrimary(): AST = js.native
  
  def parseRelational(): AST = js.native
  
  /**
    * Parse microsyntax template expression and return a list of bindings or
    * parsing errors in case the given expression is invalid.
    *
    * For example,
    * ```
    *   <div *ngFor="let item of items; index as i; trackBy: func">
    * ```
    * contains five bindings:
    * 1. ngFor -> null
    * 2. item -> NgForOfContext.$implicit
    * 3. ngForOf -> items
    * 4. i -> NgForOfContext.index
    * 5. ngForTrackBy -> func
    *
    * For a full description of the microsyntax grammar, see
    * https://gist.github.com/mhevery/d3530294cff2e4a1b3fe15ff75d08855
    *
    * @param templateKey name of the microsyntax directive, like ngIf, ngFor,
    * without the *, along with its absolute span.
    */
  def parseTemplateBindings(templateKey: TemplateBindingIdentifier): TemplateBindingParseResult = js.native
  
  def peek(offset: Double): Token = js.native
  
  def peekKeywordAs(): Boolean = js.native
  
  def peekKeywordLet(): Boolean = js.native
  
  def prettyPrintToken(tok: Token): String = js.native
  
  /* private */ var rbracesExpected: Any = js.native
  
  /* private */ var rbracketsExpected: Any = js.native
  
  /* private */ var rparensExpected: Any = js.native
  
  /**
    * Error recovery should skip tokens until it encounters a recovery point.
    *
    * The following are treated as unconditional recovery points:
    *   - end of input
    *   - ';' (parseChain() is always the root production, and it expects a ';')
    *   - '|' (since pipes may be chained and each pipe expression may be treated independently)
    *
    * The following are conditional recovery points:
    *   - ')', '}', ']' if one of calling productions is expecting one of these symbols
    *     - This allows skip() to recover from errors such as '(a.) + 1' allowing more of the AST to
    *       be retained (it doesn't skip any tokens as the ')' is retained because of the '(' begins
    *       an '(' <expr> ')' production).
    *       The recovery points of grouping symbols must be conditional as they must be skipped if
    *       none of the calling productions are not expecting the closing token else we will never
    *       make progress in the case of an extraneous group closing symbol (such as a stray ')').
    *       That is, we skip a closing symbol if we are not in a grouping production.
    *   - '=' in a `Writable` context
    *     - In this context, we are able to recover after seeing the `=` operator, which
    *       signals the presence of an independent rvalue expression following the `=` operator.
    *
    * If a production expects one of these token it increments the corresponding nesting count,
    * and then decrements it just prior to checking if the token is in the input.
    */
  /* private */ var skip: Any = js.native
  
  def sourceSpan(start: Double): AbsoluteSourceSpan = js.native
  def sourceSpan(start: Double, artificialEndIndex: Double): AbsoluteSourceSpan = js.native
  
  /* private */ var sourceSpanCache: Any = js.native
  
  /**
    * Retrieve a `ParseSpan` from `start` to the current position (or to `artificialEndIndex` if
    * provided).
    *
    * @param start Position from which the `ParseSpan` will start.
    * @param artificialEndIndex Optional ending index to be used if provided (and if greater than the
    *     natural ending index)
    */
  def span(start: Double): ParseSpan = js.native
  def span(start: Double, artificialEndIndex: Double): ParseSpan = js.native
  
  var tokens: js.Array[Token] = js.native
  
  /**
    * Executes a callback in the provided context.
    */
  /* private */ var withContext: Any = js.native
}
