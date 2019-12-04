package typings.atAngularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.atAngularCompiler.srcI18nExtractorUnderscoreMergerMod.ExtractionResult
import typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod.Message
import typings.atAngularCompiler.srcI18nParseUnderscoreUtilMod.I18nError
import typings.atAngularCompiler.srcI18nTranslationUnderscoreBundleMod.TranslationBundle
import typings.atAngularCompiler.srcMlUnderscoreParserAstMod.Node
import typings.atAngularCompiler.srcMlUnderscoreParserInterpolationUnderscoreConfigMod.InterpolationConfig
import typings.atAngularCompiler.srcMlUnderscoreParserParserMod.ParseTreeResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n/extractor_merger", JSImport.Namespace)
@js.native
object srcI18nExtractorUnderscoreMergerMod extends js.Object {
  @js.native
  class ExtractionResult protected () extends js.Object {
    def this(messages: js.Array[Message], errors: js.Array[I18nError]) = this()
    var errors: js.Array[I18nError] = js.native
    var messages: js.Array[Message] = js.native
  }
  
  def extractMessages(
    nodes: js.Array[Node],
    interpolationConfig: InterpolationConfig,
    implicitTags: js.Array[String],
    implicitAttrs: StringDictionary[js.Array[String]]
  ): ExtractionResult = js.native
  def mergeTranslations(
    nodes: js.Array[Node],
    translations: TranslationBundle,
    interpolationConfig: InterpolationConfig,
    implicitTags: js.Array[String],
    implicitAttrs: StringDictionary[js.Array[String]]
  ): ParseTreeResult = js.native
}

