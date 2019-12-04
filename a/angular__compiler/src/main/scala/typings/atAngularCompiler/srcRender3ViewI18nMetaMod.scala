package typings.atAngularCompiler

import typings.atAngularCompiler.srcMlUnderscoreParserAstMod.Attribute
import typings.atAngularCompiler.srcMlUnderscoreParserAstMod.Comment
import typings.atAngularCompiler.srcMlUnderscoreParserAstMod.Element
import typings.atAngularCompiler.srcMlUnderscoreParserAstMod.Expansion
import typings.atAngularCompiler.srcMlUnderscoreParserAstMod.ExpansionCase
import typings.atAngularCompiler.srcMlUnderscoreParserAstMod.Text
import typings.atAngularCompiler.srcMlUnderscoreParserAstMod.Visitor
import typings.atAngularCompiler.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig
import typings.atAngularCompiler.srcMlUnderscoreParserParserMod.ParseTreeResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/i18n/meta", JSImport.Namespace)
@js.native
object srcRender3ViewI18nMetaMod extends js.Object {
  @js.native
  class I18nMetaVisitor () extends Visitor {
    def this(interpolationConfig: InterpolationConfig) = this()
    def this(interpolationConfig: InterpolationConfig, keepI18nAttrs: Boolean) = this()
    var _createI18nMessage: js.Any = js.native
    var _generateI18nMessage: js.Any = js.native
    var interpolationConfig: js.Any = js.native
    var keepI18nAttrs: js.Any = js.native
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
  
  def processI18nMeta(htmlAstWithErrors: ParseTreeResult): ParseTreeResult = js.native
  def processI18nMeta(htmlAstWithErrors: ParseTreeResult, interpolationConfig: InterpolationConfig): ParseTreeResult = js.native
}

