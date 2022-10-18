package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscSourcemapsMod.SourceFile
import typings.angularCompilerCli.srcNgtscSourcemapsMod.SourceFileLoader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkerSrcFileLinkerGetSourceFileMod {
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/get_source_file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createGetSourceFile(sourceUrl: AbsoluteFsPath, code: String): GetSourceFileFn = (^.asInstanceOf[js.Dynamic].applyDynamic("createGetSourceFile")(sourceUrl.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[GetSourceFileFn]
  inline def createGetSourceFile(sourceUrl: AbsoluteFsPath, code: String, loader: SourceFileLoader): GetSourceFileFn = (^.asInstanceOf[js.Dynamic].applyDynamic("createGetSourceFile")(sourceUrl.asInstanceOf[js.Any], code.asInstanceOf[js.Any], loader.asInstanceOf[js.Any])).asInstanceOf[GetSourceFileFn]
  
  type GetSourceFileFn = js.Function0[SourceFile | Null]
}
