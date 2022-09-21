package typings.angularLocalize

import typings.angularCompilerCli.srcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcTypesMod.ReadonlyFileSystem
import typings.angularLocalize.diagnosticsMod.DiagnosticHandlingStrategy
import typings.angularLocalize.diagnosticsMod.Diagnostics
import typings.angularLocalize.translationParserMod.TranslationParser
import typings.angularLocalize.translatorMod.TranslationBundle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object translationLoaderMod {
  
  @JSImport("@angular/localize/tools/src/translate/translation_files/translation_loader", "TranslationLoader")
  @js.native
  open class TranslationLoader protected () extends StObject {
    def this(
      fs: ReadonlyFileSystem,
      translationParsers: js.Array[TranslationParser[Any]],
      duplicateTranslation: DiagnosticHandlingStrategy
    ) = this()
    def this(
      fs: ReadonlyFileSystem,
      translationParsers: js.Array[TranslationParser[Any]],
      duplicateTranslation: DiagnosticHandlingStrategy,
      /** @deprecated */ diagnostics: Diagnostics
    ) = this()
    
    /** @deprecated */ /* private */ var diagnostics: Any = js.native
    
    /* private */ var duplicateTranslation: Any = js.native
    
    /* private */ var fs: Any = js.native
    
    /**
      * Load all the translations from the file at the given `filePath`.
      */
    /* private */ var loadBundle: Any = js.native
    
    /**
      * Load and parse the translation files into a collection of `TranslationBundles`.
      *
      * @param translationFilePaths An array, per locale, of absolute paths to translation files.
      *
      * For each locale to be translated, there is an element in `translationFilePaths`. Each element
      * is an array of absolute paths to translation files for that locale.
      * If the array contains more than one translation file, then the translations are merged.
      * If allowed by the `duplicateTranslation` property, when more than one translation has the same
      * message id, the message from the earlier translation file in the array is used.
      * For example, if the files are `[app.xlf, lib-1.xlf, lib-2.xlif]` then a message that appears in
      * `app.xlf` will override the same message in `lib-1.xlf` or `lib-2.xlf`.
      *
      * @param translationFileLocales An array of locales for each of the translation files.
      *
      * If there is a locale provided in `translationFileLocales` then this is used rather than a
      * locale extracted from the file itself.
      * If there is neither a provided locale nor a locale parsed from the file, then an error is
      * thrown.
      * If there are both a provided locale and a locale parsed from the file, and they are not the
      * same, then a warning is reported.
      */
    def loadBundles(
      translationFilePaths: js.Array[js.Array[AbsoluteFsPath]],
      translationFileLocales: js.Array[js.UndefOr[String]]
    ): js.Array[TranslationBundle] = js.native
    
    /**
      * There is more than one `filePath` for this locale, so load each as a bundle and then merge
      * them all together.
      */
    /* private */ var mergeBundles: Any = js.native
    
    /* private */ var translationParsers: Any = js.native
  }
}
