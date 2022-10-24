package typings.angularLocalize

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.FileSystem
import typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import typings.angularLocalize.toolsSrcDiagnosticsMod.DiagnosticHandlingStrategy
import typings.angularLocalize.toolsSrcExtractTranslationFilesFormatOptionsMod.FormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcExtractMod {
  
  @JSImport("@angular/localize/tools/src/extract", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractTranslations(param0: ExtractTranslationsOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extractTranslations")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ExtractTranslationsOptions extends StObject {
    
    /**
      * How to handle messages with the same id but not the same text.
      */
    var duplicateMessageHandling: DiagnosticHandlingStrategy
    
    /**
      * The file-system abstraction to use.
      */
    var fileSystem: FileSystem
    
    /**
      * The format of the translation file.
      */
    var format: String
    
    /**
      * A collection of formatting options to pass to the translation file serializer.
      */
    var formatOptions: js.UndefOr[FormatOptions] = js.undefined
    
    /**
      * The logger to use for diagnostic messages.
      */
    var logger: Logger
    
    /**
      * A path to where the translation file will be written. This should be relative to the rootPath.
      */
    var outputPath: String
    
    /**
      * The base path for other paths provided in these options.
      * This should either be absolute or relative to the current working directory.
      */
    var rootPath: String
    
    /**
      * An array of paths to files to search for translations. These should be relative to the
      * rootPath.
      */
    var sourceFilePaths: js.Array[String]
    
    /**
      * The locale of the source being processed.
      */
    var sourceLocale: String
    
    /**
      * Whether to use the legacy id format for messages that were extracted from Angular templates
      */
    var useLegacyIds: Boolean
    
    /**
      * Whether to generate source information in the output files by following source-map mappings
      * found in the source file.
      */
    var useSourceMaps: Boolean
  }
  object ExtractTranslationsOptions {
    
    inline def apply(
      duplicateMessageHandling: DiagnosticHandlingStrategy,
      fileSystem: FileSystem,
      format: String,
      logger: Logger,
      outputPath: String,
      rootPath: String,
      sourceFilePaths: js.Array[String],
      sourceLocale: String,
      useLegacyIds: Boolean,
      useSourceMaps: Boolean
    ): ExtractTranslationsOptions = {
      val __obj = js.Dynamic.literal(duplicateMessageHandling = duplicateMessageHandling.asInstanceOf[js.Any], fileSystem = fileSystem.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], outputPath = outputPath.asInstanceOf[js.Any], rootPath = rootPath.asInstanceOf[js.Any], sourceFilePaths = sourceFilePaths.asInstanceOf[js.Any], sourceLocale = sourceLocale.asInstanceOf[js.Any], useLegacyIds = useLegacyIds.asInstanceOf[js.Any], useSourceMaps = useSourceMaps.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtractTranslationsOptions]
    }
    
    extension [Self <: ExtractTranslationsOptions](x: Self) {
      
      inline def setDuplicateMessageHandling(value: DiagnosticHandlingStrategy): Self = StObject.set(x, "duplicateMessageHandling", value.asInstanceOf[js.Any])
      
      inline def setFileSystem(value: FileSystem): Self = StObject.set(x, "fileSystem", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatOptions(value: FormatOptions): Self = StObject.set(x, "formatOptions", value.asInstanceOf[js.Any])
      
      inline def setFormatOptionsUndefined: Self = StObject.set(x, "formatOptions", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
      inline def setRootPath(value: String): Self = StObject.set(x, "rootPath", value.asInstanceOf[js.Any])
      
      inline def setSourceFilePaths(value: js.Array[String]): Self = StObject.set(x, "sourceFilePaths", value.asInstanceOf[js.Any])
      
      inline def setSourceFilePathsVarargs(value: String*): Self = StObject.set(x, "sourceFilePaths", js.Array(value*))
      
      inline def setSourceLocale(value: String): Self = StObject.set(x, "sourceLocale", value.asInstanceOf[js.Any])
      
      inline def setUseLegacyIds(value: Boolean): Self = StObject.set(x, "useLegacyIds", value.asInstanceOf[js.Any])
      
      inline def setUseSourceMaps(value: Boolean): Self = StObject.set(x, "useSourceMaps", value.asInstanceOf[js.Any])
    }
  }
}
