package typings.angularCompilerCli

import typings.angularCompilerCli.anon.FileName
import typings.angularCompilerCli.anon.PickCompilerHostgetCanoni
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.BrandedPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.FileSystem
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathManipulation
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathSegment
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathString
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.ReadonlyFileSystem
import typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel
import typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import typings.angularCompilerCli.srcNgtscSourcemapsSrcRawSourceMapMod.SourceMapInfo
import typings.std.Record
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privateLocalizeMod {
  
  @JSImport("@angular/compiler-cli/private/localize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/private/localize", "ConsoleLogger")
  @js.native
  open class ConsoleLogger protected ()
    extends typings.angularCompilerCli.srcNgtscLoggingMod.ConsoleLogger {
    def this(level: LogLevel) = this()
  }
  
  @JSImport("@angular/compiler-cli/private/localize", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel & Double] = js.native
    
    /* 0 */ val debug: typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel.debug & Double = js.native
    
    /* 3 */ val error: typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel.error & Double = js.native
    
    /* 1 */ val info: typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel.info & Double = js.native
    
    /* 2 */ val warn: typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel.warn & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/private/localize", "LogicalFileSystem")
  @js.native
  open class LogicalFileSystem protected ()
    extends typings.angularCompilerCli.srcNgtscFileSystemMod.LogicalFileSystem {
    def this(rootDirs: js.Array[AbsoluteFsPath], compilerHost: PickCompilerHostgetCanoni) = this()
  }
  
  object LogicalProjectPath {
    
    @JSImport("@angular/compiler-cli/private/localize", "LogicalProjectPath")
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
  
  @JSImport("@angular/compiler-cli/private/localize", "NgtscCompilerHost")
  @js.native
  open class NgtscCompilerHost protected ()
    extends typings.angularCompilerCli.srcNgtscFileSystemMod.NgtscCompilerHost {
    def this(fs: FileSystem) = this()
    def this(fs: FileSystem, options: CompilerOptions) = this()
  }
  
  @JSImport("@angular/compiler-cli/private/localize", "NodeJSFileSystem")
  @js.native
  open class NodeJSFileSystem ()
    extends typings.angularCompilerCli.srcNgtscFileSystemMod.NodeJSFileSystem
  
  @JSImport("@angular/compiler-cli/private/localize", "SourceFile")
  @js.native
  open class SourceFile protected ()
    extends typings.angularCompilerCli.srcNgtscSourcemapsMod.SourceFile {
    def this(
      /** The path to this source file. */
    sourcePath: AbsoluteFsPath,
      /** The contents of this source file. */
    contents: String,
      /** The raw source map (if any) referenced by this source file. */
    rawMap: Null,
      /** Any source files referenced by the raw source map associated with this source file. */
    sources: js.Array[typings.angularCompilerCli.srcNgtscSourcemapsSrcSourceFileMod.SourceFile | Null],
      fs: PathManipulation
    ) = this()
    def this(
      /** The path to this source file. */
    sourcePath: AbsoluteFsPath,
      /** The contents of this source file. */
    contents: String,
      /** The raw source map (if any) referenced by this source file. */
    rawMap: SourceMapInfo,
      /** Any source files referenced by the raw source map associated with this source file. */
    sources: js.Array[typings.angularCompilerCli.srcNgtscSourcemapsSrcSourceFileMod.SourceFile | Null],
      fs: PathManipulation
    ) = this()
  }
  
  @JSImport("@angular/compiler-cli/private/localize", "SourceFileLoader")
  @js.native
  open class SourceFileLoader protected ()
    extends typings.angularCompilerCli.srcNgtscSourcemapsMod.SourceFileLoader {
    def this(
      fs: ReadonlyFileSystem,
      logger: Logger,
      /** A map of URL schemes to base paths. The scheme name should be lowercase. */
    schemeMap: Record[String, AbsoluteFsPath]
    ) = this()
  }
  
  inline def absoluteFrom(path: String): AbsoluteFsPath = ^.asInstanceOf[js.Dynamic].applyDynamic("absoluteFrom")(path.asInstanceOf[js.Any]).asInstanceOf[AbsoluteFsPath]
  
  inline def absoluteFromSourceFile(sf: FileName): AbsoluteFsPath = ^.asInstanceOf[js.Dynamic].applyDynamic("absoluteFromSourceFile")(sf.asInstanceOf[js.Any]).asInstanceOf[AbsoluteFsPath]
  
  inline def basename(filePath: PathString): PathSegment = ^.asInstanceOf[js.Dynamic].applyDynamic("basename")(filePath.asInstanceOf[js.Any]).asInstanceOf[PathSegment]
  inline def basename(filePath: PathString, `extension`: String): PathSegment = (^.asInstanceOf[js.Dynamic].applyDynamic("basename")(filePath.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[PathSegment]
  
  inline def dirname(file: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dirname")(file.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.annotation.targetName("dirname_PathSegment")
  inline def dirname(file: BrandedPath["PathSegment"]): BrandedPath["PathSegment"] = ^.asInstanceOf[js.Dynamic].applyDynamic("dirname")(file.asInstanceOf[js.Any]).asInstanceOf[BrandedPath["PathSegment"]]
  @scala.annotation.targetName("dirname_AbsoluteFsPath")
  inline def dirname(file: BrandedPath["AbsoluteFsPath"]): BrandedPath["AbsoluteFsPath"] = ^.asInstanceOf[js.Dynamic].applyDynamic("dirname")(file.asInstanceOf[js.Any]).asInstanceOf[BrandedPath["AbsoluteFsPath"]]
  
  inline def getFileSystem(): FileSystem = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileSystem")().asInstanceOf[FileSystem]
  
  inline def getSourceFileOrError(program: Program, fileName: AbsoluteFsPath): typings.typescript.mod.SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("getSourceFileOrError")(program.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[typings.typescript.mod.SourceFile]
  
  inline def isLocalRelativePath(relativePath: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLocalRelativePath")(relativePath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRoot(path: AbsoluteFsPath): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRoot")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRooted(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRooted")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def join(basePath: String, paths: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(scala.List(basePath.asInstanceOf[js.Any]).`++`(paths.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  @scala.annotation.targetName("join_PathSegment")
  inline def join(basePath: BrandedPath["PathSegment"], paths: String*): BrandedPath["PathSegment"] = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(scala.List(basePath.asInstanceOf[js.Any]).`++`(paths.asInstanceOf[Seq[js.Any]])*).asInstanceOf[BrandedPath["PathSegment"]]
  @scala.annotation.targetName("join_AbsoluteFsPath")
  inline def join(basePath: BrandedPath["AbsoluteFsPath"], paths: String*): BrandedPath["AbsoluteFsPath"] = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(scala.List(basePath.asInstanceOf[js.Any]).`++`(paths.asInstanceOf[Seq[js.Any]])*).asInstanceOf[BrandedPath["AbsoluteFsPath"]]
  
  inline def relative(from: String, to: String): PathSegment | AbsoluteFsPath = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[PathSegment | AbsoluteFsPath]
  @scala.annotation.targetName("relative_PathSegment_PathSegment")
  inline def relative(from: BrandedPath["PathSegment"], to: BrandedPath["PathSegment"]): PathSegment | AbsoluteFsPath = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[PathSegment | AbsoluteFsPath]
  @scala.annotation.targetName("relative_AbsoluteFsPath_AbsoluteFsPath")
  inline def relative(from: BrandedPath["AbsoluteFsPath"], to: BrandedPath["AbsoluteFsPath"]): PathSegment | AbsoluteFsPath = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[PathSegment | AbsoluteFsPath]
  
  inline def relativeFrom(path: String): PathSegment = ^.asInstanceOf[js.Dynamic].applyDynamic("relativeFrom")(path.asInstanceOf[js.Any]).asInstanceOf[PathSegment]
  
  inline def resolve(basePath: String, paths: String*): AbsoluteFsPath = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(scala.List(basePath.asInstanceOf[js.Any]).`++`(paths.asInstanceOf[Seq[js.Any]])*).asInstanceOf[AbsoluteFsPath]
  
  inline def setFileSystem(fileSystem: FileSystem): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFileSystem")(fileSystem.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def toRelativeImport(relativePath: AbsoluteFsPath | PathSegment): PathSegment | AbsoluteFsPath = ^.asInstanceOf[js.Dynamic].applyDynamic("toRelativeImport")(relativePath.asInstanceOf[js.Any]).asInstanceOf[PathSegment | AbsoluteFsPath]
}
