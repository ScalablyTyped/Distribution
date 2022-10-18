package typings.angularLocalize

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathSegment
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.ReadonlyFileSystem
import typings.angularLocalize.mod.MessageId
import typings.angularLocalize.mod.ɵParsedTranslation
import typings.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics
import typings.angularLocalize.toolsSrcTranslateOutputPathMod.OutputPathFn
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcTranslateTranslatorMod {
  
  @JSImport("@angular/localize/tools/src/translate/translator", "Translator")
  @js.native
  open class Translator protected () extends StObject {
    def this(fs: ReadonlyFileSystem, resourceHandlers: js.Array[TranslationHandler], diagnostics: Diagnostics) = this()
    
    /* private */ var diagnostics: Any = js.native
    
    /* private */ var fs: Any = js.native
    
    /* private */ var resourceHandlers: Any = js.native
    
    def translateFiles(
      inputPaths: js.Array[PathSegment],
      rootPath: AbsoluteFsPath,
      outputPathFn: OutputPathFn,
      translations: js.Array[TranslationBundle]
    ): Unit = js.native
    def translateFiles(
      inputPaths: js.Array[PathSegment],
      rootPath: AbsoluteFsPath,
      outputPathFn: OutputPathFn,
      translations: js.Array[TranslationBundle],
      sourceLocale: String
    ): Unit = js.native
  }
  
  trait TranslationBundle extends StObject {
    
    var diagnostics: js.UndefOr[Diagnostics] = js.undefined
    
    var locale: String
    
    var translations: Record[MessageId, ɵParsedTranslation]
  }
  object TranslationBundle {
    
    inline def apply(locale: String, translations: Record[MessageId, ɵParsedTranslation]): TranslationBundle = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
      __obj.asInstanceOf[TranslationBundle]
    }
    
    extension [Self <: TranslationBundle](x: Self) {
      
      inline def setDiagnostics(value: Diagnostics): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
      
      inline def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setTranslations(value: Record[MessageId, ɵParsedTranslation]): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TranslationHandler extends StObject {
    
    /**
      * Returns true if the given file can be translated by this handler.
      *
      * @param relativeFilePath A relative path from the sourceRoot to the resource file to handle.
      * @param contents The contents of the file to handle.
      */
    def canTranslate(relativeFilePath: AbsoluteFsPath | PathSegment, contents: js.typedarray.Uint8Array): Boolean = js.native
    
    /**
      * Translate the file at `relativeFilePath` containing `contents`, using the given `translations`,
      * and write the translated content to the path computed by calling `outputPathFn()`.
      *
      * @param diagnostics An object for collecting translation diagnostic messages.
      * @param sourceRoot An absolute path to the root of the files being translated.
      * @param relativeFilePath A relative path from the sourceRoot to the file to translate.
      * @param contents The contents of the file to translate.
      * @param outputPathFn A function that returns an absolute path where the output file should be
      * written.
      * @param translations A collection of translations to apply to this file.
      * @param sourceLocale The locale of the original application source. If provided then an
      * additional copy of the application is created under this locale just with the `$localize` calls
      * stripped out.
      */
    def translate(
      diagnostics: Diagnostics,
      sourceRoot: AbsoluteFsPath,
      relativeFilePath: AbsoluteFsPath | PathSegment,
      contents: js.typedarray.Uint8Array,
      outputPathFn: OutputPathFn,
      translations: js.Array[TranslationBundle]
    ): Unit = js.native
    def translate(
      diagnostics: Diagnostics,
      sourceRoot: AbsoluteFsPath,
      relativeFilePath: AbsoluteFsPath | PathSegment,
      contents: js.typedarray.Uint8Array,
      outputPathFn: OutputPathFn,
      translations: js.Array[TranslationBundle],
      sourceLocale: String
    ): Unit = js.native
  }
}
