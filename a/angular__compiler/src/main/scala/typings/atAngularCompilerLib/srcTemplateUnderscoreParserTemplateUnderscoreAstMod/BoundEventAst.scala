package typings
package atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/template_parser/template_ast", "BoundEventAst")
@js.native
class BoundEventAst protected () extends TemplateAst {
  def this(name: java.lang.String, target: java.lang.String, phase: java.lang.String, handler: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, target: java.lang.String, phase: scala.Null, handler: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, target: scala.Null, phase: java.lang.String, handler: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, target: scala.Null, phase: scala.Null, handler: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  val fullName: java.lang.String = js.native
  var handler: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.AST = js.native
  val isAnimation: scala.Boolean = js.native
  var name: java.lang.String = js.native
  var phase: java.lang.String | scala.Null = js.native
  /**
       * The source span from which this node was parsed.
       */
  /* CompleteClass */
  override var sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan = js.native
  var target: java.lang.String | scala.Null = js.native
  /**
       * Visit this node and possibly transform it.
       */
  /* CompleteClass */
  override def visit(visitor: TemplateAstVisitor, context: js.Any): js.Any = js.native
}

@JSImport("@angular/compiler/src/template_parser/template_ast", "BoundEventAst")
@js.native
object BoundEventAst extends js.Object {
  def calcFullName(name: java.lang.String): java.lang.String = js.native
  def calcFullName(name: java.lang.String, target: java.lang.String): java.lang.String = js.native
  def calcFullName(name: java.lang.String, target: java.lang.String, phase: java.lang.String): java.lang.String = js.native
  def calcFullName(name: java.lang.String, target: scala.Null, phase: java.lang.String): java.lang.String = js.native
  def fromParsedEvent(event: atAngularCompilerLib.srcExpressionUnderscoreParserAstMod.ParsedEvent): atAngularCompilerLib.srcTemplateUnderscoreParserTemplateUnderscoreAstMod.BoundEventAst = js.native
}

