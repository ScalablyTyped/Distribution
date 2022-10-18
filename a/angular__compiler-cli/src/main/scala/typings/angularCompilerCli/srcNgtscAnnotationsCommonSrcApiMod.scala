package typings.angularCompilerCli

import typings.angularCompilerCli.angularCompilerCliStrings.style
import typings.angularCompilerCli.angularCompilerCliStrings.template
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscAnnotationsCommonSrcApiMod {
  
  trait ResourceLoader extends StObject {
    
    /**
      * True if this resource loader can preload resources.
      *
      * Sometimes a `ResourceLoader` is not able to do asynchronous pre-loading of resources.
      */
    var canPreload: Boolean
    
    /**
      * If true, the resource loader is able to preprocess inline resources.
      */
    var canPreprocess: Boolean
    
    /**
      * Load the resource at the given url, synchronously.
      *
      * The contents of the resource may have been cached by a previous call to `preload()`.
      *
      * @param resolvedUrl The url (resolved by a call to `resolve()`) of the resource to load.
      * @returns The contents of the resource.
      */
    def load(resolvedUrl: String): String
    
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
    def preload(resolvedUrl: String, context: ResourceLoaderContext): js.UndefOr[js.Promise[Unit]]
    
    /**
      * Preprocess the content data of an inline resource, asynchronously.
      *
      * @param data The existing content data from the inline resource.
      * @param context Information regarding the resource such as the type and containing file.
      * @returns A Promise that resolves to the processed data. If no processing occurs, the
      * same data string that was passed to the function will be resolved.
      */
    def preprocessInline(data: String, context: ResourceLoaderContext): js.Promise[String]
    
    /**
      * Resolve the url of a resource relative to the file that contains the reference to it.
      * The return value of this method can be used in the `load()` and `preload()` methods.
      *
      * @param url The, possibly relative, url of the resource.
      * @param fromFile The path to the file that contains the URL of the resource.
      * @returns A resolved url of resource.
      * @throws An error if the resource cannot be resolved.
      */
    def resolve(file: String, basePath: String): String
  }
  object ResourceLoader {
    
    inline def apply(
      canPreload: Boolean,
      canPreprocess: Boolean,
      load: String => String,
      preload: (String, ResourceLoaderContext) => js.UndefOr[js.Promise[Unit]],
      preprocessInline: (String, ResourceLoaderContext) => js.Promise[String],
      resolve: (String, String) => String
    ): ResourceLoader = {
      val __obj = js.Dynamic.literal(canPreload = canPreload.asInstanceOf[js.Any], canPreprocess = canPreprocess.asInstanceOf[js.Any], load = js.Any.fromFunction1(load), preload = js.Any.fromFunction2(preload), preprocessInline = js.Any.fromFunction2(preprocessInline), resolve = js.Any.fromFunction2(resolve))
      __obj.asInstanceOf[ResourceLoader]
    }
    
    extension [Self <: ResourceLoader](x: Self) {
      
      inline def setCanPreload(value: Boolean): Self = StObject.set(x, "canPreload", value.asInstanceOf[js.Any])
      
      inline def setCanPreprocess(value: Boolean): Self = StObject.set(x, "canPreprocess", value.asInstanceOf[js.Any])
      
      inline def setLoad(value: String => String): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setPreload(value: (String, ResourceLoaderContext) => js.UndefOr[js.Promise[Unit]]): Self = StObject.set(x, "preload", js.Any.fromFunction2(value))
      
      inline def setPreprocessInline(value: (String, ResourceLoaderContext) => js.Promise[String]): Self = StObject.set(x, "preprocessInline", js.Any.fromFunction2(value))
      
      inline def setResolve(value: (String, String) => String): Self = StObject.set(x, "resolve", js.Any.fromFunction2(value))
    }
  }
  
  trait ResourceLoaderContext extends StObject {
    
    /**
      * The absolute path to the file that contains the resource or reference to the resource.
      */
    var containingFile: String
    
    /**
      * The type of the component resource.
      * * Resources referenced via a component's `styles` or `styleUrls` properties are of
      * type `style`.
      * * Resources referenced via a component's `template` or `templateUrl` properties are of type
      * `template`.
      */
    var `type`: style | template
  }
  object ResourceLoaderContext {
    
    inline def apply(containingFile: String, `type`: style | template): ResourceLoaderContext = {
      val __obj = js.Dynamic.literal(containingFile = containingFile.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceLoaderContext]
    }
    
    extension [Self <: ResourceLoaderContext](x: Self) {
      
      inline def setContainingFile(value: String): Self = StObject.set(x, "containingFile", value.asInstanceOf[js.Any])
      
      inline def setType(value: style | template): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
