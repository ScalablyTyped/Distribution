package typings.angularCompilerCli

import typings.angularCompilerCli.anon.PartialRecordEntryPointFo
import typings.angularCompilerCli.ngccSrcDependenciesDependencyHostMod.DependencyHost
import typings.angularCompilerCli.ngccSrcDependenciesDependencyHostMod.EntryPointWithDependencies
import typings.angularCompilerCli.ngccSrcPackagesConfigurationMod.NgccConfiguration
import typings.angularCompilerCli.ngccSrcPackagesEntryPointMod.EntryPoint
import typings.angularCompilerCli.ngccSrcUtilsMod.PartiallyOrderedList
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.ReadonlyFileSystem
import typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import typings.dependencyGraph.mod.DepGraph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcDependenciesDependencyResolverMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/dependencies/dependency_resolver", "DependencyResolver")
  @js.native
  open class DependencyResolver protected () extends StObject {
    def this(
      fs: ReadonlyFileSystem,
      logger: Logger,
      config: NgccConfiguration,
      hosts: PartialRecordEntryPointFo,
      typingsHost: DependencyHost
    ) = this()
    
    /**
      * Computes a dependency graph of the given entry-points.
      *
      * The graph only holds entry-points that ngcc cares about and whose dependencies
      * (direct and transitive) all exist.
      */
    /* private */ var computeDependencyGraph: Any = js.native
    
    /* private */ var config: Any = js.native
    
    /**
      * Filter out the deepImports that can be ignored, according to this entryPoint's config.
      */
    /* private */ var filterIgnorableDeepImports: Any = js.native
    
    /* private */ var fs: Any = js.native
    
    /* private */ var getEntryPointFormatInfo: Any = js.native
    
    def getEntryPointWithDependencies(entryPoint: EntryPoint): EntryPointWithDependencies = js.native
    
    /* private */ var hosts: Any = js.native
    
    /* private */ var logger: Any = js.native
    
    /**
      * Sort the array of entry points so that the dependant entry points always come later than
      * their dependencies in the array.
      * @param entryPoints An array entry points to sort.
      * @param target If provided, only return entry-points depended on by this entry-point.
      * @returns the result of sorting the entry points by dependency.
      */
    def sortEntryPointsByDependency(entryPoints: js.Array[EntryPointWithDependencies]): SortedEntryPointsInfo = js.native
    def sortEntryPointsByDependency(entryPoints: js.Array[EntryPointWithDependencies], target: EntryPoint): SortedEntryPointsInfo = js.native
    
    /* private */ var typingsHost: Any = js.native
  }
  
  trait DependencyDiagnostics extends StObject {
    
    var ignoredDependencies: js.Array[IgnoredDependency]
    
    var invalidEntryPoints: js.Array[InvalidEntryPoint]
  }
  object DependencyDiagnostics {
    
    inline def apply(ignoredDependencies: js.Array[IgnoredDependency], invalidEntryPoints: js.Array[InvalidEntryPoint]): DependencyDiagnostics = {
      val __obj = js.Dynamic.literal(ignoredDependencies = ignoredDependencies.asInstanceOf[js.Any], invalidEntryPoints = invalidEntryPoints.asInstanceOf[js.Any])
      __obj.asInstanceOf[DependencyDiagnostics]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DependencyDiagnostics] (val x: Self) extends AnyVal {
      
      inline def setIgnoredDependencies(value: js.Array[IgnoredDependency]): Self = StObject.set(x, "ignoredDependencies", value.asInstanceOf[js.Any])
      
      inline def setIgnoredDependenciesVarargs(value: IgnoredDependency*): Self = StObject.set(x, "ignoredDependencies", js.Array(value*))
      
      inline def setInvalidEntryPoints(value: js.Array[InvalidEntryPoint]): Self = StObject.set(x, "invalidEntryPoints", value.asInstanceOf[js.Any])
      
      inline def setInvalidEntryPointsVarargs(value: InvalidEntryPoint*): Self = StObject.set(x, "invalidEntryPoints", js.Array(value*))
    }
  }
  
  trait IgnoredDependency extends StObject {
    
    var dependencyPath: String
    
    var entryPoint: EntryPoint
  }
  object IgnoredDependency {
    
    inline def apply(dependencyPath: String, entryPoint: EntryPoint): IgnoredDependency = {
      val __obj = js.Dynamic.literal(dependencyPath = dependencyPath.asInstanceOf[js.Any], entryPoint = entryPoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[IgnoredDependency]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IgnoredDependency] (val x: Self) extends AnyVal {
      
      inline def setDependencyPath(value: String): Self = StObject.set(x, "dependencyPath", value.asInstanceOf[js.Any])
      
      inline def setEntryPoint(value: EntryPoint): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidEntryPoint extends StObject {
    
    var entryPoint: EntryPoint
    
    var missingDependencies: js.Array[String]
  }
  object InvalidEntryPoint {
    
    inline def apply(entryPoint: EntryPoint, missingDependencies: js.Array[String]): InvalidEntryPoint = {
      val __obj = js.Dynamic.literal(entryPoint = entryPoint.asInstanceOf[js.Any], missingDependencies = missingDependencies.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvalidEntryPoint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InvalidEntryPoint] (val x: Self) extends AnyVal {
      
      inline def setEntryPoint(value: EntryPoint): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
      
      inline def setMissingDependencies(value: js.Array[String]): Self = StObject.set(x, "missingDependencies", value.asInstanceOf[js.Any])
      
      inline def setMissingDependenciesVarargs(value: String*): Self = StObject.set(x, "missingDependencies", js.Array(value*))
    }
  }
  
  type PartiallyOrderedEntryPoints = PartiallyOrderedList[EntryPoint]
  
  trait SortedEntryPointsInfo
    extends StObject
       with DependencyDiagnostics {
    
    var entryPoints: PartiallyOrderedEntryPoints
    
    var graph: DepGraph[EntryPoint]
  }
  object SortedEntryPointsInfo {
    
    inline def apply(
      entryPoints: PartiallyOrderedEntryPoints,
      graph: DepGraph[EntryPoint],
      ignoredDependencies: js.Array[IgnoredDependency],
      invalidEntryPoints: js.Array[InvalidEntryPoint]
    ): SortedEntryPointsInfo = {
      val __obj = js.Dynamic.literal(entryPoints = entryPoints.asInstanceOf[js.Any], graph = graph.asInstanceOf[js.Any], ignoredDependencies = ignoredDependencies.asInstanceOf[js.Any], invalidEntryPoints = invalidEntryPoints.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortedEntryPointsInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SortedEntryPointsInfo] (val x: Self) extends AnyVal {
      
      inline def setEntryPoints(value: PartiallyOrderedEntryPoints): Self = StObject.set(x, "entryPoints", value.asInstanceOf[js.Any])
      
      inline def setGraph(value: DepGraph[EntryPoint]): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
    }
  }
}
