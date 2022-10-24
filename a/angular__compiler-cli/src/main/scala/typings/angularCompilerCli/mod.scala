package typings.angularCompilerCli

import typings.angularCompiler.mod.Version
import typings.angularCompilerCli.angularCompilerCliStrings.angular
import typings.angularCompilerCli.anon.BasePath
import typings.angularCompilerCli.anon.CustomTransformers
import typings.angularCompilerCli.anon.FileName
import typings.angularCompilerCli.anon.Host
import typings.angularCompilerCli.anon.Options
import typings.angularCompilerCli.anon.PickCompilerHostgetCanoni
import typings.angularCompilerCli.srcNgtscCoreApiSrcOptionsMod.NgCompilerOptions
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.BrandedPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.FileSystem
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathSegment
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathString
import typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel
import typings.angularCompilerCli.srcPerformCompileMod.ConfigurationHost
import typings.angularCompilerCli.srcPerformCompileMod.ParsedConfiguration
import typings.angularCompilerCli.srcPerformCompileMod.PerformCompilationResult
import typings.angularCompilerCli.srcTransformersApiMod.CompilerHost
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.FormatDiagnosticsHost
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TransformerFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@angular/compiler-cli", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli", "ConsoleLogger")
  @js.native
  open class ConsoleLogger protected ()
    extends typings.angularCompilerCli.srcNgtscLoggingMod.ConsoleLogger {
    def this(level: LogLevel) = this()
  }
  
  @JSImport("@angular/compiler-cli", "DEFAULT_ERROR_CODE")
  @js.native
  val DEFAULT_ERROR_CODE: /* 100 */ Double = js.native
  
  @JSImport("@angular/compiler-cli", "EmitFlags")
  @js.native
  object EmitFlags extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.srcTransformersApiMod.EmitFlags & Double] = js.native
    
    /* 31 */ val All: typings.angularCompilerCli.srcTransformersApiMod.EmitFlags.All & Double = js.native
    
    /* 16 */ val Codegen: typings.angularCompilerCli.srcTransformersApiMod.EmitFlags.Codegen & Double = js.native
    
    /* 1 */ val DTS: typings.angularCompilerCli.srcTransformersApiMod.EmitFlags.DTS & Double = js.native
    
    /* 19 */ val Default: typings.angularCompilerCli.srcTransformersApiMod.EmitFlags.Default & Double = js.native
    
    /* 8 */ val I18nBundle: typings.angularCompilerCli.srcTransformersApiMod.EmitFlags.I18nBundle & Double = js.native
    
    /* 2 */ val JS: typings.angularCompilerCli.srcTransformersApiMod.EmitFlags.JS & Double = js.native
    
    /* 4 */ val Metadata: typings.angularCompilerCli.srcTransformersApiMod.EmitFlags.Metadata & Double = js.native
  }
  
  object GLOBAL_DEFS_FOR_TERSER {
    
    @JSImport("@angular/compiler-cli", "GLOBAL_DEFS_FOR_TERSER")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/compiler-cli", "GLOBAL_DEFS_FOR_TERSER.ngDevMode")
    @js.native
    def ngDevMode: Boolean = js.native
    inline def ngDevMode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ngDevMode")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/compiler-cli", "GLOBAL_DEFS_FOR_TERSER.ngI18nClosureMode")
    @js.native
    def ngI18nClosureMode: Boolean = js.native
    inline def ngI18nClosureMode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ngI18nClosureMode")(x.asInstanceOf[js.Any])
  }
  
  object GLOBAL_DEFS_FOR_TERSER_WITH_AOT {
    
    @JSImport("@angular/compiler-cli", "GLOBAL_DEFS_FOR_TERSER_WITH_AOT")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/compiler-cli", "GLOBAL_DEFS_FOR_TERSER_WITH_AOT.ngDevMode")
    @js.native
    def ngDevMode: Boolean = js.native
    inline def ngDevMode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ngDevMode")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/compiler-cli", "GLOBAL_DEFS_FOR_TERSER_WITH_AOT.ngI18nClosureMode")
    @js.native
    def ngI18nClosureMode: Boolean = js.native
    inline def ngI18nClosureMode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ngI18nClosureMode")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/compiler-cli", "GLOBAL_DEFS_FOR_TERSER_WITH_AOT.ngJitMode")
    @js.native
    def ngJitMode: Boolean = js.native
    inline def ngJitMode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ngJitMode")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@angular/compiler-cli", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel & Double] = js.native
    
    /* 0 */ val debug: typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel.debug & Double = js.native
    
    /* 3 */ val error: typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel.error & Double = js.native
    
    /* 1 */ val info: typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel.info & Double = js.native
    
    /* 2 */ val warn: typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel.warn & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli", "LogicalFileSystem")
  @js.native
  open class LogicalFileSystem protected ()
    extends typings.angularCompilerCli.srcNgtscFileSystemMod.LogicalFileSystem {
    def this(rootDirs: js.Array[AbsoluteFsPath], compilerHost: PickCompilerHostgetCanoni) = this()
  }
  
  object LogicalProjectPath {
    
    @JSImport("@angular/compiler-cli", "LogicalProjectPath")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get the relative path between two `LogicalProjectPath`s.
      *
      * This will return a `PathSegment` which would be a valid module specifier to use in `from` when
      * importing from `to`.
      */
    inline def relativePathBetween(
      from: typings.angularCompilerCli.srcNgtscFileSystemSrcLogicalMod.LogicalProjectPath,
      to: typings.angularCompilerCli.srcNgtscFileSystemSrcLogicalMod.LogicalProjectPath
    ): PathSegment = (^.asInstanceOf[js.Dynamic].applyDynamic("relativePathBetween")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[PathSegment]
  }
  
  @JSImport("@angular/compiler-cli", "NgTscPlugin")
  @js.native
  open class NgTscPlugin protected ()
    extends typings.angularCompilerCli.srcNgtscTscPluginMod.NgTscPlugin {
    def this(ngOptions: js.Object) = this()
  }
  
  @JSImport("@angular/compiler-cli", "NgtscCompilerHost")
  @js.native
  open class NgtscCompilerHost protected ()
    extends typings.angularCompilerCli.srcNgtscFileSystemMod.NgtscCompilerHost {
    def this(fs: FileSystem) = this()
    def this(fs: FileSystem, options: CompilerOptions) = this()
  }
  
  @JSImport("@angular/compiler-cli", "NgtscProgram")
  @js.native
  open class NgtscProgram protected ()
    extends typings.angularCompilerCli.srcNgtscProgramMod.NgtscProgram {
    def this(rootNames: js.Array[String], options: NgCompilerOptions, delegateHost: CompilerHost) = this()
    def this(
      rootNames: js.Array[String],
      options: NgCompilerOptions,
      delegateHost: CompilerHost,
      oldProgram: typings.angularCompilerCli.srcNgtscProgramMod.NgtscProgram
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli", "NodeJSFileSystem")
  @js.native
  open class NodeJSFileSystem ()
    extends typings.angularCompilerCli.srcNgtscFileSystemMod.NodeJSFileSystem
  
  @JSImport("@angular/compiler-cli", "OptimizeFor")
  @js.native
  object OptimizeFor extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.srcNgtscTypecheckApiCheckerMod.OptimizeFor & Double] = js.native
    
    /* 0 */ val SingleFile: typings.angularCompilerCli.srcNgtscTypecheckApiCheckerMod.OptimizeFor.SingleFile & Double = js.native
    
    /* 1 */ val WholeProgram: typings.angularCompilerCli.srcNgtscTypecheckApiCheckerMod.OptimizeFor.WholeProgram & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli", "SOURCE")
  @js.native
  val SOURCE: angular = js.native
  
  @JSImport("@angular/compiler-cli", "UNKNOWN_ERROR_CODE")
  @js.native
  val UNKNOWN_ERROR_CODE: /* 500 */ Double = js.native
  
  @JSImport("@angular/compiler-cli", "VERSION")
  @js.native
  val VERSION: Version = js.native
  
  inline def absoluteFrom(path: String): AbsoluteFsPath = ^.asInstanceOf[js.Dynamic].applyDynamic("absoluteFrom")(path.asInstanceOf[js.Any]).asInstanceOf[AbsoluteFsPath]
  
  inline def absoluteFromSourceFile(sf: FileName): AbsoluteFsPath = ^.asInstanceOf[js.Dynamic].applyDynamic("absoluteFromSourceFile")(sf.asInstanceOf[js.Any]).asInstanceOf[AbsoluteFsPath]
  
  inline def basename(filePath: PathString): PathSegment = ^.asInstanceOf[js.Dynamic].applyDynamic("basename")(filePath.asInstanceOf[js.Any]).asInstanceOf[PathSegment]
  inline def basename(filePath: PathString, `extension`: String): PathSegment = (^.asInstanceOf[js.Dynamic].applyDynamic("basename")(filePath.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[PathSegment]
  
  inline def calcProjectFileAndBasePath(project: String): BasePath = ^.asInstanceOf[js.Dynamic].applyDynamic("calcProjectFileAndBasePath")(project.asInstanceOf[js.Any]).asInstanceOf[BasePath]
  inline def calcProjectFileAndBasePath(project: String, host: ConfigurationHost): BasePath = (^.asInstanceOf[js.Dynamic].applyDynamic("calcProjectFileAndBasePath")(project.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[BasePath]
  
  inline def constructorParametersDownlevelTransform(program: Program): TransformerFactory[SourceFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("constructorParametersDownlevelTransform")(program.asInstanceOf[js.Any]).asInstanceOf[TransformerFactory[SourceFile]]
  
  inline def createCompilerHost(param0: Options): CompilerHost = ^.asInstanceOf[js.Dynamic].applyDynamic("createCompilerHost")(param0.asInstanceOf[js.Any]).asInstanceOf[CompilerHost]
  
  inline def createProgram(param0: Host): typings.angularCompilerCli.srcTransformersApiMod.Program = ^.asInstanceOf[js.Dynamic].applyDynamic("createProgram")(param0.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompilerCli.srcTransformersApiMod.Program]
  
  inline def defaultGatherDiagnostics(program: typings.angularCompilerCli.srcTransformersApiMod.Program): js.Array[Diagnostic] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultGatherDiagnostics")(program.asInstanceOf[js.Any]).asInstanceOf[js.Array[Diagnostic]]
  
  inline def dirname(file: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dirname")(file.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def dirname_AbsoluteFsPath(file: BrandedPath[typings.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath]): BrandedPath[typings.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath] = ^.asInstanceOf[js.Dynamic].applyDynamic("dirname")(file.asInstanceOf[js.Any]).asInstanceOf[BrandedPath[typings.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath]]
  
  inline def dirname_PathSegment(file: BrandedPath[typings.angularCompilerCli.angularCompilerCliStrings.PathSegment]): BrandedPath[typings.angularCompilerCli.angularCompilerCliStrings.PathSegment] = ^.asInstanceOf[js.Dynamic].applyDynamic("dirname")(file.asInstanceOf[js.Any]).asInstanceOf[BrandedPath[typings.angularCompilerCli.angularCompilerCliStrings.PathSegment]]
  
  inline def exitCodeFromResult(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("exitCodeFromResult")().asInstanceOf[Double]
  inline def exitCodeFromResult(diags: js.Array[Diagnostic]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("exitCodeFromResult")(diags.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def formatDiagnostics(diags: js.Array[Diagnostic]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDiagnostics")(diags.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatDiagnostics(diags: js.Array[Diagnostic], host: FormatDiagnosticsHost): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDiagnostics")(diags.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getFileSystem(): FileSystem = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileSystem")().asInstanceOf[FileSystem]
  
  inline def getSourceFileOrError(program: Program, fileName: AbsoluteFsPath): SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("getSourceFileOrError")(program.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[SourceFile]
  
  inline def isLocalRelativePath(relativePath: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLocalRelativePath")(relativePath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRoot(path: AbsoluteFsPath): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRoot")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRooted(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRooted")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTsDiagnostic(diagnostic: Any): /* is typescript.typescript.Diagnostic */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTsDiagnostic")(diagnostic.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.Diagnostic */ Boolean]
  
  inline def join(basePath: String, paths: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(scala.List(basePath.asInstanceOf[js.Any]).`++`(paths.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def join_AbsoluteFsPath(
    basePath: BrandedPath[typings.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath],
    paths: String*
  ): BrandedPath[typings.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath] = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(scala.List(basePath.asInstanceOf[js.Any]).`++`(paths.asInstanceOf[Seq[js.Any]])*).asInstanceOf[BrandedPath[typings.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath]]
  
  inline def join_PathSegment(
    basePath: BrandedPath[typings.angularCompilerCli.angularCompilerCliStrings.PathSegment],
    paths: String*
  ): BrandedPath[typings.angularCompilerCli.angularCompilerCliStrings.PathSegment] = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(scala.List(basePath.asInstanceOf[js.Any]).`++`(paths.asInstanceOf[Seq[js.Any]])*).asInstanceOf[BrandedPath[typings.angularCompilerCli.angularCompilerCliStrings.PathSegment]]
  
  inline def performCompilation(param0: CustomTransformers): PerformCompilationResult = ^.asInstanceOf[js.Dynamic].applyDynamic("performCompilation")(param0.asInstanceOf[js.Any]).asInstanceOf[PerformCompilationResult]
  
  inline def readConfiguration(project: String): ParsedConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("readConfiguration")(project.asInstanceOf[js.Any]).asInstanceOf[ParsedConfiguration]
  inline def readConfiguration(project: String, existingOptions: Unit, host: ConfigurationHost): ParsedConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfiguration")(project.asInstanceOf[js.Any], existingOptions.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[ParsedConfiguration]
  inline def readConfiguration(project: String, existingOptions: typings.angularCompilerCli.srcTransformersApiMod.CompilerOptions): ParsedConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfiguration")(project.asInstanceOf[js.Any], existingOptions.asInstanceOf[js.Any])).asInstanceOf[ParsedConfiguration]
  inline def readConfiguration(
    project: String,
    existingOptions: typings.angularCompilerCli.srcTransformersApiMod.CompilerOptions,
    host: ConfigurationHost
  ): ParsedConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfiguration")(project.asInstanceOf[js.Any], existingOptions.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[ParsedConfiguration]
  
  inline def relative(from: String, to: String): PathSegment | AbsoluteFsPath = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[PathSegment | AbsoluteFsPath]
  
  inline def relativeFrom(path: String): PathSegment = ^.asInstanceOf[js.Dynamic].applyDynamic("relativeFrom")(path.asInstanceOf[js.Any]).asInstanceOf[PathSegment]
  
  inline def relative_AbsoluteFsPath(
    from: BrandedPath[typings.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath],
    to: BrandedPath[typings.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath]
  ): PathSegment | AbsoluteFsPath = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[PathSegment | AbsoluteFsPath]
  
  inline def relative_PathSegment(
    from: BrandedPath[typings.angularCompilerCli.angularCompilerCliStrings.PathSegment],
    to: BrandedPath[typings.angularCompilerCli.angularCompilerCliStrings.PathSegment]
  ): PathSegment | AbsoluteFsPath = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[PathSegment | AbsoluteFsPath]
  
  inline def resolve(basePath: String, paths: String*): AbsoluteFsPath = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(scala.List(basePath.asInstanceOf[js.Any]).`++`(paths.asInstanceOf[Seq[js.Any]])*).asInstanceOf[AbsoluteFsPath]
  
  inline def setFileSystem(fileSystem: FileSystem): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFileSystem")(fileSystem.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def toRelativeImport(relativePath: AbsoluteFsPath | PathSegment): PathSegment | AbsoluteFsPath = ^.asInstanceOf[js.Dynamic].applyDynamic("toRelativeImport")(relativePath.asInstanceOf[js.Any]).asInstanceOf[PathSegment | AbsoluteFsPath]
}
