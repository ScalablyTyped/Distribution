package typings
package aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Registration extends js.Object {
  /**
    * Called by the container to register the resolver.
    * @param container The container the resolver is being registered with.
    * @param key The key the resolver should be registered as.
    * @param fn The function to create the resolver for.
    * @return The resolver that was registered.
    */
  def registerResolver(container: Container, key: js.Any, fn: js.Function): Resolver
}

object Registration {
  @scala.inline
  def apply(registerResolver: js.Function3[Container, js.Any, js.Function, Resolver]): Registration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("registerResolver")(registerResolver)
    __obj.asInstanceOf[Registration]
  }
}

