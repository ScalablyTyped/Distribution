package typings.angularCompilerCli

import typings.angularCompilerCli.anon.CompilerHostPartialUnifie
import typings.angularCompilerCli.anon.IgnoreForDiagnostics
import typings.angularCompilerCli.coreMod.NgCompiler
import typings.typescript.mod.CancellationToken
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.CreateSourceFileOptions
import typings.typescript.mod.CustomTransformers
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

object tscPluginMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/tsc_plugin", "NgTscPlugin")
  @js.native
  open class NgTscPlugin protected ()
    extends StObject
       with TscPlugin {
    def this(ngOptions: js.Object) = this()
    
    /* private */ var _compiler: Any = js.native
    
    def compiler: NgCompiler = js.native
    
    /* private */ var host: Any = js.native
    
    /* private */ var ngOptions: Any = js.native
    
    /* private */ var options: Any = js.native
  }
  
  /**
    * A `ts.CompilerHost` which also returns a list of input files, out of which the `ts.Program`
    * should be created.
    *
    * Currently mirrored from @bazel/concatjs/internal/tsc_wrapped/plugin_api (with the naming of
    * `fileNameToModuleName` corrected).
    */
  /* Inlined parent typescript.typescript.CompilerHost */
  /* Inlined parent std.Partial<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/core/api.UnifiedModulesHost> */
  @js.native
  trait PluginCompilerHost extends StObject {
    
    var createHash: js.UndefOr[js.Function1[/* data */ String, String]] = js.native
    
    var directoryExists: js.UndefOr[js.Function1[/* directoryName */ String, Boolean]] = js.native
    
    def fileExists(fileName: String): Boolean = js.native
    
    var fileNameToModuleName: js.UndefOr[
        js.Function2[/* importedFilePath */ String, /* containingFilePath */ String, String]
      ] = js.native
    
    var getCancellationToken: js.UndefOr[js.Function0[CancellationToken]] = js.native
    
    def getCanonicalFileName(fileName: String): String = js.native
    
    def getCurrentDirectory(): String = js.native
    @JSName("getCurrentDirectory")
    var getCurrentDirectory_FPluginCompilerHost: js.UndefOr[js.Function0[String]] = js.native
    
    def getDefaultLibFileName(options: CompilerOptions): String = js.native
    
    var getDefaultLibLocation: js.UndefOr[js.Function0[String]] = js.native
    
    var getDirectories: js.UndefOr[js.Function1[/* path */ String, js.Array[String]]] = js.native
    
    var getEnvironmentVariable: js.UndefOr[js.Function1[/* name */ String, js.UndefOr[String]]] = js.native
    
    /**
      * Returns the module resolution cache used by a provided `resolveModuleNames` implementation so that any non-name module resolution operations (eg, package.json lookup) can reuse it
      */
    var getModuleResolutionCache: js.UndefOr[js.Function0[js.UndefOr[ModuleResolutionCache]]] = js.native
    
    def getNewLine(): String = js.native
    
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
    def getSourceFile(fileName: String, languageVersionOrOptions: ScriptTarget): js.UndefOr[SourceFile] = js.native
    def getSourceFile(
      fileName: String,
      languageVersionOrOptions: ScriptTarget,
      onError: js.Function1[/* message */ String, Unit]
    ): js.UndefOr[SourceFile] = js.native
    def getSourceFile(
      fileName: String,
      languageVersionOrOptions: ScriptTarget,
      onError: js.Function1[/* message */ String, Unit],
      shouldCreateNewSourceFile: Boolean
    ): js.UndefOr[SourceFile] = js.native
    def getSourceFile(
      fileName: String,
      languageVersionOrOptions: ScriptTarget,
      onError: Unit,
      shouldCreateNewSourceFile: Boolean
    ): js.UndefOr[SourceFile] = js.native
    
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
    
    val inputFiles: js.Array[String] = js.native
    
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
    
    var trace: js.UndefOr[js.Function1[/* s */ String, Unit]] = js.native
    
    def useCaseSensitiveFileNames(): Boolean = js.native
    @JSName("useCaseSensitiveFileNames")
    var useCaseSensitiveFileNames_FPluginCompilerHost: js.UndefOr[Boolean | js.Function0[Boolean]] = js.native
    
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
  
  /**
    * Mirrors the plugin interface from tsc_wrapped which is currently under active development. To
    * enable progress to be made in parallel, the upstream interface isn't implemented directly.
    * Instead, `TscPlugin` here is structurally assignable to what tsc_wrapped expects.
    */
  @js.native
  trait TscPlugin extends StObject {
    
    def createTransformers(): CustomTransformers = js.native
    
    def getDiagnostics(): js.Array[Diagnostic] = js.native
    def getDiagnostics(file: SourceFile): js.Array[Diagnostic] = js.native
    
    def getNextProgram(): Program = js.native
    
    def getOptionDiagnostics(): js.Array[Diagnostic] = js.native
    
    val name: String = js.native
    
    def setupCompilation(program: Program): IgnoreForDiagnostics = js.native
    def setupCompilation(program: Program, oldProgram: Program): IgnoreForDiagnostics = js.native
    
    def wrapHost(host: CompilerHostPartialUnifie, inputFiles: js.Array[String], options: CompilerOptions): PluginCompilerHost = js.native
  }
}
