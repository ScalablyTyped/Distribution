package typings.angularLocalize

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathManipulation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcTranslateOutputPathMod {
  
  @JSImport("@angular/localize/tools/src/translate/output_path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOutputPathFn(fs: PathManipulation, outputFolder: AbsoluteFsPath): OutputPathFn = (^.asInstanceOf[js.Dynamic].applyDynamic("getOutputPathFn")(fs.asInstanceOf[js.Any], outputFolder.asInstanceOf[js.Any])).asInstanceOf[OutputPathFn]
  
  type OutputPathFn = js.Function2[/* locale */ String, /* relativePath */ String, String]
}
