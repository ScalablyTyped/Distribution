package typings.angularLocalize

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathManipulation
import typings.angularLocalize.mod.ɵParsedTranslation
import typings.angularLocalize.toolsSrcBabelCoreMod.PluginObj
import typings.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics
import typings.angularLocalize.toolsSrcSourceFileUtilsMod.TranslatePluginOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcTranslateSourceFilesEs5TranslatePluginMod {
  
  @JSImport("@angular/localize/tools/src/translate/source_files/es5_translate_plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeEs5TranslatePlugin(diagnostics: Diagnostics, translations: Record[String, ɵParsedTranslation]): PluginObj = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEs5TranslatePlugin")(diagnostics.asInstanceOf[js.Any], translations.asInstanceOf[js.Any])).asInstanceOf[PluginObj]
  inline def makeEs5TranslatePlugin(
    diagnostics: Diagnostics,
    translations: Record[String, ɵParsedTranslation],
    hasMissingTranslationLocalizeName: Unit,
    fs: PathManipulation
  ): PluginObj = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEs5TranslatePlugin")(diagnostics.asInstanceOf[js.Any], translations.asInstanceOf[js.Any], hasMissingTranslationLocalizeName.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[PluginObj]
  inline def makeEs5TranslatePlugin(
    diagnostics: Diagnostics,
    translations: Record[String, ɵParsedTranslation],
    hasMissingTranslationLocalizeName: TranslatePluginOptions
  ): PluginObj = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEs5TranslatePlugin")(diagnostics.asInstanceOf[js.Any], translations.asInstanceOf[js.Any], hasMissingTranslationLocalizeName.asInstanceOf[js.Any])).asInstanceOf[PluginObj]
  inline def makeEs5TranslatePlugin(
    diagnostics: Diagnostics,
    translations: Record[String, ɵParsedTranslation],
    hasMissingTranslationLocalizeName: TranslatePluginOptions,
    fs: PathManipulation
  ): PluginObj = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEs5TranslatePlugin")(diagnostics.asInstanceOf[js.Any], translations.asInstanceOf[js.Any], hasMissingTranslationLocalizeName.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[PluginObj]
}
