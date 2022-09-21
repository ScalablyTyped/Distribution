package typings.angularCompilerCli

import typings.angularCompilerCli.loggerMod.Logger
import typings.angularCompilerCli.pathMappingsMod.PathMappings
import typings.angularCompilerCli.srcTypesMod.AbsoluteFsPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entryPointFinderUtilsMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/entry_point_finder/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBasePaths(logger: Logger, sourceDirectory: AbsoluteFsPath): js.Array[AbsoluteFsPath] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBasePaths")(logger.asInstanceOf[js.Any], sourceDirectory.asInstanceOf[js.Any])).asInstanceOf[js.Array[AbsoluteFsPath]]
  inline def getBasePaths(logger: Logger, sourceDirectory: AbsoluteFsPath, pathMappings: PathMappings): js.Array[AbsoluteFsPath] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBasePaths")(logger.asInstanceOf[js.Any], sourceDirectory.asInstanceOf[js.Any], pathMappings.asInstanceOf[js.Any])).asInstanceOf[js.Array[AbsoluteFsPath]]
  
  inline def trackDuration[T](task: js.Function0[T], log: js.Function1[/* duration */ Double, Unit]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("trackDuration")(task.asInstanceOf[js.Any], log.asInstanceOf[js.Any])).asInstanceOf[T]
}
