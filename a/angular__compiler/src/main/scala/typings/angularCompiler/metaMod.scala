package typings.angularCompiler

import typings.angularCompiler.interpolationConfigMod.InterpolationConfig
import typings.angularCompiler.mlParserAstMod.Attribute
import typings.angularCompiler.mlParserAstMod.Comment
import typings.angularCompiler.mlParserAstMod.Element
import typings.angularCompiler.mlParserAstMod.Expansion
import typings.angularCompiler.mlParserAstMod.ExpansionCase
import typings.angularCompiler.mlParserAstMod.Text
import typings.angularCompiler.mlParserAstMod.Visitor
import typings.angularCompiler.mlParserParserMod.ParseTreeResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/i18n/meta", JSImport.Namespace)
@js.native
object metaMod extends js.Object {
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

