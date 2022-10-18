package typings.angularCompilerCli

import typings.angularCompilerCli.ngccSrcPackagesEntryPointBundleMod.EntryPointBundle
import typings.angularCompilerCli.ngccSrcPackagesEntryPointMod.EntryPoint
import typings.angularCompilerCli.ngccSrcPackagesEntryPointMod.EntryPointJsonProperty
import typings.angularCompilerCli.ngccSrcRenderingUtilsMod.FileToWrite
import typings.angularCompilerCli.ngccSrcWritingInPlaceFileWriterMod.InPlaceFileWriter
import typings.angularCompilerCli.ngccSrcWritingPackageJsonUpdaterMod.PackageJsonUpdater
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.FileSystem
import typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcWritingNewEntryPointFileWriterMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/writing/new_entry_point_file_writer", "NGCC_DIRECTORY")
  @js.native
  val NGCC_DIRECTORY: /* "__ivy_ngcc__" */ String = js.native
  
  @JSImport("@angular/compiler-cli/ngcc/src/writing/new_entry_point_file_writer", "NGCC_PROPERTY_EXTENSION")
  @js.native
  val NGCC_PROPERTY_EXTENSION: /* "_ivy_ngcc" */ String = js.native
  
  @JSImport("@angular/compiler-cli/ngcc/src/writing/new_entry_point_file_writer", "NewEntryPointFileWriter")
  @js.native
  open class NewEntryPointFileWriter protected () extends InPlaceFileWriter {
    def this(
      fs: FileSystem,
      logger: Logger,
      errorOnFailedEntryPoint: Boolean,
      pkgJsonUpdater: PackageJsonUpdater
    ) = this()
    
    /**
      * If a source file has an associated source-map, then copy this, while updating its sourceRoot
      * accordingly.
      *
      * For now don't try to parse the source for inline source-maps or external source-map links,
      * since that is more complex and will slow ngcc down.
      * Instead just check for a source-map file residing next to the source file, which is by far
      * the most common case.
      *
      * @param originalSrcPath absolute path to the original source file being copied.
      * @param newSrcPath absolute path to where the source will be written.
      */
    /* protected */ def copyAndUpdateSourceMap(originalSrcPath: AbsoluteFsPath, newSrcPath: AbsoluteFsPath): Unit = js.native
    
    /* protected */ def copyBundle(
      bundle: EntryPointBundle,
      packagePath: AbsoluteFsPath,
      ngccFolder: AbsoluteFsPath,
      transformedFiles: js.Array[FileToWrite]
    ): Unit = js.native
    
    /* private */ var pkgJsonUpdater: Any = js.native
    
    /* protected */ def revertFile(filePath: AbsoluteFsPath, packagePath: AbsoluteFsPath): Unit = js.native
    
    /* protected */ def revertPackageJson(entryPoint: EntryPoint, formatProperties: js.Array[EntryPointJsonProperty]): Unit = js.native
    
    /* protected */ def updatePackageJson(
      entryPoint: EntryPoint,
      formatProperties: js.Array[EntryPointJsonProperty],
      ngccFolder: AbsoluteFsPath
    ): Unit = js.native
    
    /* protected */ def writeFile(file: FileToWrite, packagePath: AbsoluteFsPath, ngccFolder: AbsoluteFsPath): Unit = js.native
  }
}
