package typings.aureliaTemplating.mod

import typings.aureliaDependencyInjection.mod.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-templating", "ElementConfigResource")
@js.native
class ElementConfigResource () extends js.Object {
  /**
    * Provides an opportunity for the resource to initialize iteself.
    * @param container The dependency injection container from which the resource
    * can aquire needed services.
    * @param target The class to which this resource metadata is attached.
    */
  def initialize(container: Container, target: js.Function): Unit = js.native
  /**
    * Enables the resource to asynchronously load additional resources.
    * @param container The dependency injection container from which the resource
    * can aquire needed services.
    * @param target The class to which this resource metadata is attached.
    */
  def load(container: Container, target: js.Function): Unit = js.native
  /**
    * Allows the resource to be registered in the view resources for the particular
    * view into which it was required.
    * @param registry The view resource registry for the view that required this resource.
    * @param name The name provided by the end user for this resource, within the
    * particular view it's being used.
    */
  def register(registry: ViewResources_): Unit = js.native
  def register(registry: ViewResources_, name: String): Unit = js.native
}

