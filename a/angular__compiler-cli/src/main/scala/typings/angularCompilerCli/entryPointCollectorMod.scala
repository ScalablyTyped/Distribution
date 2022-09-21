package typings.angularCompilerCli

import typings.angularCompilerCli.configurationMod.NgccConfiguration
import typings.angularCompilerCli.dependencyHostMod.EntryPointWithDependencies
import typings.angularCompilerCli.dependencyResolverMod.DependencyResolver
import typings.angularCompilerCli.loggerMod.Logger
import typings.angularCompilerCli.srcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcTypesMod.ReadonlyFileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entryPointCollectorMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/entry_point_finder/entry_point_collector", "EntryPointCollector")
  @js.native
  open class EntryPointCollector protected () extends StObject {
    def this(fs: ReadonlyFileSystem, config: NgccConfiguration, logger: Logger, resolver: DependencyResolver) = this()
    
    /**
      * Search the `directory` looking for any secondary entry-points for a package, adding any that
      * are found to the `entryPoints` array.
      *
      * @param entryPoints An array where we will add any entry-points found in this directory.
      * @param packagePath The absolute path to the package that may contain entry-points.
      * @param directory The current directory being searched.
      * @param paths The paths contained in the current `directory`.
      */
    /* private */ var collectSecondaryEntryPoints: Any = js.native
    
    /* private */ var config: Any = js.native
    
    /* private */ var fs: Any = js.native
    
    /* private */ var logger: Any = js.native
    
    /* private */ var resolver: Any = js.native
    
    /**
      * Look for Angular packages that need to be compiled, starting at the source directory.
      * The function will recurse into directories that start with `@...`, e.g. `@angular/...`.
      *
      * @param sourceDirectory An absolute path to the root directory where searching begins.
      * @returns an array of `EntryPoint`s that were found within `sourceDirectory`.
      */
    def walkDirectoryForPackages(sourceDirectory: AbsoluteFsPath): js.Array[EntryPointWithDependencies] = js.native
  }
}
