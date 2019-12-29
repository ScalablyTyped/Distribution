package typings.atAngularCompiler

import typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.AST
import typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ASTWithSource
import typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.BindingPipe
import typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.LiteralMap
import typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParseSpan
import typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.ParserError
import typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.TemplateBinding
import typings.atAngularCompiler.srcExpressionUnderscoreParserLexerMod.Lexer
import typings.atAngularCompiler.srcExpressionUnderscoreParserLexerMod.Token
import typings.atAngularCompiler.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/parser", JSImport.Namespace)
@js.native
object srcExpressionUnderscoreParserParserMod extends js.Object {
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
    var errors: js.Any = js.native
    def parseAction(input: String, location: js.Any, absoluteOffset: Double): ASTWithSource = js.native
    def parseAction(input: String, location: js.Any, absoluteOffset: Double, interpolationConfig: InterpolationConfig): ASTWithSource = js.native
    def parseBinding(input: String, location: js.Any, absoluteOffset: Double): ASTWithSource = js.native
    def parseBinding(input: String, location: js.Any, absoluteOffset: Double, interpolationConfig: InterpolationConfig): ASTWithSource = js.native
    def parseInterpolation(input: String, location: js.Any, absoluteOffset: Double): ASTWithSource | Null = js.native
    def parseInterpolation(input: String, location: js.Any, absoluteOffset: Double, interpolationConfig: InterpolationConfig): ASTWithSource | Null = js.native
    def parseSimpleBinding(input: String, location: String, absoluteOffset: Double): ASTWithSource = js.native
    def parseSimpleBinding(input: String, location: String, absoluteOffset: Double, interpolationConfig: InterpolationConfig): ASTWithSource = js.native
    def parseTemplateBindings(tplKey: String, tplValue: String, location: js.Any, absoluteOffset: Double): TemplateBindingParseResult = js.native
    def splitInterpolation(input: String, location: String): SplitInterpolation | Null = js.native
    def splitInterpolation(input: String, location: String, interpolationConfig: InterpolationConfig): SplitInterpolation | Null = js.native
    def wrapLiteralPrimitive(input: String, location: js.Any, absoluteOffset: Double): ASTWithSource = js.native
    def wrapLiteralPrimitive(input: Null, location: js.Any, absoluteOffset: Double): ASTWithSource = js.native
  }
  
  @js.native
  class SplitInterpolation protected () extends js.Object {
    def this(strings: js.Array[String], expressions: js.Array[String], offsets: js.Array[Double]) = this()
    var expressions: js.Array[String] = js.native
    var offsets: js.Array[Double] = js.native
    var strings: js.Array[String] = js.native
  }
  
  @js.native
  class TemplateBindingParseResult protected () extends js.Object {
    def this(
      templateBindings: js.Array[TemplateBinding],
      warnings: js.Array[String],
      errors: js.Array[ParserError]
    ) = this()
    var errors: js.Array[ParserError] = js.native
    var templateBindings: js.Array[TemplateBinding] = js.native
    var warnings: js.Array[String] = js.native
  }
  
  @js.native
  class _ParseAST protected () extends js.Object {
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
    var errors: js.Any = js.native
    var index: Double = js.native
    var input: String = js.native
    val inputIndex: Double = js.native
    var inputLength: Double = js.native
    var location: js.Any = js.native
    var locationText: js.Any = js.native
    val next: Token = js.native
    var offset: js.Any = js.native
    var parseAction: Boolean = js.native
    var rbracesExpected: js.Any = js.native
    var rbracketsExpected: js.Any = js.native
    var rparensExpected: js.Any = js.native
    var skip: js.Any = js.native
    var tokens: js.Array[Token] = js.native
    def advance(): Unit = js.native
    def error(message: String): Unit = js.native
    def error(message: String, index: Double): Unit = js.native
    def expectCharacter(code: Double): Unit = js.native
    def expectIdentifierOrKeyword(): String = js.native
    def expectIdentifierOrKeywordOrString(): String = js.native
    def expectOperator(operator: String): Unit = js.native
    /**
      * An identifier, a keyword, a string with an optional `-` in between.
      */
    def expectTemplateBindingKey(): String = js.native
    def optionalCharacter(code: Double): Boolean = js.native
    def optionalOperator(op: String): Boolean = js.native
    def parseAccessMemberOrMethodCall(receiver: AST): AST = js.native
    def parseAccessMemberOrMethodCall(receiver: AST, isSafe: Boolean): AST = js.native
    def parseAdditive(): AST = js.native
    def parseCallArguments(): js.Array[BindingPipe] = js.native
    def parseCallChain(): AST = js.native
    def parseChain(): AST = js.native
    def parseConditional(): AST = js.native
    def parseEquality(): AST = js.native
    def parseExpression(): AST = js.native
    def parseExpressionList(terminator: Double): js.Array[AST] = js.native
    def parseLiteralMap(): LiteralMap = js.native
    def parseLogicalAnd(): AST = js.native
    def parseLogicalOr(): AST = js.native
    def parseMultiplicative(): AST = js.native
    def parsePipe(): AST = js.native
    def parsePrefix(): AST = js.native
    def parsePrimary(): AST = js.native
    def parseRelational(): AST = js.native
    def parseTemplateBindings(tplKey: String): TemplateBindingParseResult = js.native
    def peek(offset: Double): Token = js.native
    def peekKeywordAs(): Boolean = js.native
    def peekKeywordLet(): Boolean = js.native
    def span(start: Double): ParseSpan = js.native
  }
  
}

