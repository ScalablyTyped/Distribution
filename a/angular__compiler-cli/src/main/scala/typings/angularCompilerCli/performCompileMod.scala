package typings.angularCompilerCli

import typings.angularCompilerCli.anon.BasePath
import typings.angularCompilerCli.anon.CustomTransformers
import typings.angularCompilerCli.srcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcTypesMod.FileStats
import typings.angularCompilerCli.srcTypesMod.PathSegment
import typings.angularCompilerCli.srcTypesMod.PathString
import typings.angularCompilerCli.transformersApiMod.CompilerOptions
import typings.angularCompilerCli.transformersApiMod.EmitFlags
import typings.angularCompilerCli.transformersApiMod.Program
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.EmitResult
import typings.typescript.mod.FormatDiagnosticsHost
import typings.typescript.mod.ProjectReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object performCompileMod {
  
  @JSImport("@angular/compiler-cli/src/perform_compile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calcProjectFileAndBasePath(project: String): BasePath = ^.asInstanceOf[js.Dynamic].applyDynamic("calcProjectFileAndBasePath")(project.asInstanceOf[js.Any]).asInstanceOf[BasePath]
  inline def calcProjectFileAndBasePath(project: String, host: ConfigurationHost): BasePath = (^.asInstanceOf[js.Dynamic].applyDynamic("calcProjectFileAndBasePath")(project.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[BasePath]
  
  inline def defaultGatherDiagnostics(program: Program): js.Array[Diagnostic] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultGatherDiagnostics")(program.asInstanceOf[js.Any]).asInstanceOf[js.Array[Diagnostic]]
  
  inline def exitCodeFromResult(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("exitCodeFromResult")().asInstanceOf[Double]
  inline def exitCodeFromResult(diags: js.Array[Diagnostic]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("exitCodeFromResult")(diags.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def formatDiagnostics(diags: js.Array[Diagnostic]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDiagnostics")(diags.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatDiagnostics(diags: js.Array[Diagnostic], host: FormatDiagnosticsHost): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDiagnostics")(diags.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def performCompilation(
    hasRootNamesOptionsHostOldProgramEmitCallbackMergeEmitResultsCallbackGatherDiagnosticsCustomTransformersEmitFlagsForceEmitModifiedResourceFiles: CustomTransformers
  ): PerformCompilationResult = ^.asInstanceOf[js.Dynamic].applyDynamic("performCompilation")(hasRootNamesOptionsHostOldProgramEmitCallbackMergeEmitResultsCallbackGatherDiagnosticsCustomTransformersEmitFlagsForceEmitModifiedResourceFiles.asInstanceOf[js.Any]).asInstanceOf[PerformCompilationResult]
  
  inline def readConfiguration(project: String): ParsedConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("readConfiguration")(project.asInstanceOf[js.Any]).asInstanceOf[ParsedConfiguration]
  inline def readConfiguration(project: String, existingOptions: Unit, host: ConfigurationHost): ParsedConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfiguration")(project.asInstanceOf[js.Any], existingOptions.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[ParsedConfiguration]
  inline def readConfiguration(project: String, existingOptions: CompilerOptions): ParsedConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfiguration")(project.asInstanceOf[js.Any], existingOptions.asInstanceOf[js.Any])).asInstanceOf[ParsedConfiguration]
  inline def readConfiguration(project: String, existingOptions: CompilerOptions, host: ConfigurationHost): ParsedConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfiguration")(project.asInstanceOf[js.Any], existingOptions.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[ParsedConfiguration]
  
  /* Inlined std.Pick<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/file_system.ReadonlyFileSystem, 'readFile' | 'exists' | 'lstat' | 'resolve' | 'join' | 'dirname' | 'extname' | 'pwd'> */
  trait ConfigurationHost extends StObject {
    
    def dirname[T /* <: PathString */](file: T): T
    @JSName("dirname")
    var dirname_Original: js.Function1[/* file */ PathString, PathString]
    
    def exists(path: AbsoluteFsPath): Boolean
    @JSName("exists")
    var exists_Original: js.Function1[/* path */ AbsoluteFsPath, Boolean]
    
    def extname(path: AbsoluteFsPath | PathSegment): String
    @JSName("extname")
    var extname_Original: js.Function1[/* path */ AbsoluteFsPath | PathSegment, String]
    
    def join[T /* <: PathString */](basePath: T, paths: String*): T
    @JSName("join")
    var join_Original: js.Function2[/* basePath */ PathString, /* repeated */ String, PathString]
    
    def lstat(path: AbsoluteFsPath): FileStats
    @JSName("lstat")
    var lstat_Original: js.Function1[/* path */ AbsoluteFsPath, FileStats]
    
    def pwd(): AbsoluteFsPath
    @JSName("pwd")
    var pwd_Original: js.Function0[AbsoluteFsPath]
    
    def readFile(path: AbsoluteFsPath): String
    @JSName("readFile")
    var readFile_Original: js.Function1[/* path */ AbsoluteFsPath, String]
    
    def resolve(paths: String*): AbsoluteFsPath
    @JSName("resolve")
    var resolve_Original: js.Function1[/* repeated */ String, AbsoluteFsPath]
  }
  object ConfigurationHost {
    
    inline def apply(
      dirname: /* file */ PathString => PathString,
      exists: /* path */ AbsoluteFsPath => Boolean,
      extname: /* path */ AbsoluteFsPath | PathSegment => String,
      join: (/* basePath */ PathString, /* repeated */ String) => PathString,
      lstat: /* path */ AbsoluteFsPath => FileStats,
      pwd: () => AbsoluteFsPath,
      readFile: /* path */ AbsoluteFsPath => String,
      resolve: /* repeated */ String => AbsoluteFsPath
    ): ConfigurationHost = {
      val __obj = js.Dynamic.literal(dirname = js.Any.fromFunction1(dirname), exists = js.Any.fromFunction1(exists), extname = js.Any.fromFunction1(extname), join = js.Any.fromFunction2(join), lstat = js.Any.fromFunction1(lstat), pwd = js.Any.fromFunction0(pwd), readFile = js.Any.fromFunction1(readFile), resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[ConfigurationHost]
    }
    
    extension [Self <: ConfigurationHost](x: Self) {
      
      inline def setDirname(value: /* file */ PathString => PathString): Self = StObject.set(x, "dirname", js.Any.fromFunction1(value))
      
      inline def setExists(value: /* path */ AbsoluteFsPath => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction1(value))
      
      inline def setExtname(value: /* path */ AbsoluteFsPath | PathSegment => String): Self = StObject.set(x, "extname", js.Any.fromFunction1(value))
      
      inline def setJoin(value: (/* basePath */ PathString, /* repeated */ String) => PathString): Self = StObject.set(x, "join", js.Any.fromFunction2(value))
      
      inline def setLstat(value: /* path */ AbsoluteFsPath => FileStats): Self = StObject.set(x, "lstat", js.Any.fromFunction1(value))
      
      inline def setPwd(value: () => AbsoluteFsPath): Self = StObject.set(x, "pwd", js.Any.fromFunction0(value))
      
      inline def setReadFile(value: /* path */ AbsoluteFsPath => String): Self = StObject.set(x, "readFile", js.Any.fromFunction1(value))
      
      inline def setResolve(value: /* repeated */ String => AbsoluteFsPath): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
  
  trait ParsedConfiguration extends StObject {
    
    var emitFlags: EmitFlags
    
    var errors: js.Array[Diagnostic]
    
    var options: CompilerOptions
    
    var project: String
    
    var projectReferences: js.UndefOr[js.Array[ProjectReference]] = js.undefined
    
    var rootNames: js.Array[String]
  }
  object ParsedConfiguration {
    
    inline def apply(
      emitFlags: EmitFlags,
      errors: js.Array[Diagnostic],
      options: CompilerOptions,
      project: String,
      rootNames: js.Array[String]
    ): ParsedConfiguration = {
      val __obj = js.Dynamic.literal(emitFlags = emitFlags.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], rootNames = rootNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedConfiguration]
    }
    
    extension [Self <: ParsedConfiguration](x: Self) {
      
      inline def setEmitFlags(value: EmitFlags): Self = StObject.set(x, "emitFlags", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: js.Array[Diagnostic]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: Diagnostic*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setOptions(value: CompilerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setProjectReferences(value: js.Array[ProjectReference]): Self = StObject.set(x, "projectReferences", value.asInstanceOf[js.Any])
      
      inline def setProjectReferencesUndefined: Self = StObject.set(x, "projectReferences", js.undefined)
      
      inline def setProjectReferencesVarargs(value: ProjectReference*): Self = StObject.set(x, "projectReferences", js.Array(value*))
      
      inline def setRootNames(value: js.Array[String]): Self = StObject.set(x, "rootNames", value.asInstanceOf[js.Any])
      
      inline def setRootNamesVarargs(value: String*): Self = StObject.set(x, "rootNames", js.Array(value*))
    }
  }
  
  trait PerformCompilationResult extends StObject {
    
    var diagnostics: js.Array[Diagnostic]
    
    var emitResult: js.UndefOr[EmitResult] = js.undefined
    
    var program: js.UndefOr[Program] = js.undefined
  }
  object PerformCompilationResult {
    
    inline def apply(diagnostics: js.Array[Diagnostic]): PerformCompilationResult = {
      val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any])
      __obj.asInstanceOf[PerformCompilationResult]
    }
    
    extension [Self <: PerformCompilationResult](x: Self) {
      
      inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
      
      inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
      
      inline def setEmitResult(value: EmitResult): Self = StObject.set(x, "emitResult", value.asInstanceOf[js.Any])
      
      inline def setEmitResultUndefined: Self = StObject.set(x, "emitResult", js.undefined)
      
      inline def setProgram(value: Program): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
      
      inline def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
    }
  }
}
