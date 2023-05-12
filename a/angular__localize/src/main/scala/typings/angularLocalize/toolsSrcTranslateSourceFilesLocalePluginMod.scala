package typings.angularLocalize

import typings.angularLocalize.toolsSrcSourceFileUtilsMod.TranslatePluginOptions
import typings.babelCore.mod.PluginObj
import typings.babelCore.mod.PluginPass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcTranslateSourceFilesLocalePluginMod {
  
  @JSImport("@angular/localize/tools/src/translate/source_files/locale_plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeLocalePlugin(locale: String): PluginObj[PluginPass] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeLocalePlugin")(locale.asInstanceOf[js.Any]).asInstanceOf[PluginObj[PluginPass]]
  inline def makeLocalePlugin(locale: String, param1: TranslatePluginOptions): PluginObj[PluginPass] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeLocalePlugin")(locale.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[PluginObj[PluginPass]]
}
