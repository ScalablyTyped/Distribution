package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscCoreApiSrcInterfacesMod.ExtendedTsCompilerHost
import typings.angularCompilerCli.srcNgtscCoreApiSrcInterfacesMod.ResourceHostContext
import typings.angularCompilerCli.srcNgtscCoreApiSrcInterfacesMod.TransformResourceResult
import typings.angularCompilerCli.srcNgtscCoreApiSrcInterfacesMod.UnifiedModulesHost
import typings.angularCompilerCli.srcNgtscCoreApiSrcOptionsMod.NgCompilerOptions
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscShimsApiMod.FactoryTracker
import typings.angularCompilerCli.srcNgtscShimsMod.ShimAdapter
import typings.angularCompilerCli.srcNgtscShimsMod.ShimReferenceTagger
import typings.std.Set
import typings.typescript.mod.CancellationToken
import typings.typescript.mod.CompilerHost
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.CreateSourceFileOptions
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.FileReference
import typings.typescript.mod.ModuleKind.CommonJS
import typings.typescript.mod.ModuleKind.ESNext
import typings.typescript.mod.ModuleResolutionCache
import typings.typescript.mod.ParsedCommandLine
import typings.typescript.mod.Path
import typings.typescript.mod.Program
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

object srcNgtscCoreSrcHostMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof @angular/compiler-cli.anon.RequiredDelegationsExtend, 'getSourceFile' | 'fileExists'> ]: @angular/compiler-cli.anon.RequiredDelegationsExtend[P]} */ @JSImport("@angular/compiler-cli/src/ngtsc/core/src/host", "DelegatingCompilerHost")
  @js.native
  open class DelegatingCompilerHost protected () extends StObject {
    def this(delegate: ExtendedTsCompilerHost) = this()
    
    var createHash: js.UndefOr[js.Function1[/* data */ String, String]] = js.native
    
    /* protected */ var delegate: ExtendedTsCompilerHost = js.native
    
    /* private */ var delegateMethod: Any = js.native
    
    var directoryExists: js.UndefOr[js.Function1[/* directoryName */ String, Boolean]] = js.native
    
    var fileNameToModuleName: js.UndefOr[
        js.Function2[/* importedFilePath */ String, /* containingFilePath */ String, String]
      ] = js.native
    
    var getCancellationToken: js.UndefOr[js.Function0[CancellationToken]] = js.native
    
    def getCanonicalFileName(fileName: String): String = js.native
    
    def getCurrentDirectory(): String = js.native
    
    def getDefaultLibFileName(options: CompilerOptions): String = js.native
    
    var getDefaultLibLocation: js.UndefOr[js.Function0[String]] = js.native
    
    var getDirectories: js.UndefOr[js.Function1[/* path */ String, js.Array[String]]] = js.native
    
    var getEnvironmentVariable: js.UndefOr[js.Function1[/* name */ String, js.UndefOr[String]]] = js.native
    
    var getModifiedResourceFiles: js.UndefOr[js.Function0[js.UndefOr[Set[String]]]] = js.native
    
    var getModuleResolutionCache: js.UndefOr[js.Function0[js.UndefOr[ModuleResolutionCache]]] = js.native
    
    def getNewLine(): String = js.native
    
    var getParsedCommandLine: js.UndefOr[js.Function1[/* fileName */ String, js.UndefOr[ParsedCommandLine]]] = js.native
    
    var getSourceFileByPath: js.UndefOr[
        js.Function5[
          /* fileName */ String, 
          /* path */ Path, 
          /* languageVersionOrOptions */ ScriptTarget | CreateSourceFileOptions, 
          /* onError */ js.UndefOr[js.Function1[/* message */ String, Unit]], 
          /* shouldCreateNewSourceFile */ js.UndefOr[Boolean], 
          js.UndefOr[SourceFile]
        ]
      ] = js.native
    
    var readDirectory: js.UndefOr[
        js.Function5[
          /* rootDir */ String, 
          /* extensions */ js.Array[String], 
          /* excludes */ js.UndefOr[js.Array[String]], 
          /* includes */ js.Array[String], 
          /* depth */ js.UndefOr[Double], 
          js.Array[String]
        ]
      ] = js.native
    
    def readFile(fileName: String): js.UndefOr[String] = js.native
    
    var readResource: js.UndefOr[js.Function1[/* fileName */ String, String | js.Promise[String]]] = js.native
    
    var realpath: js.UndefOr[js.Function1[/* path */ String, String]] = js.native
    
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
      ] = js.native
    
    var resolveTypeReferenceDirectives: js.UndefOr[
        js.Function5[
          /* typeReferenceDirectiveNames */ js.Array[FileReference | String], 
          /* containingFile */ String, 
          /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
          /* options */ CompilerOptions, 
          /* containingFileMode */ js.UndefOr[CommonJS | ESNext], 
          js.Array[js.UndefOr[ResolvedTypeReferenceDirective]]
        ]
      ] = js.native
    
    var resourceNameToFileName: js.UndefOr[
        js.Function3[
          /* resourceName */ String, 
          /* containingFilePath */ String, 
          /* fallbackResolve */ js.UndefOr[js.Function2[/* url */ String, /* fromFile */ String, String | Null]], 
          String | Null
        ]
      ] = js.native
    
    var trace: js.UndefOr[js.Function1[/* s */ String, Unit]] = js.native
    
    var transformResource: js.UndefOr[
        js.Function2[
          /* data */ String, 
          /* context */ ResourceHostContext, 
          js.Promise[TransformResourceResult | Null]
        ]
      ] = js.native
    
    def useCaseSensitiveFileNames(): Boolean = js.native
    
    def writeFile(fileName: String, text: String, writeByteOrderMark: Boolean): Unit = js.native
    def writeFile(
      fileName: String,
      text: String,
      writeByteOrderMark: Boolean,
      onError: js.Function1[/* message */ String, Unit]
    ): Unit = js.native
    def writeFile(
      fileName: String,
      text: String,
      writeByteOrderMark: Boolean,
      onError: js.Function1[/* message */ String, Unit],
      sourceFiles: js.Array[SourceFile]
    ): Unit = js.native
    def writeFile(
      fileName: String,
      text: String,
      writeByteOrderMark: Boolean,
      onError: js.Function1[/* message */ String, Unit],
      sourceFiles: js.Array[SourceFile],
      data: WriteFileCallbackData
    ): Unit = js.native
    def writeFile(
      fileName: String,
      text: String,
      writeByteOrderMark: Boolean,
      onError: js.Function1[/* message */ String, Unit],
      sourceFiles: Unit,
      data: WriteFileCallbackData
    ): Unit = js.native
    def writeFile(
      fileName: String,
      text: String,
      writeByteOrderMark: Boolean,
      onError: Unit,
      sourceFiles: js.Array[SourceFile]
    ): Unit = js.native
    def writeFile(
      fileName: String,
      text: String,
      writeByteOrderMark: Boolean,
      onError: Unit,
      sourceFiles: js.Array[SourceFile],
      data: WriteFileCallbackData
    ): Unit = js.native
    def writeFile(
      fileName: String,
      text: String,
      writeByteOrderMark: Boolean,
      onError: Unit,
      sourceFiles: Unit,
      data: WriteFileCallbackData
    ): Unit = js.native
    @JSName("writeFile")
    var writeFile_Original: WriteFileCallback = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ M in keyof std.Required<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/core/api/src/interfaces.ExtendedTsCompilerHost> ]: @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/core/api/src/interfaces.ExtendedTsCompilerHost[M]} */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.angularCompilerCli.srcNgtscCoreApiSrcAdapterMod.NgCompilerAdapter because var conflicts: directoryExists, getCurrentDirectory, getDirectories, getModifiedResourceFiles, readResource, realpath, resolveModuleNames, resourceNameToFileName, trace, transformResource, useCaseSensitiveFileNames. Inlined entryPoint, constructionDiagnostics, ignoreForEmit, factoryTracker, unifiedModulesHost, rootDirs, readFile_Original, fileExists_Original, getCanonicalFileName_Original, isShim, isResource
  - typings.angularCompilerCli.srcNgtscCoreApiSrcInterfacesMod.ExtendedTsCompilerHost because var conflicts: createHash, directoryExists, fileNameToModuleName, getCancellationToken, getCurrentDirectory, getDefaultLibLocation, getDirectories, getEnvironmentVariable, getModifiedResourceFiles, getModuleResolutionCache, getParsedCommandLine, getSourceFileByPath, readDirectory, readResource, realpath, resolveModuleNames, resolveTypeReferenceDirectives, resourceNameToFileName, trace, transformResource, useCaseSensitiveFileNames, writeFile_Original. Inlined getSourceFile, getSourceFile, getSourceFile, getSourceFile, getSourceFile, getSourceFile, getSourceFile, getSourceFile, fileExists */ @JSImport("@angular/compiler-cli/src/ngtsc/core/src/host", "NgCompilerHost")
  @js.native
  open class NgCompilerHost protected () extends DelegatingCompilerHost {
    def this(
      delegate: ExtendedTsCompilerHost,
      inputFiles: js.Array[String],
      rootDirs: js.Array[AbsoluteFsPath],
      shimAdapter: ShimAdapter,
      shimTagger: ShimReferenceTagger,
      entryPoint: Null,
      factoryTracker: Null,
      diagnostics: js.Array[Diagnostic]
    ) = this()
    def this(
      delegate: ExtendedTsCompilerHost,
      inputFiles: js.Array[String],
      rootDirs: js.Array[AbsoluteFsPath],
      shimAdapter: ShimAdapter,
      shimTagger: ShimReferenceTagger,
      entryPoint: Null,
      factoryTracker: FactoryTracker,
      diagnostics: js.Array[Diagnostic]
    ) = this()
    def this(
      delegate: ExtendedTsCompilerHost,
      inputFiles: js.Array[String],
      rootDirs: js.Array[AbsoluteFsPath],
      shimAdapter: ShimAdapter,
      shimTagger: ShimReferenceTagger,
      entryPoint: AbsoluteFsPath,
      factoryTracker: Null,
      diagnostics: js.Array[Diagnostic]
    ) = this()
    def this(
      delegate: ExtendedTsCompilerHost,
      inputFiles: js.Array[String],
      rootDirs: js.Array[AbsoluteFsPath],
      shimAdapter: ShimAdapter,
      shimTagger: ShimReferenceTagger,
      entryPoint: AbsoluteFsPath,
      factoryTracker: FactoryTracker,
      diagnostics: js.Array[Diagnostic]
    ) = this()
    
    val constructionDiagnostics: js.Array[Diagnostic] = js.native
    
    /* private */ var createCachedResolveModuleNamesFunction: Any = js.native
    
    val entryPoint: AbsoluteFsPath | Null = js.native
    
    val factoryTracker: FactoryTracker | Null = js.native
    
    def fileExists(fileName: String): Boolean = js.native
    @JSName("fileExists")
    var fileExists_Original: js.Function1[/* fileName */ String, Boolean] = js.native
    
    @JSName("getCanonicalFileName")
    var getCanonicalFileName_Original: js.Function1[/* fileName */ String, String] = js.native
    
    def getSourceFile(fileName: String, languageVersionOrOptions: CreateSourceFileOptions): js.UndefOr[SourceFile] = js.native
    def getSourceFile(
      fileName: String,
      languageVersionOrOptions: CreateSourceFileOptions,
      onError: js.Function1[/* message */ String, Unit]
    ): js.UndefOr[SourceFile] = js.native
    def getSourceFile(
      fileName: String,
      languageVersionOrOptions: CreateSourceFileOptions,
      onError: js.Function1[/* message */ String, Unit],
      shouldCreateNewSourceFile: Boolean
    ): js.UndefOr[SourceFile] = js.native
    def getSourceFile(
      fileName: String,
      languageVersionOrOptions: CreateSourceFileOptions,
      onError: Unit,
      shouldCreateNewSourceFile: Boolean
    ): js.UndefOr[SourceFile] = js.native
    def getSourceFile(fileName: String, languageVersion: ScriptTarget): js.UndefOr[SourceFile] = js.native
    def getSourceFile(fileName: String, languageVersion: ScriptTarget, onError: js.Function1[/* message */ String, Unit]): js.UndefOr[SourceFile] = js.native
    def getSourceFile(
      fileName: String,
      languageVersion: ScriptTarget,
      onError: js.Function1[/* message */ String, Unit],
      shouldCreateNewSourceFile: Boolean
    ): js.UndefOr[SourceFile] = js.native
    def getSourceFile(fileName: String, languageVersion: ScriptTarget, onError: Unit, shouldCreateNewSourceFile: Boolean): js.UndefOr[SourceFile] = js.native
    
    /**
      * Retrieves a set of `ts.SourceFile`s which should not be emitted as JS files.
      *
      * Available after this host is used to create a `ts.Program` (which causes all the files in the
      * program to be enumerated).
      */
    def ignoreForEmit: Set[SourceFile] = js.native
    /**
      * A `Set` of `ts.SourceFile`s which are internal to the program and should not be emitted as JS
      * files.
      *
      * Often these are shim files such as `ngtypecheck` shims used for template type-checking in
      * command-line ngc.
      */
    @JSName("ignoreForEmit")
    val ignoreForEmit_FNgCompilerHost: Set[SourceFile] = js.native
    
    val inputFiles: js.Array[String] = js.native
    
    /**
      * Check whether the given `ts.SourceFile` is a resource file.
      *
      * This simply returns `false` for the compiler-cli since resource files are not added as root
      * files to the project.
      */
    /**
      * Distinguishes between resource files added by Angular to the project and original files in the
      * user's program.
      *
      * This is necessary only for the language service because it adds resource files as root files
      * when they are read. This is done to indicate to TS Server that these resources are part of the
      * project and ensures that projects are retained properly when navigating around the workspace.
      */
    def isResource(sf: SourceFile): Boolean = js.native
    
    /**
      * Check whether the given `ts.SourceFile` is a shim file.
      *
      * If this returns false, the file is user-provided.
      */
    /**
      * Distinguishes between shim files added by Angular to the compilation process (both those
      * intended for output, like ngfactory files, as well as internal shims like ngtypecheck files)
      * and original files in the user's program.
      *
      * This is mostly used to limit type-checking operations to only user files. It should return
      * `true` if a file was written by the user, and `false` if a file was added by the compiler.
      */
    def isShim(sf: SourceFile): Boolean = js.native
    
    /**
      * Performs cleanup that needs to happen after a `ts.Program` has been created using this host.
      */
    def postProgramCreationCleanup(): Unit = js.native
    
    @JSName("readFile")
    var readFile_Original: js.Function1[/* fileName */ String, js.UndefOr[String]] = js.native
    
    val rootDirs: js.Array[AbsoluteFsPath] = js.native
    
    /* private */ var shimAdapter: Any = js.native
    
    /**
      * Retrieve the array of shim extension prefixes for which shims were created for each original
      * file.
      */
    def shimExtensionPrefixes: js.Array[String] = js.native
    
    /* private */ var shimTagger: Any = js.native
    
    def unifiedModulesHost: UnifiedModulesHost | Null = js.native
    /**
      * A specialized interface provided in some environments (such as Bazel) which overrides how
      * import specifiers are generated.
      *
      * If not required, this can be `null`.
      */
    @JSName("unifiedModulesHost")
    val unifiedModulesHost_FNgCompilerHost: UnifiedModulesHost | Null = js.native
  }
  /* static members */
  object NgCompilerHost {
    
    @JSImport("@angular/compiler-cli/src/ngtsc/core/src/host", "NgCompilerHost")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an `NgCompilerHost` from a delegate host, an array of input filenames, and the full set
      * of TypeScript and Angular compiler options.
      */
    inline def wrap(delegate: CompilerHost, inputFiles: js.Array[String], options: NgCompilerOptions): typings.angularCompilerCli.anon.NgCompilerHost = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(delegate.asInstanceOf[js.Any], inputFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompilerCli.anon.NgCompilerHost]
    inline def wrap(
      delegate: CompilerHost,
      inputFiles: js.Array[String],
      options: NgCompilerOptions,
      oldProgram: Program
    ): typings.angularCompilerCli.anon.NgCompilerHost = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(delegate.asInstanceOf[js.Any], inputFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompilerCli.anon.NgCompilerHost]
  }
}
