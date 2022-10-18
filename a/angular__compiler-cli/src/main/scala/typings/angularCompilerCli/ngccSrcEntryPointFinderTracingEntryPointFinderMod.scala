package typings.angularCompilerCli

import typings.angularCompilerCli.ngccSrcDependenciesDependencyHostMod.EntryPointWithDependencies
import typings.angularCompilerCli.ngccSrcDependenciesDependencyResolverMod.DependencyResolver
import typings.angularCompilerCli.ngccSrcDependenciesDependencyResolverMod.SortedEntryPointsInfo
import typings.angularCompilerCli.ngccSrcEntryPointFinderInterfaceMod.EntryPointFinder
import typings.angularCompilerCli.ngccSrcPackagesConfigurationMod.NgccConfiguration
import typings.angularCompilerCli.ngccSrcPathMappingsMod.PathMappings
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.ReadonlyFileSystem
import typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcEntryPointFinderTracingEntryPointFinderMod {
  
  /* note: abstract class */ @JSImport("@angular/compiler-cli/ngcc/src/entry_point_finder/tracing_entry_point_finder", "TracingEntryPointFinder")
  @js.native
  open class TracingEntryPointFinder protected ()
    extends StObject
       with EntryPointFinder {
    def this(
      fs: ReadonlyFileSystem,
      config: NgccConfiguration,
      logger: Logger,
      resolver: DependencyResolver,
      basePath: AbsoluteFsPath
    ) = this()
    def this(
      fs: ReadonlyFileSystem,
      config: NgccConfiguration,
      logger: Logger,
      resolver: DependencyResolver,
      basePath: AbsoluteFsPath,
      pathMappings: PathMappings
    ) = this()
    
    /* protected */ var basePath: AbsoluteFsPath = js.native
    
    /* private */ var basePaths: Any = js.native
    
    /* protected */ var config: NgccConfiguration = js.native
    
    /**
      * Search for Angular package entry-points.
      */
    /* CompleteClass */
    override def findEntryPoints(): SortedEntryPointsInfo = js.native
    
    /* protected */ var fs: ReadonlyFileSystem = js.native
    
    /**
      * Parse the path-mappings to compute the base-paths that need to be considered when finding
      * entry-points.
      *
      * This processing can be time-consuming if the path-mappings are complex or extensive.
      * So the result is cached locally once computed.
      */
    /* protected */ def getBasePaths(): js.Array[AbsoluteFsPath] = js.native
    
    /**
      * For the given `entryPointPath`, compute, or retrieve, the entry-point information, including
      * paths to other entry-points that this entry-point depends upon.
      *
      * @param entryPointPath the path to the entry-point whose information and dependencies are to be
      *     retrieved or computed.
      *
      * @returns the entry-point and its dependencies or `null` if the entry-point is not compiled by
      *     Angular or cannot be determined.
      */
    /* protected */ def getEntryPointWithDeps(entryPointPath: AbsoluteFsPath): EntryPointWithDependencies | Null = js.native
    
    /**
      * Return an array of entry-point paths from which to start the trace.
      */
    /* protected */ def getInitialEntryPointPaths(): js.Array[AbsoluteFsPath] = js.native
    
    /* protected */ var logger: Logger = js.native
    
    /* protected */ var pathMappings: js.UndefOr[PathMappings] = js.native
    
    /* protected */ var resolver: DependencyResolver = js.native
  }
}
