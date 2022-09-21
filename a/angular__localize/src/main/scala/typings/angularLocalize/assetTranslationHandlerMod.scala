package typings.angularLocalize

import typings.angularCompilerCli.srcTypesMod.FileSystem
import typings.angularLocalize.translatorMod.TranslationHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assetTranslationHandlerMod {
  
  @JSImport("@angular/localize/tools/src/translate/asset_files/asset_translation_handler", "AssetTranslationHandler")
  @js.native
  open class AssetTranslationHandler protected ()
    extends StObject
       with TranslationHandler {
    def this(fs: FileSystem) = this()
    
    /* private */ var fs: Any = js.native
    
    /* private */ var writeAssetFile: Any = js.native
  }
}
