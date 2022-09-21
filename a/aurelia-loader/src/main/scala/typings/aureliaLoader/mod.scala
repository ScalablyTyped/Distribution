package typings.aureliaLoader

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("aurelia-loader", "Loader")
  @js.native
  /**
    * Creates an instance of Loader.
    */
  open class Loader () extends StObject {
    
    /**
      * Registers a plugin with the loader.
      * @param pluginName The name of the plugin.
      * @param implementation The plugin implementation.
      */
    def addPlugin(pluginName: String, implementation: LoaderPlugin): Unit = js.native
    
    /**
      * Alters a module id so that it includes a plugin loader.
      * @param url The url of the module to load.
      * @param pluginName The plugin to apply to the module id.
      * @return The plugin-based module id.
      */
    def applyPluginToUrl(url: String, pluginName: String): String = js.native
    
    /**
      * Gets or creates a TemplateRegistryEntry for the provided address.
      * @param address The address of the template.
      * @return The located or created TemplateRegistryEntry.
      */
    def getOrCreateTemplateRegistryEntry(address: String): TemplateRegistryEntry = js.native
    
    /**
      * Loads a collection of modules.
      * @param ids The set of module ids to load.
      * @return A Promise for an array of loaded modules.
      */
    def loadAllModules(ids: js.Array[String]): js.Promise[js.Array[Any]] = js.native
    
    /**
      * Loads a module.
      * @param id The module id to normalize.
      * @return A Promise for the loaded module.
      */
    def loadModule(id: String): js.Promise[Any] = js.native
    
    /**
      * Loads a template.
      * @param url The url of the template to load.
      * @return A Promise for a TemplateRegistryEntry containing the template.
      */
    def loadTemplate(url: String): js.Promise[TemplateRegistryEntry] = js.native
    
    /**
      * Loads a text-based resource.
      * @param url The url of the text file to load.
      * @return A Promise for text content.
      */
    def loadText(url: String): js.Promise[String] = js.native
    
    /**
      * Maps a module id to a source.
      * @param id The module id.
      * @param source The source to map the module to.
      */
    def map(id: String, source: String): Unit = js.native
    
    /**
      * Normalizes a module id.
      * @param moduleId The module id to normalize.
      * @param relativeTo What the module id should be normalized relative to.
      * @return A promise for the normalized module id.
      */
    def normalize(moduleId: String, relativeTo: String): js.Promise[String] = js.native
    
    /**
      * Normalizes a module id.
      * @param moduleId The module id to normalize.
      * @param relativeTo What the module id should be normalized relative to.
      * @return The normalized module id.
      */
    def normalizeSync(moduleId: String, relativeTo: String): String = js.native
  }
  
  @JSImport("aurelia-loader", "TemplateDependency")
  @js.native
  open class TemplateDependency protected () extends StObject {
    /**
      * Creates a template dependency.
      * @param src The source of the dependency.
      * @param name The local name of the src when used in the template.
      */
    def this(src: String) = this()
    def this(src: String, name: String) = this()
    
    /**
      * The local name of the src when used in the template.
      */
    var name: String = js.native
    
    /**
      * The source of the dependency.
      */
    var src: String = js.native
  }
  
  @JSImport("aurelia-loader", "TemplateRegistryEntry")
  @js.native
  open class TemplateRegistryEntry protected () extends StObject {
    /**
      * Creates an instance of TemplateRegistryEntry.
      * @param address The address of the template that this entry represents.
      */
    def this(address: String) = this()
    
    /**
      * Adds a dependency to this template registry entry. Cannot be called until after the template is set.
      * @param src The dependency instance or a relative path to its module.
      * @param name An optional local name by which this dependency is used in the template.
      */
    def addDependency(src: String): Unit = js.native
    def addDependency(src: String, name: String): Unit = js.native
    def addDependency(src: js.Function): Unit = js.native
    def addDependency(src: js.Function, name: String): Unit = js.native
    
    /**
      * The address of the template that this entry represents.
      */
    var address: String = js.native
    
    /**
      * The dependencies of the associated template. Dependencies are not available until after the template is loaded.
      */
    var dependencies: js.Array[TemplateDependency] = js.native
    
    /**
      * Gets the factory capable of creating instances of this template.
      */
    var factory: Any = js.native
    
    /**
      * Indicates whether the factory is ready to be used to create instances of the associated template.
      */
    var factoryIsReady: Boolean = js.native
    
    /**
      * Sets the resources associated with this entry.
      */
    var resources: js.Object = js.native
    
    /**
      * Gets the template for this registry entry.
      */
    var template: Element = js.native
    
    /**
      * Indicates whether or not the associated template is loaded .
      */
    var templateIsLoaded: Boolean = js.native
  }
  
  trait LoaderPlugin extends StObject {
    
    /**
      * Fetches the resource.
      * @param address The address of the resource.
      * @return A Promise for the requested resouce.
      */
    def fetch(address: String): js.Promise[Any]
  }
  object LoaderPlugin {
    
    inline def apply(fetch: String => js.Promise[Any]): LoaderPlugin = {
      val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction1(fetch))
      __obj.asInstanceOf[LoaderPlugin]
    }
    
    extension [Self <: LoaderPlugin](x: Self) {
      
      inline def setFetch(value: String => js.Promise[Any]): Self = StObject.set(x, "fetch", js.Any.fromFunction1(value))
    }
  }
}
