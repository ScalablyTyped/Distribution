package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.coreMod.MissingTranslationStrategy
import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.i18nAstMod.Node
import typings.angularCompiler.serializerMod.PlaceholderMapper
import typings.angularCompiler.serializerMod.Serializer
import typings.angularCompiler.srcUtilMod.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/i18n/translation_bundle", JSImport.Namespace)
@js.native
object translationBundleMod extends js.Object {
  
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
      missingTranslationStrategy: js.UndefOr[scala.Nothing],
      console: Console
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
      missingTranslationStrategy: js.UndefOr[scala.Nothing],
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
      missingTranslationStrategy: js.UndefOr[scala.Nothing],
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
      missingTranslationStrategy: js.UndefOr[scala.Nothing],
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
    
    def digest(m: Message): String = js.native
    
    def get(srcMsg: Message): js.Array[typings.angularCompiler.mlParserAstMod.Node] = js.native
    
    def has(srcMsg: Message): Boolean = js.native
    
    var mapperFactory: js.UndefOr[js.Function1[/* m */ Message, PlaceholderMapper]] = js.native
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
