package typings.angularCompilerCli.anon

import typings.angularCompilerCli.srcNgtscCoreApiSrcInterfacesMod.ResourceHostContext
import typings.angularCompilerCli.srcNgtscCoreApiSrcInterfacesMod.TransformResourceResult
import typings.std.Set
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
import typings.typescript.mod.WriteFileCallback
import typings.typescript.mod.WriteFileCallbackData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/util/src/typescript.RequiredDelegations<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/core/api.ExtendedTsCompilerHost> */
trait RequiredDelegationsExtend extends StObject {
  
  var createHash: js.UndefOr[js.Function1[/* data */ String, String]] = js.undefined
  
  var directoryExists: js.UndefOr[js.Function1[/* directoryName */ String, Boolean]] = js.undefined
  
  def fileExists(fileName: String): Boolean
  @JSName("fileExists")
  var fileExists_Original: js.Function1[/* fileName */ String, Boolean]
  
  var fileNameToModuleName: js.UndefOr[
    js.Function2[/* importedFilePath */ String, /* containingFilePath */ String, String]
  ] = js.undefined
  
  var getCancellationToken: js.UndefOr[js.Function0[typings.typescript.mod.CancellationToken]] = js.undefined
  
  def getCanonicalFileName(fileName: String): String
  @JSName("getCanonicalFileName")
  var getCanonicalFileName_Original: js.Function1[/* fileName */ String, String]
  
  var getCurrentDirectory: js.UndefOr[js.Function0[String]] = js.undefined
  
  def getDefaultLibFileName(options: CompilerOptions): String
  @JSName("getDefaultLibFileName")
  var getDefaultLibFileName_Original: js.Function1[/* options */ CompilerOptions, String]
  
  var getDefaultLibLocation: js.UndefOr[js.Function0[String]] = js.undefined
  
  var getDirectories: js.UndefOr[js.Function1[/* path */ String, js.Array[String]]] = js.undefined
  
  var getEnvironmentVariable: js.UndefOr[js.Function1[/* name */ String, js.UndefOr[String]]] = js.undefined
  
  var getModifiedResourceFiles: js.UndefOr[js.Function0[js.UndefOr[Set[String]]]] = js.undefined
  
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
  
  var readResource: js.UndefOr[js.Function1[/* fileName */ String, js.Promise[String] | String]] = js.undefined
  
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
  
  var resourceNameToFileName: js.UndefOr[
    js.Function3[
      /* resourceName */ String, 
      /* containingFilePath */ String, 
      /* fallbackResolve */ js.UndefOr[js.Function2[/* url */ String, /* fromFile */ String, String | Null]], 
      String | Null
    ]
  ] = js.undefined
  
  var trace: js.UndefOr[js.Function1[/* s */ String, Unit]] = js.undefined
  
  var transformResource: js.UndefOr[
    js.Function2[
      /* data */ String, 
      /* context */ ResourceHostContext, 
      js.Promise[TransformResourceResult | Null]
    ]
  ] = js.undefined
  
  var useCaseSensitiveFileNames: js.UndefOr[Boolean | js.Function0[Boolean]] = js.undefined
  
