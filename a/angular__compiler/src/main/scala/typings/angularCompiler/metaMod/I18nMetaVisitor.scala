package typings.angularCompiler.metaMod

import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.interpolationConfigMod.InterpolationConfig
import typings.angularCompiler.mlParserAstMod.Attribute
import typings.angularCompiler.mlParserAstMod.Comment
import typings.angularCompiler.mlParserAstMod.Element
import typings.angularCompiler.mlParserAstMod.Expansion
import typings.angularCompiler.mlParserAstMod.ExpansionCase
import typings.angularCompiler.mlParserAstMod.Text
import typings.angularCompiler.mlParserAstMod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/i18n/meta", "I18nMetaVisitor")
@js.native
class I18nMetaVisitor () extends Visitor {
  def this(interpolationConfig: InterpolationConfig) = this()
  def this(interpolationConfig: InterpolationConfig, keepI18nAttrs: Boolean) = this()
  def this(
    interpolationConfig: InterpolationConfig,
    keepI18nAttrs: Boolean,
    enableI18nLegacyMessageIdFormat: Boolean
  ) = this()
  var _createI18nMessage: js.Any = js.native
  var _generateI18nMessage: js.Any = js.native
  /**
    * Parse the general form `meta` passed into extract the explicit metadata needed to create a
    * `Message`.
    *
    * There are three possibilities for the `meta` variable
    * 1) a string from an `i18n` template attribute: parse it to extract the metadata values.
    * 2) a `Message` from a previous processing pass: reuse the metadata values in the message.
    * 4) other: ignore this and just process the message metadata as normal
    *
    * @param meta the bucket that holds information about the message
    * @returns the parsed metadata.
    */
  var _parseMetadata: js.Any = js.native
  /**
    * Update the `message` with a `legacyId` if necessary.
    *
    * @param message the message whose legacy id should be set
    * @param meta information about the message being processed
    */
  var _setLegacyIds: js.Any = js.native
  /**
    * Generate (or restore) message id if not specified already.
    */
  var _setMessageId: js.Any = js.native
  var enableI18nLegacyMessageIdFormat: js.Any = js.native
  var hasI18nMeta: Boolean = js.native
  var interpolationConfig: js.Any = js.native
  var keepI18nAttrs: js.Any = js.native
  def visitAttribute(attribute: Attribute): js.Any = js.native
  /* CompleteClass */
  override def visitAttribute(attribute: Attribute, context: js.Any): js.Any = js.native
  def visitComment(comment: Comment): js.Any = js.native
  /* CompleteClass */
  override def visitComment(comment: Comment, context: js.Any): js.Any = js.native
  def visitElement(element: Element): js.Any = js.native
  /* CompleteClass */
  override def visitElement(element: Element, context: js.Any): js.Any = js.native
  def visitExpansion(expansion: Expansion): js.Any = js.native
  /* CompleteClass */
  override def visitExpansion(expansion: Expansion, context: js.Any): js.Any = js.native
  def visitExpansion(expansion: Expansion, currentMessage: Message): js.Any = js.native
  def visitExpansionCase(expansionCase: ExpansionCase): js.Any = js.native
  /* CompleteClass */
  override def visitExpansionCase(expansionCase: ExpansionCase, context: js.Any): js.Any = js.native
  def visitText(text: Text): js.Any = js.native
  /* CompleteClass */
  override def visitText(text: Text, context: js.Any): js.Any = js.native
}

