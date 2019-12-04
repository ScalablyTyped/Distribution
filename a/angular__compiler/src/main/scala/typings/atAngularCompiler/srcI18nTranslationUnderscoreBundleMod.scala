package typings.atAngularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.atAngularCompiler.srcCoreMod.MissingTranslationStrategy
import typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Message
import typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Node
import typings.atAngularCompiler.srcI18nSerializersSerializerMod.PlaceholderMapper
import typings.atAngularCompiler.srcI18nSerializersSerializerMod.Serializer
import typings.atAngularCompiler.srcI18nTranslationUnderscoreBundleMod.TranslationBundle
import typings.atAngularCompiler.srcUtilMod.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n/translation_bundle", JSImport.Namespace)
@js.native
object srcI18nTranslationUnderscoreBundleMod extends js.Object {
  @js.native
  class TranslationBundle protected () extends js.Object {
    def this(
      _i18nNodesByMsgId: StringDictionary[js.Array[Node]],
      locale: String,
      digest: js.Function1[/* m */ Message, String]
    ) = this()
    def this(
      _i18nNodesByMsgId: StringDictionary[js.Array[Node]],
      locale: Null,
      digest: js.Function1[/* m */ Message, String]
    ) = this()
    def this(
      _i18nNodesByMsgId: StringDictionary[js.Array[Node]],
      locale: String,
      digest: js.Function1[/* m */ Message, String],
      mapperFactory: js.Function1[/* m */ Message, PlaceholderMapper]
    ) = this()
    def this(
      _i18nNodesByMsgId: StringDictionary[js.Array[Node]],
      locale: Null,
      digest: js.Function1[/* m */ Message, String],
      mapperFactory: js.Function1[/* m */ Message, PlaceholderMapper]
    ) = this()
    def this(
      _i18nNodesByMsgId: StringDictionary[js.Array[Node]],
      locale: String,
      digest: js.Function1[/* m */ Message, String],
      mapperFactory: js.UndefOr[scala.Nothing],
      missingTranslationStrategy: MissingTranslationStrategy
    ) = this()
    def this(
      _i18nNodesByMsgId: StringDictionary[js.Array[Node]],
      locale: String,
      digest: js.Function1[/* m */ Message, String],
      mapperFactory: js.Function1[/* m */ Message, PlaceholderMapper],
      missingTranslationStrategy: MissingTranslationStrategy
    ) = this()
    def this(
      _i18nNodesByMsgId: StringDictionary[js.Array[Node]],
      locale: Null,
      digest: js.Function1[/* m */ Message, String],
      mapperFactory: js.UndefOr[scala.Nothing],
      missingTranslationStrategy: MissingTranslationStrategy
    ) = this()
    def this(
      _i18nNodesByMsgId: StringDictionary[js.Array[Node]],
      locale: Null,
      digest: js.Function1[/* m */ Message, String],
      mapperFactory: js.Function1[/* m */ Message, PlaceholderMapper],
      missingTranslationStrategy: MissingTranslationStrategy
    ) = this()
    def this(
      _i18nNodesByMsgId: StringDictionary[js.Array[Node]],
      locale: String,
      digest: js.Function1[/* m */ Message, String],
      mapperFactory: js.UndefOr[scala.Nothing],
      missingTranslationStrategy: MissingTranslationStrategy,
      console: Console
    ) = this()
    def this(
      _i18nNodesByMsgId: StringDictionary[js.Array[Node]],
      locale: String,
      digest: js.Function1[/* m */ Message, String],
      mapperFactory: js.Function1[/* m */ Message, PlaceholderMapper],
      missingTranslationStrategy: MissingTranslationStrategy,
      console: Console
    ) = this()
    def this(
      _i18nNodesByMsgId: StringDictionary[js.Array[Node]],
      locale: Null,
      digest: js.Function1[/* m */ Message, String],
      mapperFactory: js.UndefOr[scala.Nothing],
      missingTranslationStrategy: MissingTranslationStrategy,
      console: Console
    ) = this()
    def this(
      _i18nNodesByMsgId: StringDictionary[js.Array[Node]],
      locale: Null,
      digest: js.Function1[/* m */ Message, String],
      mapperFactory: js.Function1[/* m */ Message, PlaceholderMapper],
      missingTranslationStrategy: MissingTranslationStrategy,
      console: Console
    ) = this()
    var _i18nNodesByMsgId: js.Any = js.native
    var _i18nToHtml: js.Any = js.native
    var mapperFactory: js.UndefOr[js.Function1[/* m */ Message, PlaceholderMapper]] = js.native
    def digest(m: Message): String = js.native
    def get(srcMsg: Message): js.Array[typings.atAngularCompiler.srcMlUnderscoreParserAstMod.Node] = js.native
    def has(srcMsg: Message): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object TranslationBundle extends js.Object {
    def load(
      content: String,
      url: String,
      serializer: Serializer,
      missingTranslationStrategy: MissingTranslationStrategy
    ): TranslationBundle = js.native
    def load(
      content: String,
      url: String,
      serializer: Serializer,
      missingTranslationStrategy: MissingTranslationStrategy,
      console: Console
    ): TranslationBundle = js.native
  }
  
}

