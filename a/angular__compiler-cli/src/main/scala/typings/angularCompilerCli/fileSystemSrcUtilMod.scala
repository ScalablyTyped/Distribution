package typings.angularCompilerCli

import typings.angularCompilerCli.angularCompilerCliStrings.PathSegment
import typings.angularCompilerCli.srcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcTypesMod.BrandedPath
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileSystemSrcUtilMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/file_system/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSourceFileOrError(program: Program, fileName: AbsoluteFsPath): SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("getSourceFileOrError")(program.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[SourceFile]
  
  inline def normalizeSeparators(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeSeparators")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stripExtension(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripExtension")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stripExtension_AbsoluteFsPath(path: BrandedPath[typings.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath]): BrandedPath[typings.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath] = ^.asInstanceOf[js.Dynamic].applyDynamic("stripExtension")(path.asInstanceOf[js.Any]).asInstanceOf[BrandedPath[typings.angularCompilerCli.angularCompilerCliStrings.AbsoluteFsPath]]
  
  inline def stripExtension_PathSegment(path: BrandedPath[PathSegment]): BrandedPath[PathSegment] = ^.asInstanceOf[js.Dynamic].applyDynamic("stripExtension")(path.asInstanceOf[js.Any]).asInstanceOf[BrandedPath[PathSegment]]
}
