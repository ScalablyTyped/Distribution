package typings.angularCompilerCli

import typings.angularCompilerCli.ngccSrcDependenciesDependencyHostMod.EntryPointWithDependencies
import typings.angularCompilerCli.ngccSrcDependenciesDependencyResolverMod.DependencyResolver
import typings.angularCompilerCli.ngccSrcDependenciesDependencyResolverMod.SortedEntryPointsInfo
import typings.angularCompilerCli.ngccSrcEntryPointFinderEntryPointCollectorMod.EntryPointCollector
import typings.angularCompilerCli.ngccSrcEntryPointFinderInterfaceMod.EntryPointFinder
import typings.angularCompilerCli.ngccSrcPackagesEntryPointManifestMod.EntryPointManifest
import typings.angularCompilerCli.ngccSrcPathMappingsMod.PathMappings
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcEntryPointFinderDirectoryWalkerEntryPointFinderMod {
  
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
