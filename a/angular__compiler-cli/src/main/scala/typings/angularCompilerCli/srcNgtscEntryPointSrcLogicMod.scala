package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscEntryPointSrcLogicMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/entry_point/src/logic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findFlatIndexEntryPoint(rootFiles: js.Array[AbsoluteFsPath]): AbsoluteFsPath | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findFlatIndexEntryPoint")(rootFiles.asInstanceOf[js.Any]).asInstanceOf[AbsoluteFsPath | Null]
}
