package typings
package atAngularCompilerLib.srcExpressionUnderscoreParserParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/parser", "Parser")
@js.native
class Parser protected () extends js.Object {
  def this(_lexer: atAngularCompilerLib.srcExpressionUnderscoreParserLexerMod.Lexer) = this()
  var _checkNoInterpolation: js.Any = js.native
  var _commentStart: js.Any = js.native
  var _findInterpolationErrorColumn: js.Any = js.native
  var _lexer: js.Any = js.native
  var _parseBindingAst: js.Any = js.native
  var _parseQuote: js.Any = js.native
  var _reportError: js.Any = js.native
  var _stripComments: js.Any = js.native
  var errors: js.Any = js.native
  def parseAction(input: java.lang.String, location: js.Any): atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ASTWithSource = js.native
  def parseAction(
    input: java.lang.String,
    location: js.Any,
    interpolationConfig: atAngularCompilerLib.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig
  ): atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ASTWithSource = js.native
  def parseBinding(input: java.lang.String, location: js.Any): atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ASTWithSource = js.native
  def parseBinding(
    input: java.lang.String,
    location: js.Any,
    interpolationConfig: atAngularCompilerLib.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig
  ): atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ASTWithSource = js.native
  def parseInterpolation(input: java.lang.String, location: js.Any): atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ASTWithSource | scala.Null = js.native
  def parseInterpolation(
    input: java.lang.String,
    location: js.Any,
    interpolationConfig: atAngularCompilerLib.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig
  ): atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ASTWithSource | scala.Null = js.native
  def parseSimpleBinding(input: java.lang.String, location: java.lang.String): atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ASTWithSource = js.native
  def parseSimpleBinding(
    input: java.lang.String,
    location: java.lang.String,
    interpolationConfig: atAngularCompilerLib.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig
  ): atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ASTWithSource = js.native
  def parseTemplateBindings(tplKey: java.lang.String, tplValue: java.lang.String, location: js.Any): TemplateBindingParseResult = js.native
  def splitInterpolation(input: java.lang.String, location: java.lang.String): SplitInterpolation | scala.Null = js.native
  def splitInterpolation(
    input: java.lang.String,
    location: java.lang.String,
    interpolationConfig: atAngularCompilerLib.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig
  ): SplitInterpolation | scala.Null = js.native
  def wrapLiteralPrimitive(input: java.lang.String, location: js.Any): atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ASTWithSource = js.native
  def wrapLiteralPrimitive(input: scala.Null, location: js.Any): atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ASTWithSource = js.native
}

