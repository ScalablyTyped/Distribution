package typings
package atAngularCompilerLib.srcExpressionUnderscoreParserParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/parser", "_ParseAST")
@js.native
class _ParseAST protected () extends js.Object {
  def this(input: java.lang.String, location: js.Any, tokens: js.Array[atAngularCompilerLib.srcExpressionUnderscoreParserLexerMod.Token], inputLength: scala.Double, parseAction: scala.Boolean, errors: js.Array[atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParserError], offset: scala.Double) = this()
  var errors: js.Any = js.native
  var index: scala.Double = js.native
  var input: java.lang.String = js.native
  val inputIndex: scala.Double = js.native
  var inputLength: scala.Double = js.native
  var location: js.Any = js.native
  var locationText: js.Any = js.native
  val next: atAngularCompilerLib.srcExpressionUnderscoreParserLexerMod.Token = js.native
  var offset: js.Any = js.native
  var parseAction: scala.Boolean = js.native
  var rbracesExpected: js.Any = js.native
  var rbracketsExpected: js.Any = js.native
  var rparensExpected: js.Any = js.native
  var skip: js.Any = js.native
  var tokens: js.Array[atAngularCompilerLib.srcExpressionUnderscoreParserLexerMod.Token] = js.native
  def advance(): scala.Unit = js.native
  def error(message: java.lang.String): scala.Unit = js.native
  def error(message: java.lang.String, index: scala.Double): scala.Unit = js.native
  def expectCharacter(code: scala.Double): scala.Unit = js.native
  def expectIdentifierOrKeyword(): java.lang.String = js.native
  def expectIdentifierOrKeywordOrString(): java.lang.String = js.native
  def expectOperator(operator: java.lang.String): scala.Unit = js.native
  /**
    * An identifier, a keyword, a string with an optional `-` in between.
    */
  def expectTemplateBindingKey(): java.lang.String = js.native
  def optionalCharacter(code: scala.Double): scala.Boolean = js.native
  def optionalOperator(op: java.lang.String): scala.Boolean = js.native
  def parseAccessMemberOrMethodCall(receiver: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST): atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST = js.native
  def parseAccessMemberOrMethodCall(receiver: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, isSafe: scala.Boolean): atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST = js.native
  def parseAdditive(): atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST = js.native
  def parseCallArguments(): js.Array[atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.BindingPipe] = js.native
  def parseCallChain(): atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST = js.native
  def parseChain(): atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST = js.native
  def parseConditional(): atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST = js.native
  def parseEquality(): atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST = js.native
  def parseExpression(): atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST = js.native
  def parseExpressionList(terminator: scala.Double): js.Array[atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST] = js.native
  def parseLiteralMap(): atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.LiteralMap = js.native
  def parseLogicalAnd(): atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST = js.native
  def parseLogicalOr(): atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST = js.native
  def parseMultiplicative(): atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST = js.native
  def parsePipe(): atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST = js.native
  def parsePrefix(): atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST = js.native
  def parsePrimary(): atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST = js.native
  def parseRelational(): atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST = js.native
  def parseTemplateBindings(tplKey: java.lang.String): TemplateBindingParseResult = js.native
  def peek(offset: scala.Double): atAngularCompilerLib.srcExpressionUnderscoreParserLexerMod.Token = js.native
  def peekKeywordAs(): scala.Boolean = js.native
  def peekKeywordLet(): scala.Boolean = js.native
  def span(start: scala.Double): atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParseSpan = js.native
}

