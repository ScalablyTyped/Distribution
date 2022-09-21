package typings.angularLocalize

import typings.angularLocalize.diagnosticsMod.DiagnosticHandlingStrategy
import typings.angularLocalize.diagnosticsMod.Diagnostics
import typings.angularLocalize.outputPathMod.OutputPathFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object translateMod {
  
  @JSImport("@angular/localize/tools/src/translate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def translateFiles(
    hasSourceRootPathSourceFilePathsTranslationFilePathsTranslationFileLocalesOutputPathFnDiagnosticsMissingTranslationDuplicateTranslationSourceLocale: TranslateFilesOptions
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("translateFiles")(hasSourceRootPathSourceFilePathsTranslationFilePathsTranslationFileLocalesOutputPathFnDiagnosticsMissingTranslationDuplicateTranslationSourceLocale.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait TranslateFilesOptions extends StObject {
    
    /**
      * An object that will receive any diagnostics messages due to the processing.
      */
    var diagnostics: Diagnostics
    
    /**
      * How to handle duplicate translations.
      */
    var duplicateTranslation: DiagnosticHandlingStrategy
    
    /**
      * How to handle missing translations.
      */
    var missingTranslation: DiagnosticHandlingStrategy
    
    /**
      * A function that computes the output path of where the translated files will be
      * written. The marker `{{LOCALE}}` will be replaced with the target locale. E.g.
      * `dist/{{LOCALE}}`.
      */
    def outputPathFn(locale: String, relativePath: String): String
    /**
      * A function that computes the output path of where the translated files will be
      * written. The marker `{{LOCALE}}` will be replaced with the target locale. E.g.
      * `dist/{{LOCALE}}`.
      */
    @JSName("outputPathFn")
    var outputPathFn_Original: OutputPathFn
    
    /**
      * The files to translate, relative to the `root` path.
      */
    var sourceFilePaths: js.Array[String]
    
    /**
      * The locale of the source files.
      * If this is provided then a copy of the application will be created with no translation but just
      * the `$localize` calls stripped out.
      */
    var sourceLocale: js.UndefOr[String] = js.undefined
    
    /**
      * The root path of the files to translate, either absolute or relative to the current working
      * directory. E.g. `dist/en`
      */
    var sourceRootPath: String
    
    /**
      * A collection of the target locales for the translation files.
      *
      * If there is a locale provided in `translationFileLocales` then this is used rather than a
      * locale extracted from the file itself.
      * If there is neither a provided locale nor a locale parsed from the file, then an error is
      * thrown.
      * If there are both a provided locale and a locale parsed from the file, and they are not the
      * same, then a warning is reported.
      */
    var translationFileLocales: js.Array[js.UndefOr[String]]
    
    /**
      * An array of paths to the translation files to load, either absolute or relative to the current
      * working directory.
      *
      * For each locale to be translated, there should be an element in `translationFilePaths`.
      * Each element is either an absolute path to the translation file, or an array of absolute paths
      * to translation files, for that locale.
      *
      * If the element contains more than one translation file, then the translations are merged.
      *
      * If allowed by the `duplicateTranslation` property, when more than one translation has the same
      * message id, the message from the earlier translation file in the array is used.
      *
      * For example, if the files are `[app.xlf, lib-1.xlf, lib-2.xlif]` then a message that appears in
      * `app.xlf` will override the same message in `lib-1.xlf` or `lib-2.xlf`.
      */
    var translationFilePaths: js.Array[String | js.Array[String]]
  }
  object TranslateFilesOptions {
    
    inline def apply(
      diagnostics: Diagnostics,
      duplicateTranslation: DiagnosticHandlingStrategy,
      missingTranslation: DiagnosticHandlingStrategy,
      outputPathFn: (/* locale */ String, /* relativePath */ String) => String,
      sourceFilePaths: js.Array[String],
      sourceRootPath: String,
      translationFileLocales: js.Array[js.UndefOr[String]],
      translationFilePaths: js.Array[String | js.Array[String]]
    ): TranslateFilesOptions = {
      val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], duplicateTranslation = duplicateTranslation.asInstanceOf[js.Any], missingTranslation = missingTranslation.asInstanceOf[js.Any], outputPathFn = js.Any.fromFunction2(outputPathFn), sourceFilePaths = sourceFilePaths.asInstanceOf[js.Any], sourceRootPath = sourceRootPath.asInstanceOf[js.Any], translationFileLocales = translationFileLocales.asInstanceOf[js.Any], translationFilePaths = translationFilePaths.asInstanceOf[js.Any])
      __obj.asInstanceOf[TranslateFilesOptions]
    }
    
    extension [Self <: TranslateFilesOptions](x: Self) {
      
      inline def setDiagnostics(value: Diagnostics): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
      
      inline def setDuplicateTranslation(value: DiagnosticHandlingStrategy): Self = StObject.set(x, "duplicateTranslation", value.asInstanceOf[js.Any])
      
      inline def setMissingTranslation(value: DiagnosticHandlingStrategy): Self = StObject.set(x, "missingTranslation", value.asInstanceOf[js.Any])
      
      inline def setOutputPathFn(value: (/* locale */ String, /* relativePath */ String) => String): Self = StObject.set(x, "outputPathFn", js.Any.fromFunction2(value))
      
      inline def setSourceFilePaths(value: js.Array[String]): Self = StObject.set(x, "sourceFilePaths", value.asInstanceOf[js.Any])
      
      inline def setSourceFilePathsVarargs(value: String*): Self = StObject.set(x, "sourceFilePaths", js.Array(value*))
      
      inline def setSourceLocale(value: String): Self = StObject.set(x, "sourceLocale", value.asInstanceOf[js.Any])
      
      inline def setSourceLocaleUndefined: Self = StObject.set(x, "sourceLocale", js.undefined)
      
      inline def setSourceRootPath(value: String): Self = StObject.set(x, "sourceRootPath", value.asInstanceOf[js.Any])
      
      inline def setTranslationFileLocales(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "translationFileLocales", value.asInstanceOf[js.Any])
      
      inline def setTranslationFileLocalesVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "translationFileLocales", js.Array(value*))
      
      inline def setTranslationFilePaths(value: js.Array[String | js.Array[String]]): Self = StObject.set(x, "translationFilePaths", value.asInstanceOf[js.Any])
      
      inline def setTranslationFilePathsVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "translationFilePaths", js.Array(value*))
    }
  }
}