  def writeFile(fileName: String, text: String, writeByteOrderMark: Boolean): Unit
  def writeFile(
    fileName: String,
    text: String,
    writeByteOrderMark: Boolean,
    onError: js.Function1[/* message */ String, Unit]
  ): Unit
  def writeFile(
    fileName: String,
    text: String,
    writeByteOrderMark: Boolean,
    onError: js.Function1[/* message */ String, Unit],
    sourceFiles: js.Array[SourceFile]
  ): Unit
  def writeFile(
    fileName: String,
    text: String,
    writeByteOrderMark: Boolean,
    onError: js.Function1[/* message */ String, Unit],
    sourceFiles: js.Array[SourceFile],
    data: WriteFileCallbackData
  ): Unit
  def writeFile(
    fileName: String,
    text: String,
    writeByteOrderMark: Boolean,
    onError: js.Function1[/* message */ String, Unit],
    sourceFiles: Unit,
    data: WriteFileCallbackData
  ): Unit
  def writeFile(
    fileName: String,
    text: String,
    writeByteOrderMark: Boolean,
    onError: Unit,
    sourceFiles: js.Array[SourceFile]
  ): Unit
  def writeFile(
    fileName: String,
    text: String,
    writeByteOrderMark: Boolean,
    onError: Unit,
    sourceFiles: js.Array[SourceFile],
    data: WriteFileCallbackData
  ): Unit
  def writeFile(
    fileName: String,
    text: String,
    writeByteOrderMark: Boolean,
    onError: Unit,
    sourceFiles: Unit,
    data: WriteFileCallbackData
  ): Unit
  @JSName("writeFile")
  var writeFile_Original: WriteFileCallback
}
object RequiredDelegationsExtend {
  
  inline def apply(
    fileExists: /* fileName */ String => Boolean,
    getCanonicalFileName: /* fileName */ String => String,
    getDefaultLibFileName: /* options */ CompilerOptions => String,
    getNewLine: () => String,
    getSourceFile: (/* fileName */ String, /* languageVersionOrOptions */ ScriptTarget) => js.UndefOr[SourceFile],
    readFile: /* fileName */ String => js.UndefOr[String],
    writeFile: (/* fileName */ String, /* text */ String, /* writeByteOrderMark */ Boolean, /* onError */ js.UndefOr[js.Function1[/* message */ String, Unit]], /* sourceFiles */ js.UndefOr[js.Array[SourceFile]], /* data */ js.UndefOr[WriteFileCallbackData]) => Unit
  ): RequiredDelegationsExtend = {
    val __obj = js.Dynamic.literal(fileExists = js.Any.fromFunction1(fileExists), getCanonicalFileName = js.Any.fromFunction1(getCanonicalFileName), getDefaultLibFileName = js.Any.fromFunction1(getDefaultLibFileName), getNewLine = js.Any.fromFunction0(getNewLine), getSourceFile = js.Any.fromFunction2(getSourceFile), readFile = js.Any.fromFunction1(readFile), writeFile = js.Any.fromFunction6(writeFile))
    __obj.asInstanceOf[RequiredDelegationsExtend]
  }
  
  extension [Self <: RequiredDelegationsExtend](x: Self) {
    
    inline def setCreateHash(value: /* data */ String => String): Self = StObject.set(x, "createHash", js.Any.fromFunction1(value))
    
    inline def setCreateHashUndefined: Self = StObject.set(x, "createHash", js.undefined)
    
    inline def setDirectoryExists(value: /* directoryName */ String => Boolean): Self = StObject.set(x, "directoryExists", js.Any.fromFunction1(value))
    
    inline def setDirectoryExistsUndefined: Self = StObject.set(x, "directoryExists", js.undefined)
    
    inline def setFileExists(value: /* fileName */ String => Boolean): Self = StObject.set(x, "fileExists", js.Any.fromFunction1(value))
    
    inline def setFileNameToModuleName(value: (/* importedFilePath */ String, /* containingFilePath */ String) => String): Self = StObject.set(x, "fileNameToModuleName", js.Any.fromFunction2(value))
    
    inline def setFileNameToModuleNameUndefined: Self = StObject.set(x, "fileNameToModuleName", js.undefined)
    
    inline def setGetCancellationToken(value: () => typings.typescript.mod.CancellationToken): Self = StObject.set(x, "getCancellationToken", js.Any.fromFunction0(value))
    
    inline def setGetCancellationTokenUndefined: Self = StObject.set(x, "getCancellationToken", js.undefined)
    
    inline def setGetCanonicalFileName(value: /* fileName */ String => String): Self = StObject.set(x, "getCanonicalFileName", js.Any.fromFunction1(value))
    
