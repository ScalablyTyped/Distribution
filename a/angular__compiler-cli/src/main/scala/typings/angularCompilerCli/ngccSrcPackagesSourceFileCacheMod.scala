package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.ReadonlyFileSystem
import typings.typescript.mod.ModuleResolutionCache
import typings.typescript.mod.ScriptTarget
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcPackagesSourceFileCacheMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/packages/source_file_cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/ngcc/src/packages/source_file_cache", "EntryPointFileCache")
  @js.native
  open class EntryPointFileCache protected () extends StObject {
    def this(
      fs: ReadonlyFileSystem,
      sharedFileCache: SharedFileCache,
      processSourceText: js.Function1[/* sourceText */ String, String]
    ) = this()
    
    /* private */ var fs: Any = js.native
    
    /**
      * Returns and caches a parsed `ts.SourceFile` for the provided `fileName`. If the `fileName` is
      * cached in the shared file cache, that result is used. Otherwise, the source file is cached
      * internally. This method returns `undefined` if the requested file does not exist.
      *
      * @param fileName The path of the file to retrieve a source file for.
      * @param languageVersion The language version to use for parsing the file.
      */
    def getCachedSourceFile(fileName: String, languageVersion: ScriptTarget): js.UndefOr[SourceFile] = js.native
    
    /* private */ var processSourceText: Any = js.native
    
    /* private */ val sfCache: Any = js.native
    
    /* private */ var sharedFileCache: Any = js.native
  }
  
  @JSImport("@angular/compiler-cli/ngcc/src/packages/source_file_cache", "SharedFileCache")
  @js.native
  open class SharedFileCache protected () extends StObject {
    def this(fs: ReadonlyFileSystem) = this()
    
    /* private */ var fs: Any = js.native
    
    /**
      * Loads a `ts.SourceFile` if the provided `fileName` is deemed appropriate to be cached. To
      * optimize for memory usage, only files that are generally used in all entry-points are cached.
      * If `fileName` is not considered to benefit from caching or the requested file does not exist,
      * then `undefined` is returned.
      */
    def getCachedSourceFile(fileName: String): js.UndefOr[SourceFile] = js.native
    
    /**
      * Attempts to load the source file from the cache, or parses the file into a `ts.SourceFile` if
      * it's not yet cached. This method assumes that the file will not be modified for the duration
      * that this cache is valid for. If that assumption does not hold, the `getVolatileCachedFile`
      * method is to be used instead.
      */
    /* private */ var getStableCachedFile: Any = js.native
    
    /**
      * In contrast to `getStableCachedFile`, this method always verifies that the cached source file
      * is the same as what's stored on disk. This is done for files that are expected to change during
      * ngcc's processing, such as @angular scoped packages for which the .d.ts files are overwritten
      * by ngcc. If the contents on disk have changed compared to a previously cached source file, the
      * content from disk is re-parsed and the cache entry is replaced.
      */
    /* private */ var getVolatileCachedFile: Any = js.native
    
    /* private */ var sfCache: Any = js.native
  }
  
  inline def createModuleResolutionCache(fs: ReadonlyFileSystem): ModuleResolutionCache = ^.asInstanceOf[js.Dynamic].applyDynamic("createModuleResolutionCache")(fs.asInstanceOf[js.Any]).asInstanceOf[ModuleResolutionCache]
  
  inline def isAngularDts(absPath: AbsoluteFsPath, fs: ReadonlyFileSystem): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAngularDts")(absPath.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isDefaultLibrary(absPath: AbsoluteFsPath, fs: ReadonlyFileSystem): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDefaultLibrary")(absPath.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
