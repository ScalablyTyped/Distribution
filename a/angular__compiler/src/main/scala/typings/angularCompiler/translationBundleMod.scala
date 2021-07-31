package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.coreMod.MissingTranslationStrategy
import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.i18nAstMod.Node
import typings.angularCompiler.serializerMod.PlaceholderMapper
import typings.angularCompiler.serializerMod.Serializer
import typings.angularCompiler.srcUtilMod.Console
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object translationBundleMod {
  
  @JSImport("@angular/compiler/src/i18n/translation_bundle", "TranslationBundle")
  @js.native
  class TranslationBundle protected () extends StObject {
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
      mapperFactory: js.Function1[/* m */ Message, PlaceholderMapper],
      missingTranslationStrategy: MissingTranslationStrategy
    ) = this()
    def this(
      _i18nNodesByMsgId: StringDictionary[js.Array[Node]],
      locale: String,
      digest: js.Function1[/* m */ Message, String],
      mapperFactory: Unit,
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
      locale: Null,
      digest: js.Function1[/* m */ Message, String],
      mapperFactory: Unit,
      missingTranslationStrategy: MissingTranslationStrategy
    ) = this()
    def this(
      _i18nNodesByMsgId: StringDictionary[js.Array[Node]],
      locale: String,
      digest: js.Function1[/* m */ Message, String],
      mapperFactory: js.Function1[/* m */ Message, PlaceholderMapper],
      missingTranslationStrategy: Unit,
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
      locale: String,
      digest: js.Function1[/* m */ Message, String],
      mapperFactory: Unit,
      missingTranslationStrategy: Unit,
      console: Console
    ) = this()
    def this(
      _i18nNodesByMsgId: StringDictionary[js.Array[Node]],
      locale: String,
      digest: js.Function1[/* m */ Message, String],
      mapperFactory: Unit,
      missingTranslationStrategy: MissingTranslationStrategy,
      console: Console
    ) = this()
    def this(
      _i18nNodesByMsgId: StringDictionary[js.Array[Node]],
      locale: Null,
      digest: js.Function1[/* m */ Message, String],
      mapperFactory: js.Function1[/* m */ Message, PlaceholderMapper],
      missingTranslationStrategy: Unit,
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
    def this(
      _i18nNodesByMsgId: StringDictionary[js.Array[Node]],
      locale: Null,
      digest: js.Function1[/* m */ Message, String],
      mapperFactory: Unit,
      missingTranslationStrategy: Unit,
      console: Console
    ) = this()
    def this(
      _i18nNodesByMsgId: StringDictionary[js.Array[Node]],
      locale: Null,
      digest: js.Function1[/* m */ Message, String],
      mapperFactory: Unit,
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
  object TranslationBundle {
    
    @JSImport("@angular/compiler/src/i18n/translation_bundle", "TranslationBundle")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def load(
      content: String,
      url: String,
      serializer: Serializer,
      missingTranslationStrategy: MissingTranslationStrategy
    ): TranslationBundle = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], url.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any], missingTranslationStrategy.asInstanceOf[js.Any])).asInstanceOf[TranslationBundle]
    @scala.inline
    def load(
      content: String,
      url: String,
      serializer: Serializer,
      missingTranslationStrategy: MissingTranslationStrategy,
      console: Console
    ): TranslationBundle = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], url.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any], missingTranslationStrategy.asInstanceOf[js.Any], console.asInstanceOf[js.Any])).asInstanceOf[TranslationBundle]
  }
}
