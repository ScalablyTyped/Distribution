package typings.angularCompilerCli

import typings.angularCompilerCli.dependencyHostMod.EntryPointWithDependencies
import typings.angularCompilerCli.dependencyResolverMod.DependencyResolver
import typings.angularCompilerCli.dependencyResolverMod.SortedEntryPointsInfo
import typings.angularCompilerCli.entryPointCollectorMod.EntryPointCollector
import typings.angularCompilerCli.entryPointManifestMod.EntryPointManifest
import typings.angularCompilerCli.interfaceMod.EntryPointFinder
import typings.angularCompilerCli.loggerMod.Logger
import typings.angularCompilerCli.pathMappingsMod.PathMappings
import typings.angularCompilerCli.srcTypesMod.AbsoluteFsPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directoryWalkerEntryPointFinderMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/entry_point_finder/directory_walker_entry_point_finder", "DirectoryWalkerEntryPointFinder")
  @js.native
  open class DirectoryWalkerEntryPointFinder protected ()
    extends StObject
       with EntryPointFinder {
    def this(
      logger: Logger,
      resolver: DependencyResolver,
      entryPointCollector: EntryPointCollector,
      entryPointManifest: EntryPointManifest,
      sourceDirectory: AbsoluteFsPath
    ) = this()
    def this(
      logger: Logger,
      resolver: DependencyResolver,
      entryPointCollector: EntryPointCollector,
      entryPointManifest: EntryPointManifest,
      sourceDirectory: AbsoluteFsPath,
      pathMappings: PathMappings
    ) = this()
    
    /* private */ var basePaths: Any = js.native
    
    /* private */ var entryPointCollector: Any = js.native
    
    /* private */ var entryPointManifest: Any = js.native
    
    /**
      * Search for Angular package entry-points.
      */
    /* CompleteClass */
    override def findEntryPoints(): SortedEntryPointsInfo = js.native
    
    /* private */ var logger: Any = js.native
    
    /* private */ var pathMappings: Any = js.native
    
    /* private */ var resolver: Any = js.native
    
    /* private */ var sourceDirectory: Any = js.native
    
    /**
      * Search the `basePath` for possible Angular packages and entry-points.
      *
      * @param basePath The path at which to start the search.
      * @returns an array of `EntryPoint`s that were found within `basePath`.
      */
    def walkBasePathForPackages(basePath: AbsoluteFsPath): js.Array[EntryPointWithDependencies] = js.native
  }
}
