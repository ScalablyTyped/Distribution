package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.i18nAstMod.Message
import typings.angularCompiler.interpolationConfigMod.InterpolationConfig
import typings.angularCompiler.mlParserAstMod.Node
import typings.angularCompiler.mlParserParserMod.ParseTreeResult
import typings.angularCompiler.parseUtilMod.I18nError
import typings.angularCompiler.translationBundleMod.TranslationBundle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extractorMergerMod {
  
  @JSImport("@angular/compiler/src/i18n/extractor_merger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler/src/i18n/extractor_merger", "ExtractionResult")
  @js.native
  class ExtractionResult protected () extends StObject {
    def this(messages: js.Array[Message], errors: js.Array[I18nError]) = this()
    
    var errors: js.Array[I18nError] = js.native
    
    var messages: js.Array[Message] = js.native
  }
  
  @scala.inline
  def extractMessages(
    nodes: js.Array[Node],
    interpolationConfig: InterpolationConfig,
    implicitTags: js.Array[String],
    implicitAttrs: StringDictionary[js.Array[String]]
  ): ExtractionResult = (^.asInstanceOf[js.Dynamic].applyDynamic("extractMessages")(nodes.asInstanceOf[js.Any], interpolationConfig.asInstanceOf[js.Any], implicitTags.asInstanceOf[js.Any], implicitAttrs.asInstanceOf[js.Any])).asInstanceOf[ExtractionResult]
  
  @scala.inline
  def mergeTranslations(
    nodes: js.Array[Node],
    translations: TranslationBundle,
    interpolationConfig: InterpolationConfig,
    implicitTags: js.Array[String],
    implicitAttrs: StringDictionary[js.Array[String]]
  ): ParseTreeResult = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeTranslations")(nodes.asInstanceOf[js.Any], translations.asInstanceOf[js.Any], interpolationConfig.asInstanceOf[js.Any], implicitTags.asInstanceOf[js.Any], implicitAttrs.asInstanceOf[js.Any])).asInstanceOf[ParseTreeResult]
}
