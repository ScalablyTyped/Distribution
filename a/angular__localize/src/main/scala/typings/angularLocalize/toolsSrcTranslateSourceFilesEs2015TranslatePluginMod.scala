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

object toolsSrcTranslateSourceFilesEs2015TranslatePluginMod {
  
  @JSImport("@angular/localize/tools/src/translate/source_files/es2015_translate_plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeEs2015TranslatePlugin(diagnostics: Diagnostics, translations: Record[String, ɵParsedTranslation]): PluginObj = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEs2015TranslatePlugin")(diagnostics.asInstanceOf[js.Any], translations.asInstanceOf[js.Any])).asInstanceOf[PluginObj]
  inline def makeEs2015TranslatePlugin(
    diagnostics: Diagnostics,
    translations: Record[String, ɵParsedTranslation],
    param2: Unit,
    fs: PathManipulation
  ): PluginObj = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEs2015TranslatePlugin")(diagnostics.asInstanceOf[js.Any], translations.asInstanceOf[js.Any], param2.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[PluginObj]
  inline def makeEs2015TranslatePlugin(
    diagnostics: Diagnostics,
    translations: Record[String, ɵParsedTranslation],
    param2: TranslatePluginOptions
  ): PluginObj = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEs2015TranslatePlugin")(diagnostics.asInstanceOf[js.Any], translations.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[PluginObj]
  inline def makeEs2015TranslatePlugin(
    diagnostics: Diagnostics,
    translations: Record[String, ɵParsedTranslation],
    param2: TranslatePluginOptions,
    fs: PathManipulation
  ): PluginObj = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEs2015TranslatePlugin")(diagnostics.asInstanceOf[js.Any], translations.asInstanceOf[js.Any], param2.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[PluginObj]
}
