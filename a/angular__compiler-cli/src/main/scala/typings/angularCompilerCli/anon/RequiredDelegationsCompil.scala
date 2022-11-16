package typings.angularCompilerCli.anon

import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.CreateSourceFileOptions
import typings.typescript.mod.FileReference
import typings.typescript.mod.ModuleKind.CommonJS
import typings.typescript.mod.ModuleKind.ESNext
import typings.typescript.mod.ModuleResolutionCache
import typings.typescript.mod.ParsedCommandLine
import typings.typescript.mod.Path
import typings.typescript.mod.ResolvedModule
import typings.typescript.mod.ResolvedProjectReference
import typings.typescript.mod.ResolvedTypeReferenceDirective
import typings.typescript.mod.ScriptTarget
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/util/src/typescript.RequiredDelegations<typescript.typescript.CompilerHost> */
trait RequiredDelegationsCompil extends StObject {
  
  var createHash: js.UndefOr[js.Function1[/* data */ String, String]] = js.undefined
  
  var directoryExists: js.UndefOr[js.Function1[/* directoryName */ String, Boolean]] = js.undefined
  
  def fileExists(fileName: String): Boolean
  @JSName("fileExists")
  var fileExists_Original: js.Function1[/* fileName */ String, Boolean]
  
  var getCancellationToken: js.UndefOr[js.Function0[typings.typescript.mod.CancellationToken]] = js.undefined
  
  def getCanonicalFileName(fileName: String): String
  @JSName("getCanonicalFileName")
  var getCanonicalFileName_Original: js.Function1[/* fileName */ String, String]
  
  def getCurrentDirectory(): String
  @JSName("getCurrentDirectory")
  var getCurrentDirectory_Original: js.Function0[String]
  
  def getDefaultLibFileName(options: CompilerOptions): String
  @JSName("getDefaultLibFileName")
  var getDefaultLibFileName_Original: js.Function1[/* options */ CompilerOptions, String]
  
  var getDefaultLibLocation: js.UndefOr[js.Function0[String]] = js.undefined
  
  var getDirectories: js.UndefOr[js.Function1[/* path */ String, js.Array[String]]] = js.undefined
  
  var getEnvironmentVariable: js.UndefOr[js.Function1[/* name */ String, js.UndefOr[String]]] = js.undefined
  
  var getModuleResolutionCache: js.UndefOr[js.Function0[js.UndefOr[ModuleResolutionCache]]] = js.undefined
  
  def getNewLine(): String
  @JSName("getNewLine")
  var getNewLine_Original: js.Function0[String]
  
  var getParsedCommandLine: js.UndefOr[js.Function1[/* fileName */ String, js.UndefOr[ParsedCommandLine]]] = js.undefined
  
  def getSourceFile(fileName: String, languageVersionOrOptions: ScriptTarget): js.UndefOr[SourceFile]
  
  var getSourceFileByPath: js.UndefOr[
    js.Function5[
      /* fileName */ String, 
      /* path */ Path, 
      /* languageVersionOrOptions */ ScriptTarget | CreateSourceFileOptions, 
      /* onError */ js.UndefOr[js.Function1[/* message */ String, Unit]], 
      /* shouldCreateNewSourceFile */ js.UndefOr[Boolean], 
      js.UndefOr[SourceFile]
    ]
  ] = js.undefined
  
  @JSName("getSourceFile")
  var getSourceFile_Original: js.Function2[
    /* fileName */ String, 
    /* languageVersionOrOptions */ ScriptTarget, 
    js.UndefOr[SourceFile]
  ]
  
  var hasInvalidatedResolutions: js.UndefOr[js.Function1[/* filePath */ Path, Boolean]] = js.undefined
  
  var readDirectory: js.UndefOr[
    js.Function5[
      /* rootDir */ String, 
      /* extensions */ js.Array[String], 
      /* excludes */ js.UndefOr[js.Array[String]], 
      /* includes */ js.Array[String], 
      /* depth */ js.UndefOr[Double], 
      js.Array[String]
    ]
  ] = js.undefined
  
  def readFile(fileName: String): js.UndefOr[String]
  @JSName("readFile")
  var readFile_Original: js.Function1[/* fileName */ String, js.UndefOr[String]]
  
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
  
  var resolveTypeReferenceDirectives: js.UndefOr[
    js.Function5[
      /* typeReferenceDirectiveNames */ js.Array[FileReference | String], 
      /* containingFile */ String, 
      /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
      /* options */ CompilerOptions, 
      /* containingFileMode */ js.UndefOr[ESNext | CommonJS], 
      js.Array[js.UndefOr[ResolvedTypeReferenceDirective]]
    ]
  ] = js.undefined
  