    inline def setGetCurrentDirectory(value: () => String): Self = StObject.set(x, "getCurrentDirectory", js.Any.fromFunction0(value))
    
    inline def setGetCurrentDirectoryUndefined: Self = StObject.set(x, "getCurrentDirectory", js.undefined)
    
    inline def setGetDefaultLibFileName(value: /* options */ CompilerOptions => String): Self = StObject.set(x, "getDefaultLibFileName", js.Any.fromFunction1(value))
    
    inline def setGetDefaultLibLocation(value: () => String): Self = StObject.set(x, "getDefaultLibLocation", js.Any.fromFunction0(value))
    
    inline def setGetDefaultLibLocationUndefined: Self = StObject.set(x, "getDefaultLibLocation", js.undefined)
    
    inline def setGetDirectories(value: /* path */ String => js.Array[String]): Self = StObject.set(x, "getDirectories", js.Any.fromFunction1(value))
    
    inline def setGetDirectoriesUndefined: Self = StObject.set(x, "getDirectories", js.undefined)
    
    inline def setGetEnvironmentVariable(value: /* name */ String => js.UndefOr[String]): Self = StObject.set(x, "getEnvironmentVariable", js.Any.fromFunction1(value))
    
    inline def setGetEnvironmentVariableUndefined: Self = StObject.set(x, "getEnvironmentVariable", js.undefined)
    
    inline def setGetModifiedResourceFiles(value: () => js.UndefOr[Set[String]]): Self = StObject.set(x, "getModifiedResourceFiles", js.Any.fromFunction0(value))
    
    inline def setGetModifiedResourceFilesUndefined: Self = StObject.set(x, "getModifiedResourceFiles", js.undefined)
    
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
    
    inline def setReadResource(value: /* fileName */ String => js.Promise[String] | String): Self = StObject.set(x, "readResource", js.Any.fromFunction1(value))
    
    inline def setReadResourceUndefined: Self = StObject.set(x, "readResource", js.undefined)
    
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
    
    inline def setResourceNameToFileName(
      value: (/* resourceName */ String, /* containingFilePath */ String, /* fallbackResolve */ js.UndefOr[js.Function2[/* url */ String, /* fromFile */ String, String | Null]]) => String | Null
    ): Self = StObject.set(x, "resourceNameToFileName", js.Any.fromFunction3(value))
    
    inline def setResourceNameToFileNameUndefined: Self = StObject.set(x, "resourceNameToFileName", js.undefined)
    
    inline def setTrace(value: /* s */ String => Unit): Self = StObject.set(x, "trace", js.Any.fromFunction1(value))
    
    inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
    
    inline def setTransformResource(
      value: (/* data */ String, /* context */ ResourceHostContext) => js.Promise[TransformResourceResult | Null]
    ): Self = StObject.set(x, "transformResource", js.Any.fromFunction2(value))
    
    inline def setTransformResourceUndefined: Self = StObject.set(x, "transformResource", js.undefined)
    
    inline def setUseCaseSensitiveFileNames(value: Boolean | js.Function0[Boolean]): Self = StObject.set(x, "useCaseSensitiveFileNames", value.asInstanceOf[js.Any])
    
    inline def setUseCaseSensitiveFileNamesFunction0(value: () => Boolean): Self = StObject.set(x, "useCaseSensitiveFileNames", js.Any.fromFunction0(value))
    
    inline def setUseCaseSensitiveFileNamesUndefined: Self = StObject.set(x, "useCaseSensitiveFileNames", js.undefined)
    
    inline def setWriteFile(
      value: (/* fileName */ String, /* text */ String, /* writeByteOrderMark */ Boolean, /* onError */ js.UndefOr[js.Function1[/* message */ String, Unit]], /* sourceFiles */ js.UndefOr[js.Array[SourceFile]], /* data */ js.UndefOr[WriteFileCallbackData]) => Unit
    ): Self = StObject.set(x, "writeFile", js.Any.fromFunction6(value))
  }
}
