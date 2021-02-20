package typings.angularCompiler

import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.interpolationConfigMod.InterpolationConfig
import typings.angularCompiler.mlParserAstMod.Attribute
import typings.angularCompiler.mlParserAstMod.Comment
import typings.angularCompiler.mlParserAstMod.Element
import typings.angularCompiler.mlParserAstMod.Expansion
import typings.angularCompiler.mlParserAstMod.ExpansionCase
import typings.angularCompiler.mlParserAstMod.Text
import typings.angularCompiler.mlParserAstMod.Visitor
import typings.angularCompiler.outputAstMod.JSDocComment_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metaMod {
  
  @JSImport("@angular/compiler/src/render3/view/i18n/meta", "I18nMetaVisitor")
  @js.native
  class I18nMetaVisitor () extends Visitor {
    def this(interpolationConfig: InterpolationConfig) = this()
    def this(interpolationConfig: js.UndefOr[scala.Nothing], keepI18nAttrs: Boolean) = this()
    def this(interpolationConfig: InterpolationConfig, keepI18nAttrs: Boolean) = this()
    def this(
      interpolationConfig: js.UndefOr[scala.Nothing],
      keepI18nAttrs: js.UndefOr[scala.Nothing],
      enableI18nLegacyMessageIdFormat: Boolean
    ) = this()
    def this(
      interpolationConfig: js.UndefOr[scala.Nothing],
      keepI18nAttrs: Boolean,
      enableI18nLegacyMessageIdFormat: Boolean
    ) = this()
    def this(
      interpolationConfig: InterpolationConfig,
      keepI18nAttrs: js.UndefOr[scala.Nothing],
      enableI18nLegacyMessageIdFormat: Boolean
    ) = this()
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
    
    def visitComment(comment: Comment): js.Any = js.native
    
    def visitElement(element: Element): js.Any = js.native
    
    def visitExpansion(expansion: Expansion): js.Any = js.native
    def visitExpansion(expansion: Expansion, currentMessage: Message): js.Any = js.native
    
    def visitExpansionCase(expansionCase: ExpansionCase): js.Any = js.native
    
    def visitText(text: Text): js.Any = js.native
  }
  
  @JSImport("@angular/compiler/src/render3/view/i18n/meta", "i18nMetaToJSDoc")
  @js.native
  def i18nMetaToJSDoc(meta: I18nMeta): JSDocComment_ | Null = js.native
  
  @JSImport("@angular/compiler/src/render3/view/i18n/meta", "parseI18nMeta")
  @js.native
  def parseI18nMeta(): I18nMeta = js.native
  @JSImport("@angular/compiler/src/render3/view/i18n/meta", "parseI18nMeta")
  @js.native
  def parseI18nMeta(meta: String): I18nMeta = js.native
  
  @js.native
  trait I18nMeta extends StObject {
    
    var customId: js.UndefOr[String] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var legacyIds: js.UndefOr[js.Array[String]] = js.native
    
    var meaning: js.UndefOr[String] = js.native
  }
  object I18nMeta {
    
    @scala.inline
    def apply(): I18nMeta = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[I18nMeta]
    }
    
    @scala.inline
    implicit class I18nMetaMutableBuilder[Self <: I18nMeta] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomId(value: String): Self = StObject.set(x, "customId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomIdUndefined: Self = StObject.set(x, "customId", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLegacyIds(value: js.Array[String]): Self = StObject.set(x, "legacyIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegacyIdsUndefined: Self = StObject.set(x, "legacyIds", js.undefined)
      
      @scala.inline
      def setLegacyIdsVarargs(value: String*): Self = StObject.set(x, "legacyIds", js.Array(value :_*))
      
      @scala.inline
      def setMeaning(value: String): Self = StObject.set(x, "meaning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeaningUndefined: Self = StObject.set(x, "meaning", js.undefined)
    }
  }
}
