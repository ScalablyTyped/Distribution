package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.coreMod.MissingTranslationStrategy
import typings.angularCompiler.extractorMod.ExtractorHost
import typings.angularCompiler.htmlParserMod.HtmlParser
import typings.angularCompiler.metadataResolverMod.CompileMetadataResolver
import typings.angularCompiler.srcUtilMod.Console
import typings.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/i18n", JSImport.Namespace)
@js.native
object i18nMod extends js.Object {
  
  def computeMsgId(msg: String): String = js.native
  def computeMsgId(msg: String, meaning: String): String = js.native
  
  @js.native
  class Extractor protected ()
    extends typings.angularCompiler.extractorMod.Extractor {
    def this(
      host: ExtractorHost,
      staticSymbolResolver: StaticSymbolResolver,
      messageBundle: typings.angularCompiler.messageBundleMod.MessageBundle,
      metadataResolver: CompileMetadataResolver
    ) = this()
  }
  /* static members */
  @js.native
  object Extractor extends js.Object {
    
    def create(host: ExtractorHost): typings.angularCompiler.anon.Extractor = js.native
    def create(host: ExtractorHost, locale: String): typings.angularCompiler.anon.Extractor = js.native
  }
  
  @js.native
  class I18NHtmlParser protected ()
    extends typings.angularCompiler.i18nHtmlParserMod.I18NHtmlParser {
    def this(_htmlParser: HtmlParser) = this()
    def this(_htmlParser: HtmlParser, translations: String) = this()
    def this(_htmlParser: HtmlParser, translations: js.UndefOr[scala.Nothing], translationsFormat: String) = this()
    def this(_htmlParser: HtmlParser, translations: String, translationsFormat: String) = this()
    def this(
      _htmlParser: HtmlParser,
      translations: js.UndefOr[scala.Nothing],
      translationsFormat: js.UndefOr[scala.Nothing],
      missingTranslation: MissingTranslationStrategy
    ) = this()
    def this(
      _htmlParser: HtmlParser,
      translations: js.UndefOr[scala.Nothing],
      translationsFormat: String,
      missingTranslation: MissingTranslationStrategy
    ) = this()
    def this(
      _htmlParser: HtmlParser,
      translations: String,
      translationsFormat: js.UndefOr[scala.Nothing],
      missingTranslation: MissingTranslationStrategy
    ) = this()
    def this(
      _htmlParser: HtmlParser,
      translations: String,
      translationsFormat: String,
      missingTranslation: MissingTranslationStrategy
    ) = this()
    def this(
      _htmlParser: HtmlParser,
      translations: js.UndefOr[scala.Nothing],
      translationsFormat: js.UndefOr[scala.Nothing],
      missingTranslation: js.UndefOr[scala.Nothing],
      console: Console
    ) = this()
    def this(
      _htmlParser: HtmlParser,
      translations: js.UndefOr[scala.Nothing],
      translationsFormat: js.UndefOr[scala.Nothing],
      missingTranslation: MissingTranslationStrategy,
      console: Console
    ) = this()
    def this(
      _htmlParser: HtmlParser,
      translations: js.UndefOr[scala.Nothing],
      translationsFormat: String,
      missingTranslation: js.UndefOr[scala.Nothing],
      console: Console
    ) = this()
    def this(
      _htmlParser: HtmlParser,
      translations: js.UndefOr[scala.Nothing],
      translationsFormat: String,
      missingTranslation: MissingTranslationStrategy,
      console: Console
    ) = this()
    def this(
      _htmlParser: HtmlParser,
      translations: String,
      translationsFormat: js.UndefOr[scala.Nothing],
      missingTranslation: js.UndefOr[scala.Nothing],
      console: Console
    ) = this()
    def this(
      _htmlParser: HtmlParser,
      translations: String,
      translationsFormat: js.UndefOr[scala.Nothing],
      missingTranslation: MissingTranslationStrategy,
      console: Console
    ) = this()
    def this(
      _htmlParser: HtmlParser,
      translations: String,
      translationsFormat: String,
      missingTranslation: js.UndefOr[scala.Nothing],
      console: Console
    ) = this()
    def this(
      _htmlParser: HtmlParser,
      translations: String,
      translationsFormat: String,
      missingTranslation: MissingTranslationStrategy,
      console: Console
    ) = this()
  }
  
  @js.native
  class MessageBundle protected ()
    extends typings.angularCompiler.messageBundleMod.MessageBundle {
    def this(
      _htmlParser: HtmlParser,
      _implicitTags: js.Array[String],
      _implicitAttrs: StringDictionary[js.Array[String]]
    ) = this()
    def this(
      _htmlParser: HtmlParser,
      _implicitTags: js.Array[String],
      _implicitAttrs: StringDictionary[js.Array[String]],
      _locale: String
    ) = this()
  }
  
  @js.native
  abstract class Serializer ()
    extends typings.angularCompiler.serializerMod.Serializer
  
  @js.native
  class Xliff ()
    extends typings.angularCompiler.xliffMod.Xliff
  
  @js.native
  class Xliff2 ()
    extends typings.angularCompiler.xliff2Mod.Xliff2
  
  @js.native
  class Xmb ()
    extends typings.angularCompiler.xmbMod.Xmb
  
  @js.native
  class Xtb ()
    extends typings.angularCompiler.xtbMod.Xtb
}
