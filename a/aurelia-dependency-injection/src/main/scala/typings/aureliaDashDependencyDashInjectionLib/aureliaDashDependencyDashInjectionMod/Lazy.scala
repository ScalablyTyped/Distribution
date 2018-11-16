package typings
package aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-dependency-injection", "Lazy")
@js.native
class Lazy protected () extends js.Object {
  /**
      * Creates an instance of the Lazy class.
      * @param key The key to lazily resolve.
      */
  def this(key: js.Any) = this()
  /**
      * Called by the container to lazily resolve the dependency into a lazy locator function.
      * @param container The container to resolve from.
      * @return Returns a function which can be invoked at a later time to obtain the actual dependency.
      */
  def get(container: Container): js.Any = js.native
}

@JSImport("aurelia-dependency-injection", "Lazy")
@js.native
object Lazy extends js.Object {
  /**
      * Creates a Lazy Resolver for the supplied key.
      * @param key The key to lazily resolve.
      * @return Returns an instance of Lazy for the key.
      */
  def of(key: js.Any): aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Lazy = js.native
}

