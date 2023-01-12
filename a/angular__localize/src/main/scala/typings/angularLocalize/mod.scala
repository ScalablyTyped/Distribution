package typings.angularLocalize

import typings.angularLocalize.angularLocalizeStrings.AbsoluteFsPath
import typings.angularLocalize.anon.Block
import typings.angularLocalize.anon.Column
import typings.std.Error
import typings.std.Record
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@angular/localize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearTranslations(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTranslations")().asInstanceOf[Unit]
  
  inline def loadTranslations(translations: Record[MessageId, TargetMessage]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTranslations")(translations.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@angular/localize", "\u0275_global")
  @js.native
  val ɵGlobal: Any = js.native
  
  @JSImport("@angular/localize", "\u0275MissingTranslationError")
  @js.native
  open class ɵMissingTranslationError protected ()
    extends StObject
       with Error {
    def this(parsedMessage: ɵParsedMessage) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    val parsedMessage: ɵParsedMessage = js.native
    
    /* private */ val `type`: Any = js.native
  }
  
  inline def ɵcomputeMsgId(msg: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275computeMsgId")(msg.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def ɵcomputeMsgId(msg: String, meaning: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275computeMsgId")(msg.asInstanceOf[js.Any], meaning.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def ɵfindEndOfBlock(cooked: String, raw: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275findEndOfBlock")(cooked.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def ɵisMissingTranslationError(e: Any): /* is @angular/localize.@angular/localize.ɵMissingTranslationError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275isMissingTranslationError")(e.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/localize.@angular/localize.ɵMissingTranslationError */ Boolean]
  
  @JSImport("@angular/localize", "\u0275$localize")
  @js.native
  val ɵlocalize: ɵLocalizeFn = js.native
  
  inline def ɵmakeParsedTranslation(messageParts: js.Array[String]): ɵParsedTranslation = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeParsedTranslation")(messageParts.asInstanceOf[js.Any]).asInstanceOf[ɵParsedTranslation]
  inline def ɵmakeParsedTranslation(messageParts: js.Array[String], placeholderNames: js.Array[String]): ɵParsedTranslation = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeParsedTranslation")(messageParts.asInstanceOf[js.Any], placeholderNames.asInstanceOf[js.Any])).asInstanceOf[ɵParsedTranslation]
  
  inline def ɵmakeTemplateObject(cooked: js.Array[String], raw: js.Array[String]): TemplateStringsArray = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275makeTemplateObject")(cooked.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[TemplateStringsArray]
  
  inline def ɵparseMessage(messageParts: TemplateStringsArray): ɵParsedMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275parseMessage")(messageParts.asInstanceOf[js.Any]).asInstanceOf[ɵParsedMessage]
  inline def ɵparseMessage(messageParts: TemplateStringsArray, expressions: js.Array[Any]): ɵParsedMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275parseMessage")(messageParts.asInstanceOf[js.Any], expressions.asInstanceOf[js.Any])).asInstanceOf[ɵParsedMessage]
  inline def ɵparseMessage(
    messageParts: TemplateStringsArray,
    expressions: js.Array[Any],
    location: Unit,
    messagePartLocations: js.Array[js.UndefOr[ɵSourceLocation]]
  ): ɵParsedMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275parseMessage")(messageParts.asInstanceOf[js.Any], expressions.asInstanceOf[js.Any], location.asInstanceOf[js.Any], messagePartLocations.asInstanceOf[js.Any])).asInstanceOf[ɵParsedMessage]
  inline def ɵparseMessage(
    messageParts: TemplateStringsArray,
    expressions: js.Array[Any],
    location: Unit,
    messagePartLocations: js.Array[js.UndefOr[ɵSourceLocation]],
    expressionLocations: js.Array[js.UndefOr[ɵSourceLocation]]
  ): ɵParsedMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275parseMessage")(messageParts.asInstanceOf[js.Any], expressions.asInstanceOf[js.Any], location.asInstanceOf[js.Any], messagePartLocations.asInstanceOf[js.Any], expressionLocations.asInstanceOf[js.Any])).asInstanceOf[ɵParsedMessage]
  inline def ɵparseMessage(
    messageParts: TemplateStringsArray,
    expressions: js.Array[Any],
    location: Unit,
    messagePartLocations: Unit,
    expressionLocations: js.Array[js.UndefOr[ɵSourceLocation]]
  ): ɵParsedMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275parseMessage")(messageParts.asInstanceOf[js.Any], expressions.asInstanceOf[js.Any], location.asInstanceOf[js.Any], messagePartLocations.asInstanceOf[js.Any], expressionLocations.asInstanceOf[js.Any])).asInstanceOf[ɵParsedMessage]
  inline def ɵparseMessage(messageParts: TemplateStringsArray, expressions: js.Array[Any], location: ɵSourceLocation): ɵParsedMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275parseMessage")(messageParts.asInstanceOf[js.Any], expressions.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[ɵParsedMessage]
  inline def ɵparseMessage(
    messageParts: TemplateStringsArray,
    expressions: js.Array[Any],
    location: ɵSourceLocation,
    messagePartLocations: js.Array[js.UndefOr[ɵSourceLocation]]
  ): ɵParsedMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275parseMessage")(messageParts.asInstanceOf[js.Any], expressions.asInstanceOf[js.Any], location.asInstanceOf[js.Any], messagePartLocations.asInstanceOf[js.Any])).asInstanceOf[ɵParsedMessage]
  inline def ɵparseMessage(
    messageParts: TemplateStringsArray,
    expressions: js.Array[Any],
    location: ɵSourceLocation,
    messagePartLocations: js.Array[js.UndefOr[ɵSourceLocation]],
    expressionLocations: js.Array[js.UndefOr[ɵSourceLocation]]
  ): ɵParsedMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275parseMessage")(messageParts.asInstanceOf[js.Any], expressions.asInstanceOf[js.Any], location.asInstanceOf[js.Any], messagePartLocations.asInstanceOf[js.Any], expressionLocations.asInstanceOf[js.Any])).asInstanceOf[ɵParsedMessage]
  inline def ɵparseMessage(
    messageParts: TemplateStringsArray,
    expressions: js.Array[Any],
    location: ɵSourceLocation,
    messagePartLocations: Unit,
    expressionLocations: js.Array[js.UndefOr[ɵSourceLocation]]
  ): ɵParsedMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275parseMessage")(messageParts.asInstanceOf[js.Any], expressions.asInstanceOf[js.Any], location.asInstanceOf[js.Any], messagePartLocations.asInstanceOf[js.Any], expressionLocations.asInstanceOf[js.Any])).asInstanceOf[ɵParsedMessage]
  inline def ɵparseMessage(
    messageParts: TemplateStringsArray,
    expressions: Unit,
    location: Unit,
    messagePartLocations: js.Array[js.UndefOr[ɵSourceLocation]]
  ): ɵParsedMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275parseMessage")(messageParts.asInstanceOf[js.Any], expressions.asInstanceOf[js.Any], location.asInstanceOf[js.Any], messagePartLocations.asInstanceOf[js.Any])).asInstanceOf[ɵParsedMessage]
  inline def ɵparseMessage(
    messageParts: TemplateStringsArray,
    expressions: Unit,
    location: Unit,
    messagePartLocations: js.Array[js.UndefOr[ɵSourceLocation]],
    expressionLocations: js.Array[js.UndefOr[ɵSourceLocation]]
  ): ɵParsedMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275parseMessage")(messageParts.asInstanceOf[js.Any], expressions.asInstanceOf[js.Any], location.asInstanceOf[js.Any], messagePartLocations.asInstanceOf[js.Any], expressionLocations.asInstanceOf[js.Any])).asInstanceOf[ɵParsedMessage]
  inline def ɵparseMessage(
    messageParts: TemplateStringsArray,
    expressions: Unit,
    location: Unit,
    messagePartLocations: Unit,
    expressionLocations: js.Array[js.UndefOr[ɵSourceLocation]]
  ): ɵParsedMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275parseMessage")(messageParts.asInstanceOf[js.Any], expressions.asInstanceOf[js.Any], location.asInstanceOf[js.Any], messagePartLocations.asInstanceOf[js.Any], expressionLocations.asInstanceOf[js.Any])).asInstanceOf[ɵParsedMessage]
  inline def ɵparseMessage(messageParts: TemplateStringsArray, expressions: Unit, location: ɵSourceLocation): ɵParsedMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275parseMessage")(messageParts.asInstanceOf[js.Any], expressions.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[ɵParsedMessage]
  inline def ɵparseMessage(
    messageParts: TemplateStringsArray,
    expressions: Unit,
    location: ɵSourceLocation,
    messagePartLocations: js.Array[js.UndefOr[ɵSourceLocation]]
  ): ɵParsedMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275parseMessage")(messageParts.asInstanceOf[js.Any], expressions.asInstanceOf[js.Any], location.asInstanceOf[js.Any], messagePartLocations.asInstanceOf[js.Any])).asInstanceOf[ɵParsedMessage]
  inline def ɵparseMessage(
    messageParts: TemplateStringsArray,
    expressions: Unit,
    location: ɵSourceLocation,
    messagePartLocations: js.Array[js.UndefOr[ɵSourceLocation]],
    expressionLocations: js.Array[js.UndefOr[ɵSourceLocation]]
  ): ɵParsedMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275parseMessage")(messageParts.asInstanceOf[js.Any], expressions.asInstanceOf[js.Any], location.asInstanceOf[js.Any], messagePartLocations.asInstanceOf[js.Any], expressionLocations.asInstanceOf[js.Any])).asInstanceOf[ɵParsedMessage]
  inline def ɵparseMessage(
    messageParts: TemplateStringsArray,
    expressions: Unit,
    location: ɵSourceLocation,
    messagePartLocations: Unit,
    expressionLocations: js.Array[js.UndefOr[ɵSourceLocation]]
  ): ɵParsedMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275parseMessage")(messageParts.asInstanceOf[js.Any], expressions.asInstanceOf[js.Any], location.asInstanceOf[js.Any], messagePartLocations.asInstanceOf[js.Any], expressionLocations.asInstanceOf[js.Any])).asInstanceOf[ɵParsedMessage]
  
  inline def ɵparseMetadata(cooked: String, raw: String): MessageMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275parseMetadata")(cooked.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[MessageMetadata]
  
  inline def ɵparseTranslation(messageString: TargetMessage): ɵParsedTranslation = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275parseTranslation")(messageString.asInstanceOf[js.Any]).asInstanceOf[ɵParsedTranslation]
  
  inline def ɵsplitBlock(cooked: String, raw: String): Block = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275splitBlock")(cooked.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[Block]
  
  inline def ɵtranslate(
    translations: Record[String, ɵParsedTranslation],
    messageParts: TemplateStringsArray,
    substitutions: js.Array[Any]
  ): js.Tuple2[TemplateStringsArray, js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275translate")(translations.asInstanceOf[js.Any], messageParts.asInstanceOf[js.Any], substitutions.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TemplateStringsArray, js.Array[Any]]]
  
  /**
    * Declares a copy of the `AbsoluteFsPath` branded type in `@angular/compiler-cli` to avoid an
    * import into `@angular/compiler-cli`. The compiler-cli's declaration files are not necessarily
    * compatible with web environments that use `@angular/localize`, and would inadvertently include
    * `typescript` declaration files in any compilation unit that uses `@angular/localize` (which
    * increases parsing time and memory usage during builds) using a default import that only
    * type-checks when `allowSyntheticDefaultImports` is enabled.
    *
    * @see https://github.com/angular/angular/issues/45179
    */
  @js.native
  trait AbsoluteFsPathLocalizeCopy
    extends StObject
       with typings.std.String {
    
    var _brand: AbsoluteFsPath = js.native
  }
  
  type MessageId = String
  
  /**
    * Additional information that can be associated with a message.
    */
  trait MessageMetadata extends StObject {
    
    /**
      * The id of the `message` if a custom one was specified explicitly.
      *
      * This id overrides any computed or legacy ids.
      */
    var customId: js.UndefOr[String] = js.undefined
    
    /**
      * The description of the `message`, used to aid translation.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * Legacy message ids, if provided.
      *
      * In legacy message formats the message id can only be computed directly from the original
      * template source.
      *
      * Since this information is not available in `$localize` calls, the legacy message ids may be
      * attached by the compiler to the `$localize` metablock so it can be used if needed at the point
      * of translation if the translations are encoded using the legacy message id.
      */
    var legacyIds: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The location of the message in the source.
      */
    var location: js.UndefOr[ɵSourceLocation] = js.undefined
    
    /**
      * The meaning of the `message`, used to distinguish identical `messageString`s.
      */
    var meaning: js.UndefOr[String] = js.undefined
    
    /**
      * A human readable rendering of the message
      */
    var text: String
  }
  object MessageMetadata {
    
    inline def apply(text: String): MessageMetadata = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageMetadata] (val x: Self) extends AnyVal {
      
      inline def setCustomId(value: String): Self = StObject.set(x, "customId", value.asInstanceOf[js.Any])
      
      inline def setCustomIdUndefined: Self = StObject.set(x, "customId", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setLegacyIds(value: js.Array[String]): Self = StObject.set(x, "legacyIds", value.asInstanceOf[js.Any])
      
      inline def setLegacyIdsUndefined: Self = StObject.set(x, "legacyIds", js.undefined)
      
      inline def setLegacyIdsVarargs(value: String*): Self = StObject.set(x, "legacyIds", js.Array(value*))
      
      inline def setLocation(value: ɵSourceLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setMeaning(value: String): Self = StObject.set(x, "meaning", value.asInstanceOf[js.Any])
      
      inline def setMeaningUndefined: Self = StObject.set(x, "meaning", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  type TargetMessage = String
  
  @js.native
  trait ɵLocalizeFn extends StObject {
    
    def apply(messageParts: TemplateStringsArray, expressions: Any*): String = js.native
    
    /**
      * The current locale of the translated messages.
      *
      * The compile-time translation inliner is able to replace the following code:
      *
      * ```
      * typeof $localize !== "undefined" && $localize.locale
      * ```
      *
      * with a string literal of the current locale. E.g.
      *
      * ```
      * "fr"
      * ```
      */
    var locale: js.UndefOr[String] = js.native
    
    /**
      * A function that converts an input "message with expressions" into a translated "message with
      * expressions".
      *
      * The conversion may be done in place, modifying the array passed to the function, so
      * don't assume that this has no side-effects.
      *
      * The expressions must be passed in since it might be they need to be reordered for
      * different translations.
      */
    var translate: js.UndefOr[ɵTranslateFn] = js.native
  }
  
  trait ɵParsedMessage
    extends StObject
       with MessageMetadata {
    
    /**
      * An optional mapping of placeholder names to associated MessageIds.
      * This can be used to match ICU placeholders to the message that contains the ICU.
      */
    var associatedMessageIds: js.UndefOr[Record[String, MessageId]] = js.undefined
    
    /**
      * The key used to look up the appropriate translation target.
      */
    var id: MessageId
    
    /**
      * An optional mapping of message parts to source locations
      */
    var messagePartLocations: js.UndefOr[js.Array[js.UndefOr[ɵSourceLocation]]] = js.undefined
    
    /**
      * The static parts of the message.
      */
    var messageParts: js.Array[String]
    
    /**
      * The names of the placeholders that will be replaced with substitutions.
      */
    var placeholderNames: js.Array[String]
    
    /**
      * An optional mapping of placeholder names to source locations
      */
    var substitutionLocations: js.UndefOr[Record[String, js.UndefOr[ɵSourceLocation]]] = js.undefined
    
    /**
      * A mapping of placeholder names to substitution values.
      */
    var substitutions: Record[String, Any]
  }
  object ɵParsedMessage {
    
    inline def apply(
      id: MessageId,
      messageParts: js.Array[String],
      placeholderNames: js.Array[String],
      substitutions: Record[String, Any],
      text: String
    ): ɵParsedMessage = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], messageParts = messageParts.asInstanceOf[js.Any], placeholderNames = placeholderNames.asInstanceOf[js.Any], substitutions = substitutions.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ɵParsedMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ɵParsedMessage] (val x: Self) extends AnyVal {
      
      inline def setAssociatedMessageIds(value: Record[String, MessageId]): Self = StObject.set(x, "associatedMessageIds", value.asInstanceOf[js.Any])
      
      inline def setAssociatedMessageIdsUndefined: Self = StObject.set(x, "associatedMessageIds", js.undefined)
      
      inline def setId(value: MessageId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMessagePartLocations(value: js.Array[js.UndefOr[ɵSourceLocation]]): Self = StObject.set(x, "messagePartLocations", value.asInstanceOf[js.Any])
      
      inline def setMessagePartLocationsUndefined: Self = StObject.set(x, "messagePartLocations", js.undefined)
      
      inline def setMessagePartLocationsVarargs(value: js.UndefOr[ɵSourceLocation]*): Self = StObject.set(x, "messagePartLocations", js.Array(value*))
      
      inline def setMessageParts(value: js.Array[String]): Self = StObject.set(x, "messageParts", value.asInstanceOf[js.Any])
      
      inline def setMessagePartsVarargs(value: String*): Self = StObject.set(x, "messageParts", js.Array(value*))
      
      inline def setPlaceholderNames(value: js.Array[String]): Self = StObject.set(x, "placeholderNames", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderNamesVarargs(value: String*): Self = StObject.set(x, "placeholderNames", js.Array(value*))
      
      inline def setSubstitutionLocations(value: Record[String, js.UndefOr[ɵSourceLocation]]): Self = StObject.set(x, "substitutionLocations", value.asInstanceOf[js.Any])
      
      inline def setSubstitutionLocationsUndefined: Self = StObject.set(x, "substitutionLocations", js.undefined)
      
      inline def setSubstitutions(value: Record[String, Any]): Self = StObject.set(x, "substitutions", value.asInstanceOf[js.Any])
    }
  }
  
  trait ɵParsedTranslation
    extends StObject
       with MessageMetadata {
    
    var messageParts: TemplateStringsArray
    
    var placeholderNames: js.Array[String]
  }
  object ɵParsedTranslation {
    
    inline def apply(messageParts: TemplateStringsArray, placeholderNames: js.Array[String], text: String): ɵParsedTranslation = {
      val __obj = js.Dynamic.literal(messageParts = messageParts.asInstanceOf[js.Any], placeholderNames = placeholderNames.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ɵParsedTranslation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ɵParsedTranslation] (val x: Self) extends AnyVal {
      
      inline def setMessageParts(value: TemplateStringsArray): Self = StObject.set(x, "messageParts", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderNames(value: js.Array[String]): Self = StObject.set(x, "placeholderNames", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderNamesVarargs(value: String*): Self = StObject.set(x, "placeholderNames", js.Array(value*))
    }
  }
  
  type ɵParsedTranslations = Record[MessageId, ɵParsedTranslation]
  
  trait ɵSourceLocation extends StObject {
    
    var end: Column
    
    var file: AbsoluteFsPathLocalizeCopy
    
    var start: Column
    
    var text: js.UndefOr[String] = js.undefined
  }
  object ɵSourceLocation {
    
    inline def apply(end: Column, file: AbsoluteFsPathLocalizeCopy, start: Column): ɵSourceLocation = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[ɵSourceLocation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ɵSourceLocation] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Column): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setFile(value: AbsoluteFsPathLocalizeCopy): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Column): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type ɵSourceMessage = String
  
  type ɵTranslateFn = js.Function2[
    /* messageParts */ TemplateStringsArray, 
    /* expressions */ js.Array[Any], 
    js.Tuple2[TemplateStringsArray, js.Array[Any]]
  ]
}
