package typings.angularCompilerCli

import typings.angularCompilerCli.pathMappingsMod.PathMappings
import typings.angularCompilerCli.srcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcTypesMod.ReadonlyFileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moduleResolverMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/dependencies/module_resolver", "ModuleResolver")
  @js.native
  open class ModuleResolver protected () extends StObject {
    def this(fs: ReadonlyFileSystem) = this()
    def this(fs: ReadonlyFileSystem, pathMappings: PathMappings) = this()
    def this(fs: ReadonlyFileSystem, pathMappings: Unit, relativeExtensions: js.Array[String]) = this()
    def this(fs: ReadonlyFileSystem, pathMappings: PathMappings, relativeExtensions: js.Array[String]) = this()
    
    /**
      * Compute the candidate paths from the given mapping's templates using the matched
      * string.
      */
    /* private */ var computeMappedTemplates: Any = js.native
    
    /**
      * Apply the `pathMappers` to the `moduleName` and return all the possible
      * paths that match.
      *
      * The mapped path is computed for each template in `mapping.templates` by
      * replacing the `matcher.prefix` and `matcher.postfix` strings in `path with the
      * `template.prefix` and `template.postfix` strings.
      */
    /* private */ var findMappedPaths: Any = js.native
    
    /**
      * Search up the folder tree for the first folder that contains `package.json`
      * or `null` if none is found.
      */
    /* private */ var findPackagePath: Any = js.native
    
    /* private */ var fs: Any = js.native
    
    /**
      * Can we consider the given path as an entry-point to a package?
      *
      * This is achieved by checking for the existence of `${modulePath}/package.json`.
      * If there is no `package.json`, we check whether this is an APF v14+ secondary entry-point,
      * which does not have its own `package.json` but has an `exports` entry in the package's primary
      * `package.json`.
      */
    /* private */ var isEntryPoint: Any = js.native
    
    /**
      * Attempt to find a mapped path for the given `path` and a `mapping`.
      *
      * The `path` matches the `mapping` if if it starts with `matcher.prefix` and ends with
      * `matcher.postfix`.
      *
      * @returns the wildcard segment of a matched `path`, or `null` if no match.
      */
    /* private */ var matchMapping: Any = js.native
    
    /* private */ var pathMappings: Any = js.native
    
    /**
      * Convert the `pathMappings` into a collection of `PathMapper` functions.
      */
    /* private */ var processPathMappings: Any = js.native
    
    val relativeExtensions: js.Array[String] = js.native
    
    /**
      * Try to resolve the `moduleName` as an external entry-point by searching the `node_modules`
      * folders up the tree for a matching `.../node_modules/${moduleName}`.
      *
      * If a folder is found but the path is not considered an entry-point (see `isEntryPoint()`) then
      * it is marked as a "deep-import".
      */
    /* private */ var resolveAsEntryPoint: Any = js.native
    
    /**
      * Try to resolve a module name, as a relative path, from the `fromPath`.
      *
      * As it is relative, it only looks for files that end in one of the `relativeExtensions`.
      * For example: `${moduleName}.js` or `${moduleName}/index.js`.
      * If neither of these files exist then the method returns `null`.
      */
    /* private */ var resolveAsRelativePath: Any = js.native
    
    /**
      * Try to resolve the `moduleName`, by applying the computed `pathMappings` and
      * then trying to resolve the mapped path as a relative or external import.
      *
      * Whether the mapped path is relative is defined as it being "below the `fromPath`" and not
      * containing `node_modules`.
      *
      * If the mapped path is not relative but does not resolve to an external entry-point, then we
      * check whether it would have resolved to a relative path, in which case it is marked as a
      * "deep-import".
      */
    /* private */ var resolveByPathMappings: Any = js.native
    
    /**
      * Resolve an absolute path for the `moduleName` imported into a file at `fromPath`.
      * @param moduleName The name of the import to resolve.
      * @param fromPath The path to the file containing the import.
      * @returns A path to the resolved module or null if missing.
      * Specifically:
      *  * the absolute path to the package.json of an external module
      *  * a JavaScript file of an internal module
      *  * null if none exists.
      */
    def resolveModuleImport(moduleName: String, fromPath: AbsoluteFsPath): ResolvedModule | Null = js.native
  }
  
  @JSImport("@angular/compiler-cli/ngcc/src/dependencies/module_resolver", "ResolvedDeepImport")
  @js.native
  open class ResolvedDeepImport protected ()
    extends StObject
       with ResolvedModule {
    def this(importPath: AbsoluteFsPath) = this()
    
    var importPath: AbsoluteFsPath = js.native
  }
  
  @JSImport("@angular/compiler-cli/ngcc/src/dependencies/module_resolver", "ResolvedExternalModule")
  @js.native
  open class ResolvedExternalModule protected ()
    extends StObject
       with ResolvedModule {
    def this(entryPointPath: AbsoluteFsPath) = this()
    
    var entryPointPath: AbsoluteFsPath = js.native
  }
  
  @JSImport("@angular/compiler-cli/ngcc/src/dependencies/module_resolver", "ResolvedRelativeModule")
  @js.native
  open class ResolvedRelativeModule protected ()
    extends StObject
       with ResolvedModule {
    def this(modulePath: AbsoluteFsPath) = this()
    
    var modulePath: AbsoluteFsPath = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularCompilerCli.moduleResolverMod.ResolvedExternalModule
    - typings.angularCompilerCli.moduleResolverMod.ResolvedRelativeModule
    - typings.angularCompilerCli.moduleResolverMod.ResolvedDeepImport
  */
  trait ResolvedModule extends StObject
}
