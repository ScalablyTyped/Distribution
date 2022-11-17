package typings.angularCompilerCli

import typings.angularCompilerCli.anon.FileName
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.BrandedPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.FileSystem
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathSegment
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscFileSystemSrcHelpersMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/file_system/src/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