  var trace: js.UndefOr[js.Function1[/* s */ String, Unit]] = js.undefined
  
  def useCaseSensitiveFileNames(): Boolean
  @JSName("useCaseSensitiveFileNames")
  var useCaseSensitiveFileNames_Original: js.Function0[Boolean]
  
  def writeFile(fileName: String, text: String, writeByteOrderMark: Boolean): Unit
  @JSName("writeFile")
  var writeFile_Original: js.Function3[/* fileName */ String, /* text */ String, /* writeByteOrderMark */ Boolean, Unit]
}
object RequiredDelegationsCompil {
  
  inline def apply(
    fileExists: /* fileName */ String => Boolean,
    getCanonicalFileName: /* fileName */ String => String,
    getCurrentDirectory: () => String,
    getDefaultLibFileName: /* options */ CompilerOptions => String,
    getNewLine: () => String,
    getSourceFile: (/* fileName */ String, /* languageVersionOrOptions */ ScriptTarget) => js.UndefOr[SourceFile],
    readFile: /* fileName */ String => js.UndefOr[String],
    useCaseSensitiveFileNames: () => Boolean,
    writeFile: (/* fileName */ String, /* text */ String, /* writeByteOrderMark */ Boolean) => Unit
  ): RequiredDelegationsCompil = {
    val __obj = js.Dynamic.literal(fileExists = js.Any.fromFunction1(fileExists), getCanonicalFileName = js.Any.fromFunction1(getCanonicalFileName), getCurrentDirectory = js.Any.fromFunction0(getCurrentDirectory), getDefaultLibFileName = js.Any.fromFunction1(getDefaultLibFileName), getNewLine = js.Any.fromFunction0(getNewLine), getSourceFile = js.Any.fromFunction2(getSourceFile), readFile = js.Any.fromFunction1(readFile), useCaseSensitiveFileNames = js.Any.fromFunction0(useCaseSensitiveFileNames), writeFile = js.Any.fromFunction3(writeFile))
    __obj.asInstanceOf[RequiredDelegationsCompil]
  }
  
  extension [Self <: RequiredDelegationsCompil](x: Self) {
    
    inline def setCreateHash(value: /* data */ String => String): Self = StObject.set(x, "createHash", js.Any.fromFunction1(value))
    
    inline def setCreateHashUndefined: Self = StObject.set(x, "createHash", js.undefined)
    
    inline def setDirectoryExists(value: /* directoryName */ String => Boolean): Self = StObject.set(x, "directoryExists", js.Any.fromFunction1(value))
    
    inline def setDirectoryExistsUndefined: Self = StObject.set(x, "directoryExists", js.undefined)
    
    inline def setFileExists(value: /* fileName */ String => Boolean): Self = StObject.set(x, "fileExists", js.Any.fromFunction1(value))
    
    inline def setGetCancellationToken(value: () => typings.typescript.mod.CancellationToken): Self = StObject.set(x, "getCancellationToken", js.Any.fromFunction0(value))
    
    inline def setGetCancellationTokenUndefined: Self = StObject.set(x, "getCancellationToken", js.undefined)
    
    inline def setGetCanonicalFileName(value: /* fileName */ String => String): Self = StObject.set(x, "getCanonicalFileName", js.Any.fromFunction1(value))
    
    inline def setGetCurrentDirectory(value: () => String): Self = StObject.set(x, "getCurrentDirectory", js.Any.fromFunction0(value))
    
    inline def setGetDefaultLibFileName(value: /* options */ CompilerOptions => String): Self = StObject.set(x, "getDefaultLibFileName", js.Any.fromFunction1(value))
    
    inline def setGetDefaultLibLocation(value: () => String): Self = StObject.set(x, "getDefaultLibLocation", js.Any.fromFunction0(value))
    
    inline def setGetDefaultLibLocationUndefined: Self = StObject.set(x, "getDefaultLibLocation", js.undefined)
    
    inline def setGetDirectories(value: /* path */ String => js.Array[String]): Self = StObject.set(x, "getDirectories", js.Any.fromFunction1(value))
    
    inline def setGetDirectoriesUndefined: Self = StObject.set(x, "getDirectories", js.undefined)
    
    inline def setGetEnvironmentVariable(value: /* name */ String => js.UndefOr[String]): Self = StObject.set(x, "getEnvironmentVariable", js.Any.fromFunction1(value))
    
    inline def setGetEnvironmentVariableUndefined: Self = StObject.set(x, "getEnvironmentVariable", js.undefined)
    
    inline def setGetModuleResolutionCache(value: () => js.UndefOr[ModuleResolutionCache]): Self = StObject.set(x, "getModuleResolutionCache", js.Any.fromFunction0(value))
    
