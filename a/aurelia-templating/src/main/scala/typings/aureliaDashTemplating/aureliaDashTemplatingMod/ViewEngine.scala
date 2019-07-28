package typings.aureliaDashTemplating.aureliaDashTemplatingMod

import typings.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod.Container
import typings.aureliaDashLoader.aureliaDashLoaderMod.Loader
import typings.aureliaDashLoader.aureliaDashLoaderMod.TemplateRegistryEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-templating", "ViewEngine")
@js.native
class ViewEngine protected () extends js.Object {
  /**
    * Creates an instance of ViewEngine.
    * @param loader The module loader.
    * @param container The root DI container for the app.
    * @param viewCompiler The view compiler.
    * @param moduleAnalyzer The module analyzer.
    * @param appResources The app-level global resources.
    */
  def this(
    loader: Loader,
    container: Container,
    viewCompiler: ViewCompiler,
    moduleAnalyzer: ModuleAnalyzer,
    appResources: ViewResources
  ) = this()
  /**
    * Adds a resource plugin to the resource loading pipeline.
    * @param extension The file extension to match in require elements.
    * @param implementation The plugin implementation that handles the resource type.
    */
  def addResourcePlugin(extension: String, implementation: js.Object): Unit = js.native
  /**
    * Loads a view model as a resource.
    * @param moduleImport The module to import.
    * @param moduleMember The export from the module to generate the resource for.
    * @return A promise for the ResourceDescription.
    */
  def importViewModelResource(moduleImport: String, moduleMember: String): js.Promise[ResourceDescription] = js.native
  /**
    * Imports the specified resources with the specified names into the view resources object.
    * @param moduleIds The modules to load.
    * @param names The names associated with resource modules to import.
    * @param resources The resources lookup to add the loaded resources to.
    * @param compileInstruction The compilation instruction associated with the resource imports.
    * @return A promise for the ViewResources.
    */
  def importViewResources(moduleIds: js.Array[String], names: js.Array[String], resources: ViewResources): js.Promise[ViewResources] = js.native
  def importViewResources(
    moduleIds: js.Array[String],
    names: js.Array[String],
    resources: ViewResources,
    compileInstruction: ViewCompileInstruction
  ): js.Promise[ViewResources] = js.native
  def importViewResources(
    moduleIds: js.Array[String],
    names: js.Array[String],
    resources: ViewResources,
    compileInstruction: ViewCompileInstruction,
    loadContext: ResourceLoadContext
  ): js.Promise[ViewResources] = js.native
  /**
    * Loads all the resources specified by the registry entry.
    * @param registryEntry The template registry entry to load the resources for.
    * @param compileInstruction The compile instruction associated with the load.
    * @param loadContext The load context if this is happening within the context of a larger load operation.
    * @param target A class from which to extract metadata of additional resources to load.
    * @return A promise of ViewResources for the registry entry.
    */
  def loadTemplateResources(registryEntry: TemplateRegistryEntry): js.Promise[ViewResources] = js.native
  def loadTemplateResources(registryEntry: TemplateRegistryEntry, compileInstruction: ViewCompileInstruction): js.Promise[ViewResources] = js.native
  def loadTemplateResources(
    registryEntry: TemplateRegistryEntry,
    compileInstruction: ViewCompileInstruction,
    loadContext: ResourceLoadContext
  ): js.Promise[ViewResources] = js.native
  def loadTemplateResources(
    registryEntry: TemplateRegistryEntry,
    compileInstruction: ViewCompileInstruction,
    loadContext: ResourceLoadContext,
    target: js.Any
  ): js.Promise[ViewResources] = js.native
  /**
    * Loads and compiles a ViewFactory from a url or template registry entry.
    * @param urlOrRegistryEntry A url or template registry entry to generate the view factory for.
    * @param compileInstruction Instructions detailing how the factory should be compiled.
    * @param loadContext The load context if this factory load is happening within the context of a larger load operation.
    * @param target A class from which to extract metadata of additional resources to load.
    * @return A promise for the compiled view factory.
    */
  def loadViewFactory(urlOrRegistryEntry: String): js.Promise[ViewFactory] = js.native
  def loadViewFactory(urlOrRegistryEntry: String, compileInstruction: ViewCompileInstruction): js.Promise[ViewFactory] = js.native
  def loadViewFactory(
    urlOrRegistryEntry: String,
    compileInstruction: ViewCompileInstruction,
    loadContext: ResourceLoadContext
  ): js.Promise[ViewFactory] = js.native
  def loadViewFactory(
    urlOrRegistryEntry: String,
    compileInstruction: ViewCompileInstruction,
    loadContext: ResourceLoadContext,
    target: js.Any
  ): js.Promise[ViewFactory] = js.native
  def loadViewFactory(urlOrRegistryEntry: TemplateRegistryEntry): js.Promise[ViewFactory] = js.native
  def loadViewFactory(urlOrRegistryEntry: TemplateRegistryEntry, compileInstruction: ViewCompileInstruction): js.Promise[ViewFactory] = js.native
  def loadViewFactory(
    urlOrRegistryEntry: TemplateRegistryEntry,
    compileInstruction: ViewCompileInstruction,
    loadContext: ResourceLoadContext
  ): js.Promise[ViewFactory] = js.native
  def loadViewFactory(
    urlOrRegistryEntry: TemplateRegistryEntry,
    compileInstruction: ViewCompileInstruction,
    loadContext: ResourceLoadContext,
    target: js.Any
  ): js.Promise[ViewFactory] = js.native
}

/* static members */
@JSImport("aurelia-templating", "ViewEngine")
@js.native
object ViewEngine extends js.Object {
  /**
    * The metadata key for storing requires declared in a ViewModel.
    */
  var viewModelRequireMetadataKey: js.Any = js.native
}

