package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscCoreApiSrcInterfacesMod.ResourceHostContext
import typings.angularCompilerCli.srcNgtscCoreApiSrcInterfacesMod.TransformResourceResult
import typings.angularCompilerCli.srcNgtscCoreApiSrcInterfacesMod.UnifiedModulesHost
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscShimsApiMod.FactoryTracker
import typings.std.Set
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.ResolvedModule
import typings.typescript.mod.ResolvedProjectReference
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscCoreApiSrcAdapterMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularCompilerCli.angularCompilerCliStrings.getCanonicalFileName
    - typings.angularCompilerCli.angularCompilerCliStrings.resolveModuleNames
    - typings.angularCompilerCli.angularCompilerCliStrings.getCurrentDirectory
    - typings.angularCompilerCli.angularCompilerCliStrings.getModifiedResourceFiles
    - typings.angularCompilerCli.angularCompilerCliStrings.readResource
    - typings.angularCompilerCli.angularCompilerCliStrings.resourceNameToFileName
    - typings.angularCompilerCli.angularCompilerCliStrings.transformResource
  */
  trait ExtendedCompilerHostMethods extends StObject
  object ExtendedCompilerHostMethods {
    
    inline def getCanonicalFileName: typings.angularCompilerCli.angularCompilerCliStrings.getCanonicalFileName = "getCanonicalFileName".asInstanceOf[typings.angularCompilerCli.angularCompilerCliStrings.getCanonicalFileName]
    
    inline def getCurrentDirectory: typings.angularCompilerCli.angularCompilerCliStrings.getCurrentDirectory = "getCurrentDirectory".asInstanceOf[typings.angularCompilerCli.angularCompilerCliStrings.getCurrentDirectory]
    
    inline def getModifiedResourceFiles: typings.angularCompilerCli.angularCompilerCliStrings.getModifiedResourceFiles = "getModifiedResourceFiles".asInstanceOf[typings.angularCompilerCli.angularCompilerCliStrings.getModifiedResourceFiles]
    
    inline def readResource: typings.angularCompilerCli.angularCompilerCliStrings.readResource = "readResource".asInstanceOf[typings.angularCompilerCli.angularCompilerCliStrings.readResource]
    
    inline def resolveModuleNames: typings.angularCompilerCli.angularCompilerCliStrings.resolveModuleNames = "resolveModuleNames".asInstanceOf[typings.angularCompilerCli.angularCompilerCliStrings.resolveModuleNames]
    
    inline def resourceNameToFileName: typings.angularCompilerCli.angularCompilerCliStrings.resourceNameToFileName = "resourceNameToFileName".asInstanceOf[typings.angularCompilerCli.angularCompilerCliStrings.resourceNameToFileName]
    
    inline def transformResource: typings.angularCompilerCli.angularCompilerCliStrings.transformResource = "transformResource".asInstanceOf[typings.angularCompilerCli.angularCompilerCliStrings.transformResource]
  }
  
  /* Inlined parent std.Omit<typescript.typescript.ModuleResolutionHost, 'getCurrentDirectory'> */
  /* Inlined parent std.Pick<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/core/api/src/interfaces.ExtendedTsCompilerHost, 'getCurrentDirectory' | @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/core/api/src/adapter.ExtendedCompilerHostMethods> */
  /* Inlined parent @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/core/api/src/adapter.SourceFileTypeIdentifier */
  trait NgCompilerAdapter extends StObject {
    
    /**
      * An array of `ts.Diagnostic`s that occurred during construction of the `ts.Program`.
      */
    val constructionDiagnostics: js.Array[Diagnostic]
    
    var directoryExists: js.UndefOr[js.Function1[/* directoryName */ String, Boolean]] = js.undefined
    
    /**
      * A path to a single file which represents the entrypoint of an Angular Package Format library,
      * if the current program is one.
      *
      * This is used to emit a flat module index if requested, and can be left `null` if that is not
      * required.
      */
    val entryPoint: AbsoluteFsPath | Null
    
    /**
      * A tracker for usage of symbols in `.ngfactory` shims.
      *
      * This can be left `null` if such shims are not a part of the `ts.Program`.
      */
    val factoryTracker: FactoryTracker | Null
    
    def fileExists(fileName: String): Boolean
    @JSName("fileExists")
    var fileExists_Original: js.Function1[/* fileName */ String, Boolean]
    
    def getCanonicalFileName(fileName: String): String
    @JSName("getCanonicalFileName")
    var getCanonicalFileName_Original: js.Function1[/* fileName */ String, String]
    
    var getCurrentDirectory: js.UndefOr[js.Function0[String]] = js.undefined
    
    var getDirectories: js.UndefOr[js.Function1[/* path */ String, js.Array[String]]] = js.undefined
    
    var getModifiedResourceFiles: js.UndefOr[js.Function0[js.UndefOr[Set[String]]]] = js.undefined
    
    /**
      * A `Set` of `ts.SourceFile`s which are internal to the program and should not be emitted as JS
      * files.
      *
      * Often these are shim files such as `ngtypecheck` shims used for template type-checking in
      * command-line ngc.
      */
    val ignoreForEmit: Set[SourceFile]
    
    /**
      * Distinguishes between resource files added by Angular to the project and original files in the
      * user's program.
      *
      * This is necessary only for the language service because it adds resource files as root files
      * when they are read. This is done to indicate to TS Server that these resources are part of the
      * project and ensures that projects are retained properly when navigating around the workspace.
      */
    def isResource(sf: SourceFile): Boolean
    
    /**
      * Distinguishes between shim files added by Angular to the compilation process (both those
      * intended for output, like ngfactory files, as well as internal shims like ngtypecheck files)
      * and original files in the user's program.
      *
      * This is mostly used to limit type-checking operations to only user files. It should return
      * `true` if a file was written by the user, and `false` if a file was added by the compiler.
      */
    def isShim(sf: SourceFile): Boolean
    
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
    
    var resourceNameToFileName: js.UndefOr[
        js.Function3[
          /* resourceName */ String, 
          /* containingFilePath */ String, 
          /* fallbackResolve */ js.UndefOr[js.Function2[/* url */ String, /* fromFile */ String, String | Null]], 
          String | Null
        ]
      ] = js.undefined
    
    /**
      * Resolved list of root directories explicitly set in, or inferred from, the tsconfig.
      */
    val rootDirs: js.Array[AbsoluteFsPath]
    
    var trace: js.UndefOr[js.Function1[/* s */ String, Unit]] = js.undefined
    
    var transformResource: js.UndefOr[
        js.Function2[
          /* data */ String, 
          /* context */ ResourceHostContext, 
          js.Promise[TransformResourceResult | Null]
        ]
      ] = js.undefined
    
    /**
      * A specialized interface provided in some environments (such as Bazel) which overrides how
      * import specifiers are generated.
      *
      * If not required, this can be `null`.
      */
    val unifiedModulesHost: UnifiedModulesHost | Null
    
    var useCaseSensitiveFileNames: js.UndefOr[Boolean | js.Function0[Boolean]] = js.undefined
  }
  object NgCompilerAdapter {
    
    inline def apply(
      constructionDiagnostics: js.Array[Diagnostic],
      fileExists: /* fileName */ String => Boolean,
      getCanonicalFileName: /* fileName */ String => String,
      ignoreForEmit: Set[SourceFile],
      isResource: SourceFile => Boolean,
      isShim: SourceFile => Boolean,
      readFile: /* fileName */ String => js.UndefOr[String],
      rootDirs: js.Array[AbsoluteFsPath]
    ): NgCompilerAdapter = {
      val __obj = js.Dynamic.literal(constructionDiagnostics = constructionDiagnostics.asInstanceOf[js.Any], fileExists = js.Any.fromFunction1(fileExists), getCanonicalFileName = js.Any.fromFunction1(getCanonicalFileName), ignoreForEmit = ignoreForEmit.asInstanceOf[js.Any], isResource = js.Any.fromFunction1(isResource), isShim = js.Any.fromFunction1(isShim), readFile = js.Any.fromFunction1(readFile), rootDirs = rootDirs.asInstanceOf[js.Any], entryPoint = null, factoryTracker = null, unifiedModulesHost = null)
      __obj.asInstanceOf[NgCompilerAdapter]
    }
    
    extension [Self <: NgCompilerAdapter](x: Self) {
      
      inline def setConstructionDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "constructionDiagnostics", value.asInstanceOf[js.Any])
      
      inline def setConstructionDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "constructionDiagnostics", js.Array(value*))
      
      inline def setDirectoryExists(value: /* directoryName */ String => Boolean): Self = StObject.set(x, "directoryExists", js.Any.fromFunction1(value))
      
      inline def setDirectoryExistsUndefined: Self = StObject.set(x, "directoryExists", js.undefined)
      
      inline def setEntryPoint(value: AbsoluteFsPath): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
      
      inline def setEntryPointNull: Self = StObject.set(x, "entryPoint", null)
      
      inline def setFactoryTracker(value: FactoryTracker): Self = StObject.set(x, "factoryTracker", value.asInstanceOf[js.Any])
      
      inline def setFactoryTrackerNull: Self = StObject.set(x, "factoryTracker", null)
      
      inline def setFileExists(value: /* fileName */ String => Boolean): Self = StObject.set(x, "fileExists", js.Any.fromFunction1(value))
      
      inline def setGetCanonicalFileName(value: /* fileName */ String => String): Self = StObject.set(x, "getCanonicalFileName", js.Any.fromFunction1(value))
      
      inline def setGetCurrentDirectory(value: () => String): Self = StObject.set(x, "getCurrentDirectory", js.Any.fromFunction0(value))
      
      inline def setGetCurrentDirectoryUndefined: Self = StObject.set(x, "getCurrentDirectory", js.undefined)
      
      inline def setGetDirectories(value: /* path */ String => js.Array[String]): Self = StObject.set(x, "getDirectories", js.Any.fromFunction1(value))
      
      inline def setGetDirectoriesUndefined: Self = StObject.set(x, "getDirectories", js.undefined)
      
      inline def setGetModifiedResourceFiles(value: () => js.UndefOr[Set[String]]): Self = StObject.set(x, "getModifiedResourceFiles", js.Any.fromFunction0(value))
      
      inline def setGetModifiedResourceFilesUndefined: Self = StObject.set(x, "getModifiedResourceFiles", js.undefined)
      
      inline def setIgnoreForEmit(value: Set[SourceFile]): Self = StObject.set(x, "ignoreForEmit", value.asInstanceOf[js.Any])
      
      inline def setIsResource(value: SourceFile => Boolean): Self = StObject.set(x, "isResource", js.Any.fromFunction1(value))
      
      inline def setIsShim(value: SourceFile => Boolean): Self = StObject.set(x, "isShim", js.Any.fromFunction1(value))
      
      inline def setReadFile(value: /* fileName */ String => js.UndefOr[String]): Self = StObject.set(x, "readFile", js.Any.fromFunction1(value))
      
      inline def setReadResource(value: /* fileName */ String => js.Promise[String] | String): Self = StObject.set(x, "readResource", js.Any.fromFunction1(value))
      
      inline def setReadResourceUndefined: Self = StObject.set(x, "readResource", js.undefined)
      
      inline def setRealpath(value: /* path */ String => String): Self = StObject.set(x, "realpath", js.Any.fromFunction1(value))
      
      inline def setRealpathUndefined: Self = StObject.set(x, "realpath", js.undefined)
      
      inline def setResolveModuleNames(
        value: (/* moduleNames */ js.Array[String], /* containingFile */ String, /* reusedNames */ js.UndefOr[js.Array[String]], /* redirectedReference */ js.UndefOr[ResolvedProjectReference], /* options */ CompilerOptions, /* containingSourceFile */ js.UndefOr[SourceFile]) => js.Array[js.UndefOr[ResolvedModule]]
      ): Self = StObject.set(x, "resolveModuleNames", js.Any.fromFunction6(value))
      
      inline def setResolveModuleNamesUndefined: Self = StObject.set(x, "resolveModuleNames", js.undefined)
      
      inline def setResourceNameToFileName(
        value: (/* resourceName */ String, /* containingFilePath */ String, /* fallbackResolve */ js.UndefOr[js.Function2[/* url */ String, /* fromFile */ String, String | Null]]) => String | Null
      ): Self = StObject.set(x, "resourceNameToFileName", js.Any.fromFunction3(value))
      
      inline def setResourceNameToFileNameUndefined: Self = StObject.set(x, "resourceNameToFileName", js.undefined)
      
      inline def setRootDirs(value: js.Array[AbsoluteFsPath]): Self = StObject.set(x, "rootDirs", value.asInstanceOf[js.Any])
      
      inline def setRootDirsVarargs(value: AbsoluteFsPath*): Self = StObject.set(x, "rootDirs", js.Array(value*))
      
      inline def setTrace(value: /* s */ String => Unit): Self = StObject.set(x, "trace", js.Any.fromFunction1(value))
      
      inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
      
      inline def setTransformResource(
        value: (/* data */ String, /* context */ ResourceHostContext) => js.Promise[TransformResourceResult | Null]
      ): Self = StObject.set(x, "transformResource", js.Any.fromFunction2(value))
      
      inline def setTransformResourceUndefined: Self = StObject.set(x, "transformResource", js.undefined)
      
      inline def setUnifiedModulesHost(value: UnifiedModulesHost): Self = StObject.set(x, "unifiedModulesHost", value.asInstanceOf[js.Any])
      
      inline def setUnifiedModulesHostNull: Self = StObject.set(x, "unifiedModulesHost", null)
      
      inline def setUseCaseSensitiveFileNames(value: Boolean | js.Function0[Boolean]): Self = StObject.set(x, "useCaseSensitiveFileNames", value.asInstanceOf[js.Any])
      
      inline def setUseCaseSensitiveFileNamesFunction0(value: () => Boolean): Self = StObject.set(x, "useCaseSensitiveFileNames", js.Any.fromFunction0(value))
      
      inline def setUseCaseSensitiveFileNamesUndefined: Self = StObject.set(x, "useCaseSensitiveFileNames", js.undefined)
    }
  }
  
  trait SourceFileTypeIdentifier extends StObject {
    
    /**
      * Distinguishes between resource files added by Angular to the project and original files in the
      * user's program.
      *
      * This is necessary only for the language service because it adds resource files as root files
      * when they are read. This is done to indicate to TS Server that these resources are part of the
      * project and ensures that projects are retained properly when navigating around the workspace.
      */
    def isResource(sf: SourceFile): Boolean
    
    /**
      * Distinguishes between shim files added by Angular to the compilation process (both those
      * intended for output, like ngfactory files, as well as internal shims like ngtypecheck files)
      * and original files in the user's program.
      *
      * This is mostly used to limit type-checking operations to only user files. It should return
      * `true` if a file was written by the user, and `false` if a file was added by the compiler.
      */
    def isShim(sf: SourceFile): Boolean
  }
  object SourceFileTypeIdentifier {
    
    inline def apply(isResource: SourceFile => Boolean, isShim: SourceFile => Boolean): SourceFileTypeIdentifier = {
      val __obj = js.Dynamic.literal(isResource = js.Any.fromFunction1(isResource), isShim = js.Any.fromFunction1(isShim))
      __obj.asInstanceOf[SourceFileTypeIdentifier]
    }
    
    extension [Self <: SourceFileTypeIdentifier](x: Self) {
      
      inline def setIsResource(value: SourceFile => Boolean): Self = StObject.set(x, "isResource", js.Any.fromFunction1(value))
      
      inline def setIsShim(value: SourceFile => Boolean): Self = StObject.set(x, "isShim", js.Any.fromFunction1(value))
    }
  }
}
