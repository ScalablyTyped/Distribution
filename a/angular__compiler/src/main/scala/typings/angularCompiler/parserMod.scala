package typings.angularCompiler

import org.scalablytyped.runtime.Instantiable0
import typings.angularCompiler.anon.End
import typings.angularCompiler.astMod.AST
import typings.angularCompiler.astMod.ASTWithSource
import typings.angularCompiler.astMod.AbsoluteSourceSpan
import typings.angularCompiler.astMod.AstVisitor
import typings.angularCompiler.astMod.Binary
import typings.angularCompiler.astMod.BindingPipe
import typings.angularCompiler.astMod.Chain
import typings.angularCompiler.astMod.Conditional
import typings.angularCompiler.astMod.FunctionCall
import typings.angularCompiler.astMod.ImplicitReceiver
import typings.angularCompiler.astMod.Interpolation
import typings.angularCompiler.astMod.KeyedRead
import typings.angularCompiler.astMod.KeyedWrite
import typings.angularCompiler.astMod.LiteralArray
import typings.angularCompiler.astMod.LiteralMap
import typings.angularCompiler.astMod.LiteralPrimitive
import typings.angularCompiler.astMod.MethodCall
import typings.angularCompiler.astMod.NonNullAssert
import typings.angularCompiler.astMod.ParseSpan
import typings.angularCompiler.astMod.ParserError
import typings.angularCompiler.astMod.PrefixNot
import typings.angularCompiler.astMod.PropertyRead
import typings.angularCompiler.astMod.PropertyWrite
import typings.angularCompiler.astMod.Quote
import typings.angularCompiler.astMod.RecursiveAstVisitor
import typings.angularCompiler.astMod.SafeMethodCall
import typings.angularCompiler.astMod.SafePropertyRead
import typings.angularCompiler.astMod.TemplateBinding
import typings.angularCompiler.astMod.TemplateBindingIdentifier
import typings.angularCompiler.astMod.ThisReceiver
import typings.angularCompiler.astMod.Unary
import typings.angularCompiler.interpolationConfigMod.InterpolationConfig
import typings.angularCompiler.lexerMod.Lexer
import typings.angularCompiler.lexerMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("@angular/compiler/src/expression_parser/parser", "IvyParser")
  @js.native
  class IvyParser protected () extends Parser {
    def this(_lexer: Lexer) = this()
    
    @JSName("simpleExpressionChecker")
    var simpleExpressionChecker_IvyParser: Instantiable0[IvySimpleExpressionChecker] = js.native
  }
  
  @JSImport("@angular/compiler/src/expression_parser/parser", "_ParseAST")
  @js.native
  class ParseAST protected () extends StObject {
    def this(
      input: String,
      location: js.Any,
      absoluteOffset: Double,
      tokens: js.Array[Token],
      inputLength: Double,
      parseAction: Boolean,
      errors: js.Array[ParserError],
      offset: Double
    ) = this()
    
    var absoluteOffset: Double = js.native
    
    def advance(): Unit = js.native
    
    /** Whether all the parser input has been processed. */
    def atEOF: Boolean = js.native
    
    def consumeOptionalCharacter(code: Double): Boolean = js.native
    
    def consumeOptionalOperator(op: String): Boolean = js.native
    
    /**
      * Consume the optional statement terminator: semicolon or comma.
      */
    var consumeStatementTerminator: js.Any = js.native
    
    var context: js.Any = js.native
    
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
    
    var errors: js.Any = js.native
    
    /**
      * Consumes an expected character, otherwise emits an error about the missing expected character
      * and skips over the token stream until reaching a recoverable point.
      *
      * See `this.error` and `this.skip` for more details.
      */
    def expectCharacter(code: Double): Unit = js.native
    
    def expectIdentifierOrKeyword(): String = js.native
    
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
    var getDirectiveBoundTarget: js.Any = js.native
    
    var index: Double = js.native
    
    var input: String = js.native
    
    /**
      * Index of the next token to be processed, or the end of the last token if all have been
      * processed.
      */
    def inputIndex: Double = js.native
    
    var inputLength: Double = js.native
    
    var location: js.Any = js.native
    
    var locationText: js.Any = js.native
    
    def next: Token = js.native
    
    var offset: js.Any = js.native
    
    def parseAccessMemberOrMethodCall(receiver: AST): AST = js.native
    def parseAccessMemberOrMethodCall(receiver: AST, isSafe: Boolean): AST = js.native
    
    var parseAction: Boolean = js.native
    
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
    var parseAsBinding: js.Any = js.native
    
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
    var parseDirectiveKeywordBindings: js.Any = js.native
    
    def parseEquality(): AST = js.native
    
    def parseExpression(): AST = js.native
    
    def parseExpressionList(terminator: Double): js.Array[AST] = js.native
    
    /**
      * Return the binding for a variable declared using `let`. For example,
      * ```
      *   *ngFor="let item of items; let i=index;"
      *           ^^^^^^^^           ^^^^^^^^^^^
      * ```
      * In the first binding, `item` is bound to `NgForOfContext.$implicit`.
      * In the second binding, `i` is bound to `NgForOfContext.index`.
      */
    var parseLetBinding: js.Any = js.native
    
    def parseLiteralMap(): LiteralMap = js.native
    
    def parseLogicalAnd(): AST = js.native
    
    def parseLogicalOr(): AST = js.native
    
    def parseMultiplicative(): AST = js.native
    
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
    
    var rbracesExpected: js.Any = js.native
    
    var rbracketsExpected: js.Any = js.native
    
    var rparensExpected: js.Any = js.native
    
    /**
      * Error recovery should skip tokens until it encounters a recovery point. skip() treats
      * the end of input and a ';' as unconditionally a recovery point. It also treats ')',
      * '}' and ']' as conditional recovery points if one of calling productions is expecting
      * one of these symbols. This allows skip() to recover from errors such as '(a.) + 1' allowing
      * more of the AST to be retained (it doesn't skip any tokens as the ')' is retained because
      * of the '(' begins an '(' <expr> ')' production). The recovery points of grouping symbols
      * must be conditional as they must be skipped if none of the calling productions are not
      * expecting the closing token else we will never make progress in the case of an
      * extraneous group closing symbol (such as a stray ')'). This is not the case for ';' because
      * parseChain() is always the root production and it expects a ';'.
      *
      * Furthermore, the presence of a stateful context can add more recovery points.
      *   - in a `Writable` context, we are able to recover after seeing the `=` operator, which
      *     signals the presence of an independent rvalue expression following the `=` operator.
      *
      * If a production expects one of these token it increments the corresponding nesting count,
      * and then decrements it just prior to checking if the token is in the input.
      */
    var skip: js.Any = js.native
    
    def sourceSpan(start: Double): AbsoluteSourceSpan = js.native
    
    var sourceSpanCache: js.Any = js.native
    
    def span(start: Double): ParseSpan = js.native
    
    var tokens: js.Array[Token] = js.native
    
    /**
      * Executes a callback in the provided context.
      */
    var withContext: js.Any = js.native
  }
  
  @JSImport("@angular/compiler/src/expression_parser/parser", "Parser")
  @js.native
  class Parser protected () extends StObject {
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
    
    var createInterpolationAst: js.Any = js.native
    
    var errors: js.Any = js.native
    
    def parseAction(input: String, location: js.Any, absoluteOffset: Double): ASTWithSource = js.native
    def parseAction(input: String, location: js.Any, absoluteOffset: Double, interpolationConfig: InterpolationConfig): ASTWithSource = js.native
    
    def parseBinding(input: String, location: js.Any, absoluteOffset: Double): ASTWithSource = js.native
    def parseBinding(input: String, location: js.Any, absoluteOffset: Double, interpolationConfig: InterpolationConfig): ASTWithSource = js.native
    
    def parseInterpolation(input: String, location: js.Any, absoluteOffset: Double): ASTWithSource | Null = js.native
    def parseInterpolation(input: String, location: js.Any, absoluteOffset: Double, interpolationConfig: InterpolationConfig): ASTWithSource | Null = js.native
    
    /**
      * Similar to `parseInterpolation`, but treats the provided string as a single expression
      * element that would normally appear within the interpolation prefix and suffix (`{{` and `}}`).
      * This is used for parsing the switch expression in ICUs.
      */
    def parseInterpolationExpression(expression: String, location: js.Any, absoluteOffset: Double): ASTWithSource = js.native
    
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
    
    var simpleExpressionChecker: Instantiable0[SimpleExpressionChecker] = js.native
    
    /**
      * Splits a string of text into "raw" text segments and expressions present in interpolations in
      * the string.
      * Returns `null` if there are no interpolations, otherwise a
      * `SplitInterpolation` with splits that look like
      *   <raw text> <expression> <raw text> ... <raw text> <expression> <raw text>
      */
    def splitInterpolation(input: String, location: String): SplitInterpolation | Null = js.native
    def splitInterpolation(input: String, location: String, interpolationConfig: InterpolationConfig): SplitInterpolation | Null = js.native
    
    def wrapLiteralPrimitive(input: String, location: js.Any, absoluteOffset: Double): ASTWithSource = js.native
    def wrapLiteralPrimitive(input: Null, location: js.Any, absoluteOffset: Double): ASTWithSource = js.native
  }
  
  @JSImport("@angular/compiler/src/expression_parser/parser", "SplitInterpolation")
  @js.native
  class SplitInterpolation protected () extends StObject {
    def this(
      strings: js.Array[String],
      stringSpans: js.Array[End],
      expressions: js.Array[String],
      expressionsSpans: js.Array[End],
      offsets: js.Array[Double]
    ) = this()
    
    var expressions: js.Array[String] = js.native
    
    var expressionsSpans: js.Array[End] = js.native
    
    var offsets: js.Array[Double] = js.native
    
    var stringSpans: js.Array[End] = js.native
    
    var strings: js.Array[String] = js.native
  }
  
  @JSImport("@angular/compiler/src/expression_parser/parser", "TemplateBindingParseResult")
  @js.native
  class TemplateBindingParseResult protected () extends StObject {
    def this(
      templateBindings: js.Array[TemplateBinding],
      warnings: js.Array[String],
      errors: js.Array[ParserError]
    ) = this()
    
    var errors: js.Array[ParserError] = js.native
    
    var templateBindings: js.Array[TemplateBinding] = js.native
    
    var warnings: js.Array[String] = js.native
  }
  
  /**
    * This class implements SimpleExpressionChecker used in View Engine and performs more strict checks
    * to make sure host bindings do not contain pipes. In View Engine, having pipes in host bindings is
    * not supported as well, but in some cases (like `!(value | async)`) the error is not triggered at
    * compile time. In order to preserve View Engine behavior, more strict checks are introduced for
    * Ivy mode only.
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.angularCompiler.astMod.AstVisitor because Already inherited
  - typings.angularCompiler.parserMod.SimpleExpressionChecker because var conflicts: visit, visitASTWithSource, visitThisReceiver, visitUnary. Inlined errors */ @js.native
  trait IvySimpleExpressionChecker extends RecursiveAstVisitor {
    
    var errors: js.Array[String] = js.native
    
    def visitPipe(): Unit = js.native
  }
  
  @js.native
  trait SimpleExpressionChecker extends AstVisitor {
    
    var errors: js.Array[String] = js.native
    
    def visitAll(asts: js.Array[_], context: js.Any): js.Array[_] = js.native
    
    @JSName("visitThisReceiver")
    def visitThisReceiver_MSimpleExpressionChecker(ast: ThisReceiver, context: js.Any): Unit = js.native
    
    @JSName("visitUnary")
    def visitUnary_MSimpleExpressionChecker(ast: Unary, context: js.Any): Unit = js.native
  }
  object SimpleExpressionChecker {
    
    @scala.inline
    def apply(
      errors: js.Array[String],
      visitAll: (js.Array[_], js.Any) => js.Array[_],
      visitBinary: (Binary, js.Any) => js.Any,
      visitChain: (Chain, js.Any) => js.Any,
      visitConditional: (Conditional, js.Any) => js.Any,
      visitFunctionCall: (FunctionCall, js.Any) => js.Any,
      visitImplicitReceiver: (ImplicitReceiver, js.Any) => js.Any,
      visitInterpolation: (Interpolation, js.Any) => js.Any,
      visitKeyedRead: (KeyedRead, js.Any) => js.Any,
      visitKeyedWrite: (KeyedWrite, js.Any) => js.Any,
      visitLiteralArray: (LiteralArray, js.Any) => js.Any,
      visitLiteralMap: (LiteralMap, js.Any) => js.Any,
      visitLiteralPrimitive: (LiteralPrimitive, js.Any) => js.Any,
      visitMethodCall: (MethodCall, js.Any) => js.Any,
      visitNonNullAssert: (NonNullAssert, js.Any) => js.Any,
      visitPipe: (BindingPipe, js.Any) => js.Any,
      visitPrefixNot: (PrefixNot, js.Any) => js.Any,
      visitPropertyRead: (PropertyRead, js.Any) => js.Any,
      visitPropertyWrite: (PropertyWrite, js.Any) => js.Any,
      visitQuote: (Quote, js.Any) => js.Any,
      visitSafeMethodCall: (SafeMethodCall, js.Any) => js.Any,
      visitSafePropertyRead: (SafePropertyRead, js.Any) => js.Any,
      visitThisReceiver: (ThisReceiver, js.Any) => Unit,
      visitUnary: (Unary, js.Any) => Unit
    ): SimpleExpressionChecker = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], visitAll = js.Any.fromFunction2(visitAll), visitBinary = js.Any.fromFunction2(visitBinary), visitChain = js.Any.fromFunction2(visitChain), visitConditional = js.Any.fromFunction2(visitConditional), visitFunctionCall = js.Any.fromFunction2(visitFunctionCall), visitImplicitReceiver = js.Any.fromFunction2(visitImplicitReceiver), visitInterpolation = js.Any.fromFunction2(visitInterpolation), visitKeyedRead = js.Any.fromFunction2(visitKeyedRead), visitKeyedWrite = js.Any.fromFunction2(visitKeyedWrite), visitLiteralArray = js.Any.fromFunction2(visitLiteralArray), visitLiteralMap = js.Any.fromFunction2(visitLiteralMap), visitLiteralPrimitive = js.Any.fromFunction2(visitLiteralPrimitive), visitMethodCall = js.Any.fromFunction2(visitMethodCall), visitNonNullAssert = js.Any.fromFunction2(visitNonNullAssert), visitPipe = js.Any.fromFunction2(visitPipe), visitPrefixNot = js.Any.fromFunction2(visitPrefixNot), visitPropertyRead = js.Any.fromFunction2(visitPropertyRead), visitPropertyWrite = js.Any.fromFunction2(visitPropertyWrite), visitQuote = js.Any.fromFunction2(visitQuote), visitSafeMethodCall = js.Any.fromFunction2(visitSafeMethodCall), visitSafePropertyRead = js.Any.fromFunction2(visitSafePropertyRead), visitThisReceiver = js.Any.fromFunction2(visitThisReceiver), visitUnary = js.Any.fromFunction2(visitUnary))
      __obj.asInstanceOf[SimpleExpressionChecker]
    }
    
    @scala.inline
    implicit class SimpleExpressionCheckerMutableBuilder[Self <: SimpleExpressionChecker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setVisitAll(value: (js.Array[_], js.Any) => js.Array[_]): Self = StObject.set(x, "visitAll", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVisitThisReceiver(value: (ThisReceiver, js.Any) => Unit): Self = StObject.set(x, "visitThisReceiver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVisitUnary(value: (Unary, js.Any) => Unit): Self = StObject.set(x, "visitUnary", js.Any.fromFunction2(value))
    }
  }
}
