package typings.angularCompilerCli

import typings.angularCompilerCli.ngccSrcDependenciesDependencyResolverMod.DependencyResolver
import typings.angularCompilerCli.ngccSrcEntryPointFinderTracingEntryPointFinderMod.TracingEntryPointFinder
import typings.angularCompilerCli.ngccSrcPackagesConfigurationMod.NgccConfiguration
import typings.angularCompilerCli.ngccSrcPackagesEntryPointMod.EntryPointJsonProperty
import typings.angularCompilerCli.ngccSrcPathMappingsMod.PathMappings
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.ReadonlyFileSystem
import typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcEntryPointFinderTargetedEntryPointFinderMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/entry_point_finder/targeted_entry_point_finder", "TargetedEntryPointFinder")
  @js.native
  open class TargetedEntryPointFinder protected () extends TracingEntryPointFinder {
    def this(
      fs: ReadonlyFileSystem,
      config: NgccConfiguration,
      logger: Logger,
      resolver: DependencyResolver,
      basePath: AbsoluteFsPath,
      pathMappings: Unit,
      targetPath: AbsoluteFsPath
    ) = this()
    def this(
      fs: ReadonlyFileSystem,
      config: NgccConfiguration,
      logger: Logger,
      resolver: DependencyResolver,
      basePath: AbsoluteFsPath,
      pathMappings: PathMappings,
      targetPath: AbsoluteFsPath
    ) = this()
    
    /**
      * Compute the path to the package that contains the given entry-point.
      *
      * In this entry-point finder it is not trivial to find the containing package, since it is
      * possible that this entry-point is not directly below the directory containing the package.
      * Moreover, the import path could be affected by path-mapping.
      *
      * @param entryPointPath the path to the entry-point, whose package path we want to compute.
      */
    /* private */ var computePackagePath: Any = js.native
    
    /**
      * Search down to the `entryPointPath` from the `containingPath` for the first `package.json` that
      * we come to. This is the path to the entry-point's containing package. For example if
      * `containingPath` is `/a/b/c` and `entryPointPath` is `/a/b/c/d/e` and there exists
      * `/a/b/c/d/package.json` and `/a/b/c/d/e/package.json`, then we will return `/a/b/c/d`.
      *
      * To account for nested `node_modules` we actually start the search at the last `node_modules` in
      * the `entryPointPath` that is below the `containingPath`. E.g. if `containingPath` is `/a/b/c`
      * and `entryPointPath` is `/a/b/c/d/node_modules/x/y/z`, we start the search at
      * `/a/b/c/d/node_modules`.
      */
    /* private */ var computePackagePathFromContainingPath: Any = js.native
    
    /**
      * Search up the directory tree from the `entryPointPath` looking for a `node_modules` directory
      * that we can use as a potential starting point for computing the package path.
      */
    /* private */ var computePackagePathFromNearestNodeModules: Any = js.native
    
    /**
      * Compute whether the `test` path is contained within the `base` path.
      *
      * Note that this doesn't use a simple `startsWith()` since that would result in a false positive
      * for `test` paths such as `a/b/c-x` when the `base` path is `a/b/c`.
      *
      * Since `fs.relative()` can be quite expensive we check the fast possibilities first.
      */
    /* private */ var isPathContainedBy: Any = js.native
    
    /**
      * Split the given `path` into path segments using an FS independent algorithm.
      */
    /* private */ var splitPath: Any = js.native
    
    /**
      * Determine whether the entry-point at the given `targetPath` needs to be processed.
      *
      * @param propertiesToConsider the package.json properties that should be considered for
      *     processing.
      * @param compileAllFormats true if all formats need to be processed, or false if it is enough for
      *     one of the formats covered by the `propertiesToConsider` is processed.
      */
    def targetNeedsProcessingOrCleaning(propertiesToConsider: js.Array[EntryPointJsonProperty], compileAllFormats: Boolean): Boolean = js.native
    
    /* private */ var targetPath: Any = js.native
  }
}
