package typings.aureliaTemplating.mod

import typings.aureliaDependencyInjection.mod.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-templating", "ResourceModule")
@js.native
open class ResourceModule protected () extends StObject {
  /**
  	* Creates an instance of ResourceModule.
  	* @param moduleId The id of the module that contains view resources.
  	*/
  def this(moduleId: String) = this()
  
  /**
  	* Initializes the resources within the module.
  	* @param container The dependency injection container usable during resource initialization.
  	*/
  def initialize(container: Container): Unit = js.native
  
  /**
  	* Loads any dependencies of the resources within this module.
  	* @param container The DI container to use during dependency resolution.
  	* @param loadContext The loading context used for loading all resources and dependencies.
  	* @return A promise that resolves when all loading is complete.
  	*/
  def load(container: Container): js.Promise[Unit] = js.native
  def load(container: Container, loadContext: ResourceLoadContext): js.Promise[Unit] = js.native
  
  /**
  	* Registers the resources in the module with the view resources.
  	* @param registry The registry of view resources to regiser within.
  	* @param name The name to use in registering the default resource.
  	*/
  def register(registry: ViewResources_): Unit = js.native
  def register(registry: ViewResources_, name: String): Unit = js.native
}
