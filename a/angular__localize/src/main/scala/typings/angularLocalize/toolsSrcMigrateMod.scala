package typings.angularLocalize

import typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcMigrateMod {
  
  @JSImport("@angular/localize/tools/src/migrate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def migrateFiles(param0: MigrateFilesOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("migrateFiles")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait MigrateFilesOptions extends StObject {
    
    /** Logger to use for diagnostic messages. */
    var logger: Logger
    
    /** Path to the file containing the message ID mappings. Should be relative to the `rootPath`. */
    var mappingFilePath: String
    
    /**
      * The base path for other paths provided in these options.
      * This should either be absolute or relative to the current working directory.
      */
    var rootPath: String
    
    /** Paths to the files that should be migrated. Should be relative to the `rootPath`. */
    var translationFilePaths: js.Array[String]
  }
  object MigrateFilesOptions {
    
    inline def apply(logger: Logger, mappingFilePath: String, rootPath: String, translationFilePaths: js.Array[String]): MigrateFilesOptions = {
      val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any], mappingFilePath = mappingFilePath.asInstanceOf[js.Any], rootPath = rootPath.asInstanceOf[js.Any], translationFilePaths = translationFilePaths.asInstanceOf[js.Any])
      __obj.asInstanceOf[MigrateFilesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MigrateFilesOptions] (val x: Self) extends AnyVal {
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setMappingFilePath(value: String): Self = StObject.set(x, "mappingFilePath", value.asInstanceOf[js.Any])
      
      inline def setRootPath(value: String): Self = StObject.set(x, "rootPath", value.asInstanceOf[js.Any])
      
      inline def setTranslationFilePaths(value: js.Array[String]): Self = StObject.set(x, "translationFilePaths", value.asInstanceOf[js.Any])
      
      inline def setTranslationFilePathsVarargs(value: String*): Self = StObject.set(x, "translationFilePaths", js.Array(value*))
    }
  }
}
