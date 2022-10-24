package typings.angularCompilerCli

import typings.angularCompilerCli.ngccSrcDependenciesModuleResolverMod.ModuleResolver
import typings.angularCompilerCli.ngccSrcPackagesEntryPointMod.EntryPoint
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathSegment
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.ReadonlyFileSystem
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcDependenciesDependencyHostMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/dependencies/dependency_host", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@angular/compiler-cli/ngcc/src/dependencies/dependency_host", "DependencyHostBase")
  @js.native
  open class DependencyHostBase protected ()
    extends StObject
       with DependencyHost {
    def this(fs: ReadonlyFileSystem, moduleResolver: ModuleResolver) = this()
    
    /* protected */ def canSkipFile(fileContents: String): Boolean = js.native
    
    /* CompleteClass */
    override def collectDependencies(entryPointPath: AbsoluteFsPath, param1: DependencyInfo): Unit = js.native
    
    /**
      * Find all the dependencies for the provided paths.
      *
      * @param files The list of absolute paths of JavaScript files to scan for dependencies.
      * @param dependencyInfo An object containing information about the dependencies of the
      * entry-point, including those that were missing or deep imports into other entry-points. The
      * sets in this object will be updated with new information about the entry-point's dependencies.
      */
    def collectDependenciesInFiles(files: js.Array[AbsoluteFsPath], param1: DependencyInfo): Unit = js.native
    
    /* protected */ def extractImports(file: AbsoluteFsPath, fileContents: String): Set[String] = js.native
    
    /* protected */ var fs: ReadonlyFileSystem = js.native
    
    /* protected */ var moduleResolver: ModuleResolver = js.native
    
    /**
      * Processes the file if it has not already been seen. This will also recursively process
      * all files that are imported from the file, while taking the set of already seen files
      * into account.
      */
    /* protected */ def processFile(
      file: AbsoluteFsPath,
      dependencies: Set[AbsoluteFsPath],
      missing: Set[String],
      deepImports: Set[String],
      alreadySeen: Set[AbsoluteFsPath]
    ): Unit = js.native
    
    /**
      * Resolve the given `importPath` from `file` and add it to the appropriate set.
      *
      * If the import is local to this package then follow it by calling
      * `recursivelyCollectDependencies()`.
      *
      * @returns `true` if the import was resolved (to an entry-point, a local import, or a
      * deep-import), `false` otherwise.
      */
    /* protected */ def processImport(
      importPath: String,
      file: AbsoluteFsPath,
      dependencies: Set[AbsoluteFsPath],
      missing: Set[String],
      deepImports: Set[String],
      alreadySeen: Set[AbsoluteFsPath]
    ): Boolean = js.native
    
    /**
      * Compute the dependencies of the given file.
      *
      * @param file An absolute path to the file whose dependencies we want to get.
      * @param dependencies A set that will have the absolute paths of resolved entry points added to
      * it.
      * @param missing A set that will have the dependencies that could not be found added to it.
      * @param deepImports A set that will have the import paths that exist but cannot be mapped to
      * entry-points, i.e. deep-imports.
      * @param alreadySeen A set that is used to track internal dependencies to prevent getting stuck
      * in a circular dependency loop.
      */
    /* protected */ def recursivelyCollectDependencies(
      file: AbsoluteFsPath,
      dependencies: Set[AbsoluteFsPath],
      missing: Set[String],
      deepImports: Set[String],
      alreadySeen: Set[AbsoluteFsPath]
    ): Unit = js.native
  }
  
  inline def createDependencyInfo(): DependencyInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createDependencyInfo")().asInstanceOf[DependencyInfo]
  
  trait DependencyHost extends StObject {
    
    def collectDependencies(entryPointPath: AbsoluteFsPath, param1: DependencyInfo): Unit
  }
  object DependencyHost {
    
    inline def apply(collectDependencies: (AbsoluteFsPath, DependencyInfo) => Unit): DependencyHost = {
      val __obj = js.Dynamic.literal(collectDependencies = js.Any.fromFunction2(collectDependencies))
      __obj.asInstanceOf[DependencyHost]
    }
    
    extension [Self <: DependencyHost](x: Self) {
      
      inline def setCollectDependencies(value: (AbsoluteFsPath, DependencyInfo) => Unit): Self = StObject.set(x, "collectDependencies", js.Any.fromFunction2(value))
    }
  }
  
  trait DependencyInfo extends StObject {
    
    var deepImports: Set[AbsoluteFsPath]
    
    var dependencies: Set[AbsoluteFsPath]
    
    var missing: Set[AbsoluteFsPath | PathSegment]
  }
  object DependencyInfo {
    
    inline def apply(
      deepImports: Set[AbsoluteFsPath],
      dependencies: Set[AbsoluteFsPath],
      missing: Set[AbsoluteFsPath | PathSegment]
    ): DependencyInfo = {
      val __obj = js.Dynamic.literal(deepImports = deepImports.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], missing = missing.asInstanceOf[js.Any])
      __obj.asInstanceOf[DependencyInfo]
    }
    
    extension [Self <: DependencyInfo](x: Self) {
      
      inline def setDeepImports(value: Set[AbsoluteFsPath]): Self = StObject.set(x, "deepImports", value.asInstanceOf[js.Any])
      
      inline def setDependencies(value: Set[AbsoluteFsPath]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setMissing(value: Set[AbsoluteFsPath | PathSegment]): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    }
  }
  
  trait EntryPointWithDependencies extends StObject {
    
    var depInfo: DependencyInfo
    
    var entryPoint: EntryPoint
  }
  object EntryPointWithDependencies {
    
    inline def apply(depInfo: DependencyInfo, entryPoint: EntryPoint): EntryPointWithDependencies = {
      val __obj = js.Dynamic.literal(depInfo = depInfo.asInstanceOf[js.Any], entryPoint = entryPoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntryPointWithDependencies]
    }
    
    extension [Self <: EntryPointWithDependencies](x: Self) {
      
      inline def setDepInfo(value: DependencyInfo): Self = StObject.set(x, "depInfo", value.asInstanceOf[js.Any])
      
      inline def setEntryPoint(value: EntryPoint): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
    }
  }
}
