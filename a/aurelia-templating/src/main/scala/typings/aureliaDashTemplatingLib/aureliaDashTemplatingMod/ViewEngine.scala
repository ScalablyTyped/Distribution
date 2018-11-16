package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

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
  def this(loader: aureliaDashLoaderLib.aureliaDashLoaderMod.Loader, container: aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container, viewCompiler: ViewCompiler, moduleAnalyzer: ModuleAnalyzer, appResources: ViewResources) = this()
  /**
      * Adds a resource plugin to the resource loading pipeline.
      * @param extension The file extension to match in require elements.
      * @param implementation The plugin implementation that handles the resource type.
      */
  def addResourcePlugin(extension: java.lang.String, implementation: js.Object): scala.Unit = js.native
  /**
      * Loads a view model as a resource.
      * @param moduleImport The module to import.
      * @param moduleMember The export from the module to generate the resource for.
      * @return A promise for the ResourceDescription.
      */
  def importViewModelResource(moduleImport: java.lang.String, moduleMember: java.lang.String): stdLib.Promise[ResourceDescription] = js.native
  /**
      * Imports the specified resources with the specified names into the view resources object.
      * @param moduleIds The modules to load.
      * @param names The names associated with resource modules to import.
      * @param resources The resources lookup to add the loaded resources to.
      * @param compileInstruction The compilation instruction associated with the resource imports.
      * @return A promise for the ViewResources.
      */
  def importViewResources(moduleIds: js.Array[java.lang.String], names: js.Array[java.lang.String], resources: ViewResources): stdLib.Promise[ViewResources] = js.native
  /**
      * Imports the specified resources with the specified names into the view resources object.
      * @param moduleIds The modules to load.
      * @param names The names associated with resource modules to import.
      * @param resources The resources lookup to add the loaded resources to.
      * @param compileInstruction The compilation instruction associated with the resource imports.
      * @return A promise for the ViewResources.
      */
  def importViewResources(
    moduleIds: js.Array[java.lang.String],
    names: js.Array[java.lang.String],
    resources: ViewResources,
    compileInstruction: ViewCompileInstruction
  ): stdLib.Promise[ViewResources] = js.native
  /**
      * Imports the specified resources with the specified names into the view resources object.
      * @param moduleIds The modules to load.
      * @param names The names associated with resource modules to import.
      * @param resources The resources lookup to add the loaded resources to.
      * @param compileInstruction The compilation instruction associated with the resource imports.
      * @return A promise for the ViewResources.
      */
  def importViewResources(
    moduleIds: js.Array[java.lang.String],
    names: js.Array[java.lang.String],
    resources: ViewResources,
    compileInstruction: ViewCompileInstruction,
    loadContext: ResourceLoadContext
  ): stdLib.Promise[ViewResources] = js.native
  /**
      * Loads all the resources specified by the registry entry.
      * @param registryEntry The template registry entry to load the resources for.
      * @param compileInstruction The compile instruction associated with the load.
      * @param loadContext The load context if this is happening within the context of a larger load operation.
      * @param target A class from which to extract metadata of additional resources to load.
      * @return A promise of ViewResources for the registry entry.
      */
  def loadTemplateResources(registryEntry: aureliaDashLoaderLib.aureliaDashLoaderMod.TemplateRegistryEntry): stdLib.Promise[ViewResources] = js.native
  /**
      * Loads all the resources specified by the registry entry.
      * @param registryEntry The template registry entry to load the resources for.
      * @param compileInstruction The compile instruction associated with the load.
      * @param loadContext The load context if this is happening within the context of a larger load operation.
      * @param target A class from which to extract metadata of additional resources to load.
      * @return A promise of ViewResources for the registry entry.
      */
  def loadTemplateResources(
    registryEntry: aureliaDashLoaderLib.aureliaDashLoaderMod.TemplateRegistryEntry,
    compileInstruction: ViewCompileInstruction
  ): stdLib.Promise[ViewResources] = js.native
  /**
      * Loads all the resources specified by the registry entry.
      * @param registryEntry The template registry entry to load the resources for.
      * @param compileInstruction The compile instruction associated with the load.
      * @param loadContext The load context if this is happening within the context of a larger load operation.
      * @param target A class from which to extract metadata of additional resources to load.
      * @return A promise of ViewResources for the registry entry.
      */
  def loadTemplateResources(
    registryEntry: aureliaDashLoaderLib.aureliaDashLoaderMod.TemplateRegistryEntry,
    compileInstruction: ViewCompileInstruction,
    loadContext: ResourceLoadContext
  ): stdLib.Promise[ViewResources] = js.native
  /**
      * Loads all the resources specified by the registry entry.
      * @param registryEntry The template registry entry to load the resources for.
      * @param compileInstruction The compile instruction associated with the load.
      * @param loadContext The load context if this is happening within the context of a larger load operation.
      * @param target A class from which to extract metadata of additional resources to load.
      * @return A promise of ViewResources for the registry entry.
      */
  def loadTemplateResources(
    registryEntry: aureliaDashLoaderLib.aureliaDashLoaderMod.TemplateRegistryEntry,
    compileInstruction: ViewCompileInstruction,
    loadContext: ResourceLoadContext,
    target: js.Any
  ): stdLib.Promise[ViewResources] = js.native
  /**
      * Loads and compiles a ViewFactory from a url or template registry entry.
      * @param urlOrRegistryEntry A url or template registry entry to generate the view factory for.
      * @param compileInstruction Instructions detailing how the factory should be compiled.
      * @param loadContext The load context if this factory load is happening within the context of a larger load operation.
      * @param target A class from which to extract metadata of additional resources to load.
      * @return A promise for the compiled view factory.
      */
  def loadViewFactory(urlOrRegistryEntry: aureliaDashLoaderLib.aureliaDashLoaderMod.TemplateRegistryEntry): stdLib.Promise[ViewFactory] = js.native
  /**
      * Loads and compiles a ViewFactory from a url or template registry entry.
      * @param urlOrRegistryEntry A url or template registry entry to generate the view factory for.
      * @param compileInstruction Instructions detailing how the factory should be compiled.
      * @param loadContext The load context if this factory load is happening within the context of a larger load operation.
      * @param target A class from which to extract metadata of additional resources to load.
      * @return A promise for the compiled view factory.
      */
  def loadViewFactory(
    urlOrRegistryEntry: aureliaDashLoaderLib.aureliaDashLoaderMod.TemplateRegistryEntry,
    compileInstruction: ViewCompileInstruction
  ): stdLib.Promise[ViewFactory] = js.native
  /**
      * Loads and compiles a ViewFactory from a url or template registry entry.
      * @param urlOrRegistryEntry A url or template registry entry to generate the view factory for.
      * @param compileInstruction Instructions detailing how the factory should be compiled.
      * @param loadContext The load context if this factory load is happening within the context of a larger load operation.
      * @param target A class from which to extract metadata of additional resources to load.
      * @return A promise for the compiled view factory.
      */
  def loadViewFactory(
    urlOrRegistryEntry: aureliaDashLoaderLib.aureliaDashLoaderMod.TemplateRegistryEntry,
    compileInstruction: ViewCompileInstruction,
    loadContext: ResourceLoadContext
  ): stdLib.Promise[ViewFactory] = js.native
  /**
      * Loads and compiles a ViewFactory from a url or template registry entry.
      * @param urlOrRegistryEntry A url or template registry entry to generate the view factory for.
      * @param compileInstruction Instructions detailing how the factory should be compiled.
      * @param loadContext The load context if this factory load is happening within the context of a larger load operation.
      * @param target A class from which to extract metadata of additional resources to load.
      * @return A promise for the compiled view factory.
      */
  def loadViewFactory(
    urlOrRegistryEntry: aureliaDashLoaderLib.aureliaDashLoaderMod.TemplateRegistryEntry,
    compileInstruction: ViewCompileInstruction,
    loadContext: ResourceLoadContext,
    target: js.Any
  ): stdLib.Promise[ViewFactory] = js.native
  /**
      * Loads and compiles a ViewFactory from a url or template registry entry.
      * @param urlOrRegistryEntry A url or template registry entry to generate the view factory for.
      * @param compileInstruction Instructions detailing how the factory should be compiled.
      * @param loadContext The load context if this factory load is happening within the context of a larger load operation.
      * @param target A class from which to extract metadata of additional resources to load.
      * @return A promise for the compiled view factory.
      */
  def loadViewFactory(urlOrRegistryEntry: java.lang.String): stdLib.Promise[ViewFactory] = js.native
  /**
      * Loads and compiles a ViewFactory from a url or template registry entry.
      * @param urlOrRegistryEntry A url or template registry entry to generate the view factory for.
      * @param compileInstruction Instructions detailing how the factory should be compiled.
      * @param loadContext The load context if this factory load is happening within the context of a larger load operation.
      * @param target A class from which to extract metadata of additional resources to load.
      * @return A promise for the compiled view factory.
      */
  def loadViewFactory(urlOrRegistryEntry: java.lang.String, compileInstruction: ViewCompileInstruction): stdLib.Promise[ViewFactory] = js.native
  /**
      * Loads and compiles a ViewFactory from a url or template registry entry.
      * @param urlOrRegistryEntry A url or template registry entry to generate the view factory for.
      * @param compileInstruction Instructions detailing how the factory should be compiled.
      * @param loadContext The load context if this factory load is happening within the context of a larger load operation.
      * @param target A class from which to extract metadata of additional resources to load.
      * @return A promise for the compiled view factory.
      */
  def loadViewFactory(
    urlOrRegistryEntry: java.lang.String,
    compileInstruction: ViewCompileInstruction,
    loadContext: ResourceLoadContext
  ): stdLib.Promise[ViewFactory] = js.native
  /**
      * Loads and compiles a ViewFactory from a url or template registry entry.
      * @param urlOrRegistryEntry A url or template registry entry to generate the view factory for.
      * @param compileInstruction Instructions detailing how the factory should be compiled.
      * @param loadContext The load context if this factory load is happening within the context of a larger load operation.
      * @param target A class from which to extract metadata of additional resources to load.
      * @return A promise for the compiled view factory.
      */
  def loadViewFactory(
    urlOrRegistryEntry: java.lang.String,
    compileInstruction: ViewCompileInstruction,
    loadContext: ResourceLoadContext,
    target: js.Any
  ): stdLib.Promise[ViewFactory] = js.native
}

@JSImport("aurelia-templating", "ViewEngine")
@js.native
object ViewEngine extends js.Object {
  /**
      * The metadata key for storing requires declared in a ViewModel.
      */
  var viewModelRequireMetadataKey: js.Any = js.native
}

