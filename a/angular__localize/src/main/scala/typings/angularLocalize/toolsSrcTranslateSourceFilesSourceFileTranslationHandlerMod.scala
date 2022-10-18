package typings.angularLocalize

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.FileSystem
import typings.angularLocalize.toolsSrcSourceFileUtilsMod.TranslatePluginOptions
import typings.angularLocalize.toolsSrcTranslateTranslatorMod.TranslationHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcTranslateSourceFilesSourceFileTranslationHandlerMod {
  
  @JSImport("@angular/localize/tools/src/translate/source_files/source_file_translation_handler", "SourceFileTranslationHandler")
  @js.native
  open class SourceFileTranslationHandler protected ()
    extends StObject
       with TranslationHandler {
    def this(fs: FileSystem) = this()
    def this(fs: FileSystem, translationOptions: TranslatePluginOptions) = this()
    
    /* private */ var fs: Any = js.native
    
    /* private */ var sourceLocaleOptions: Any = js.native
    
    /* private */ var translateFile: Any = js.native
    
    /* private */ var translationOptions: Any = js.native
    
    /* private */ var writeSourceFile: Any = js.native
  }
}
