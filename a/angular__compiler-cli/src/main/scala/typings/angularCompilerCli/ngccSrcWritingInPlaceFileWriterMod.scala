package typings.angularCompilerCli

import typings.angularCompilerCli.ngccSrcPackagesEntryPointBundleMod.EntryPointBundle
import typings.angularCompilerCli.ngccSrcPackagesEntryPointMod.EntryPoint
import typings.angularCompilerCli.ngccSrcPackagesEntryPointMod.EntryPointJsonProperty
import typings.angularCompilerCli.ngccSrcRenderingUtilsMod.FileToWrite
import typings.angularCompilerCli.ngccSrcWritingFileWriterMod.FileWriter
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.FileSystem
import typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcWritingInPlaceFileWriterMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/writing/in_place_file_writer", "InPlaceFileWriter")
  @js.native
  open class InPlaceFileWriter protected ()
    extends StObject
       with FileWriter {
    def this(fs: FileSystem, logger: Logger, errorOnFailedEntryPoint: Boolean) = this()
    
    /* protected */ var errorOnFailedEntryPoint: Boolean = js.native
    
    /* protected */ var fs: FileSystem = js.native
    
    /* protected */ var logger: Logger = js.native
    
    /**
      * Revert the changes to an entry-point processed for the specified format-properties by the same
      * `FileWriter` implementation.
      *
      * @param entryPoint The entry-point to revert.
      * @param transformedFilePaths The original paths of the transformed files. (The transformed files
      *     may be written at the same or a different location, depending on the `FileWriter`
      *     implementation.)
      * @param formatProperties The format-properties pointing to the entry-point.
      */
    /* CompleteClass */
    override def revertBundle(
      entryPoint: EntryPoint,
      transformedFilePaths: js.Array[AbsoluteFsPath],
      formatProperties: js.Array[EntryPointJsonProperty]
    ): Unit = js.native
    
    /* protected */ def revertFileAndBackup(filePath: AbsoluteFsPath): Unit = js.native
    
    def writeBundle(_bundle: EntryPointBundle, transformedFiles: js.Array[FileToWrite]): Unit = js.native
    /* CompleteClass */
    override def writeBundle(
      bundle: EntryPointBundle,
      transformedFiles: js.Array[FileToWrite],
      formatProperties: js.Array[EntryPointJsonProperty]
    ): Unit = js.native
    
    /* protected */ def writeFileAndBackup(file: FileToWrite): Unit = js.native
  }
  
  @JSImport("@angular/compiler-cli/ngcc/src/writing/in_place_file_writer", "NGCC_BACKUP_EXTENSION")
  @js.native
  val NGCC_BACKUP_EXTENSION: /* ".__ivy_ngcc_bak" */ String = js.native
}
