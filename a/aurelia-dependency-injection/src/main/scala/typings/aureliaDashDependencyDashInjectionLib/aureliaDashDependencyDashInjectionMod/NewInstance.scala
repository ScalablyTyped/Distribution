package typings
package aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-dependency-injection", "NewInstance")
@js.native
class NewInstance protected () extends js.Object {
  /**
    * Creates an instance of the NewInstance class.
    * @param key The key to resolve/instantiate.
    * @param dynamicDependencies An optional list of dynamic dependencies.
    */
  def this(key: js.Any, dynamicDependencies: js.Any*) = this()
  /**
    * Instructs the NewInstance resolver to register the resolved instance using the supplied key.
    * @param key The key to register the instance with.
    * @return Returns the NewInstance resolver.
    */
  def as(key: js.Any): this.type = js.native
  /**
    * Called by the container to instantiate the dependency and potentially register
    * as another key if the `as` method was used.
    * @param container The container to resolve the parent from.
    * @return Returns the matching instance from the parent container
    */
  def get(container: js.Any): js.Any = js.native
}

/* static members */
@JSImport("aurelia-dependency-injection", "NewInstance")
@js.native
object NewInstance extends js.Object {
  /**
    * Creates an NewInstance Resolver for the supplied key.
    * @param key The key to resolve/instantiate.
    * @param dynamicDependencies An optional list of dynamic dependencies.
    * @return Returns an instance of NewInstance for the key.
    */
  def of(key: js.Any, dynamicDependencies: js.Any*): aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.NewInstance = js.native
}

