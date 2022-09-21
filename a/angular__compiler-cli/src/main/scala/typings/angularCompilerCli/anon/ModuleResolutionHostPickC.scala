package typings.angularCompilerCli.anon

import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.ResolvedModule
import typings.typescript.mod.ResolvedProjectReference
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined typescript.typescript.ModuleResolutionHost & std.Pick<typescript.typescript.CompilerHost, 'resolveModuleNames'> */
trait ModuleResolutionHostPickC extends StObject {
  
  var directoryExists: js.UndefOr[js.Function1[/* directoryName */ String, Boolean]] = js.undefined
  
  def fileExists(fileName: String): Boolean
  
  var getCurrentDirectory: js.UndefOr[js.Function0[String]] = js.undefined
  
  var getDirectories: js.UndefOr[js.Function1[/* path */ String, js.Array[String]]] = js.undefined
  
  def readFile(fileName: String): js.UndefOr[String]
  
  /**
    * Resolve a symbolic link.
    * @see https://nodejs.org/api/fs.html#fs_fs_realpathsync_path_options
    */
  var realpath: js.UndefOr[js.Function1[/* path */ String, String]] = js.undefined
  
  var resolveModuleNames: js.UndefOr[
    js.Function6[
      /* moduleNames */ js.Array[String], 
      /* containingFile */ String, 
      /* reusedNames */ js.UndefOr[js.Array[String]], 
      /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
      /* options */ CompilerOptions, 
      /* containingSourceFile */ js.UndefOr[SourceFile], 
      js.Array[js.UndefOr[ResolvedModule]]
    ]
  ] = js.undefined
  
  var trace: js.UndefOr[js.Function1[/* s */ String, Unit]] = js.undefined
  
  var useCaseSensitiveFileNames: js.UndefOr[Boolean | js.Function0[Boolean]] = js.undefined
}
object ModuleResolutionHostPickC {
  
  inline def apply(fileExists: String => Boolean, readFile: String => js.UndefOr[String]): ModuleResolutionHostPickC = {
    val __obj = js.Dynamic.literal(fileExists = js.Any.fromFunction1(fileExists), readFile = js.Any.fromFunction1(readFile))
    __obj.asInstanceOf[ModuleResolutionHostPickC]
  }
  
  extension [Self <: ModuleResolutionHostPickC](x: Self) {
    
    inline def setDirectoryExists(value: /* directoryName */ String => Boolean): Self = StObject.set(x, "directoryExists", js.Any.fromFunction1(value))
    
    inline def setDirectoryExistsUndefined: Self = StObject.set(x, "directoryExists", js.undefined)
    
    inline def setFileExists(value: String => Boolean): Self = StObject.set(x, "fileExists", js.Any.fromFunction1(value))
    
    inline def setGetCurrentDirectory(value: () => String): Self = StObject.set(x, "getCurrentDirectory", js.Any.fromFunction0(value))
    
    inline def setGetCurrentDirectoryUndefined: Self = StObject.set(x, "getCurrentDirectory", js.undefined)
    
    inline def setGetDirectories(value: /* path */ String => js.Array[String]): Self = StObject.set(x, "getDirectories", js.Any.fromFunction1(value))
    
    inline def setGetDirectoriesUndefined: Self = StObject.set(x, "getDirectories", js.undefined)
    
    inline def setReadFile(value: String => js.UndefOr[String]): Self = StObject.set(x, "readFile", js.Any.fromFunction1(value))
    
    inline def setRealpath(value: /* path */ String => String): Self = StObject.set(x, "realpath", js.Any.fromFunction1(value))
    
    inline def setRealpathUndefined: Self = StObject.set(x, "realpath", js.undefined)
    
    inline def setResolveModuleNames(
      value: (/* moduleNames */ js.Array[String], /* containingFile */ String, /* reusedNames */ js.UndefOr[js.Array[String]], /* redirectedReference */ js.UndefOr[ResolvedProjectReference], /* options */ CompilerOptions, /* containingSourceFile */ js.UndefOr[SourceFile]) => js.Array[js.UndefOr[ResolvedModule]]
    ): Self = StObject.set(x, "resolveModuleNames", js.Any.fromFunction6(value))
    
    inline def setResolveModuleNamesUndefined: Self = StObject.set(x, "resolveModuleNames", js.undefined)
    
    inline def setTrace(value: /* s */ String => Unit): Self = StObject.set(x, "trace", js.Any.fromFunction1(value))
    
    inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
    
    inline def setUseCaseSensitiveFileNames(value: Boolean | js.Function0[Boolean]): Self = StObject.set(x, "useCaseSensitiveFileNames", value.asInstanceOf[js.Any])
    
    inline def setUseCaseSensitiveFileNamesFunction0(value: () => Boolean): Self = StObject.set(x, "useCaseSensitiveFileNames", js.Any.fromFunction0(value))
    
    inline def setUseCaseSensitiveFileNamesUndefined: Self = StObject.set(x, "useCaseSensitiveFileNames", js.undefined)
  }
}
