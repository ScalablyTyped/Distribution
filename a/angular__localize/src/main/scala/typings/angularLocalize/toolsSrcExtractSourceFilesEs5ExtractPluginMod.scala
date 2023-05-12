package typings.angularLocalize

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathManipulation
import typings.angularLocalize.localizeMod.ɵParsedMessage
import typings.babelCore.mod.PluginObj
import typings.babelCore.mod.PluginPass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcExtractSourceFilesEs5ExtractPluginMod {
  
  @JSImport("@angular/localize/tools/src/extract/source_files/es5_extract_plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeEs5ExtractPlugin(fs: PathManipulation, messages: js.Array[ɵParsedMessage]): PluginObj[PluginPass] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEs5ExtractPlugin")(fs.asInstanceOf[js.Any], messages.asInstanceOf[js.Any])).asInstanceOf[PluginObj[PluginPass]]
  inline def makeEs5ExtractPlugin(fs: PathManipulation, messages: js.Array[ɵParsedMessage], localizeName: String): PluginObj[PluginPass] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEs5ExtractPlugin")(fs.asInstanceOf[js.Any], messages.asInstanceOf[js.Any], localizeName.asInstanceOf[js.Any])).asInstanceOf[PluginObj[PluginPass]]
}
