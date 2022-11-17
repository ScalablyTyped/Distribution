package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.BrandedPath
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscFileSystemSrcUtilMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/file_system/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSourceFileOrError(program: Program, fileName: AbsoluteFsPath): SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("getSourceFileOrError")(program.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[SourceFile]
  
  inline def normalizeSeparators(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeSeparators")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stripExtension(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripExtension")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.annotation.targetName("stripExtension_AbsoluteFsPath")
  inline def stripExtension(path: BrandedPath["AbsoluteFsPath"]): BrandedPath["AbsoluteFsPath"] = ^.asInstanceOf[js.Dynamic].applyDynamic("stripExtension")(path.asInstanceOf[js.Any]).asInstanceOf[BrandedPath["AbsoluteFsPath"]]
  @scala.annotation.targetName("stripExtension_PathSegment")
  inline def stripExtension(path: BrandedPath["PathSegment"]): BrandedPath["PathSegment"] = ^.asInstanceOf[js.Dynamic].applyDynamic("stripExtension")(path.asInstanceOf[js.Any]).asInstanceOf[BrandedPath["PathSegment"]]
}
