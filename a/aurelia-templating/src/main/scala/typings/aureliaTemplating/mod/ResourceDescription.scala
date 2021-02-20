package typings.aureliaTemplating.mod

import typings.aureliaDependencyInjection.mod.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-templating", "ResourceDescription")
@js.native
class ResourceDescription protected () extends StObject {
  /**
    * Creates an instance of ResourceDescription.
    * @param key The key that the resource was exported as.
    * @param exportedValue The exported resource.
    * @param resourceTypeMeta The metadata located on the resource.
    */
  def this(key: String, exportedValue: js.Any) = this()
  def this(key: String, exportedValue: js.Any, resourceTypeMeta: js.Object) = this()
  
  /**
    * Initializes the resource.
    * @param container The dependency injection container usable during resource initialization.
    */
  def initialize(container: Container): Unit = js.native
  
  /**
    * Loads any dependencies of the resource.
    * @param container The DI container to use during dependency resolution.
    * @param loadContext The loading context used for loading all resources and dependencies.
    * @return A promise that resolves when all loading is complete.
    */
  def load(container: Container): js.Promise[Unit] | Unit = js.native
  def load(container: Container, loadContext: ResourceLoadContext): js.Promise[Unit] | Unit = js.native
  
  /**
    * Registrers the resource with the view resources.
    * @param registry The registry of view resources to regiser within.
    * @param name The name to use in registering the resource.
    */
  def register(registry: ViewResources_): Unit = js.native
  def register(registry: ViewResources_, name: String): Unit = js.native
}
