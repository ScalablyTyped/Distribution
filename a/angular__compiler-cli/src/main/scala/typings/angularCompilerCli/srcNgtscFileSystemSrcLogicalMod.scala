package typings.angularCompilerCli

import typings.angularCompilerCli.anon.PickCompilerHostgetCanoni
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.BrandedPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathSegment
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscFileSystemSrcLogicalMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/file_system/src/logical", "LogicalFileSystem")
  @js.native
  open class LogicalFileSystem protected () extends StObject {
    def this(rootDirs: js.Array[AbsoluteFsPath], compilerHost: PickCompilerHostgetCanoni) = this()
    
    /**
      * A cache of file paths to project paths, because computation of these paths is slightly
      * expensive.
      */
    /* private */ var cache: Any = js.native
    
    /**
      * The same root directories as `rootDirs` but with each one converted to its
      * canonical form for matching in case-insensitive file-systems.
      */
    /* private */ var canonicalRootDirs: Any = js.native
    
    /* private */ var compilerHost: Any = js.native
    
    /* private */ var createLogicalProjectPath: Any = js.native
    
    /**
      * Get the logical path in the project of a source file.
      *
      * @returns A `LogicalProjectPath` to the source file, or `null` if the source file is not in any
      * of the TS project's root directories.
      */
    def logicalPathOfFile(physicalFile: AbsoluteFsPath): LogicalProjectPath | Null = js.native
    
    /**
      * Get the logical path in the project of a `ts.SourceFile`.
      *
      * This method is provided as a convenient alternative to calling
      * `logicalPathOfFile(absoluteFromSourceFile(sf))`.
      */
    def logicalPathOfSf(sf: SourceFile): LogicalProjectPath | Null = js.native
    
    /**
      * The root directories of the project, sorted with the longest path first.
      */
    /* private */ var rootDirs: Any = js.native
  }
  
  object LogicalProjectPath {
    
    @JSImport("@angular/compiler-cli/src/ngtsc/file_system/src/logical", "LogicalProjectPath")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get the relative path between two `LogicalProjectPath`s.
      *
      * This will return a `PathSegment` which would be a valid module specifier to use in `from` when
      * importing from `to`.
      */
    inline def relativePathBetween(from: LogicalProjectPath, to: LogicalProjectPath): PathSegment = (^.asInstanceOf[js.Dynamic].applyDynamic("relativePathBetween")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[PathSegment]
  }
  type LogicalProjectPath = BrandedPath[typings.angularCompilerCli.angularCompilerCliStrings.LogicalProjectPath]
}
