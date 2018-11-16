package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-templating", "ResourceDescription")
@js.native
class ResourceDescription protected () extends js.Object {
  /**
      * Creates an instance of ResourceDescription.
      * @param key The key that the resource was exported as.
      * @param exportedValue The exported resource.
      * @param resourceTypeMeta The metadata located on the resource.
      */
  def this(key: java.lang.String, exportedValue: js.Any) = this()
  /**
      * Creates an instance of ResourceDescription.
      * @param key The key that the resource was exported as.
      * @param exportedValue The exported resource.
      * @param resourceTypeMeta The metadata located on the resource.
      */
  def this(key: java.lang.String, exportedValue: js.Any, resourceTypeMeta: js.Object) = this()
  /**
      * Initializes the resource.
      * @param container The dependency injection container usable during resource initialization.
      */
  def initialize(container: aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container): scala.Unit = js.native
  /**
      * Loads any dependencies of the resource.
      * @param container The DI container to use during dependency resolution.
      * @param loadContext The loading context used for loading all resources and dependencies.
      * @return A promise that resolves when all loading is complete.
      */
  def load(container: aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container): stdLib.Promise[scala.Unit] | scala.Unit = js.native
  /**
      * Loads any dependencies of the resource.
      * @param container The DI container to use during dependency resolution.
      * @param loadContext The loading context used for loading all resources and dependencies.
      * @return A promise that resolves when all loading is complete.
      */
  def load(
    container: aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container,
    loadContext: ResourceLoadContext
  ): stdLib.Promise[scala.Unit] | scala.Unit = js.native
  /**
      * Registrers the resource with the view resources.
      * @param registry The registry of view resources to regiser within.
      * @param name The name to use in registering the resource.
      */
  def register(registry: ViewResources): scala.Unit = js.native
  /**
      * Registrers the resource with the view resources.
      * @param registry The registry of view resources to regiser within.
      * @param name The name to use in registering the resource.
      */
  def register(registry: ViewResources, name: java.lang.String): scala.Unit = js.native
}

