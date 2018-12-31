package typings
package aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-dependency-injection", "Factory")
@js.native
class Factory protected () extends js.Object {
  /**
    * Creates an instance of the Factory class.
    * @param key The key to resolve from the parent container.
    */
  def this(key: js.Any) = this()
  /**
    * Called by the container to pass the dependencies to the constructor.
    * @param container The container to invoke the constructor with dependencies and other parameters.
    * @return Returns a function that can be invoked to resolve dependencies later, and the rest of the parameters.
    */
  def get(container: Container): js.Any = js.native
}

@JSImport("aurelia-dependency-injection", "Factory")
@js.native
object Factory extends js.Object {
  /**
    * Creates a Factory Resolver for the supplied key.
    * @param key The key to resolve.
    * @return Returns an instance of Factory for the key.
    */
  def of(key: js.Any): aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Factory = js.native
}

