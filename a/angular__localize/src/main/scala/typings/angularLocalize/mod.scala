package typings.angularLocalize

import typings.angularLocalize.anon.Block
import typings.angularLocalize.localizeMod.MessageId
import typings.angularLocalize.localizeMod.MessageMetadata
import typings.angularLocalize.localizeMod.TargetMessage
import typings.angularLocalize.localizeMod.ɵLocalizeFn
import typings.angularLocalize.localizeMod.ɵParsedMessage
import typings.angularLocalize.localizeMod.ɵParsedTranslation
import typings.angularLocalize.localizeMod.ɵSourceLocation
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
  
  object global {
    
    /**
      * Tag a template literal string for localization.
      *
      * For example:
      *
      * ```ts
      * $localize `some string to localize`
      * ```
      *
      * **Providing meaning, description and id**
      *
      * You can optionally specify one or more of `meaning`, `description` and `id` for a localized
      * string by pre-pending it with a colon delimited block of the form:
      *
      * ```ts
      * $localize`:meaning|description@@id:source message text`;
      *
      * $localize`:meaning|:source message text`;
      * $localize`:description:source message text`;
      * $localize`:@@id:source message text`;
      * ```
      *
      * This format is the same as that used for `i18n` markers in Angular templates. See the
      * [Angular i18n guide](guide/i18n-common-prepare#mark-text-in-component-template).
      *
      * **Naming placeholders**
      *
      * If the template literal string contains expressions, then the expressions will be automatically
      * associated with placeholder names for you.
      *
      * For example:
      *
      * ```ts
      * $localize `Hi ${name}! There are ${items.length} items.`;
      * ```
      *
      * will generate a message-source of `Hi {$PH}! There are {$PH_1} items`.
      *
      * The recommended practice is to name the placeholder associated with each expression though.
      *
      * Do this by providing the placeholder name wrapped in `:` characters directly after the
      * expression. These placeholder names are stripped out of the rendered localized string.
      *
      * For example, to name the `items.length` expression placeholder `itemCount` you write:
      *
      * ```ts
      * $localize `There are ${items.length}:itemCount: items`;
      * ```
      *
      * **Escaping colon markers**
      *
      * If you need to use a `:` character directly at the start of a tagged string that has no
      * metadata block, or directly after a substitution expression that has no name you must escape
      * the `:` by preceding it with a backslash:
      *
      * For example:
      *
      * ```ts
      * // message has a metadata block so no need to escape colon
      * $localize `:some description::this message starts with a colon (:)`;
      * // no metadata block so the colon must be escaped
      * $localize `\:this message starts with a colon (:)`;
      * ```
      *
      * ```ts
      * // named substitution so no need to escape colon
      * $localize `${label}:label:: ${}`
      * // anonymous substitution so colon must be escaped
      * $localize `${label}\: ${}`
      * ```
      *
      * **Processing localized strings:**
      *
      * There are three scenarios:
      *
      * * **compile-time inlining**: the `$localize` tag is transformed at compile time by a
      * transpiler, removing the tag and replacing the template literal string with a translated
      * literal string from a collection of translations provided to the transpilation tool.
      *
      * * **run-time evaluation**: the `$localize` tag is a run-time function that replaces and
      * reorders the parts (static strings and expressions) of the template literal string with strings
      * from a collection of translations loaded at run-time.
      *
      * * **pass-through evaluation**: the `$localize` tag is a run-time function that simply evaluates
      * the original template literal string without applying any translations to the parts. This
      * version is used during development or where there is no need to translate the localized
      * template literals.
      *
      * @param messageParts a collection of the static parts of the template string.
      * @param expressions a collection of the values of each placeholder in the template string.
      * @returns the translated string, with the `messageParts` and `expressions` interleaved together.
      */
    @JSGlobal("$localize")
    @js.native
    val localize: ɵLocalizeFn = js.native
  }
  
  inline def loadTranslations(translations: Record[MessageId, TargetMessage]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTranslations")(translations.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@angular/localize", "\u0275_global")
  @js.native
  val ɵGlobal: Any = js.native
  
  @JSImport("@angular/localize", "\u0275MissingTranslationError")
  @js.native
  open class ɵMissingTranslationError protected ()
    extends typings.angularLocalize.localizeMod.ɵMissingTranslationError {
    def this(parsedMessage: ɵParsedMessage) = this()
  }
  
  inline def ɵcomputeMsgId(msg: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275computeMsgId")(msg.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def ɵcomputeMsgId(msg: String, meaning: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275computeMsgId")(msg.asInstanceOf[js.Any], meaning.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def ɵfindEndOfBlock(cooked: String, raw: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275findEndOfBlock")(cooked.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def ɵisMissingTranslationError(e: Any): /* is @angular/localize.@angular/localize/localize.ɵMissingTranslationError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275isMissingTranslationError")(e.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/localize.@angular/localize/localize.ɵMissingTranslationError */ Boolean]
  
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
}
