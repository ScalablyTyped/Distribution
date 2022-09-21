package typings.angularCompilerCli

import typings.angularCompilerCli.adapterMod.NgCompilerAdapter
import typings.angularCompilerCli.srcApiMod.ResourceLoader
import typings.angularCompilerCli.srcApiMod.ResourceLoaderContext
import typings.typescript.mod.CompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loaderMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/resource/src/loader", "AdapterResourceLoader")
  @js.native
  open class AdapterResourceLoader protected ()
    extends StObject
       with ResourceLoader {
    def this(adapter: NgCompilerAdapter, options: CompilerOptions) = this()
    
    /* private */ var adapter: Any = js.native
    
    /* private */ var cache: Any = js.native
    
    /**
      * True if this resource loader can preload resources.
      *
      * Sometimes a `ResourceLoader` is not able to do asynchronous pre-loading of resources.
      */
    /* CompleteClass */
    var canPreload: Boolean = js.native
    
    /**
      * If true, the resource loader is able to preprocess inline resources.
      */
    /* CompleteClass */
    var canPreprocess: Boolean = js.native
    
    /**
      * Attempt to resolve `url` in the context of `fromFile`, while respecting the rootDirs
      * option from the tsconfig. First, normalize the file name.
      */
    /* private */ var fallbackResolve: Any = js.native
    
    /* private */ var fetching: Any = js.native
    
    /**
      * TypeScript provides utilities to resolve module names, but not resource files (which aren't
      * a part of the ts.Program). However, TypeScript's module resolution can be used creatively
      * to locate where resource files should be expected to exist. Since module resolution returns
      * a list of file names that were considered, the loader can enumerate the possible locations
      * for the file by setting up a module resolution for it that will fail.
      */
    /* private */ var getResolvedCandidateLocations: Any = js.native
    
    /* private */ var getRootedCandidateLocations: Any = js.native
    
    /**
      * Invalidate the entire resource cache.
      */
    def invalidate(): Unit = js.native
    
    /**
      * Load the resource at the given url, synchronously.
      *
      * The contents of the resource may have been cached by a previous call to `preload()`.
      *
      * @param resolvedUrl The url (resolved by a call to `resolve()`) of the resource to load.
      * @returns The contents of the resource.
      */
    /* CompleteClass */
    override def load(resolvedUrl: String): String = js.native
    
    /* private */ var lookupResolutionHost: Any = js.native
    
    /* private */ var options: Any = js.native
    
    /**
      * Preload the specified resource, asynchronously. Once the resource is loaded, its value
      * should be cached so it can be accessed synchronously via the `load()` method.
      *
      * @param resolvedUrl The url (resolved by a call to `resolve()`) of the resource to preload.
      * @param context Information regarding the resource such as the type and containing file.
      * @returns A Promise that is resolved once the resource has been loaded or `undefined`
      * if the file has already been loaded.
      * @throws An Error if pre-loading is not available.
      */
    /* CompleteClass */
    override def preload(resolvedUrl: String, context: ResourceLoaderContext): js.UndefOr[js.Promise[Unit]] = js.native
    
    /**
      * Preprocess the content data of an inline resource, asynchronously.
      *
      * @param data The existing content data from the inline resource.
      * @param context Information regarding the resource such as the type and containing file.
      * @returns A Promise that resolves to the processed data. If no processing occurs, the
      * same data string that was passed to the function will be resolved.
      */
    /* CompleteClass */
    override def preprocessInline(data: String, context: ResourceLoaderContext): js.Promise[String] = js.native
    
    /**
      * Resolve the url of a resource relative to the file that contains the reference to it.
      * The return value of this method can be used in the `load()` and `preload()` methods.
      *
      * @param url The, possibly relative, url of the resource.
      * @param fromFile The path to the file that contains the URL of the resource.
      * @returns A resolved url of resource.
      * @throws An error if the resource cannot be resolved.
      */
    /* CompleteClass */
    override def resolve(file: String, basePath: String): String = js.native
  }
}
