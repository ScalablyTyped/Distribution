package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-templating", "ResourceModule")
@js.native
class ResourceModule protected () extends js.Object {
  /**
    * Creates an instance of ResourceModule.
    * @param moduleId The id of the module that contains view resources.
    */
  def this(moduleId: java.lang.String) = this()
  /**
    * Initializes the resources within the module.
    * @param container The dependency injection container usable during resource initialization.
    */
  def initialize(container: aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container): scala.Unit = js.native
  /**
    * Loads any dependencies of the resources within this module.
    * @param container The DI container to use during dependency resolution.
    * @param loadContext The loading context used for loading all resources and dependencies.
    * @return A promise that resolves when all loading is complete.
    */
  def load(container: aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container): js.Promise[scala.Unit] = js.native
  def load(
    container: aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container,
    loadContext: ResourceLoadContext
  ): js.Promise[scala.Unit] = js.native
  /**
    * Registers the resources in the module with the view resources.
    * @param registry The registry of view resources to regiser within.
    * @param name The name to use in registering the default resource.
    */
  def register(registry: ViewResources): scala.Unit = js.native
  def register(registry: ViewResources, name: java.lang.String): scala.Unit = js.native
}