    inline def setGetModuleResolutionCacheUndefined: Self = StObject.set(x, "getModuleResolutionCache", js.undefined)
    
    inline def setGetNewLine(value: () => String): Self = StObject.set(x, "getNewLine", js.Any.fromFunction0(value))
    
    inline def setGetParsedCommandLine(value: /* fileName */ String => js.UndefOr[ParsedCommandLine]): Self = StObject.set(x, "getParsedCommandLine", js.Any.fromFunction1(value))
    
    inline def setGetParsedCommandLineUndefined: Self = StObject.set(x, "getParsedCommandLine", js.undefined)
    
    inline def setGetSourceFile(
      value: (/* fileName */ String, /* languageVersionOrOptions */ ScriptTarget) => js.UndefOr[SourceFile]
    ): Self = StObject.set(x, "getSourceFile", js.Any.fromFunction2(value))
    
    inline def setGetSourceFileByPath(
      value: (/* fileName */ String, /* path */ Path, /* languageVersionOrOptions */ ScriptTarget | CreateSourceFileOptions, /* onError */ js.UndefOr[js.Function1[/* message */ String, Unit]], /* shouldCreateNewSourceFile */ js.UndefOr[Boolean]) => js.UndefOr[SourceFile]
    ): Self = StObject.set(x, "getSourceFileByPath", js.Any.fromFunction5(value))
    
    inline def setGetSourceFileByPathUndefined: Self = StObject.set(x, "getSourceFileByPath", js.undefined)
    
    inline def setHasInvalidatedResolutions(value: /* filePath */ Path => Boolean): Self = StObject.set(x, "hasInvalidatedResolutions", js.Any.fromFunction1(value))
    
    inline def setHasInvalidatedResolutionsUndefined: Self = StObject.set(x, "hasInvalidatedResolutions", js.undefined)
    
    inline def setReadDirectory(
      value: (/* rootDir */ String, /* extensions */ js.Array[String], /* excludes */ js.UndefOr[js.Array[String]], /* includes */ js.Array[String], /* depth */ js.UndefOr[Double]) => js.Array[String]
    ): Self = StObject.set(x, "readDirectory", js.Any.fromFunction5(value))
    
    inline def setReadDirectoryUndefined: Self = StObject.set(x, "readDirectory", js.undefined)
    
    inline def setReadFile(value: /* fileName */ String => js.UndefOr[String]): Self = StObject.set(x, "readFile", js.Any.fromFunction1(value))
    
    inline def setRealpath(value: /* path */ String => String): Self = StObject.set(x, "realpath", js.Any.fromFunction1(value))
    
    inline def setRealpathUndefined: Self = StObject.set(x, "realpath", js.undefined)
    
    inline def setResolveModuleNames(
      value: (/* moduleNames */ js.Array[String], /* containingFile */ String, /* reusedNames */ js.UndefOr[js.Array[String]], /* redirectedReference */ js.UndefOr[ResolvedProjectReference], /* options */ CompilerOptions, /* containingSourceFile */ js.UndefOr[SourceFile]) => js.Array[js.UndefOr[ResolvedModule]]
    ): Self = StObject.set(x, "resolveModuleNames", js.Any.fromFunction6(value))
    
    inline def setResolveModuleNamesUndefined: Self = StObject.set(x, "resolveModuleNames", js.undefined)
    
    inline def setResolveTypeReferenceDirectives(
      value: (/* typeReferenceDirectiveNames */ js.Array[FileReference | String], /* containingFile */ String, /* redirectedReference */ js.UndefOr[ResolvedProjectReference], /* options */ CompilerOptions, /* containingFileMode */ js.UndefOr[ESNext | CommonJS]) => js.Array[js.UndefOr[ResolvedTypeReferenceDirective]]
    ): Self = StObject.set(x, "resolveTypeReferenceDirectives", js.Any.fromFunction5(value))
    
    inline def setResolveTypeReferenceDirectivesUndefined: Self = StObject.set(x, "resolveTypeReferenceDirectives", js.undefined)
    
    inline def setTrace(value: /* s */ String => Unit): Self = StObject.set(x, "trace", js.Any.fromFunction1(value))
    
    inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
    
    inline def setUseCaseSensitiveFileNames(value: () => Boolean): Self = StObject.set(x, "useCaseSensitiveFileNames", js.Any.fromFunction0(value))
    
    inline def setWriteFile(value: (/* fileName */ String, /* text */ String, /* writeByteOrderMark */ Boolean) => Unit): Self = StObject.set(x, "writeFile", js.Any.fromFunction3(value))
  }
}
