package typings.angularCompiler.parserMod

import typings.angularCompiler.astMod.AST
import typings.angularCompiler.astMod.AbsoluteSourceSpan
import typings.angularCompiler.astMod.BindingPipe
import typings.angularCompiler.astMod.LiteralMap
import typings.angularCompiler.astMod.ParseSpan
import typings.angularCompiler.astMod.ParserError
import typings.angularCompiler.lexerMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/parser", "_ParseAST")
@js.native
class ParseAST protected () extends js.Object {
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
  var inputLength: Double = js.native
  var location: js.Any = js.native
  var locationText: js.Any = js.native
  var offset: js.Any = js.native
  var parseAction: Boolean = js.native
  var rbracesExpected: js.Any = js.native
  var rbracketsExpected: js.Any = js.native
  var rparensExpected: js.Any = js.native
  var skip: js.Any = js.native
  var sourceSpanCache: js.Any = js.native
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
  def inputIndex(): Double = js.native
  def next(): Token = js.native
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
  def sourceSpan(start: Double): AbsoluteSourceSpan = js.native
  def span(start: Double): ParseSpan = js.native
}

