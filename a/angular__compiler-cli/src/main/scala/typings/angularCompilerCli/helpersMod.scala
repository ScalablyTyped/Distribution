package typings.angularCompilerCli

import typings.angularCompilerCli.anon.FileName
import typings.angularCompilerCli.srcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcTypesMod.BrandedPath
import typings.angularCompilerCli.srcTypesMod.FileSystem
import typings.angularCompilerCli.srcTypesMod.PathSegment
import typings.angularCompilerCli.srcTypesMod.PathString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/file_system/src/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def absoluteFrom(path: String): AbsoluteFsPath = ^.asInstanceOf[js.Dynamic].applyDynamic("absoluteFrom")(path.asInstanceOf[js.Any]).asInstanceOf[AbsoluteFsPath]
  
  inline def absoluteFromSourceFile(sf: FileName): AbsoluteFsPath = ^.asInstanceOf[js.Dynamic].applyDynamic("absoluteFromSourceFile")(sf.asInstanceOf[js.Any]).asInstanceOf[AbsoluteFsPath]
  
  inline def basename(filePath: PathString): PathSegment = ^.asInstanceOf[js.Dynamic].applyDynamic("basename")(filePath.asInstanceOf[js.Any]).asInstanceOf[PathSegment]
  inline def basename(filePath: PathString, `extension`: String): PathSegment = (^.asInstanceOf[js.Dynamic].applyDynamic("basename")(filePath.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[PathSegment]
  
  inline def dirname(file: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dirname")(file.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def dirname_AbsoluteFsPath(file: BrandedPath[typings.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath]): BrandedPath[typings.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath] = ^.asInstanceOf[js.Dynamic].applyDynamic("dirname")(file.asInstanceOf[js.Any]).asInstanceOf[BrandedPath[typings.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath]]
  
  inline def dirname_PathSegment(file: BrandedPath[typings.angularCompilerCli.angularCompilerCliStrings.PathSegment]): BrandedPath[typings.angularCompilerCli.angularCompilerCliStrings.PathSegment] = ^.asInstanceOf[js.Dynamic].applyDynamic("dirname")(file.asInstanceOf[js.Any]).asInstanceOf[BrandedPath[typings.angularCompilerCli.angularCompilerCliStrings.PathSegment]]
  
  inline def getFileSystem(): FileSystem = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileSystem")().asInstanceOf[FileSystem]
  
  inline def isLocalRelativePath(relativePath: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLocalRelativePath")(relativePath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRoot(path: AbsoluteFsPath): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRoot")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRooted(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRooted")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def join(basePath: String, paths: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(List(basePath.asInstanceOf[js.Any]).`++`(paths.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def join_AbsoluteFsPath(
    basePath: BrandedPath[typings.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath],
    paths: String*
  ): BrandedPath[typings.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath] = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(List(basePath.asInstanceOf[js.Any]).`++`(paths.asInstanceOf[Seq[js.Any]])*).asInstanceOf[BrandedPath[typings.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath]]
  
  inline def join_PathSegment(
    basePath: BrandedPath[typings.angularCompilerCli.angularCompilerCliStrings.PathSegment],
    paths: String*
  ): BrandedPath[typings.angularCompilerCli.angularCompilerCliStrings.PathSegment] = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(List(basePath.asInstanceOf[js.Any]).`++`(paths.asInstanceOf[Seq[js.Any]])*).asInstanceOf[BrandedPath[typings.angularCompilerCli.angularCompilerCliStrings.PathSegment]]
  
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
  
  inline def resolve(basePath: String, paths: String*): AbsoluteFsPath = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(List(basePath.asInstanceOf[js.Any]).`++`(paths.asInstanceOf[Seq[js.Any]])*).asInstanceOf[AbsoluteFsPath]
  
  inline def setFileSystem(fileSystem: FileSystem): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFileSystem")(fileSystem.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def toRelativeImport(relativePath: AbsoluteFsPath | PathSegment): PathSegment | AbsoluteFsPath = ^.asInstanceOf[js.Dynamic].applyDynamic("toRelativeImport")(relativePath.asInstanceOf[js.Any]).asInstanceOf[PathSegment | AbsoluteFsPath]
}
