package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.ReadonlyFileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcWritingCleaningUtilsMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/writing/cleaning/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isLocalDirectory(fs: ReadonlyFileSystem, path: AbsoluteFsPath): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isLocalDirectory")(fs.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
