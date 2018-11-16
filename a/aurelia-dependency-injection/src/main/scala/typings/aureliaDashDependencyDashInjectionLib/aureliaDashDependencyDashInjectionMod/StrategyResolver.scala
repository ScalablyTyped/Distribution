package typings
package aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-dependency-injection", "StrategyResolver")
@js.native
class StrategyResolver protected () extends js.Object {
  /**
      * Creates an instance of the StrategyResolver class.
      * @param strategy The type of resolution strategy.
      * @param state The state associated with the resolution strategy.
      */
  def this(strategy: js.Any, state: js.Any) = this()
  var state: js.Any = js.native
  var strategy: StrategyResolver | scala.Double = js.native
  /**
      * Called by the container to allow custom resolution of dependencies for a function/class.
      * @param container The container to resolve from.
      * @param key The key that the resolver was registered as.
      * @return Returns the resolved object.
      */
  def get(container: Container, key: js.Any): js.Any = js.native
}

