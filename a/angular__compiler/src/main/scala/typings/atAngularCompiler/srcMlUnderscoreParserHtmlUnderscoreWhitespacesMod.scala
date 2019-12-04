package typings.atAngularCompiler

import typings.atAngularCompiler.atAngularCompilerStrings.ngPreserveWhitespaces
import typings.atAngularCompiler.srcMlUnderscoreParserAstMod.Attribute
import typings.atAngularCompiler.srcMlUnderscoreParserAstMod.Comment
import typings.atAngularCompiler.srcMlUnderscoreParserAstMod.Element
import typings.atAngularCompiler.srcMlUnderscoreParserAstMod.Expansion
import typings.atAngularCompiler.srcMlUnderscoreParserAstMod.ExpansionCase
import typings.atAngularCompiler.srcMlUnderscoreParserAstMod.Text
import typings.atAngularCompiler.srcMlUnderscoreParserAstMod.Visitor
import typings.atAngularCompiler.srcMlUnderscoreParserParserMod.ParseTreeResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/html_whitespaces", JSImport.Namespace)
@js.native
object srcMlUnderscoreParserHtmlUnderscoreWhitespacesMod extends js.Object {
  @js.native
  class WhitespaceVisitor () extends Visitor {
    /* CompleteClass */
    override def visitAttribute(attribute: Attribute, context: js.Any): js.Any = js.native
    /* CompleteClass */
    override def visitComment(comment: Comment, context: js.Any): js.Any = js.native
    /* CompleteClass */
    override def visitElement(element: Element, context: js.Any): js.Any = js.native
    /* CompleteClass */
    override def visitExpansion(expansion: Expansion, context: js.Any): js.Any = js.native
    /* CompleteClass */
    override def visitExpansionCase(expansionCase: ExpansionCase, context: js.Any): js.Any = js.native
    /* CompleteClass */
    override def visitText(text: Text, context: js.Any): js.Any = js.native
  }
  
  val PRESERVE_WS_ATTR_NAME: ngPreserveWhitespaces = js.native
  def removeWhitespaces(htmlAstWithErrors: ParseTreeResult): ParseTreeResult = js.native
  def replaceNgsp(value: String): String = js.native
}

