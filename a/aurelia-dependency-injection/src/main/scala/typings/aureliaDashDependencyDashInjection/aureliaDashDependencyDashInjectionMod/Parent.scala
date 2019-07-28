package typings.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-dependency-injection", "Parent")
@js.native
class Parent protected () extends js.Object {
  /**
    * Creates an instance of the Parent class.
    * @param key The key to resolve from the parent container.
    */
  def this(key: js.Any) = this()
  /**
    * Called by the container to load the dependency from the parent container
    * @param container The container to resolve the parent from.
    * @return Returns the matching instance from the parent container
    */
  def get(container: Container): js.Any = js.native
}

/* static members */
@JSImport("aurelia-dependency-injection", "Parent")
@js.native
object Parent extends js.Object {
  /**
    * Creates a Parent Resolver for the supplied key.
    * @param key The key to resolve.
    * @return Returns an instance of Parent for the key.
    */
  def of(key: js.Any): Parent = js.native
}

