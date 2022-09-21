package typings.angularCompilerCli

import typings.angularCompilerCli.incrementalApiMod.DependencyTracker
import typings.angularCompilerCli.srcTypesMod.AbsoluteFsPath
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object analysisUtilMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/analysis/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/ngcc/src/analysis/util", "NOOP_DEPENDENCY_TRACKER")
  @js.native
  val NOOP_DEPENDENCY_TRACKER: DependencyTracker[SourceFile] = js.native
  
  inline def isWithinPackage(packagePath: AbsoluteFsPath, filePath: AbsoluteFsPath): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWithinPackage")(packagePath.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
