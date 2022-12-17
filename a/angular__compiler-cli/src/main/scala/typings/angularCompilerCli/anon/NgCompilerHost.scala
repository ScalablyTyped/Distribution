package typings.angularCompilerCli.anon

import typings.angularCompilerCli.srcNgtscCoreApiSrcInterfacesMod.ExtendedTsCompilerHost
import typings.angularCompilerCli.srcNgtscCoreApiSrcInterfacesMod.ResourceHostContext
import typings.angularCompilerCli.srcNgtscCoreApiSrcInterfacesMod.TransformResourceResult
import typings.angularCompilerCli.srcNgtscCoreApiSrcInterfacesMod.UnifiedModulesHost
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscShimsApiMod.FactoryTracker
import typings.angularCompilerCli.srcNgtscShimsMod.ShimAdapter
import typings.angularCompilerCli.srcNgtscShimsMod.ShimReferenceTagger
import typings.std.Set
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.CreateSourceFileOptions
import typings.typescript.mod.Diagnostic
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

/* Inlined @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/core/src/host.NgCompilerHost */
@js.native
trait NgCompilerHost extends StObject {
  
  val constructionDiagnostics: js.Array[Diagnostic] = js.native
  
  /* private */ var createCachedResolveModuleNamesFunction: Any = js.native
  
  var createHash: js.UndefOr[js.Function1[/* data */ String, String]] = js.native
  
  /* protected */ var delegate: ExtendedTsCompilerHost = js.native
  
  /* private */ var delegateMethod: Any = js.native
  
  var directoryExists: js.UndefOr[js.Function1[/* directoryName */ String, Boolean]] = js.native
  
  val entryPoint: AbsoluteFsPath | Null = js.native
  
  val factoryTracker: FactoryTracker | Null = js.native
  
  def fileExists(fileName: String): Boolean = js.native
  @JSName("fileExists")
  var fileExists_Original: js.Function1[/* fileName */ String, Boolean] = js.native
  
  var fileNameToModuleName: js.UndefOr[
    js.Function2[/* importedFilePath */ String, /* containingFilePath */ String, String]
  ] = js.native
  
  var getCancellationToken: js.UndefOr[js.Function0[typings.typescript.mod.CancellationToken]] = js.native
  
  def getCanonicalFileName(fileName: String): String = js.native
  @JSName("getCanonicalFileName")
  var getCanonicalFileName_Original: js.Function1[/* fileName */ String, String] = js.native
  
  def getCurrentDirectory(): String = js.native
  @JSName("getCurrentDirectory")
  var getCurrentDirectory_FNgCompilerHost: js.UndefOr[js.Function0[String]] = js.native
  
  def getDefaultLibFileName(options: CompilerOptions): String = js.native
  @JSName("getDefaultLibFileName")
  var getDefaultLibFileName_Original: js.Function1[/* options */ CompilerOptions, String] = js.native
  
  var getDefaultLibLocation: js.UndefOr[js.Function0[String]] = js.native
  
  var getDirectories: js.UndefOr[js.Function1[/* path */ String, js.Array[String]]] = js.native
  
  var getEnvironmentVariable: js.UndefOr[js.Function1[/* name */ String, js.UndefOr[String]]] = js.native
  
  var getModifiedResourceFiles: js.UndefOr[js.Function0[js.UndefOr[Set[String]]]] = js.native
  
  /**
    * Returns the module resolution cache used by a provided `resolveModuleNames` implementation so that any non-name module resolution operations (eg, package.json lookup) can reuse it
    */
  var getModuleResolutionCache: js.UndefOr[js.Function0[js.UndefOr[ModuleResolutionCache]]] = js.native
  
  def getNewLine(): String = js.native
  @JSName("getNewLine")
  var getNewLine_Original: js.Function0[String] = js.native
  
  var getParsedCommandLine: js.UndefOr[js.Function1[/* fileName */ String, js.UndefOr[ParsedCommandLine]]] = js.native
  
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
  
  @JSName("getSourceFile")
  var getSourceFile_Original: js.Function2[
    /* fileName */ String, 
    /* languageVersionOrOptions */ ScriptTarget, 
    js.UndefOr[SourceFile]
  ] = js.native
  
  /** If provided along with custom resolveModuleNames or resolveTypeReferenceDirectives, used to determine if unchanged file path needs to re-resolve modules/type reference directives */
  var hasInvalidatedResolutions: js.UndefOr[js.Function1[/* filePath */ Path, Boolean]] = js.native
  
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
  def isResource(sf: SourceFile): Boolean = js.native
  
  /**
    * Check whether the given `ts.SourceFile` is a shim file.
    *
    * If this returns false, the file is user-provided.
    */
  def isShim(sf: SourceFile): Boolean = js.native
  
  /**
    * Performs cleanup that needs to happen after a `ts.Program` has been created using this host.
    */
  def postProgramCreationCleanup(): Unit = js.native
  
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
  @JSName("readFile")
  var readFile_Original: js.Function1[/* fileName */ String, js.UndefOr[String]] = js.native
  
  var readResource: js.UndefOr[js.Function1[/* fileName */ String, js.Promise[String] | String]] = js.native
  
  /**
    * Resolve a symbolic link.
    * @see https://nodejs.org/api/fs.html#fs_fs_realpathsync_path_options
    */
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
  
  /**
    * This method is a companion for 'resolveModuleNames' and is used to resolve 'types' references to actual type declaration files
    */
  var resolveTypeReferenceDirectives: js.UndefOr[
    js.Function5[
      /* typeReferenceDirectiveNames */ js.Array[FileReference | String], 
      /* containingFile */ String, 
      /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
      /* options */ CompilerOptions, 
      /* containingFileMode */ js.UndefOr[ESNext | CommonJS], 
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
  
  val rootDirs: js.Array[AbsoluteFsPath] = js.native
  
  /* private */ var shimAdapter: Any = js.native
  
  /**
    * Retrieve the array of shim extension prefixes for which shims were created for each original
    * file.
    */
  def shimExtensionPrefixes: js.Array[String] = js.native
  
  /* private */ var shimTagger: Any = js.native
  
  var trace: js.UndefOr[js.Function1[/* s */ String, Unit]] = js.native
  
  var transformResource: js.UndefOr[
    js.Function2[
      /* data */ String, 
      /* context */ ResourceHostContext, 
      js.Promise[TransformResourceResult | Null]
    ]
  ] = js.native
  
  def unifiedModulesHost: UnifiedModulesHost | Null = js.native
  /**
    * A specialized interface provided in some environments (such as Bazel) which overrides how
    * import specifiers are generated.
    *
    * If not required, this can be `null`.
    */
  @JSName("unifiedModulesHost")
  val unifiedModulesHost_FNgCompilerHost: UnifiedModulesHost | Null = js.native
  
  def useCaseSensitiveFileNames(): Boolean = js.native
  @JSName("useCaseSensitiveFileNames")
  var useCaseSensitiveFileNames_FNgCompilerHost: js.UndefOr[Boolean | js.Function0[Boolean]] = js.native
  
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
