package typings.aureliaDashLoader.aureliaDashLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-loader", "Loader")
@js.native
/**
  * Creates an instance of Loader.
  */
class Loader () extends js.Object {
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
  def loadAllModules(ids: js.Array[String]): js.Promise[js.Array[_]] = js.native
  /**
    * Loads a module.
    * @param id The module id to normalize.
    * @return A Promise for the loaded module.
    */
  def loadModule(id: String): js.Promise[_] = js.native
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

